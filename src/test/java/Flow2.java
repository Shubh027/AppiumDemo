import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Flow2 extends AppTest{

    @Test()
    public void WorkFlow2() throws InterruptedException{
        Thread.sleep(10000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.View")).click();
        driver.findElementById("com.meesho.supply.debug:id/query_edit_text").click();
        Thread.sleep(2000);
        driver.findElementById("com.meesho.supply.debug:id/query_edit_text").sendKeys("sari");
        Thread.sleep(2000);
        new TouchAction(driver).tap(PointOption.point(987, 1695)).release().perform();
        Thread.sleep(2000);
        String view = driver.findElementById("com.meesho.supply.debug:id/btn_view_product").getText();
        Assert.assertEquals(view,"View Product");
        driver.findElementById("com.meesho.supply.debug:id/btn_view_product").click();
        Thread.sleep(2000);
        String details= driver.findElementById("com.meesho.supply.debug:id/view_details").getText();
        Assert.assertEquals(details,"View Details");
        driver.findElementById("com.meesho.supply.debug:id/view_details").click();
        Thread.sleep(2000);
        String buy = driver.findElementById("com.meesho.supply.debug:id/buy_now").getText();
        Assert.assertEquals(buy,"buy");
        driver.findElementById("com.meesho.supply.debug:id/buy_now").click();
        Thread.sleep(2000);
        String Continue= driver.findElementById("com.meesho.supply.debug:id/primary_cta").getText();
        Assert.assertEquals(Continue,"Continue");
        driver.findElementById("com.meesho.supply.debug:id/primary_cta").click();


        //driver.findElementById("com.meesho.supply.debug:id/close").click();


    }

}
