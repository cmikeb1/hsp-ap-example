package org.ihc.clinical.sbs.config;

import ca.uhn.fhir.rest.server.IResourceProvider;
import org.ihc.clinical.sbs.providers.resource.PatientResourceProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmbylund on 11/6/15.
 */
@Configuration
public class ResourceProviderConfig {

    @Bean
    public List<IResourceProvider> myResourceProvidersDstu2() {
        List<IResourceProvider> resourceProviders = new ArrayList<>();
        PatientResourceProvider patientResourceProvider = new PatientResourceProvider();
        resourceProviders.add(patientResourceProvider);

        return resourceProviders;
    }
}