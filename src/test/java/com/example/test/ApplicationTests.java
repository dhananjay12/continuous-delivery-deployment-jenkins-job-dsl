package com.example.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.junit.Test;

import javaposse.jobdsl.dsl.DslScriptLoader;
import javaposse.jobdsl.dsl.MemoryJobManagement;

public class ApplicationTests {

  @Test
  public void should_compile_scripts() throws IOException {
    // Simulate running Jenkins
    MemoryJobManagement jm = new MemoryJobManagement();
    DslScriptLoader loader = new DslScriptLoader(jm);
    String scriptText = new String(Files.readAllBytes(new File("jenkins/jobdsl.groovy").toPath()));

    loader.runScript(scriptText);
  }
}
