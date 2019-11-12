package pageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import Cucumber.AutomationTest082019.Base;

public class BusinessPlan extends Base {

	public Properties prop = new Properties();
	
//	Nhap ma so bao cao
	public void setDataNo(String dataNo) throws IOException
	{
		FileInputStream file = new FileInputStream("//Users//quanld//eclipse-workspace//AutomationTest082019//src//test//java//Cucumber//AutomationTest082019//global.properties");
		prop.load(file);
		driver.findElement(By.xpath(prop.getProperty("DataNo"))).sendKeys(dataNo);
	}
	
//	Nhap tieu de bao cao
	public void setDataTittle(String dataTitle) throws IOException
	{
		FileInputStream file = new FileInputStream("//Users//quanld//eclipse-workspace//AutomationTest082019//src//test//java//Cucumber//AutomationTest082019//global.properties");
		prop.load(file);
		driver.findElement(By.xpath(prop.getProperty("DataTitle"))).sendKeys(dataTitle);
	}
	
//	Nhap ten cong ty
	public void setCompany(String company) throws IOException
	{
		FileInputStream file = new FileInputStream("//Users//quanld//eclipse-workspace//AutomationTest082019//src//test//java//Cucumber//AutomationTest082019//global.properties");
		prop.load(file);
		driver.findElement(By.xpath(prop.getProperty("Company"))).sendKeys(company);
	}
	
//	Nhap nhan xet
	public void setRemark(String remark) throws IOException
	{
		FileInputStream file = new FileInputStream("//Users//quanld//eclipse-workspace//AutomationTest082019//src//test//java//Cucumber//AutomationTest082019//global.properties");
		prop.load(file);
		driver.findElement(By.xpath(prop.getProperty("Remark"))).sendKeys(remark);
	}
	
//	Nhap ngay bat dau kinh doanh
	public void setStartDateOfBusinessPeriod(String startDate) throws IOException
	{
		FileInputStream file = new FileInputStream("//Users//quanld//eclipse-workspace//AutomationTest082019//src//test//java//Cucumber//AutomationTest082019//global.properties");
		prop.load(file);
		driver.findElement(By.xpath(prop.getProperty("StartDateOfBusinessPeriod"))).sendKeys(startDate);
	}
	
//	Nhap ten nguoi tao bao cao
	public void setAuthor(String author) throws IOException
	{
		FileInputStream file = new FileInputStream("//Users//quanld//eclipse-workspace//AutomationTest082019//src//test//java//Cucumber//AutomationTest082019//global.properties");
		prop.load(file);
		driver.findElement(By.xpath(prop.getProperty("Author"))).sendKeys(author);
	}
	
//	Nhap ngay dang ky
	public void setRegistrationDate(String registDate) throws IOException
	{
		FileInputStream file = new FileInputStream("//Users//quanld//eclipse-workspace//AutomationTest082019//src//test//java//Cucumber//AutomationTest082019//global.properties");
		prop.load(file);
		driver.findElement(By.xpath(prop.getProperty("RegistrationDate"))).sendKeys(registDate);
	}
	
//	Nhap noi dung tom tat
	public void setAbstract(String abstractBox) throws IOException
	{
		FileInputStream file = new FileInputStream("//Users//quanld//eclipse-workspace//AutomationTest082019//src//test//java//Cucumber//AutomationTest082019//global.properties");
		prop.load(file);
		driver.findElement(By.xpath(prop.getProperty("Abstract"))).sendKeys(abstractBox);
	}
	
//	Chon muc kinh doanh
	public void selectBusinessCategory() throws IOException
	{
		FileInputStream file = new FileInputStream("//Users//quanld//eclipse-workspace//AutomationTest082019//src//test//java//Cucumber//AutomationTest082019//global.properties");
		prop.load(file);
		Select s = new Select(driver.findElement(By.xpath(prop.getProperty("BusinessCategory"))));
		s.selectByValue("9");
	}
	
//	Chon don vi ky
	public void selectPeriodUnit() throws IOException
	{
		FileInputStream file = new FileInputStream("//Users//quanld//eclipse-workspace//AutomationTest082019//src//test//java//Cucumber//AutomationTest082019//global.properties");
		prop.load(file);
		Select s = new Select(driver.findElement(By.xpath(prop.getProperty("PeriodUnit"))));
		s.selectByValue("7");
	}
	
//	Chon so ky
	public void selectPeriod() throws IOException
	{
		FileInputStream file = new FileInputStream("//Users//quanld//eclipse-workspace//AutomationTest082019//src//test//java//Cucumber//AutomationTest082019//global.properties");
		prop.load(file);
		Select s = new Select(driver.findElement(By.xpath(prop.getProperty("Period"))));
		s.selectByValue("17");
	}
	
//	Chon don vi tien te
	public void selectCurrencyUnit() throws IOException
	{
		FileInputStream file = new FileInputStream("//Users//quanld//eclipse-workspace//AutomationTest082019//src//test//java//Cucumber//AutomationTest082019//global.properties");
		prop.load(file);
		Select s = new Select(driver.findElement(By.xpath(prop.getProperty("CurrencyUnit"))));
		s.selectByValue("1");
	}
	
//	Chon loai tien te
	public void selectCurrency() throws IOException
	{
		FileInputStream file = new FileInputStream("//Users//quanld//eclipse-workspace//AutomationTest082019//src//test//java//Cucumber//AutomationTest082019//global.properties");
		prop.load(file);
		Select s = new Select(driver.findElement(By.xpath(prop.getProperty("Currency"))));
		s.selectByValue("1");
	}
	
//	Click button save
	public void clickSave() throws IOException
	{
		FileInputStream file = new FileInputStream("//Users//quanld//eclipse-workspace//AutomationTest082019//src//test//java//Cucumber//AutomationTest082019//global.properties");
		prop.load(file);
		driver.findElement(By.xpath(prop.getProperty("btnSaveBP"))).click();
	}
}
