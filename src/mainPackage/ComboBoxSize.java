package mainPackage;

import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.text.*;

public class ComboBoxSize {
	
	private JComboBox<Integer> comboBoxSize;
	private Integer[] fontSize = {8, 10, 12, 14, 16, 18, 20, 22, 24, 28, 30, 32, 34, 36};
	
	public ComboBoxSize() {
		
		comboBoxSize = new JComboBox<Integer>(fontSize);
		
		comboBoxSize.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				Action fontSizeAction = new StyledEditorKit.FontSizeAction("Int", (int)comboBoxSize.getSelectedItem());
				
				fontSizeAction.actionPerformed(e);
				
			}
			
		});
		
		int defaultSize = Arrays.binarySearch(fontSize, 14);
		
		comboBoxSize.setSelectedIndex(defaultSize);
		
	}
	
	public JComboBox<Integer> getComboBoxSize() {
		
		return comboBoxSize;
		
	}

}
