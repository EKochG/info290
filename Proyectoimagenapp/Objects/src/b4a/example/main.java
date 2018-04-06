package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (isFirst) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
				p.finish();
			}
		}
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		mostCurrent = this;
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEvent(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null) //workaround for emulator bug (Issue 2423)
            return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        processBA.setActivityPaused(true);
        mostCurrent = null;
        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
			if (mostCurrent == null || mostCurrent != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
		    processBA.raiseEvent(mostCurrent._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}



public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
return vis;}

public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = main.mostCurrent.processBA.sharedProcessBA.activityBA.get();
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, starter.class));
}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview2 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview3 = null;
public static int _element = 0;
public anywheresoftware.b4a.objects.ButtonWrapper _button1 = null;
public static int _num = 0;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview4 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview5 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview6 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview7 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview8 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview9 = null;
public b4a.example.starter _starter = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="Activity.LoadLayout(\"pantalla1\")";
mostCurrent._activity.LoadLayout("pantalla1",mostCurrent.activityBA);
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="ImageView1.Visible=True";
mostCurrent._imageview1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="ImageView2.Visible=False";
mostCurrent._imageview2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="ImageView3.Visible=False";
mostCurrent._imageview3.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="ImageView4.Visible=False";
mostCurrent._imageview4.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="ImageView5.Visible=False";
mostCurrent._imageview5.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131080;
 //BA.debugLineNum = 131080;BA.debugLine="ImageView6.Visible=False";
mostCurrent._imageview6.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="ImageView7.Visible=False";
mostCurrent._imageview7.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="ImageView8.Visible=False";
mostCurrent._imageview8.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131083;
 //BA.debugLineNum = 131083;BA.debugLine="ImageView9.Visible=False";
mostCurrent._imageview9.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131084;
 //BA.debugLineNum = 131084;BA.debugLine="ImageView1.Bitmap =LoadBitmap(File.DirAssets,\"r1.";
mostCurrent._imageview1.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"r1.jpg").getObject()));
RDebugUtils.currentLine=131085;
 //BA.debugLineNum = 131085;BA.debugLine="ImageView2.Bitmap =LoadBitmap(File.DirAssets,\"r2.";
mostCurrent._imageview2.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"r2.png").getObject()));
RDebugUtils.currentLine=131086;
 //BA.debugLineNum = 131086;BA.debugLine="ImageView3.Bitmap =LoadBitmap(File.DirAssets,\"r3.";
mostCurrent._imageview3.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"r3.jpg").getObject()));
RDebugUtils.currentLine=131087;
 //BA.debugLineNum = 131087;BA.debugLine="ImageView4.Bitmap =LoadBitmap(File.DirAssets,\"r1.";
mostCurrent._imageview4.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"r1.jpg").getObject()));
RDebugUtils.currentLine=131088;
 //BA.debugLineNum = 131088;BA.debugLine="ImageView5.Bitmap =LoadBitmap(File.DirAssets,\"r2.";
mostCurrent._imageview5.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"r2.png").getObject()));
RDebugUtils.currentLine=131089;
 //BA.debugLineNum = 131089;BA.debugLine="ImageView6.Bitmap =LoadBitmap(File.DirAssets,\"r3.";
mostCurrent._imageview6.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"r3.jpg").getObject()));
RDebugUtils.currentLine=131090;
 //BA.debugLineNum = 131090;BA.debugLine="ImageView7.Bitmap =LoadBitmap(File.DirAssets,\"r1.";
mostCurrent._imageview7.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"r1.jpg").getObject()));
RDebugUtils.currentLine=131091;
 //BA.debugLineNum = 131091;BA.debugLine="ImageView8.Bitmap =LoadBitmap(File.DirAssets,\"r2.";
mostCurrent._imageview8.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"r2.png").getObject()));
RDebugUtils.currentLine=131092;
 //BA.debugLineNum = 131092;BA.debugLine="ImageView9.Bitmap =LoadBitmap(File.DirAssets,\"r3.";
