package steps;

import cases.BaseTest;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.junit.Before;
import pages.TsumMainPage;

public class FirstTestStep extends BaseTest {

    TsumMainPage tsumMainPage;

    @Before
    public void setUp () {
        tsumMainPage = new TsumMainPage(driver);
    }
    @Дано("^главная страница")
    public void главнаяСтраница() {
        tsumMainPage.openSite();
    }
    @Когда("^пользователь вводит email и нажимает на кнопку подписатся")
    public void пользовательВводитEmailИНажимаетНаКнопкуПодписатся() {
        tsumMainPage.getInputEmailSubscription("test@mail.ru");
        tsumMainPage.clickOnButtonSubscription();
    }
    @Тогда("^приходит уведомление об успешной подписке")
    public void приходитУведомлениеОбУспешнойПодписке() {
        tsumMainPage.сheckSubscriptionTitle();
    }
}

