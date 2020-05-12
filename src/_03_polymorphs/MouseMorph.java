package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseMorph extends Polymorph  {

	MouseMorph(int x, int y) {
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
		g.setColor(Color.gray);
		g.fillRect((int) super.getX(), (int) super.getY(), width, height);
	}


	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		super.setX(e.getX());
		super.setY(e.getY());
	}
}
