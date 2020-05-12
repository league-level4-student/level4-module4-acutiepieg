package _03_polymorphs;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageMorph extends Polymorph {

	BufferedImage butterfly;

	ImageMorph(int x, int y) {
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
		try {
			butterfly = ImageIO.read(this.getClass().getResourceAsStream("butterfly.jpg"));
		} catch (IOException e) {
		}
		g.drawImage(butterfly, 350, 350, width, height, null);
	}

}
