package org.wipro.automation.auex.utilties;


import java.io.FileReader;
import java.util.Properties;

public class ReadPropertiesDataFile 
{

	public static String read_config_data(String key) throws Exception
	{
		FileReader fr = new FileReader("./configuration/config.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		
		return prop.get(key).toString();
	}
	
	public static String read_element_locator(String key) throws Exception
	{
		FileReader fr = new FileReader("./configuration/element.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		
		return prop.get(key).toString();
	}
}
