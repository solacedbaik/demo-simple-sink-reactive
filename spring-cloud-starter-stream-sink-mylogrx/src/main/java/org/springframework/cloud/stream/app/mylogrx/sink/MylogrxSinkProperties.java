/*
 * 
 * Copyright (c) 2018 Solace Corp.
 * 
 */
package org.springframework.cloud.stream.app.mylogrx.sink;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.integration.handler.LoggingHandler;
import javax.validation.constraints.NotNull;

import static org.springframework.integration.handler.LoggingHandler.Level.INFO;

/**
 * Configuration properties for the Mylogrx Sink module.
 *
 * @author Solace Corp.
 */
@ConfigurationProperties("mylogrx")
public class MylogrxSinkProperties {
	private LoggingHandler.Level level = INFO;

	@NotNull
	public LoggingHandler.Level getLevel() {
		return level;
	}

	public void setLevel(LoggingHandler.Level level) {
		this.level = level;
	}

}
