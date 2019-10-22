@echo off
if "%1"=="" goto :USAGE
if "%2"=="" goto :USAGE

set old=sonar-%1
set new=sonar-%2

if not exist %old% goto :1NOTEXIST
if not exist %new% goto :2NOTEXIST

echo Upgrade from %old% to %new%
echo.

echo Copying conf
move %new%\conf\sonar.properties %new%\conf\sonar.properties.bak
copy %old%\conf\sonar.properties %new%\conf /Y
echo Copying plugins
copy %old%\extensions\plugins\*.jar %new%\extensions\plugins /Y
echo.

echo Stopping service
sc stop sonar
sc delete sonar
echo.

echo Backing up database
set date=%date:~4,2%%date:~7,2%%date:~10,4%
set outfile=%old%\sonar-db-ver%1-%date%.sql
mysqldump -u root -p sonar > %outfile%
echo.

echo Starting service
call %new%\bin\windows-x86-64\InstallNTService
sc start sonar
echo.

echo To complete upgrade, access the following in a browser and follow instructions:
echo http://%hostname:9000/setup

goto :DONE
:2NOTEXIST
echo Cannot upgrade to %2. Directory does not exist
goto :DONE
:1NOTEXIST
echo Cannot upgrade from %1. Directory does not exist
goto :DONE
:USAGE
echo "Usage: %0 oldVersion newVersion"
:DONE

