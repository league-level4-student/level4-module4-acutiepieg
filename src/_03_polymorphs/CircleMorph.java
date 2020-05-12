package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph {

	double angle = 0;

	CircleMorph(int x, int y) {
		super(x, y);
	}

	private int width = 50;
	private int height = 50;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.MAGENTA);
		g.fillRect((int) super.getX(), (int) super.getY(), width, height);
	}

	public void update() {
		angle ++;
		super.setX(250 + Math.cos(.5 * angle) * 50 );
		super.setY(250 + Math.sin(.5 * angle) * 50);
	}

}
