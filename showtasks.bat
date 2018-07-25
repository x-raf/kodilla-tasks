call runcrud
if "%ERRORLEVEL%" == "0" goto chromestart
echo.
echo GRADLEW BUILD has errors - breaking work
goto fail

:chromestart
start chrome "http://localhost:8080/crud/v1/task/getTasks"
if "%ERRORLEVEL%" == "0" goto end
echo.
echo Cannot open Chrome and show tasks - breaking work

:fail
echo.
echo There were errors!

:end
echo.
echo Work is finished.