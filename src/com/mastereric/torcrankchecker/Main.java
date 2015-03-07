package com.mastereric.torcrankchecker;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {
	//So TBA can know how the API is being used to
	//prioritize future development, they require
	//clients to identify themselves.
	
	//All API requests must include a unique,
	//descriptive X-TBA-App-Id header or URL
	//parameter to identify the application.

	//The X-TBA-App-Id needs to follow this format:
	//<team/person id>:<app description>:<version>
	//not use any colons except for the two already present.
	public static final String appID_teamID = "frc2137";
	public static final String appID_description = "torcRankChecker";
	public static final String appID_version = "v0.1";
	public static final String appID = appID_teamID + appID_description + appID_version;
	
	//Window strings.
	public static final String window_title = "TORC Rank Checker";
	public static final String[] request_eventNames = { "*Choose Event*", "Bedford",
		"Waterford", "West Michigan",
		"Kettering", "MI Championship" };

	//Window variables.
	public static final int window_width = 800;
	public static final int window_height = 600;
	public static final String[] request_eventCodes = { "", "mibed",
		"miwfd", "miwmi",
		"miket", "micmp" };	
	
	//Window elements.
	public static JFrame window_mainFrame;
	public static JLabel window_titleLabel;
	public static JComboBox<String> window_selectEvent;
	public static JTextField window_selectTeam;
	public static JTextField window_selectYear;
	public static JButton window_getRank;
	
	
	public static void main(String[] args) {
		window_mainFrame = new JFrame(window_title);
		window_mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window_mainFrame.setLayout(null);
		
		window_titleLabel = new JLabel(window_title);
		window_titleLabel.setFont(window_titleLabel.getFont()
									.deriveFont((float)(window_height/9.375)));
		window_titleLabel.setBounds((int)(window_width/10), (int)(window_height/37.5),
									(int)(window_width), (int)(window_height/9.375));

		window_selectEvent = new JComboBox<String>();
		for(int i = 0; i < request_eventNames.length; i++)
			window_selectEvent.addItem(request_eventNames[i]);
		window_selectEvent.setFont(window_selectEvent.getFont()
									.deriveFont((float)(window_height/16)));
		window_selectEvent.setBounds((int)(window_width/4), (int)(window_height/5),
									(int)(window_width/2), (int)(window_height/16));

		window_selectTeam = new JTextField();
		window_selectTeam.setFont(window_selectTeam.getFont()
				.deriveFont((float)(window_height/16)));
		window_selectTeam.setText("*Set Team*");
		window_selectTeam.setBounds((int)(window_width/4), (int)(window_height/5+window_height/14),
									(int)(window_width/2), (int)(window_height/16));
		
		window_selectYear = new JTextField();
		window_selectYear.setFont(window_selectYear.getFont()
				.deriveFont((float)(window_height/16)));
		window_selectYear.setText("*Set Year*");
		window_selectYear.setBounds((int)(window_width/4), (int)(window_height/5+window_height/7),
									(int)(window_width/2), (int)(window_height/16));
		
		window_getRank = new JButton();
		window_getRank.setMnemonic(KeyEvent.VK_G);
		
		window_mainFrame.getContentPane().add(window_titleLabel);
		window_mainFrame.getContentPane().add(window_selectEvent);
		window_mainFrame.getContentPane().add(window_selectTeam);
		window_mainFrame.getContentPane().add(window_selectYear);
		
		window_mainFrame.setBounds(0, 0, window_width, window_height);
		window_mainFrame.setVisible(true);
	}
	
	public static void button_getRank() {
		
	}
	
}