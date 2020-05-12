package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

public class ClickMorph extends Polymorph {
	ClickMorph(int x, int y) {
		super(x, y);
	}

	private int width = 50;
	private int height = 50;

	Rectangle rect = new Rectangle((int) super.getX() + 200, (int) super.getY() + 350, width, height);

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
		g.setColor(Color.cyan);
		g.fillRect((int) super.getX() + 200, (int) super.getY() + 350, width, height);

	}

	public void checkClick(MouseEvent e) {
		if (e.getX() > rect.x && e.getX() < rect.x + width) {
			if (e.getY() > rect.y && e.getY() < rect.y + height) {
				JOptionPane.showMessageDialog(null, "Hello");
			}
		}
	}

}
