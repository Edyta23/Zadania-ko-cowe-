package pl.coderslab.seleniumcourse.Task1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/cucumber/features/Task1.feature", plugin = {"pretty","html:out"})
public class Task1Test {

}
