package demo.callfeature;

import cucumber.api.CucumberOptions;
import demo.BaseTest;

/**
 *
 * @author pthomas3
 */
@CucumberOptions(features = "classpath:demo/callfeature/caller.feature")
public class CallFeatureTest extends BaseTest {
    
}