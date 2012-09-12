package com.santhosh.springremote;

import org.apache.camel.Body;

public interface Multiplier {
	public int multiply(@Body
String a);

}
