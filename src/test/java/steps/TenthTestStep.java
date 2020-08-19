package steps;

import cases.BaseTest;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.junit.Before;
import pages.TsumMainPage;

public class TenthTestStep extends BaseTest {

    TsumMainPage tsumMainPage;

    @Before
    public void setUp () {
        tsumMainPage = new TsumMainPage(driver);
    }
    @Дано("^главная страница")
    public void главнаяСтраница() {
        tsumMainPage.openSite();
    }
    @Когда("^пользователь нажимает на кнопку Шопинг сервисы")
    public void пользовательНажимаетНаКнопкуШопингСервисы() {
        tsumMainPage.clickOnBottomSlider();
        tsumMainPage.clickOnAboutService();
    }
    @Тогда("^пользователь переходит на страницу Шопинг сервисы")
    public void пользовательПереходитНаСтраницуШопингСервисы() {
        tsumMainPage.checkPageName("Шопинг-сервисы");
    }
}

