@echo off
color 0E
title Compile java program.
 
echo Welcome, %USERNAME%
echo.
set /p name="Enter java program ID to compile and run: "

echo Compiling ID%name%.java
javac Solutions/ID%name%.java
echo Running ID%name%
echo --------------
echo.
java Solutions.ID%name%
echo.
pause