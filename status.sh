#!/bin/sh

curl --user ashintr:amruta123 -s http://localhost:8080/job/job2/build

result=curl http://localhost:8080/job/job2/lastBuild/api/json 
echo $result