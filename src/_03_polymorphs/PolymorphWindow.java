package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener, MouseListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;

	Polymorph bluePoly;
	Polymorph redPoly;
	Polymorph movingPoly;
	Polymorph circlePoly;
	Polymorph mousePoly;
	Polymorph imagePoly;
	Polymorph clickPoly;

	ArrayList<Polymorph> morphs;

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);

		window.addMouseMotionListener(this);
		window.addMouseListener(this);

		morphs = new ArrayList<Polymorph>();

		bluePoly = new BluePolymorph(50, 50);
		redPoly = new RedMorph(50, 50);
		movingPoly = new MovingMorph(50, 50);
		circlePoly = new CircleMorph(50, 50);
		mousePoly  = new MouseMorph(50, 50);
		imagePoly = new ImageMorph(50,50);
		clickPoly = new ClickMorph(50, 50);
		
		

		morphs.add(bluePoly);
		morphs.add(redPoly);
		morphs.add(movingPoly);
		morphs.add(circlePoly);
		morphs.add(mousePoly);
		morphs.add(imagePoly);
		morphs.add(clickPoly);

		timer = new Timer(1000 / 30, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);

		// draw polymorph
		for (Polymorph p : morphs) {
			p.draw(g);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		for (Polymorph p : morphs) {
			p.update();
		}

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		((MouseMorph) mousePoly).move(e);
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		((ClickMorph) clickPoly).checkClick(e);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
