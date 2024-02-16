package mainPackage;

import java.awt.*;
import javax.swing.*;

public class TextScrollPane {
	
	private JTextPane textPane;
	
	private JScrollPane scrollPane;
	
	public TextScrollPane(ComboBoxFonts cbFont) {
		
		textPane = new JTextPane();
		
		textPane.setFont(new Font((String)cbFont.getComboBoxFamily().getSelectedItem(), Font.PLAIN, 14));
		
		textPane.setMargin(new Insets(10, 10, 10, 10));
		
		scrollPane = new JScrollPane(textPane);
		
	}
	
	public JScrollPane getScrollPane() {
		
		return scrollPane;
		
	}
	
	public JTextPane getTextPane() {
		
		return textPane;
		
	}

}
