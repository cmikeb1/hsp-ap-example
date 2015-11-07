package org.ihc.clinical.sbs.config;

import ca.uhn.fhir.rest.server.provider.dstu2.ServerConformanceProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by cmbylund on 11/7/15.
 */
@Configuration
public class ConformanceProviderConfig {
    @Bean
    public ServerConformanceProvider myConformanceProviderDstu2(){
        return new ServerConformanceProvider();
    }
}
