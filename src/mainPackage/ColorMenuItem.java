package mainPackage;

import java.awt.*;
import java.net.*;
import javax.swing.*;
import javax.swing.text.*;

public class ColorMenuItem{
	
	private JMenuItem button;
	
	public void createColorMenu(JMenu menu, String name, String imgPath, Color color) {
		
		URL buttonIcon = TXFrame.class.getResource(imgPath);
		
		try {
			
		button = new JMenuItem(new ImageIcon(buttonIcon));
		
		}catch(NullPointerException e) {
			
			button = new JMenuItem(name);
			System.out.println(e);
			
		}
		
		button.addActionListener(new StyledEditorKit.ForegroundAction(name, color));
		
		menu.add(button);
		
	}

}
