#! /bin/sh

cd flexbison
jflex jflex.flex
mv Lexer.java ../src/fakescript/Lexer.java -f

