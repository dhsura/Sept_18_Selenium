 ;wait ofr 10 sec to upload File
 ;Local $windID = WinWait ("[CLASS:#32770]","",10)
 WinWait("[CLASS:#32770]","",10)
 
 ;Setfocus on file Upload text field in Upload window
 ;controlSettext  ($windID,"",Edit1)
 ControlFocus("[CLASS:#32770]","","Edit1")
 
 
 ;Set file Name 
 ;Control Set Text($windId, "","Edit1",""&$Cmdline[1])
 ControlSetText("[CLASS:#32770]","","Edit1",""&$CmdLine[1])
 ;""&$Cmdline[1]
 ;"D:\Acceleration\Workspace2\Sept_18_Selenium\FileUploads\Data.txt"
 
 
 ;wait for  2 second
 Sleep(2000)
 
 ;Click on Open Button
 ;Control Click($windId, "","Button1")
 ControlClick("[CLASS:#32770]","","Button1")