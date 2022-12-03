package com.API;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Rest_Assured {

	public static void main(String[] args) throws IOException, ParseException {

		File f = new File("C:\\Users\\rjaya\\Ishu\\Maven_PKG\\src\\test\\java\\com\\API\\Json_Parser.json");

		FileReader reader = new FileReader(f);

		JSONParser json_p = new JSONParser();

		Object parse = json_p.parse(reader);

		JSONObject jsonobj = (JSONObject) parse; // narrow casting

		Object object = jsonobj.get("course"); //key name

		String string = object.toString();

		System.out.println("Value:" + string);

	}
}
