package com.Trello.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
public static Properties p;
	
	public Configuration_Reader() throws Exception {
		File f = new File("E:\\java\\Trello\\src\\test\\java\\com\\Trello\\properties\\configuration.properties");
		FileInputStream fis=new FileInputStream(f);
		p=new Properties();
		p.load(fis);

	
	}

	public String getBroswer() {
		String broswer = p.getProperty("broswer");

		return broswer;
	}
	public String getUrl() {

		String url = p.getProperty("url");
		return url;
	}
	
	public String getUsername() {
		
		String username = p.getProperty("username");
		return username;
		
	}
	
	public String getPassword() {
		String password = p.getProperty("password");
		return password;

	}
	public String getBoardTitle() {
		String boardTitle = p.getProperty("boardTitle");
		return boardTitle;

	}
	public String getCardTitles() {
		String cardTitle = p.getProperty("cardTitle");
		return cardTitle;

	}
}
