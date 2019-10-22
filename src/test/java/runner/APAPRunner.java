package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:test"},
				 features = "src/test/java/features",
				 glue = "stepDefinitions",
				 tags = "@APAP"
				 )
public class APAPRunner {

}