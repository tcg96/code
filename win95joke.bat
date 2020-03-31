@echo off
echo.
echo To help reduce software piracy, please activate your copy of Windows now.
echo Activation over the Internet is quick and easy.
echo.
echo ------------------------------------------------------------------------
echo You don't need to give your name or other personal information when you
echo activate Windows.
echo ------------------------------------------------------------------------
echo.
echo Do you want to activate Windows 95 now?
choice

cls
echo.
echo Generating new Installation ID...
choice /C:AB /T:A,6 > nul

cls
echo.
echo Your Installation ID:
echo 380342-750154-186303-420069-202004-040100-123456
choice /C:AB /T:A,1 > nul
echo.
echo Checking for connectivity...
choice /C:AB /T:A,5 > nul

cls
echo.
echo Unable to establish a connection with the activation server.
echo Please check your network settings and your computer's date,
echo then try again.
echo.
choice /C:AB /T:A,9 > nul
pause
echo.
echo.
echo Happy April Fools' day!
echo And thank you for watching. Video by TheComputerGuy96