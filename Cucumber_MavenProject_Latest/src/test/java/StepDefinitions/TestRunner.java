package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "E:\\Training_Batches\\April_11th_2022_Batch\\April_11th_Java_Selenium_Workspace\\Cucumber_MavenProject_Latest\\Features\\Pagetittle.feature", 
		glue = "StepDefinitions",
		
		
		plugin = {"pretty", "html:test-output","json:jsonReport.json" }
)
public class TestRunner {

}


/*
 * dryRun = true, monochrome=true, 
 * ,"json:jsonReport.json"}
 */