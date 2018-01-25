package com.hc.third;

import com.hc.second.Second;

public class Third {
	public String sayHello(String name) {
		Second second = new Second();
		String str = second.sayHello("cat") + " " + name;
		return str;
	}

}
