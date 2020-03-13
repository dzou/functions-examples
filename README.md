# functions-examples
Sandbox for Cloud Functions Experiments

- `com.example` - contains the minimum code needed for an adapter; can be used to reproduce the issue:

```
WARNING: Failed to execute com.example.CloudFunctionRequestHandler
java.lang.IllegalArgumentException: No auto configuration classes found in META-INF/spring.factories. If you are using a custom packaging, make sure that file is correct.
```

after running `mvn function:run`

- `com.basic` - just contains the basic non-spring example of a function that is deployable to GCF.
