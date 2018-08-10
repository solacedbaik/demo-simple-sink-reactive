/*
 * 
 * Copyright (c) 2018 Solace Corp.
 * 
 */
package org.springframework.cloud.stream.app.mylogrx.sink;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.annotation.Input;
import java.util.logging.Level;

import reactor.core.publisher.Flux;
import reactor.core.publisher.SignalType;

/**
 * A simple logger sink
 *
 * @author Solace Corp
 */
@EnableBinding(Sink.class)
@EnableConfigurationProperties(MylogrxSinkProperties.class)
public class MylogrxSinkConfiguration {
	@Autowired
	private MylogrxSinkProperties properties;

	// Functional (reactive) style
	@StreamListener
	public void log(@Input(Sink.INPUT) Flux<String> payload) {
		payload.log("payload", Level.parse(properties.getLevel().toString()), SignalType.ON_NEXT).subscribe();
	}
}