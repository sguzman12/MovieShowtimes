package controller;

import view.Gui;

/**
 * PROJECT: Maven springboot webscraper for local movie times in my area.
 * @author Sigfredo Guzman
 * DATE: 5/28/2019
 */
public class ShowtimeMain
{

	public static void main(String[] args)
	{
		 //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Gui app = new Gui();
            }
        });
		

	}

}
