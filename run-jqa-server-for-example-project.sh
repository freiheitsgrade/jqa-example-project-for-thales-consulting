#!/bin/sh

( cd example-project;
  mvn -Djqassistant.store.directory=target/jqassistant/store com.buschmais.jqassistant:jqassistant-maven-plugin:$(mvn -q -DforceStdout -Dexpression=jqassistant-plugin.version help:evaluate):server 
  )

