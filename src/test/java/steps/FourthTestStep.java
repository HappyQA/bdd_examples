package steps;

import cases.BaseTest;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.junit.Before;
import pages.TsumMainPage;

public class FourthTestStep extends BaseTest {

    TsumMainPage tsumMainPage;

    @Before
    public void setUp () {
        tsumMainPage = new TsumMainPage(driver);
    }
    @Дано("^главная страница")
    public void главнаяСтраница() {
        tsumMainPage.openSite();
    }
    @Когда("^пользователь нажимает на кнопку Карьера")
    public void пользовательНажимаетНаКнопкуКарьера() {
        tsumMainPage.clickOnBottomSlider();
        tsumMainPage.clickOnCareer();
    }
    @Тогда("^пользователь переходит на страницу Карьера")
    public void пользовательПереходитНаСтраницуКарьера() {
        tsumMainPage.checkPageName("Карьера");
    }
}

