#!/bin/bash  
echo "#--------------------------#"                    
echo "usage ./run <javaFileName> #------------------------------------------------------------------------------------------#
(without .java at the end  and the file will be compiled and executed) you can also exec with args to the main method #
#---------------------------------------------------------------------------------------------------------------------#
"
echo "Compiling " $1.java
echo "
"
javac $1.java

echo "running class: " $1
echo " ---->------------>------------->
"
java $1 $2