@echo off
echo Cleaning up old class files...

:: Delete all .class files in the current directory and subdirectories
del /s /q *.class

:: Recompile all Java source files
echo Compiling Java files...
javac *.java

:: Check if javac was successful before running the program
if %ERRORLEVEL% neq 0 (
    echo Compilation failed. Exiting...
    exit /b %ERRORLEVEL%
)

:: Run the program (replace Tetris with your main class name)
echo Running the program...
java Main

:: Prevent closing the window without confirmation
echo Press any key to close the window after the program finishes.
pause >nul

exit