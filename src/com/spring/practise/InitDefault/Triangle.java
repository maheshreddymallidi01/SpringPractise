package com.spring.practise.InitDefault;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean {
	private Point pointid1;
	private Point pointid2;
	private Point pointid3;

	public Point getPointid1() {
		return pointid1;
	}

	public void setPointid1(Point pointid1) {
		this.pointid1 = pointid1;
	}

	public Point getPointid2() {
		return pointid2;
	}

	public void setPointid2(Point pointid2) {
		this.pointid2 = pointid2;
	}

	public Point getPointid3() {
		return pointid3;
	}

	public void setPointid3(Point pointid3) {
		this.pointid3 = pointid3;
	}
	
	public void draw() {
		System.out.println("Points {" + pointid1.getX() + "," + pointid1.getY() + "}");
		System.out.println("Points {" + pointid2.getX() + "," + pointid2.getY() + "}");
		System.out.println("Points {" + pointid3.getX() + "," + pointid3.getY() + "}");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialization method");

	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy Method");

	}

}
