package sample;

import java.util.ArrayList;
import java.util.List;

public class SampleDao {
	
	public List<PersonalInfo> getInfo(){
		List<PersonalInfo> l = new ArrayList<>();
		PersonalInfo pI = new PersonalInfo();
		pI.setEmail("carlo.paulo.tolentino@gmail.com");
		pI.setName("carlo paulo tolentino");
		pI.setNumber(123456);
		l.add(pI);
		pI = new PersonalInfo();
		pI.setEmail("kokoknojutsuo@gmail.com");
		pI.setName("kokok tolentino");
		pI.setNumber(654321);
		l.add(pI);
		
		return l;
	}

}
