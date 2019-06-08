B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9
@EndOfDesignText@

'Position = Scroll Position!
#Event: ScrollChanged (Position As Int)

private Sub Class_Globals
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Panel
	Private Const DefaultColorConstant As Int = -984833 'ignore
	Private xml As XmlLayoutBuilder
	Dim HeadPanel As Panel
	Dim FootPanel As Panel
End Sub

'CallBack - Should Be Me!
'EventName - Event Name For ScrollChanged Event!
Public Sub Initialize (CallBack As Object,EventName As String)
	mEventName = EventName
	mCallBack = CallBack
End Sub

Public Sub DesignerCreateView (Base As Panel, Lbl As Label, Props As Map)
	mBase = Base
	
	
End Sub

private Sub OnScrollChanged_Event (MethodName As String, Args() As Object) As Object
	Dim Position As Int = Args(2)
	CallSubDelayed2(mCallBack,mEventName&"_ScrollChanged",Position)
	Return True
End Sub

Public Sub GetBase As Panel
	Return mBase
End Sub

'Public Sub HeadPanel As Panel
'	Return pnlHeadPanel
'End Sub
'
'public Sub FootPanel As Panel
'	Return pnlFootPanel
'End Sub
