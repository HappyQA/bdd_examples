package steps;

import cases.BaseTest;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.junit.Before;
import pages.TsumMainPage;

public class SeventhTestStep extends BaseTest {

    TsumMainPage tsumMainPage;

    @Before
    public void setUp () {
        tsumMainPage = new TsumMainPage(driver);
    }
    @Дано("^главная страница")
    public void главнаяСтраница() {
        tsumMainPage.openSite();
    }
    @Когда("^пользователь нажимает на кнопку Доставка")
    public void пользовательНажимаетНаКнопкуДоставка() {
        tsumMainPage.clickOnBottomSlider();
        tsumMainPage.clickOnDelivery();
    }
    @Тогда("^пользователь переходит на страницу Доставка")
    public void пользовательПереходитНаСтраницуДоставка() {
        tsumMainPage.checkPageName("Доставка");
    }
}

