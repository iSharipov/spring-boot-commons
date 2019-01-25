package io.github.isharipov.commons.listeners.autoconfigure;

import io.github.isharipov.commons.listeners.CommonsApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonsListenersAutoconfigure {

	@Bean
	public CommonsApplicationReadyEvent commonsApplicationReadyEvent() {
		return new CommonsApplicationReadyEvent();
	}
}