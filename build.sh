#! /bin/sh

cd flexbison
flex flex.l
bison bison.y
mv bison.java ../src/fakescript/bison.java -f

