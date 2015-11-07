package org.ihc.clinical.sbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by cmbylund on 11/6/15.
 */
@SpringBootApplication
@ComponentScan({"org.ihc.clinical.sbs", "org.ihc.clinical.sbs.config"})
public class FhirExampleApp extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(FhirExampleApp.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(FhirExampleApp.class, args);
    }
}
