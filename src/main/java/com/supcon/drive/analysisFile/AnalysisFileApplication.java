package com.supcon.drive.analysisFile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.supcon.drive.analysisFile.controller")
public class AnalysisFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnalysisFileApplication.class, args);
	}

}
