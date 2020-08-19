package steps;

import cases.BaseTest;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.junit.Before;
import pages.TsumMainPage;

public class FifthTestStep extends BaseTest {

    TsumMainPage tsumMainPage;

    @Before
    public void setUp () {
        tsumMainPage = new TsumMainPage(driver);
    }
    @Дано("^главная страница")
    public void главнаяСтраница() {
        tsumMainPage.openSite();
    }
    @Когда("^пользователь нажимает на кнопку Бренды")
    public void пользовательНажимаетНаКнопкуБренды() {
        tsumMainPage.clickOnBottomSlider();
        tsumMainPage.clickOnBrands();
    }
    @Тогда("^пользователь переходит на страницу Бренды")
    public void пользовательПереходитНаСтраницуБренды() {
        tsumMainPage.checkPageName("Бренды A-Z");
    }
}

