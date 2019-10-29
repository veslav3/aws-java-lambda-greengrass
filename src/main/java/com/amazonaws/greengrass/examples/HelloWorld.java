/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 */

/*
 * Demonstrates a simple publish to a topic using Greengrass Core Java SDK
 * This lambda function will retrieve underlying platform information and send
 * a hello world message along with the platform information to the topic
 * 'hello/world'. The function will sleep for five seconds, then repeat.
 * Since the function is long-lived it will run forever when deployed to a
 * Greengrass core.
 */

package com.amazonaws.greengrass.examples;

import java.util.Timer;

import com.amazonaws.services.lambda.runtime.Context;

public class HelloWorld {
    static {
        Timer timer = new Timer();
        // Repeat publishing a message every 5 seconds
        timer.scheduleAtFixedRate(new PublishHelloWorld(), 0, 5000);
    }

    public String handleRequest(Object input, Context context) {
        return "Hello from java";
    }
}

