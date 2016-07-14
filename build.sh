#! /bin/sh

cd flexbison
jflex flex.l
bison bison.y
mv bison.java ../src/fakescript/bison.java -f
mv Yylex.java ../src/fakescript/Yylex.java -f

