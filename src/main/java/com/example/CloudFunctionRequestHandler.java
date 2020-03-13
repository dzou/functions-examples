package com.example;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;
import java.io.IOException;
import org.reactivestreams.Publisher;
import org.springframework.cloud.function.context.AbstractSpringFunctionAdapterInitializer;
import reactor.core.publisher.Mono;

/**
 * Minimum-needed code for a Spring Functions adapter.
 */
public class CloudFunctionRequestHandler
    extends AbstractSpringFunctionAdapterInitializer<String> implements HttpFunction {

  public CloudFunctionRequestHandler() {
    super(CloudFunctionMain.class);
  }

  @Override
  public void service(HttpRequest request, HttpResponse response) throws IOException {
    this.initialize("");
    Publisher<?> output = this.apply(Mono.just("Hello World"));
    String result = this.result("Hello World", output);
    response.getWriter().write(result);
  }
}