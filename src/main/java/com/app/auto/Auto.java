package com.app.auto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Auto {

	public Auto() {
		System.out.println("The is Auto............. ...AAAAAAAAAAAA.." + this.hashCode());
	}

	public void startAuto() {
		System.out.println("AUTO Started................");
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
