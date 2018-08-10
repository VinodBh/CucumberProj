package stepDefinition;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", glue = {"stepDefinition"})

//Suite Execution
//@RunWith(Suite.class)
//@SuiteClasses({
//	SuiteTest1.class,
//	SuiteTest2.class,
//})


public class Runner {

}
