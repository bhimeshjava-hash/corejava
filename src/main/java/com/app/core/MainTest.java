package com.app.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.auto.Auto;

public class MainTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AggConfig.class);

		Engine engine = ctx.getBean(Engine.class);
		System.out.println(engine.getEngineDetails().hashCode());

		Engine e1 = ctx.getBean(Engine.class);
		System.out.println(e1.getEngineDetails().hashCode());

		/*
		 * Car cc = ctx.getBean(Car.class); Engine ee = ctx.getBean(Engine.class);
		 * cc.getCarDetails(); ee.getEngineDetails();
		 * System.out.println("hashcode --_>  " + cc.hashCode() + "---" +
		 * ee.hashCode());
		 * 
		 * Car car = ctx.getBean(Car.class); Engine eng = ctx.getBean(Engine.class);
		 * System.out.println("hashcode --_>  " + car.hashCode() + "---" +
		 * eng.hashCode()); Auto auto = ctx.getBean(Auto.class); auto.startAuto();
		 * System.out.println(ctx.getBean(Auto.class).hashCode());
		 * System.out.println(ctx.getBean(Auto.class).hashCode());
		 * System.out.println(ctx.getBean(Auto.class).hashCode());
		 * System.out.println(ctx.getBean(Auto.class).hashCode());
		 */
	}

}
