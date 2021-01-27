package com.example;

import org.apache.camel.builder.endpoint.EndpointRouteBuilder;

/**
 * A Camel Java DSL Router
 */
public class MyRouteBuilder extends EndpointRouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {

        getContext().setManagementName("foo");
        from(stream("in").promptMessage("What:")).to(file("/tmp/t").fileName("xout"));
    }

}
