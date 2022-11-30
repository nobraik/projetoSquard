package utils;

import org.openqa.selenium.WebDriver;

public class Drivers {

   public static WebDriver driver;

   public void action(){
      String adress = ("C:\\Users\\decio\\OneDrive\\Desktop\\Nova pasta\\cadastrarProject.html");
      driver.manage().window().maximize();
      driver.get(adress);
   }
}
