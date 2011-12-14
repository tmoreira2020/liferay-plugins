@echo off

if "" == "%1" goto errorCreate

if "" == "%2" goto errorCreate

call ant -Dservice.name=%1 -Dservice.display.name=%2 create

rem call ant deploy

goto end

:errorCreate
	echo.
	echo Usage: create.bat hello-world "Hello World"
	echo.
	echo The first hello-world is your service id. A new directory will be created based
	echo on the service id.
	echo.
	echo The second "Hello World" is the service's display name. The quotation marks are
	echo only needed because there is a space in the display name.
	echo.

	goto end

:end
