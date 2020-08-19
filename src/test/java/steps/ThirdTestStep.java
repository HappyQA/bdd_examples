package steps;

import cases.BaseTest;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.junit.Before;
import pages.TsumMainPage;

public class ThirdTestStep extends BaseTest {

    TsumMainPage tsumMainPage;

    @Before
    public void setUp () {
        tsumMainPage = new TsumMainPage(driver);
    }
    @Дано("^главная страница")
    public void главнаяСтраница() {
        tsumMainPage.openSite();
    }
    @Когда("^пользователь нажимает на кнопку Наша история")
    public void пользовательНажимаетНаКнопкуНашаИстория() {
        tsumMainPage.clickOnBottomSlider();
        tsumMainPage.clickOnOurHistory();
    }
    @Тогда("^пользователь переходит на страницу Наша история")
    public void пользовательПереходитНаСтраницуНашаИстория() {
        tsumMainPage.checkPageName("Наша история");
    }
}

