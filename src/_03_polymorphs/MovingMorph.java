package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph {
	int speed = - 2;
	
	MovingMorph(int x, int y) {
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
		g.setColor(Color.GREEN);
		g.fillRect(super.getX(), super.getY(), width, height);
		
	}
	
	public void update() {
		if(super.getX() < 500 - width && super.getX() > 0) {
			super.setX(super.getX() + speed);
		}
		else {
			speed = speed * -1;
			super.setX(super.getX() + speed);
		}
	
	}
}
