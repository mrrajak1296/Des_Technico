package TestRunner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Users\\PC\\eclipse-workspace\\DesTechnico\\src\\test\\resources\\Features",
glue = "Steps",
plugin = {"pretty", "html:target/htmlreport.html"}
)

public class runnertest extends AbstractTestNGCucumberTests {

}
