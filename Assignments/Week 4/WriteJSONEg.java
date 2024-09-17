package com.egjson;
import java.io.*;
import com.fasterxml.jackson.databind.ObjectMapper;
public class WriteJSONEg {
public static void main(String[] args) throws Exception {
	//Address[] addrs = new Address[2];
	
	Address[] addr = {new Address("street1","city1",654321),new Address("street2","city2",654322)};
	Person obj = new Person("Ravi",46,addr);
	
	ObjectMapper mapper = new ObjectMapper();
	FileOutputStream fos = new FileOutputStream("Person.json");
	mapper.writeValue(fos,obj);
	String pjson = mapper.writeValueAsString(obj);
	System.out.println("JSON file has been created, Pls check");
}
}
