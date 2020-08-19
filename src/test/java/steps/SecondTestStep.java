package steps;

import cases.BaseTest;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.junit.Before;
import pages.TsumMainPage;

public class SecondTestStep extends BaseTest {

    TsumMainPage tsumMainPage;

    @Before
    public void setUp () {
        tsumMainPage = new TsumMainPage(driver);
    }
    @Дано("^главная страница")
    public void главнаяСтраница() {
        tsumMainPage.openSite();
    }
    @Когда("^пользователь нажимает на кнопку Контакты")
    public void пользовательНажимаетНаКнопкуКонтакты() {
        tsumMainPage.clickOnBottomSlider();
        tsumMainPage.clickOnContacts();
    }
    @Тогда("^пользователь переходит на страницу Контакты")
    public void пользовательПереходитНаСтраницуКонтакты() {
        tsumMainPage.checkPageName("Контакты");
    }
}

