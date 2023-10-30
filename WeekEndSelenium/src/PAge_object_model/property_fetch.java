package PAge_object_model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class property_fetch {
public static void main(String[] args) throws FileNotFoundException, IOException {
	Properties p=new Properties();
	p.load(new FileInputStream("./propertyfiles/testdata.properties"));
	String v = p.getProperty("key");
	System.out.println(v);
	String un = p.getProperty("username");
	System.out.println(un);
	String pwd=p.getProperty("password");
	System.out.println(pwd);
}
}
