package com.basic;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;

import java.io.IOException;
import java.io.Writer;

public class BasicHandler implements HttpFunction {

  @Override
  public void service(HttpRequest request, HttpResponse response) throws IOException {
    Writer writer = response.getWriter();
    writer.write("Hello world!");
  }
}
