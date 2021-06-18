import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Flow1 extends AppTest{



    @Test()
    public void WorkFLow1() throws InterruptedException{

        Thread.sleep(10000);
        String meeshaTitle= driver.findElement(By.id("com.meesho.supply.debug:id/hi_i_m_mees")).getText();
        Assert.assertEquals(meeshaTitle,"Hi,I’m Meesha.");
        String meehsacont = driver.findElement(By.id("com.meesho.supply.debug:id/let_s_start")).getText();
        Assert.assertEquals(meehsacont,"Let's start your Meesho journey!");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.View")).click();
        Thread.sleep(3000);
        driver.findElementById("com.meesho.supply.debug:id/img_video_full_thumbnail").click();
        Thread.sleep(56000);
        driver.findElementById("com.meesho.supply.debug:id/primary_cta").click();
        Thread.sleep(3000);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/androidx.viewpager.widget.ViewPager[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView[2]").click();
        Thread.sleep(4000);
        new TouchAction(driver).tap(PointOption.point(964, 1552)).release().perform();
        Thread.sleep(3000);
        driver.findElementById("com.meesho.supply.debug:id/download").click();
        Thread.sleep(3000);
        driver.findElementById("com.android.permissioncontroller:id/permission_allow_button").click();
        Thread.sleep(4000);
        driver.findElementById("com.meesho.supply.debug:id/download_status_okay").click();

        Thread.sleep(3000);
        driver.closeApp();
    }

}
