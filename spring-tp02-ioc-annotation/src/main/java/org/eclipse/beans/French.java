package org.eclipse.beans;

import org.springframework.stereotype.Component;

@Component("fr")
public class French implements European{

	public void saluer() {
		// TODO Auto-generated method stub
		System.out.println("Bonjour");
	}
}