mostCurrent._imageview9.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"r3.jpg").getObject()));
RDebugUtils.currentLine=131094;
 //BA.debugLineNum = 131094;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_pause"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_pause", new Object[] {_userclosed});
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="End Sub";
return "";
}
public static String  _button1_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button1_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "button1_click", null);
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub Button1_Click";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="ImageView9.Visible=False";
mostCurrent._imageview9.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="ImageView8.Visible=False";
mostCurrent._imageview8.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="ImageView7.Visible=False";
mostCurrent._imageview7.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="ImageView6.Visible=False";
mostCurrent._imageview6.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="ImageView5.Visible=False";
mostCurrent._imageview5.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="ImageView4.Visible=False";
mostCurrent._imageview4.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327687;
 //BA.debugLineNum = 327687;BA.debugLine="ImageView3.Visible=False";
mostCurrent._imageview3.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327688;
 //BA.debugLineNum = 327688;BA.debugLine="ImageView2.Visible=False";
mostCurrent._imageview2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327689;
 //BA.debugLineNum = 327689;BA.debugLine="ImageView1.Visible=False";
mostCurrent._imageview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327691;
 //BA.debugLineNum = 327691;BA.debugLine="If element=0 Then";
if (_element==0) { 
RDebugUtils.currentLine=327692;
 //BA.debugLineNum = 327692;BA.debugLine="If num=0 Then";
if (_num==0) { 
RDebugUtils.currentLine=327693;
 //BA.debugLineNum = 327693;BA.debugLine="ImageView1.Visible=True";
mostCurrent._imageview1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327694;
 //BA.debugLineNum = 327694;BA.debugLine="ImageView2.Visible=False";
mostCurrent._imageview2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327695;
 //BA.debugLineNum = 327695;BA.debugLine="ImageView3.Visible=False";
mostCurrent._imageview3.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327696;
 //BA.debugLineNum = 327696;BA.debugLine="num=num+1";
_num = (int) (_num+1);
 }else 
{RDebugUtils.currentLine=327698;
 //BA.debugLineNum = 327698;BA.debugLine="Else If num=1 Then";
if (_num==1) { 
RDebugUtils.currentLine=327699;
 //BA.debugLineNum = 327699;BA.debugLine="ImageView1.Visible=False";
mostCurrent._imageview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327700;
 //BA.debugLineNum = 327700;BA.debugLine="ImageView2.Visible=True";
mostCurrent._imageview2.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327701;
 //BA.debugLineNum = 327701;BA.debugLine="ImageView3.Visible=False";
mostCurrent._imageview3.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327702;
 //BA.debugLineNum = 327702;BA.debugLine="num=num+1";
_num = (int) (_num+1);
 }else {
RDebugUtils.currentLine=327704;
 //BA.debugLineNum = 327704;BA.debugLine="ImageView1.Visible=False";
mostCurrent._imageview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327705;
 //BA.debugLineNum = 327705;BA.debugLine="ImageView2.Visible=False";
mostCurrent._imageview2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327706;
 //BA.debugLineNum = 327706;BA.debugLine="ImageView3.Visible=True";
mostCurrent._imageview3.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327707;
 //BA.debugLineNum = 327707;BA.debugLine="num=0";
_num = (int) (0);
 }};
 }else 
{RDebugUtils.currentLine=327709;
 //BA.debugLineNum = 327709;BA.debugLine="Else If element=1 Then";
if (_element==1) { 
RDebugUtils.currentLine=327710;
 //BA.debugLineNum = 327710;BA.debugLine="If num=0 Then";
if (_num==0) { 
RDebugUtils.currentLine=327711;
 //BA.debugLineNum = 327711;BA.debugLine="ImageView4.Visible=True";
mostCurrent._imageview4.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327712;
 //BA.debugLineNum = 327712;BA.debugLine="ImageView5.Visible=False";
mostCurrent._imageview5.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327713;
 //BA.debugLineNum = 327713;BA.debugLine="ImageView6.Visible=False";
mostCurrent._imageview6.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327714;
 //BA.debugLineNum = 327714;BA.debugLine="num=num+1";
_num = (int) (_num+1);
 }else 
{RDebugUtils.currentLine=327716;
 //BA.debugLineNum = 327716;BA.debugLine="Else If num=1 Then";
if (_num==1) { 
RDebugUtils.currentLine=327717;
 //BA.debugLineNum = 327717;BA.debugLine="ImageView4.Visible=False";
mostCurrent._imageview4.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327718;
 //BA.debugLineNum = 327718;BA.debugLine="ImageView5.Visible=True";
mostCurrent._imageview5.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327719;
 //BA.debugLineNum = 327719;BA.debugLine="ImageView6.Visible=False";
mostCurrent._imageview6.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327720;
 //BA.debugLineNum = 327720;BA.debugLine="num=num+1";
_num = (int) (_num+1);
 }else {
RDebugUtils.currentLine=327722;
 //BA.debugLineNum = 327722;BA.debugLine="ImageView4.Visible=False";
mostCurrent._imageview4.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327723;
 //BA.debugLineNum = 327723;BA.debugLine="ImageView5.Visible=False";
mostCurrent._imageview5.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327724;
 //BA.debugLineNum = 327724;BA.debugLine="ImageView6.Visible=True";
mostCurrent._imageview6.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327725;
 //BA.debugLineNum = 327725;BA.debugLine="num=0";
_num = (int) (0);
 }};
 }else {
RDebugUtils.currentLine=327728;
 //BA.debugLineNum = 327728;BA.debugLine="If num=0 Then";
if (_num==0) { 
RDebugUtils.currentLine=327729;
 //BA.debugLineNum = 327729;BA.debugLine="ImageView7.Visible=True";
mostCurrent._imageview7.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327730;
 //BA.debugLineNum = 327730;BA.debugLine="ImageView8.Visible=False";
mostCurrent._imageview8.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327731;
 //BA.debugLineNum = 327731;BA.debugLine="ImageView9.Visible=False";
mostCurrent._imageview9.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327732;
 //BA.debugLineNum = 327732;BA.debugLine="num=num+1";
_num = (int) (_num+1);
 }else 
{RDebugUtils.currentLine=327734;
 //BA.debugLineNum = 327734;BA.debugLine="Else If num=1 Then";
if (_num==1) { 
RDebugUtils.currentLine=327735;
 //BA.debugLineNum = 327735;BA.debugLine="ImageView7.Visible=False";
mostCurrent._imageview7.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327736;
 //BA.debugLineNum = 327736;BA.debugLine="ImageView8.Visible=True";
mostCurrent._imageview8.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327737;
 //BA.debugLineNum = 327737;BA.debugLine="ImageView9.Visible=False";
mostCurrent._imageview9.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327738;
 //BA.debugLineNum = 327738;BA.debugLine="num=num+1";
_num = (int) (_num+1);
 }else {
RDebugUtils.currentLine=327740;
 //BA.debugLineNum = 327740;BA.debugLine="ImageView7.Visible=False";
mostCurrent._imageview7.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327741;
 //BA.debugLineNum = 327741;BA.debugLine="ImageView8.Visible=False";
mostCurrent._imageview8.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327742;
 //BA.debugLineNum = 327742;BA.debugLine="ImageView9.Visible=True";
mostCurrent._imageview9.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327743;
 //BA.debugLineNum = 327743;BA.debugLine="num=0";
_num = (int) (0);
 }};
 }};
