package mainPackage;

import java.net.*;
import javax.swing.*;
import javax.swing.text.*;

public class ToolBarButton{
	
	private JButton button;
	
	//--------METHOD TO CREATE STYLEDBUTTONS----------
	public void createStyleButton(JToolBar toolBar, String name, String imgPath) {
		
		URL buttonIcon = TXFrame.class.getResource(imgPath);
		
		try {
			
		button = new JButton(new ImageIcon(buttonIcon));
		
		}catch(NullPointerException e) {
			
			button = new JButton(name);
			System.out.println(e);
			
		}
		
		if(name.equalsIgnoreCase("Bold")) button.addActionListener(new StyledEditorKit.BoldAction());
		else if(name.equalsIgnoreCase("Italic")) button.addActionListener(new StyledEditorKit.ItalicAction());
		else if(name.equalsIgnoreCase("Underline")) button.addActionListener(new StyledEditorKit.UnderlineAction());
		else if(name.equalsIgnoreCase("Align Left")) button.addActionListener(new StyledEditorKit.AlignmentAction("aLeft", StyleConstants.ALIGN_LEFT));
		else if(name.equalsIgnoreCase("Align Right")) button.addActionListener(new StyledEditorKit.AlignmentAction("aRight", StyleConstants.ALIGN_RIGHT));
		else if(name.equalsIgnoreCase("Align Center")) button.addActionListener(new StyledEditorKit.AlignmentAction("aCenter", StyleConstants.ALIGN_CENTER));
		else if(name.equalsIgnoreCase("Align Justify")) button.addActionListener(new StyledEditorKit.AlignmentAction("aJustify", StyleConstants.ALIGN_JUSTIFIED));
		
		button.setToolTipText(name);
		toolBar.add(button);
		
	}

}
