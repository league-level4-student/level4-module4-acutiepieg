package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
	private double x;
	private double y;

	Polymorph(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void update() {

	}

	public abstract void draw(Graphics g);

	public double getX() {
		return x;
	}

	public void setX(double d) {
		this.x = d;
	}

	public double getY() {
		return y;
	}

	public void setY(double d) {
		this.y =  d;
	}

}