RDebugUtils.currentLine=327746;
 //BA.debugLineNum = 327746;BA.debugLine="End Sub";
return "";
}
public static String  _button2_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button2_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "button2_click", null);
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub Button2_Click";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="element=element+1";
_element = (int) (_element+1);
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="If element>2 Then";
if (_element>2) { 
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="element=0";
_element = (int) (0);
 };
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="ImageView9.Visible=False";
mostCurrent._imageview9.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393222;
 //BA.debugLineNum = 393222;BA.debugLine="ImageView8.Visible=False";
mostCurrent._imageview8.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393223;
 //BA.debugLineNum = 393223;BA.debugLine="ImageView7.Visible=False";
mostCurrent._imageview7.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393224;
 //BA.debugLineNum = 393224;BA.debugLine="ImageView6.Visible=False";
mostCurrent._imageview6.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393225;
 //BA.debugLineNum = 393225;BA.debugLine="ImageView5.Visible=False";
mostCurrent._imageview5.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393226;
 //BA.debugLineNum = 393226;BA.debugLine="ImageView4.Visible=False";
mostCurrent._imageview4.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393227;
 //BA.debugLineNum = 393227;BA.debugLine="ImageView3.Visible=False";
mostCurrent._imageview3.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393228;
 //BA.debugLineNum = 393228;BA.debugLine="ImageView2.Visible=False";
