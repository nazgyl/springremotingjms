package com.santhosh.springremote;

import org.apache.camel.Body;
import org.springframework.stereotype.Service;

@Service(value = "multiplier")
public class MultiplierImpl implements Multiplier {

	public int multiply(@Body
String a) {
		// TODO Auto-generated method stub
		return Integer.parseInt(a)*523;
	}

}
