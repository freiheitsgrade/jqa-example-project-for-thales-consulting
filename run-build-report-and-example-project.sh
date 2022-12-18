#!/bin/sh

mvn -f report/ clean install && mvn -f example-project/ clean install
