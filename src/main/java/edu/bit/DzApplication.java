package edu.bit;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DzApplication extends Application<DzConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DzApplication().run(args);

    }

    @Override
    public String getName() {
        return "a-bit-of-dz";
    }

    @Override
    public void initialize(final Bootstrap<DzConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DzConfiguration configuration, final Environment environment) {
        // TODO: implement application
    }
}