package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,29);
if (RapidSub.canDelegate("activity_create")) return main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 31;BA.debugLine="Activity.LoadLayout(\"pantalla1\")";
Debug.ShouldStop(1073741824);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("pantalla1")),main.mostCurrent.activityBA);
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,39);
if (RapidSub.canDelegate("activity_pause")) return main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,35);
if (RapidSub.canDelegate("activity_resume")) return main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Button1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,44);
if (RapidSub.canDelegate("button1_click")) return main.remoteMe.runUserSub(false, "main","button1_click");
RemoteObject _intvalue1 = RemoteObject.createImmutable(0f);
RemoteObject _intvalue2 = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 44;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="Dim intvalue1 As Float";
Debug.ShouldStop(4096);
_intvalue1 = RemoteObject.createImmutable(0f);Debug.locals.put("intvalue1", _intvalue1);
 BA.debugLineNum = 46;BA.debugLine="Dim intvalue2 As Float";
Debug.ShouldStop(8192);
_intvalue2 = RemoteObject.createImmutable(0f);Debug.locals.put("intvalue2", _intvalue2);
 BA.debugLineNum = 47;BA.debugLine="intvalue1=EditText1.Text";
Debug.ShouldStop(16384);
_intvalue1 = BA.numberCast(float.class, main.mostCurrent._edittext1.runMethod(true,"getText"));Debug.locals.put("intvalue1", _intvalue1);
 BA.debugLineNum = 48;BA.debugLine="intvalue2=EditText2.Text";
Debug.ShouldStop(32768);
_intvalue2 = BA.numberCast(float.class, main.mostCurrent._edittext2.runMethod(true,"getText"));Debug.locals.put("intvalue2", _intvalue2);
 BA.debugLineNum = 49;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 50;BA.debugLine="Msgbox(intvalue1/(intvalue2*intvalue2),\"El indic";
Debug.ShouldStop(131072);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_intvalue1,(RemoteObject.solve(new RemoteObject[] {_intvalue2,_intvalue2}, "*",0, 0))}, "/",0, 0))),(Object)(RemoteObject.createImmutable("El indice de masa Corporal es:")),main.mostCurrent.activityBA);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e8.toString()); BA.debugLineNum = 52;BA.debugLine="Msgbox(\"No se han ingresado numeros validos\",\"¡E";
Debug.ShouldStop(524288);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("No se han ingresado numeros validos")),(Object)(RemoteObject.createImmutable("¡Error!")),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
 //BA.debugLineNum = 25;BA.debugLine="Private EditText1 As EditText";
main.mostCurrent._edittext1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private EditText2 As EditText";
main.mostCurrent._edittext2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
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