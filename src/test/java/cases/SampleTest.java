package cases;

import org.junit.Test;
import org.openqa.selenium.By;

public class SampleTest extends BaseTest {

    //@Test
    public void testHabr () {
        driver.get("https://habr.com/ru/");
        driver.findElement(By.xpath("//title[contains(text(), 'Лучшие')]"));
    }
}
