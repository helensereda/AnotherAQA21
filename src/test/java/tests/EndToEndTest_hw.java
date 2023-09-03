package tests;



import baseEntities.BaseTest_hw;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;
public class EndToEndTest_hw extends BaseTest_hw {

    @Test
    public void successTest() throws InterruptedException {
        loginStep.successLogin(ReadProperties.username(), ReadProperties.password()).isPageOpened();
        Thread.sleep(5000);
        Assert.assertTrue(addCartStep.successAddCart().isPageOpened());
        Thread.sleep(3000);
        Assert.assertTrue(checkCartStep.successCheckCart().isPageOpened());
        addInfoStep.successInfo(ReadProperties.firstname(), ReadProperties.lastname(), ReadProperties.code()).isPageOpened();
        Assert.assertTrue(finishStep.successFinish().isPageOpened());
    }
}