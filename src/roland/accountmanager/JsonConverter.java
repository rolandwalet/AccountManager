package roland.accountmanager;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonConverter {
	public void javaToJson(Account account) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			System.out.println(mapper.writeValueAsString(account));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
	
	public void jsonToJava(String jsonString) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			Account account = mapper.readValue(jsonString, Account.class);
			System.out.println(account.toString());
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
