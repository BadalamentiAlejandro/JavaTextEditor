package mainPackage;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.text.*;

public class ComboBoxFonts {
	
	private JComboBox<String> comboBoxFamily;
	
	private String[] localFontFamily;
	
	public ComboBoxFonts() {
		
		localFontFamily = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		comboBoxFamily = new JComboBox<String>(localFontFamily);
		
		comboBoxFamily.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				Action fontFamilyAction = new StyledEditorKit.FontFamilyAction("Str", (String)comboBoxFamily.getSelectedItem());
				
				fontFamilyAction.actionPerformed(e);
				
			}
			
		});
		
		int defaultFont = Arrays.binarySearch(localFontFamily, "Arial");
		
		comboBoxFamily.setSelectedIndex(defaultFont);
		
	}
	
	public JComboBox<String> getComboBoxFamily() {
		
		return comboBoxFamily;
		
	}

}
