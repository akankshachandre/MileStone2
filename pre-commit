#!/bin/sh

count=`ls -1 *.pem 2>/dev/null | wc -l`
FILE="./test.js"
re="config.token[=][\"][a-zA-Z0-9\"]"
if [ $count != 0 ] 
    then 
    echo '.pem file found'
    echo 'Rejecting commit'
    exit 1
fi
if grep -q $re $FILE
    then
    echo 'File contains security token'
    echo 'Rejecting commit'
    exit 1
fi 