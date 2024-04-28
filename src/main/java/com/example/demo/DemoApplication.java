package com.example.demo;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@ConfigurationProperties(prefix = "demo")
	public static class RootConfig {
		private Map<String, ChildConfig> pathMap;

		public Map<String, ChildConfig> getPathMap() {
			return pathMap;
		}

		public void setPathMap(Map<String, ChildConfig> pathMap) {
			this.pathMap = pathMap;
		}
	}

	public static class ChildConfig {
		private String host;
		private int port;

		public String getHost() {
			return host;
		}

		public void setHost(String host) {
			this.host = host;
		}

		public int getPort() {
			return port;
		}

		public void setPort(int port) {
			this.port = port;
		}
	}

}
