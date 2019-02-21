package sample;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/personalinfo")

public class PersonalInfoService {
	SampleDao sD = new SampleDao();
	@GET
	public List<PersonalInfo> getInfo(){
		return sD.getInfo();
	}

}
