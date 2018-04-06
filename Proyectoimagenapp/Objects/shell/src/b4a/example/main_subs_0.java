package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,39);
if (RapidSub.canDelegate("activity_create")) return main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="Activity.LoadLayout(\"pantalla1\")";
Debug.ShouldStop(256);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("pantalla1")),main.mostCurrent.activityBA);
 BA.debugLineNum = 42;BA.debugLine="ImageView1.Visible=True";
Debug.ShouldStop(512);
main.mostCurrent._imageview1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 43;BA.debugLine="ImageView2.Visible=False";
Debug.ShouldStop(1024);
main.mostCurrent._imageview2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 44;BA.debugLine="ImageView3.Visible=False";
Debug.ShouldStop(2048);
main.mostCurrent._imageview3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 45;BA.debugLine="ImageView4.Visible=False";
Debug.ShouldStop(4096);
main.mostCurrent._imageview4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 46;BA.debugLine="ImageView5.Visible=False";
Debug.ShouldStop(8192);
main.mostCurrent._imageview5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 47;BA.debugLine="ImageView6.Visible=False";
Debug.ShouldStop(16384);
main.mostCurrent._imageview6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 48;BA.debugLine="ImageView7.Visible=False";
Debug.ShouldStop(32768);
main.mostCurrent._imageview7.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 49;BA.debugLine="ImageView8.Visible=False";
Debug.ShouldStop(65536);
main.mostCurrent._imageview8.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 50;BA.debugLine="ImageView9.Visible=False";
Debug.ShouldStop(131072);
main.mostCurrent._imageview9.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 51;BA.debugLine="ImageView1.Bitmap =LoadBitmap(File.DirAssets,\"r1.";
Debug.ShouldStop(262144);
main.mostCurrent._imageview1.runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("r1.jpg"))).getObject()));
 BA.debugLineNum = 52;BA.debugLine="ImageView2.Bitmap =LoadBitmap(File.DirAssets,\"r2.";
Debug.ShouldStop(524288);
main.mostCurrent._imageview2.runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("r2.png"))).getObject()));
 BA.debugLineNum = 53;BA.debugLine="ImageView3.Bitmap =LoadBitmap(File.DirAssets,\"r3.";
Debug.ShouldStop(1048576);
main.mostCurrent._imageview3.runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("r3.jpg"))).getObject()));
 BA.debugLineNum = 54;BA.debugLine="ImageView4.Bitmap =LoadBitmap(File.DirAssets,\"r1.";
Debug.ShouldStop(2097152);
main.mostCurrent._imageview4.runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("r1.jpg"))).getObject()));
 BA.debugLineNum = 55;BA.debugLine="ImageView5.Bitmap =LoadBitmap(File.DirAssets,\"r2.";
Debug.ShouldStop(4194304);
main.mostCurrent._imageview5.runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("r2.png"))).getObject()));
 BA.debugLineNum = 56;BA.debugLine="ImageView6.Bitmap =LoadBitmap(File.DirAssets,\"r3.";
Debug.ShouldStop(8388608);
main.mostCurrent._imageview6.runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("r3.jpg"))).getObject()));
 BA.debugLineNum = 57;BA.debugLine="ImageView7.Bitmap =LoadBitmap(File.DirAssets,\"r1.";
Debug.ShouldStop(16777216);
main.mostCurrent._imageview7.runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("r1.jpg"))).getObject()));
 BA.debugLineNum = 58;BA.debugLine="ImageView8.Bitmap =LoadBitmap(File.DirAssets,\"r2.";
Debug.ShouldStop(33554432);
main.mostCurrent._imageview8.runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("r2.png"))).getObject()));
 BA.debugLineNum = 59;BA.debugLine="ImageView9.Bitmap =LoadBitmap(File.DirAssets,\"r3.";
Debug.ShouldStop(67108864);
main.mostCurrent._imageview9.runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("r3.jpg"))).getObject()));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,67);
if (RapidSub.canDelegate("activity_pause")) return main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 67;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 69;BA.debugLine="End Sub";
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,63);
if (RapidSub.canDelegate("activity_resume")) return main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 63;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 65;BA.debugLine="End Sub";
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
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,72);
if (RapidSub.canDelegate("button1_click")) return main.remoteMe.runUserSub(false, "main","button1_click");
 BA.debugLineNum = 72;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="ImageView9.Visible=False";
