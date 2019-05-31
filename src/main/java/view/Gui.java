package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

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

	private JFrame frame;
	private JPanel panel1; // Main panel holding the table
	private JPanel panel2;
	private JButton refresh; // Refreshes table
	private JTable table; // Display out movie title, times.
	private DefaultTableModel model;

	private String columnNames[] = { "Title", "Showtimes" }; // Columns
																// Names for
																// table
	private String data[][];

	private final int WIDTH = 400;
	private final int HEIGHT = 500;

	public Gui()
	{
		frame = new JFrame();

		frame.setTitle("Local Movie Showtimes");
		frame.setSize(WIDTH, HEIGHT);
		frame.setLayout(new BorderLayout());

		initialize();

		frame.setVisible(true);
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}

	private void initialize()
	{
		panel1 = panelInitialize(panel1);
		// panel1.setBackground(Color.BLACK);
		tableInitialize();

		addTables(table);
		// refresh = buttonInitialize(refresh, "Refresh");
		// addButtons();

		addPanels();
	}

	private void addPanels()
	{
		// frame.setLayout(new GridLayout(1, 2));
		frame.add(panel1);
	}

	private JPanel panelInitialize(JPanel panel)
	{

		panel = new JPanel();

		return panel;
	}

	@SuppressWarnings("serial")
	private void tableInitialize()
	{

		model = new DefaultTableModel(columnNames, 0);

		table = new JTable(model)

		{

			public Component prepareRenderer(TableCellRenderer r, int data,
					int columns)
			{
				Component c = super.prepareRenderer(r, data, columns);

				if(data % 2 == 0)
				{
					c.setBackground(Color.WHITE);
				}
				else
				{
					c.setBackground(Color.LIGHT_GRAY);
				}
				return c;
			}
		};

		table.setPreferredScrollableViewportSize(new Dimension(200, 100));
		table.setFillsViewportHeight(true);
		//return table;
	}

	/**
	 * private JButton buttonInitialize(JButton but, String title) {
	 * 
	 * but = new JButton(title);
	 * 
	 * return but; }
	 * 
	 * private void addButtons() { panel1.add(refresh); }
	 */
	private void addTables(JTable table)
	{
		panel1.add(table);
	}
}