mostCurrent._imageview2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393229;
 //BA.debugLineNum = 393229;BA.debugLine="ImageView1.Visible=False";
mostCurrent._imageview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393231;
 //BA.debugLineNum = 393231;BA.debugLine="If element=0 Then";
if (_element==0) { 
RDebugUtils.currentLine=393232;
 //BA.debugLineNum = 393232;BA.debugLine="If num=0 Then";
if (_num==0) { 
RDebugUtils.currentLine=393233;
 //BA.debugLineNum = 393233;BA.debugLine="ImageView1.Visible=True";
mostCurrent._imageview1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393234;
 //BA.debugLineNum = 393234;BA.debugLine="ImageView2.Visible=False";
mostCurrent._imageview2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393235;
 //BA.debugLineNum = 393235;BA.debugLine="ImageView3.Visible=False";
mostCurrent._imageview3.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393236;
 //BA.debugLineNum = 393236;BA.debugLine="num=num+1";
_num = (int) (_num+1);
 }else 
{RDebugUtils.currentLine=393238;
 //BA.debugLineNum = 393238;BA.debugLine="Else If num=1 Then";
if (_num==1) { 
RDebugUtils.currentLine=393239;
 //BA.debugLineNum = 393239;BA.debugLine="ImageView1.Visible=False";
mostCurrent._imageview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393240;
 //BA.debugLineNum = 393240;BA.debugLine="ImageView2.Visible=True";
mostCurrent._imageview2.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393241;
 //BA.debugLineNum = 393241;BA.debugLine="ImageView3.Visible=False";
mostCurrent._imageview3.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393242;
 //BA.debugLineNum = 393242;BA.debugLine="num=num+1";
_num = (int) (_num+1);
 }else {
RDebugUtils.currentLine=393244;
 //BA.debugLineNum = 393244;BA.debugLine="ImageView1.Visible=False";
mostCurrent._imageview1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393245;
 //BA.debugLineNum = 393245;BA.debugLine="ImageView2.Visible=False";
mostCurrent._imageview2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393246;
 //BA.debugLineNum = 393246;BA.debugLine="ImageView3.Visible=True";
mostCurrent._imageview3.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393247;
 //BA.debugLineNum = 393247;BA.debugLine="num=0";
_num = (int) (0);
 }};
 }else 
{RDebugUtils.currentLine=393249;
 //BA.debugLineNum = 393249;BA.debugLine="Else If element=1 Then";
if (_element==1) { 
RDebugUtils.currentLine=393250;
 //BA.debugLineNum = 393250;BA.debugLine="If num=0 Then";
if (_num==0) { 
RDebugUtils.currentLine=393251;
 //BA.debugLineNum = 393251;BA.debugLine="ImageView4.Visible=True";
mostCurrent._imageview4.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393252;
 //BA.debugLineNum = 393252;BA.debugLine="ImageView5.Visible=False";
mostCurrent._imageview5.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393253;
 //BA.debugLineNum = 393253;BA.debugLine="ImageView6.Visible=False";
mostCurrent._imageview6.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393254;
 //BA.debugLineNum = 393254;BA.debugLine="num=num+1";
_num = (int) (_num+1);
 }else 
{RDebugUtils.currentLine=393256;
 //BA.debugLineNum = 393256;BA.debugLine="Else If num=1 Then";
if (_num==1) { 
RDebugUtils.currentLine=393257;
 //BA.debugLineNum = 393257;BA.debugLine="ImageView4.Visible=False";
mostCurrent._imageview4.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393258;
 //BA.debugLineNum = 393258;BA.debugLine="ImageView5.Visible=True";
mostCurrent._imageview5.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393259;
 //BA.debugLineNum = 393259;BA.debugLine="ImageView6.Visible=False";
mostCurrent._imageview6.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393260;
 //BA.debugLineNum = 393260;BA.debugLine="num=num+1";
_num = (int) (_num+1);
 }else {
RDebugUtils.currentLine=393262;
 //BA.debugLineNum = 393262;BA.debugLine="ImageView4.Visible=False";
mostCurrent._imageview4.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393263;
 //BA.debugLineNum = 393263;BA.debugLine="ImageView5.Visible=False";
mostCurrent._imageview5.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393264;
 //BA.debugLineNum = 393264;BA.debugLine="ImageView6.Visible=True";
mostCurrent._imageview6.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393265;
 //BA.debugLineNum = 393265;BA.debugLine="num=0";
_num = (int) (0);
 }};
 }else {
RDebugUtils.currentLine=393268;
 //BA.debugLineNum = 393268;BA.debugLine="If num=0 Then";
if (_num==0) { 
RDebugUtils.currentLine=393269;
 //BA.debugLineNum = 393269;BA.debugLine="ImageView7.Visible=True";
mostCurrent._imageview7.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393270;
 //BA.debugLineNum = 393270;BA.debugLine="ImageView8.Visible=False";
mostCurrent._imageview8.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393271;
 //BA.debugLineNum = 393271;BA.debugLine="ImageView9.Visible=False";
mostCurrent._imageview9.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393272;
 //BA.debugLineNum = 393272;BA.debugLine="num=num+1";
_num = (int) (_num+1);
 }else 
{RDebugUtils.currentLine=393274;
 //BA.debugLineNum = 393274;BA.debugLine="Else If num=1 Then";
if (_num==1) { 
RDebugUtils.currentLine=393275;
 //BA.debugLineNum = 393275;BA.debugLine="ImageView7.Visible=False";
mostCurrent._imageview7.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393276;
 //BA.debugLineNum = 393276;BA.debugLine="ImageView8.Visible=True";
mostCurrent._imageview8.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393277;
 //BA.debugLineNum = 393277;BA.debugLine="ImageView9.Visible=False";
mostCurrent._imageview9.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393278;
 //BA.debugLineNum = 393278;BA.debugLine="num=num+1";
_num = (int) (_num+1);
 }else {
RDebugUtils.currentLine=393280;
 //BA.debugLineNum = 393280;BA.debugLine="ImageView7.Visible=False";
mostCurrent._imageview7.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393281;
 //BA.debugLineNum = 393281;BA.debugLine="ImageView8.Visible=False";
mostCurrent._imageview8.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393282;
 //BA.debugLineNum = 393282;BA.debugLine="ImageView9.Visible=True";
mostCurrent._imageview9.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393283;
 //BA.debugLineNum = 393283;BA.debugLine="num=0";
_num = (int) (0);
 }};
 }};
RDebugUtils.currentLine=393286;
 //BA.debugLineNum = 393286;BA.debugLine="End Sub";
return "";
}
}