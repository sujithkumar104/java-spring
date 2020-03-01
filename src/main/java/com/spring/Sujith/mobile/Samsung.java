package com.spring.Sujith.mobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {

	@Autowired
	@Qualifier(value = "mediaTek")
	public MobileProcessor cpu;
	
	public void config() {
		System.out.println("OCT0A CORE, 4 gb ram, 12MP Camera");
		cpu.process();
	}

}
