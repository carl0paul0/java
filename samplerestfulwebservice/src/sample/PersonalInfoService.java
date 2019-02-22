package sample;

import java.util.List;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/person")
public class PersonalInfoService {
	SampleDao sD = new SampleDao();
	
	@GET
	@Path("/getperson")
	public List<PersonalInfo> getInfo(){
		return sD.getInfo();
	}
	
	@GET
	@Path("/getjson")
	@Produces("application/json")
	public String getJson(){
		String pattern = "{ \"name\" : \" %s \"}";
		return String.format(pattern, "Carlo Paulo Tolentino");
	}

}
