package service;

import bean.PersonalInfoBean;

public class ProcessPersonalInfoImplementation implements ProcessPersonalInfo {

	@Override
	public PersonalInfoBean getInfo(String input) {
		PersonalInfoBean pBean = new PersonalInfoBean();
		pBean.setInput(input);
		pBean.setName("Carlo Paulo Tolentino");
		pBean.setEmail("carlo.pulo.tolentino@gmail.com");
		
		return pBean;
	}

}
