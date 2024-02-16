package mainPackage;

import java.awt.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class MainClass {

	public static void main(String[] args) {
		
		new TXFrame();

	}

}

@SuppressWarnings("serial")
class TXFrame extends JFrame {
	
	public TXFrame() {
		
		setSize(1300, 800);
		setMinimumSize(new Dimension(getSize()));
		setLocationRelativeTo(null);
		setTitle("Text Editor");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		try {
			
			URL iconTX = TXFrame.class.getResource("resources" + File.separator + "TXIcon.png");
			
			setIconImage(Toolkit.getDefaultToolkit().getImage(iconTX));
			
		}catch(NullPointerException e) {
			
			System.out.println(e);
			
		}

		
		add(new TXPanel());
		setVisible(true);
		
	}
	
}
