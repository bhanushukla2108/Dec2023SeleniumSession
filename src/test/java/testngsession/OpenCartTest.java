package testngsession;

import java.nio.file.spi.FileSystemProvider;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartTest {
	
	//before annotations
	
	@BeforeSuite
	public void dbConection() {
		System.out.println("DB Connection");
	}
	@BeforeTest
	public void createUser() {
		System.out.println("BT--create user");
		
	}
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC-- launchBrowser");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("BM--login to app");
	}
	
	@Test
	public void titleTest() {
		System.out.println("title test");
	}
	@Test
	public void haderTest() {
		System.out.println("header test");
	}
	@Test
	public void urlTest() {
		System.out.println("url test");
	}
	//after annotation
	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("close browser");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("deleteUser");
	}
	@AfterSuite
	public void closeDB() {
		System.out.println("DB closed");
	}
}
