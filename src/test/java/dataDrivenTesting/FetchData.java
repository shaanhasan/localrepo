package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchData {

	public static void main(String[] args) throws IOException {
		FileInputStream f1=new FileInputStream("G:\\eclipse pro\\saletrackr\\src\\test\\resources\\testData\\commonData.properties");
        Properties pro=new Properties();
         pro.load(f1);
         String browser=pro.getProperty("browser");
         String url=pro.getProperty("url");
         String username=pro.getProperty("username");
         String password=pro.getProperty("password");
         System.out.println(browser+ " "+url+" "+username+" "+password);
    }
}
