package org.example;

import org.example.config.Config;
import org.example.customer.Mahesh;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInit {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(Config.class);
        ctx.refresh();

        var mahesh = ctx.getBean(Mahesh.class);

        ctx.registerShutdownHook();
    }
}
