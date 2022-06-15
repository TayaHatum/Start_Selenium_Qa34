import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {

    WebDriver wd;

    @Test
    public void start(){
        wd=new ChromeDriver();
       // wd.get("https://contacts-app.tobbymarshall815.vercel.app/home"); // without history

        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home"); // with history
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();


        //wd.close();
        wd.quit();
    }


    @Test
    public void firstTestLoginSuccess(){
        wd=new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");

//        // open form --> click login button
        WebElement loginTab=wd.findElement(By.cssSelector("[href='/login']"));
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
    public void firstTestRegistrationSuccess(){
        //fngkghfgjy
                //hfgkdjhht
        //jhgkhrg

    }

}
