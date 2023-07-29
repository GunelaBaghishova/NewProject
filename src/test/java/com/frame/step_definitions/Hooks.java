package com.frame.step_definitions;
import com.frame.utilities.Driver;
import io.cucumber.java.*;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
public class Hooks {
    private static final Logger LOG = LogManager.getLogger();

    @Before
    public void setUp(){
        Driver.getDriver();
        LOG.info("...........START AUTOMATION.......G.B.....");
    }
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte [] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png", scenario.getName());
        }
       Driver.closeDriver();
     LOG.info("...........END AUTOMATION......G.B....");//
    }


}