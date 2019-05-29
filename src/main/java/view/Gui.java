package view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * PROJECT: Maven springboot webscraper for local movie times in my area.
 * 
 * @author Sigfredo Guzman DATE: 5/28/2019
 */

// GUI version 1 implementation. Simple frame with refresh button and JTable to
// display out.
public class Gui extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2504766583330583148L;

	JFrame frame;
	JPanel panel1;
	JPanel panel2;
	JButton refresh;

	private final int WIDTH = 400;
	private final int HEIGHT = 500;
	private final float hsb[] = new float[] { 64, 92, 86 };

	public Gui()
	{
		frame = new JFrame();
		frame.setTitle("Local Movie Showtimes");
		frame.setSize(WIDTH, HEIGHT);

		initialize();
		addPanels();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	private void initialize()
	{
		panel1 = panelInitialize(panel1);
		panel1.setBackground(Color.GRAY);
		
		refresh = buttonInitialize(refresh, "Refresh");
		addButtons();
	}

	private void addPanels()
	{
		frame.add(panel1);
	}

	private JPanel panelInitialize(JPanel panel)
	{

		panel = new JPanel();

		return panel;
	}
	
	private JButton buttonInitialize(JButton but, String title) {
		
		but = new JButton(title);
		
		return but;
	}
	
	private void addButtons() {
		panel1.add(refresh);
	}
}