Debug.ShouldStop(256);
main.mostCurrent._imageview9.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 74;BA.debugLine="ImageView8.Visible=False";
Debug.ShouldStop(512);
main.mostCurrent._imageview8.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 75;BA.debugLine="ImageView7.Visible=False";
Debug.ShouldStop(1024);
main.mostCurrent._imageview7.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 76;BA.debugLine="ImageView6.Visible=False";
Debug.ShouldStop(2048);
main.mostCurrent._imageview6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 77;BA.debugLine="ImageView5.Visible=False";
Debug.ShouldStop(4096);
main.mostCurrent._imageview5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 78;BA.debugLine="ImageView4.Visible=False";
Debug.ShouldStop(8192);
main.mostCurrent._imageview4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 79;BA.debugLine="ImageView3.Visible=False";
Debug.ShouldStop(16384);
main.mostCurrent._imageview3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 80;BA.debugLine="ImageView2.Visible=False";
Debug.ShouldStop(32768);
main.mostCurrent._imageview2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 81;BA.debugLine="ImageView1.Visible=False";
Debug.ShouldStop(65536);
main.mostCurrent._imageview1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 83;BA.debugLine="If element=0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",main._element,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 84;BA.debugLine="If num=0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",main._num,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 85;BA.debugLine="ImageView1.Visible=True";
Debug.ShouldStop(1048576);
main.mostCurrent._imageview1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 86;BA.debugLine="ImageView2.Visible=False";
Debug.ShouldStop(2097152);
main.mostCurrent._imageview2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 87;BA.debugLine="ImageView3.Visible=False";
Debug.ShouldStop(4194304);
main.mostCurrent._imageview3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 88;BA.debugLine="num=num+1";
Debug.ShouldStop(8388608);
main._num = RemoteObject.solve(new RemoteObject[] {main._num,RemoteObject.createImmutable(1)}, "+",1, 1);
 }else 
{ BA.debugLineNum = 90;BA.debugLine="Else If num=1 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",main._num,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 91;BA.debugLine="ImageView1.Visible=False";
Debug.ShouldStop(67108864);
main.mostCurrent._imageview1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 92;BA.debugLine="ImageView2.Visible=True";
Debug.ShouldStop(134217728);
main.mostCurrent._imageview2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 93;BA.debugLine="ImageView3.Visible=False";
Debug.ShouldStop(268435456);
main.mostCurrent._imageview3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 94;BA.debugLine="num=num+1";
Debug.ShouldStop(536870912);
main._num = RemoteObject.solve(new RemoteObject[] {main._num,RemoteObject.createImmutable(1)}, "+",1, 1);
 }else {
 BA.debugLineNum = 96;BA.debugLine="ImageView1.Visible=False";
Debug.ShouldStop(-2147483648);
main.mostCurrent._imageview1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 97;BA.debugLine="ImageView2.Visible=False";
Debug.ShouldStop(1);
main.mostCurrent._imageview2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 98;BA.debugLine="ImageView3.Visible=True";
Debug.ShouldStop(2);
main.mostCurrent._imageview3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 99;BA.debugLine="num=0";
Debug.ShouldStop(4);
main._num = BA.numberCast(int.class, 0);
 }};
 }else 
{ BA.debugLineNum = 101;BA.debugLine="Else If element=1 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",main._element,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 102;BA.debugLine="If num=0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",main._num,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 103;BA.debugLine="ImageView4.Visible=True";
Debug.ShouldStop(64);
main.mostCurrent._imageview4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 104;BA.debugLine="ImageView5.Visible=False";
Debug.ShouldStop(128);
main.mostCurrent._imageview5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 105;BA.debugLine="ImageView6.Visible=False";
Debug.ShouldStop(256);
main.mostCurrent._imageview6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 106;BA.debugLine="num=num+1";
Debug.ShouldStop(512);
main._num = RemoteObject.solve(new RemoteObject[] {main._num,RemoteObject.createImmutable(1)}, "+",1, 1);
 }else 
{ BA.debugLineNum = 108;BA.debugLine="Else If num=1 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",main._num,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 109;BA.debugLine="ImageView4.Visible=False";
Debug.ShouldStop(4096);
main.mostCurrent._imageview4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 110;BA.debugLine="ImageView5.Visible=True";
Debug.ShouldStop(8192);
main.mostCurrent._imageview5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 111;BA.debugLine="ImageView6.Visible=False";
Debug.ShouldStop(16384);
main.mostCurrent._imageview6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 112;BA.debugLine="num=num+1";
Debug.ShouldStop(32768);
main._num = RemoteObject.solve(new RemoteObject[] {main._num,RemoteObject.createImmutable(1)}, "+",1, 1);
 }else {
 BA.debugLineNum = 114;BA.debugLine="ImageView4.Visible=False";
Debug.ShouldStop(131072);
main.mostCurrent._imageview4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 115;BA.debugLine="ImageView5.Visible=False";
Debug.ShouldStop(262144);
main.mostCurrent._imageview5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 116;BA.debugLine="ImageView6.Visible=True";
Debug.ShouldStop(524288);
main.mostCurrent._imageview6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 117;BA.debugLine="num=0";
Debug.ShouldStop(1048576);
main._num = BA.numberCast(int.class, 0);
 }};
 }else {
 BA.debugLineNum = 120;BA.debugLine="If num=0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",main._num,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 121;BA.debugLine="ImageView7.Visible=True";
Debug.ShouldStop(16777216);
main.mostCurrent._imageview7.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 122;BA.debugLine="ImageView8.Visible=False";
Debug.ShouldStop(33554432);
main.mostCurrent._imageview8.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 123;BA.debugLine="ImageView9.Visible=False";
Debug.ShouldStop(67108864);
main.mostCurrent._imageview9.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 124;BA.debugLine="num=num+1";
Debug.ShouldStop(134217728);
main._num = RemoteObject.solve(new RemoteObject[] {main._num,RemoteObject.createImmutable(1)}, "+",1, 1);
 }else 
{ BA.debugLineNum = 126;BA.debugLine="Else If num=1 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",main._num,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 127;BA.debugLine="ImageView7.Visible=False";
Debug.ShouldStop(1073741824);
main.mostCurrent._imageview7.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 128;BA.debugLine="ImageView8.Visible=True";
Debug.ShouldStop(-2147483648);
main.mostCurrent._imageview8.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 129;BA.debugLine="ImageView9.Visible=False";
Debug.ShouldStop(1);
main.mostCurrent._imageview9.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 130;BA.debugLine="num=num+1";
Debug.ShouldStop(2);
main._num = RemoteObject.solve(new RemoteObject[] {main._num,RemoteObject.createImmutable(1)}, "+",1, 1);
 }else {
 BA.debugLineNum = 132;BA.debugLine="ImageView7.Visible=False";
Debug.ShouldStop(8);
main.mostCurrent._imageview7.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 133;BA.debugLine="ImageView8.Visible=False";
Debug.ShouldStop(16);
main.mostCurrent._imageview8.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 134;BA.debugLine="ImageView9.Visible=True";
Debug.ShouldStop(32);
main.mostCurrent._imageview9.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 135;BA.debugLine="num=0";
Debug.ShouldStop(64);
main._num = BA.numberCast(int.class, 0);
 }};
 }};
 BA.debugLineNum = 138;BA.debugLine="End Sub";
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
public static RemoteObject  _button2_click() throws Exception{
try {
		Debug.PushSubsStack("Button2_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,140);
if (RapidSub.canDelegate("button2_click")) return main.remoteMe.runUserSub(false, "main","button2_click");
 BA.debugLineNum = 140;BA.debugLine="Sub Button2_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 141;BA.debugLine="element=element+1";
Debug.ShouldStop(4096);
main._element = RemoteObject.solve(new RemoteObject[] {main._element,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 142;BA.debugLine="If element>2 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",main._element,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 143;BA.debugLine="element=0";
Debug.ShouldStop(16384);
main._element = BA.numberCast(int.class, 0);
 };
 BA.debugLineNum = 145;BA.debugLine="ImageView9.Visible=False";
Debug.ShouldStop(65536);
main.mostCurrent._imageview9.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 146;BA.debugLine="ImageView8.Visible=False";
Debug.ShouldStop(131072);
main.mostCurrent._imageview8.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 147;BA.debugLine="ImageView7.Visible=False";
Debug.ShouldStop(262144);
main.mostCurrent._imageview7.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 148;BA.debugLine="ImageView6.Visible=False";
Debug.ShouldStop(524288);
main.mostCurrent._imageview6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 149;BA.debugLine="ImageView5.Visible=False";
Debug.ShouldStop(1048576);
main.mostCurrent._imageview5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 150;BA.debugLine="ImageView4.Visible=False";
Debug.ShouldStop(2097152);
main.mostCurrent._imageview4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 151;BA.debugLine="ImageView3.Visible=False";
Debug.ShouldStop(4194304);
main.mostCurrent._imageview3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 152;BA.debugLine="ImageView2.Visible=False";
Debug.ShouldStop(8388608);
main.mostCurrent._imageview2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 153;BA.debugLine="ImageView1.Visible=False";
Debug.ShouldStop(16777216);
main.mostCurrent._imageview1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 155;BA.debugLine="If element=0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",main._element,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 156;BA.debugLine="If num=0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",main._num,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 157;BA.debugLine="ImageView1.Visible=True";
Debug.ShouldStop(268435456);
main.mostCurrent._imageview1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 158;BA.debugLine="ImageView2.Visible=False";
Debug.ShouldStop(536870912);
main.mostCurrent._imageview2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 159;BA.debugLine="ImageView3.Visible=False";
Debug.ShouldStop(1073741824);
main.mostCurrent._imageview3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 160;BA.debugLine="num=num+1";
Debug.ShouldStop(-2147483648);
main._num = RemoteObject.solve(new RemoteObject[] {main._num,RemoteObject.createImmutable(1)}, "+",1, 1);
 }else 
{ BA.debugLineNum = 162;BA.debugLine="Else If num=1 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",main._num,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 163;BA.debugLine="ImageView1.Visible=False";
Debug.ShouldStop(4);
main.mostCurrent._imageview1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 164;BA.debugLine="ImageView2.Visible=True";
Debug.ShouldStop(8);
main.mostCurrent._imageview2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 165;BA.debugLine="ImageView3.Visible=False";
Debug.ShouldStop(16);
main.mostCurrent._imageview3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 166;BA.debugLine="num=num+1";
Debug.ShouldStop(32);
main._num = RemoteObject.solve(new RemoteObject[] {main._num,RemoteObject.createImmutable(1)}, "+",1, 1);
 }else {
 BA.debugLineNum = 168;BA.debugLine="ImageView1.Visible=False";
Debug.ShouldStop(128);
main.mostCurrent._imageview1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 169;BA.debugLine="ImageView2.Visible=False";
Debug.ShouldStop(256);
main.mostCurrent._imageview2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 170;BA.debugLine="ImageView3.Visible=True";
Debug.ShouldStop(512);
main.mostCurrent._imageview3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 171;BA.debugLine="num=0";
Debug.ShouldStop(1024);
main._num = BA.numberCast(int.class, 0);
 }};
 }else 
{ BA.debugLineNum = 173;BA.debugLine="Else If element=1 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",main._element,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 174;BA.debugLine="If num=0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",main._num,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 175;BA.debugLine="ImageView4.Visible=True";
Debug.ShouldStop(16384);
main.mostCurrent._imageview4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 176;BA.debugLine="ImageView5.Visible=False";
Debug.ShouldStop(32768);
main.mostCurrent._imageview5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 177;BA.debugLine="ImageView6.Visible=False";
Debug.ShouldStop(65536);
main.mostCurrent._imageview6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 178;BA.debugLine="num=num+1";
Debug.ShouldStop(131072);
main._num = RemoteObject.solve(new RemoteObject[] {main._num,RemoteObject.createImmutable(1)}, "+",1, 1);
 }else 
{ BA.debugLineNum = 180;BA.debugLine="Else If num=1 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",main._num,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 181;BA.debugLine="ImageView4.Visible=False";
Debug.ShouldStop(1048576);
main.mostCurrent._imageview4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 182;BA.debugLine="ImageView5.Visible=True";
Debug.ShouldStop(2097152);
main.mostCurrent._imageview5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 183;BA.debugLine="ImageView6.Visible=False";
Debug.ShouldStop(4194304);
main.mostCurrent._imageview6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 184;BA.debugLine="num=num+1";
Debug.ShouldStop(8388608);
main._num = RemoteObject.solve(new RemoteObject[] {main._num,RemoteObject.createImmutable(1)}, "+",1, 1);
 }else {
 BA.debugLineNum = 186;BA.debugLine="ImageView4.Visible=False";
Debug.ShouldStop(33554432);
main.mostCurrent._imageview4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 187;BA.debugLine="ImageView5.Visible=False";
Debug.ShouldStop(67108864);
main.mostCurrent._imageview5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 188;BA.debugLine="ImageView6.Visible=True";
Debug.ShouldStop(134217728);
main.mostCurrent._imageview6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 189;BA.debugLine="num=0";
Debug.ShouldStop(268435456);
main._num = BA.numberCast(int.class, 0);
 }};
 }else {
 BA.debugLineNum = 192;BA.debugLine="If num=0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",main._num,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 193;BA.debugLine="ImageView7.Visible=True";
Debug.ShouldStop(1);
main.mostCurrent._imageview7.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 194;BA.debugLine="ImageView8.Visible=False";
Debug.ShouldStop(2);
main.mostCurrent._imageview8.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 195;BA.debugLine="ImageView9.Visible=False";
Debug.ShouldStop(4);
main.mostCurrent._imageview9.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 196;BA.debugLine="num=num+1";
Debug.ShouldStop(8);
main._num = RemoteObject.solve(new RemoteObject[] {main._num,RemoteObject.createImmutable(1)}, "+",1, 1);
 }else 
{ BA.debugLineNum = 198;BA.debugLine="Else If num=1 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",main._num,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 199;BA.debugLine="ImageView7.Visible=False";
Debug.ShouldStop(64);
main.mostCurrent._imageview7.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 200;BA.debugLine="ImageView8.Visible=True";
Debug.ShouldStop(128);
main.mostCurrent._imageview8.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 201;BA.debugLine="ImageView9.Visible=False";
Debug.ShouldStop(256);
main.mostCurrent._imageview9.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 202;BA.debugLine="num=num+1";
Debug.ShouldStop(512);
main._num = RemoteObject.solve(new RemoteObject[] {main._num,RemoteObject.createImmutable(1)}, "+",1, 1);
 }else {
 BA.debugLineNum = 204;BA.debugLine="ImageView7.Visible=False";
Debug.ShouldStop(2048);
main.mostCurrent._imageview7.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 205;BA.debugLine="ImageView8.Visible=False";
Debug.ShouldStop(4096);
main.mostCurrent._imageview8.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 206;BA.debugLine="ImageView9.Visible=True";
Debug.ShouldStop(8192);
main.mostCurrent._imageview9.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 207;BA.debugLine="num=0";
Debug.ShouldStop(16384);
main._num = BA.numberCast(int.class, 0);
 }};
 }};
 BA.debugLineNum = 210;BA.debugLine="End Sub";
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 24;BA.debugLine="Private ImageView1 As ImageView";
main.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private ImageView2 As ImageView";
main.mostCurrent._imageview2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private ImageView3 As ImageView";
main.mostCurrent._imageview3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Dim element As Int=0";
main._element = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 28;BA.debugLine="Private Button1 As Button";
main.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Dim num As Int=0";
main._num = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 31;BA.debugLine="Private ImageView4 As ImageView";
main.mostCurrent._imageview4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private ImageView5 As ImageView";
main.mostCurrent._imageview5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private ImageView6 As ImageView";
main.mostCurrent._imageview6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private ImageView7 As ImageView";
main.mostCurrent._imageview7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private ImageView8 As ImageView";
main.mostCurrent._imageview8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private ImageView9 As ImageView";
main.mostCurrent._imageview9 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
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