package firstpkg;

import java.io.File;

import java.io.FileReader;
import java.util.Properties;

public class FileHandling 
{

	public static void print10numbers()
	{
		
		/*
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		*/
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
	}
	
	public static void read_properties_file() throws Exception
	{
		FileReader fr = new FileReader("./testdata/config.properties");
		
		Properties prop = new Properties();
		
		prop.load(fr);
		
		System.out.println(prop.get("BrowserName"));
		System.out.println(prop.get("ApplicationURL"));
		
	}
	
	
	public static void readtextfile() throws Exception
	{
	//	File f = new File("C:\\TestData\\data.txt");  //file connection
		
		File f = new File("./testdata/data.txt");
		
		FileReader fr = new FileReader(f);
		
		int r = fr.read();
		
		while(r!=-1)
		{
			System.out.print((char)r);
			r = fr.read();
		}
		
		
		
		
	}
	
	public static void main(String[] args) throws Exception
	{
		print10numbers();
	}
	
}
