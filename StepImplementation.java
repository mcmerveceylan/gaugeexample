package org.example;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.sql.Driver;

public class StepImplementation extends BaseText {

    public class ProductLogin {

        @Step("kullanıcı adı ve şifrenzi girin")
        public void kullanıcıGirisi(String customer, String password) {
            WebDriver webDriver = Driver.webDriver;
            webDriver.findElement(By.linkText("Sign up")).click();
            WebElement driver = webDriver.findElement(By.id("new_user"));
            driver.findElement(By.name("user[username]")).sendKeys(customer);
            driver.findElement(By.name("user[password]")).sendKeys(password);
            driver.findElement(By.name("user[password_confirmation]")).sendKeys(password);
            driver.findElement(By.name("loginButton")).click();


        }
        @Step("ürünlere bak.")
        public void ürünlereBak() {
            WebDriver webDriver = Driver.webDriver;
            List<WebElement> products = webDriver.findElements(By.className("product"));
            assertThat(products.size(), is(not(0)));
        }
@Step("rastgele kategori")
        public void rastgeleKategori(){
       driver.findElement(By.xpath(".//*[@id='productResult']")).click();
       WebElement subCategory= driver.findElement(By.xpath(".//*[@class='col lg-4 md-3 sm-3']"));
    String scText= subCategory.getText();
    @Step("marka seç")
            public void markaSec(){
    WebElement searchBox = driver.findElement(By.id("searchData"));
    searchBox.click();
    searchBox.sendKeys("Adidas");
    driver.findElement(By.className("searchBox")).click();
@Step("rastgele ürün seç")
        public void rastgeleUrun() {
            WebElement product = driver.findElement(By.xpath(".//*[@class='product-detail-module']"));
            String productText = product.getText();
        }

        @Step("ürün karşılaştırması")
        public void urunKarsılaştırma() {
            WebElement productBasket = driver.findElement(By.className("price"));
            String priceText2 = productBasket.getText();
            if (productText.compareTo(productText2) > 0) {
            }
        }
        @Step("ürün ekleme")
                public void urunEkleme() {
            WebElement basketBox = driver.findElement(By.id("basket"));
            basketBox.click();
            basketBox.sendKeys("1");
        }

}

}
