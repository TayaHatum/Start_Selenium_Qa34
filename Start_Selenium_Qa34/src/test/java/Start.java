
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Start {

    WebDriver wd;

    @Test
    public void start() {
        wd = new ChromeDriver();
        // wd.get("https://contacts-app.tobbymarshall815.vercel.app/home"); // without history

        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //new WebDriverWait(wd,Duration.ofSeconds(10)).
                // with history
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();


        //wd.close();
        wd.quit();
    }


    @Test
    public void firstTestLoginSuccess() {
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");

//        // open form --> click login button
        WebElement loginTab = wd.findElement(By.cssSelector("[href='/login']"));
        loginTab.click();

        // fill valid email
        WebElement emailTextBox = wd.findElement(By.cssSelector("[placeholder='Email']"));
        emailTextBox.click();
        emailTextBox.clear();
        emailTextBox.sendKeys("noa@gmail.com");
        // fill valid password
        WebElement passwordTextBox = wd.findElement(By.cssSelector("[placeholder='Password']"));
        passwordTextBox.click();
        passwordTextBox.clear();
        passwordTextBox.sendKeys("Nnoa12345$");

        // click login button
        WebElement loginButton = wd.findElement(By.cssSelector("button"));
        loginButton.click();

        // Assert
    }


    @Test
    public void firstTestRegistrationSuccess() {
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app");


        // open form --> click login button
        WebElement loginTab = wd.findElement(By.cssSelector("[href='/login']"));
        loginTab.click();
        // fill valid email
        WebElement emailTextBox = wd.findElement(By.cssSelector("[placeholder='Email']"));
        emailTextBox.click();
        emailTextBox.clear();
        emailTextBox.sendKeys("noa009@gmail.com");
        // fill valid password
        WebElement passwordTextBox = wd.findElement(By.cssSelector("[placeholder='Password']"));
        passwordTextBox.click();
        passwordTextBox.clear();
        passwordTextBox.sendKeys("Nnoa12345$");

        // WebElement registrationButton = wd.findElement(By.cssSelector("div.login_login__3EHKB :last-child"));
        // WebElement registrationButton = wd.findElement(By.cssSelector("button:last-child"));
        List<WebElement> list = wd.findElements(By.cssSelector("button"));
        WebElement registrationButton = list.get(1);
        registrationButton.click();


    }


}
