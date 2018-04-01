package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,32);
if (RapidSub.canDelegate("activity_create")) return main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 34;BA.debugLine="Activity.LoadLayout(\"pantalla1\")";
Debug.ShouldStop(2);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("pantalla1")),main.mostCurrent.activityBA);
 BA.debugLineNum = 35;BA.debugLine="ImageView1.Visible=True";
Debug.ShouldStop(4);
main.mostCurrent._imageview1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 36;BA.debugLine="ImageView2.Visible=False";
Debug.ShouldStop(8);
main.mostCurrent._imageview2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 37;BA.debugLine="ImageView3.Visible=False";
Debug.ShouldStop(16);
main.mostCurrent._imageview3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 38;BA.debugLine="ImageView1.Bitmap =LoadBitmap(File.DirAssets,\"r1.";
Debug.ShouldStop(32);
main.mostCurrent._imageview1.runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("r1.jpg"))).getObject()));
 BA.debugLineNum = 39;BA.debugLine="ImageView2.Bitmap =LoadBitmap(File.DirAssets,\"r2.";
Debug.ShouldStop(64);
main.mostCurrent._imageview2.runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("r2.png"))).getObject()));
 BA.debugLineNum = 40;BA.debugLine="ImageView3.Bitmap =LoadBitmap(File.DirAssets,\"r3.";
Debug.ShouldStop(128);
main.mostCurrent._imageview3.runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("r3.jpg"))).getObject()));
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,48);
if (RapidSub.canDelegate("activity_pause")) return main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 48;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,44);
if (RapidSub.canDelegate("activity_resume")) return main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 44;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2048);
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,53);
if (RapidSub.canDelegate("button1_click")) return main.remoteMe.runUserSub(false, "main","button1_click");
 BA.debugLineNum = 53;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="If num=0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",main._num,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 55;BA.debugLine="ImageView1.Visible=False";
Debug.ShouldStop(4194304);
main.mostCurrent._imageview1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 56;BA.debugLine="ImageView2.Visible=True";
Debug.ShouldStop(8388608);
main.mostCurrent._imageview2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 57;BA.debugLine="num=num+1";
Debug.ShouldStop(16777216);
main._num = RemoteObject.solve(new RemoteObject[] {main._num,RemoteObject.createImmutable(1)}, "+",1, 1);
 }else 
{ BA.debugLineNum = 58;BA.debugLine="Else If num=1 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",main._num,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 59;BA.debugLine="ImageView2.Visible=False";
Debug.ShouldStop(67108864);
main.mostCurrent._imageview2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 60;BA.debugLine="ImageView3.Visible=True";
Debug.ShouldStop(134217728);
main.mostCurrent._imageview3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 61;BA.debugLine="num=num+1";
Debug.ShouldStop(268435456);
main._num = RemoteObject.solve(new RemoteObject[] {main._num,RemoteObject.createImmutable(1)}, "+",1, 1);
 }else {
 BA.debugLineNum = 63;BA.debugLine="ImageView3.Visible=False";
Debug.ShouldStop(1073741824);
main.mostCurrent._imageview3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 64;BA.debugLine="ImageView1.Visible=True";
Debug.ShouldStop(-2147483648);
main.mostCurrent._imageview1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 65;BA.debugLine="num=0";
Debug.ShouldStop(1);
main._num = BA.numberCast(int.class, 0);
 }};
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 24;BA.debugLine="Private ImageView1 As ImageView";
main.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private ImageView2 As ImageView";
main.mostCurrent._imageview2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private ImageView3 As ImageView";
main.mostCurrent._imageview3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private Button1 As Button";
main.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Dim num As Int=0";
main._num = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}