package com.maslui.test;

import org.apache.camel.spring.boot.FatJarRouter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CamelTest extends FatJarRouter {
	
	private @Value("/Users/samlui/Documents/workspace/camel-test/files/output") String outputDirectory;
    private @Value("/Users/samlui/Documents/workspace/camel-test/files/input") String inputDirectory;
    
	@Override
	public void configure() throws Exception {
		from("file:" + inputDirectory).to("file:" + outputDirectory);
	}


}
