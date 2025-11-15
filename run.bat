@echo off
setx JAVA_HOME C:\Program Files\Java\jdk-25 >nul 2>&1
set JAVA_HOME=C:\Program Files\Java\jdk-25
set PATH=%JAVA_HOME%\bin;%PATH%
cd /d "%~dp0"
javac Choose.java
java Choose
pause
