package Com.vtiger.Genricutil;

import java.io.FileInputStream;

import java.util.Properties;

import org.junit.Test;

public class PropertyFileutility {
	
	@Test
	public String propertyfileutility(String key) throws Throwable {
		FileInputStream fis=new FileInputStream("./Data\\CommonData Sdet1.properties");
		Properties p=new Properties();
		p.load(fis);
		String value=p.getProperty(key, "please give correct key");
		return value;
		
		
	}

}
