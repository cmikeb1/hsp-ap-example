package org.ihc.clinical.sbs.config;

import org.ihc.clinical.sbs.providers.system.SystemTagsProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by cmbylund on 11/7/15.
 */
@Configuration
public class SystemProviderConfig {
    @Bean
    public Object mySystemProviderDstu2() {
        return new SystemTagsProvider();
    }
}
