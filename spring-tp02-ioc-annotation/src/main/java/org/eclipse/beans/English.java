package org.eclipse.beans;

import org.springframework.stereotype.Component;

@Component("en")
public class English implements European{

	public void saluer() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
}
