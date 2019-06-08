package amin_mohamadi.ir.parallax;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class parallaxscrollview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "amin_mohamadi.ir.parallax.parallaxscrollview");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", amin_mohamadi.ir.parallax.parallaxscrollview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbase = null;
public int _defaultcolorconstant = 0;
public anywheresoftware.b4a.object.XmlLayoutBuilder _xml = null;
public anywheresoftware.b4a.objects.PanelWrapper _headpanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _footpanel = null;
public amin_mohamadi.ir.parallax.main _main = null;
public amin_mohamadi.ir.parallax.starter _starter = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="private Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 7;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 8;BA.debugLine="Private mBase As Panel";
_mbase = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private Const DefaultColorConstant As Int = -9848";
_defaultcolorconstant = (int) (-984833);
 //BA.debugLineNum = 10;BA.debugLine="Private xml As XmlLayoutBuilder";
_xml = new anywheresoftware.b4a.object.XmlLayoutBuilder();
 //BA.debugLineNum = 11;BA.debugLine="Dim HeadPanel As Panel";
_headpanel = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Dim FootPanel As Panel";
_footpanel = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
 //BA.debugLineNum = 23;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Public Sub GetBase As Panel";
 //BA.debugLineNum = 35;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize (CallBack As Object,EventNam";
 //BA.debugLineNum = 18;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 19;BA.debugLine="mCallBack = CallBack";
_mcallback = _callback;
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public Object  _onscrollchanged_event(String _methodname,Object[] _args) throws Exception{
int _position = 0;
 //BA.debugLineNum = 28;BA.debugLine="private Sub OnScrollChanged_Event (MethodName As S";
 //BA.debugLineNum = 29;BA.debugLine="Dim Position As Int = Args(2)";
_position = (int)(BA.ObjectToNumber(_args[(int) (2)]));
 //BA.debugLineNum = 30;BA.debugLine="CallSubDelayed2(mCallBack,mEventName&\"_ScrollChan";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_ScrollChanged",(Object)(_position));
 //BA.debugLineNum = 31;BA.debugLine="Return True";
if (true) return (Object)(__c.True);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
