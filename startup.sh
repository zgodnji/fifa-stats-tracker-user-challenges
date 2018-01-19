#!/usr/bin/env bash

mvn clean package

docker build -t ancina/user-challenge .

docker run -d -p 8088:8088 -t ancina/user-challenge