package com.example;

import io.quarkus.runtime.QuarkusApplication;
import org.apache.camel.main.Main;

import javax.enterprise.context.ApplicationScoped;

/**
 * A Camel Application
 */
@ApplicationScoped
public class MainApp implements QuarkusApplication {

    @Override
    public int run(String... args) throws Exception {
        Main main = new Main();
        main.configure().addRoutesBuilder(new MyRouteBuilder());
        main.run(args);
        return 0;
    }
}

