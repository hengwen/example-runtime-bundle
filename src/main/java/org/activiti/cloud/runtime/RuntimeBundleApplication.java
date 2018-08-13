package org.activiti.cloud.runtime;

import org.activiti.cloud.starter.rb.configuration.ActivitiRuntimeBundle;
import org.activiti.cloud.starter.rb.configuration.SwaggerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ActivitiRuntimeBundle
@Import(SwaggerConfig.class) //TODO: this is temporary, will apply this in service layer
public class RuntimeBundleApplication {

    public static void main(String[] args) {
        SpringApplication.run(RuntimeBundleApplication.class,
                              args);
    }
}