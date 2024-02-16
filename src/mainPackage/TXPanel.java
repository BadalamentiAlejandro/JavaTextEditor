package mainPackage;

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import javax.swing.border.*;

@SuppressWarnings("serial")
public class TXPanel extends JPanel{
	
	private JPanel panelTop, panelMid;
	
	private ComboBoxFonts cbFont;
	
	private ComboBoxSize cbSize;
	
	private JMenuBar jmb;
	private JMenu jmColor;
	private JPopupMenu popUpColor;
	private ColorMenuItem cm;
	
	private TextScrollPane tsPane;
	
	private JToolBar tb;
	private ToolBarButton tbButton;
	
	private BufferedImage backImg;
	
	public TXPanel() {
		
		setLayout(new BorderLayout());
		
		panelTop = new JPanel();
		panelTop.setBorder(new EmptyBorder(15, 15, 10, 15));
		
		panelMid = new JPanel();
		panelMid.setLayout(new BorderLayout());
		panelMid.setBorder(new EmptyBorder(15, 300, 20, 300));
		
		//-------------JCOMBOBOX FONT------------
		cbFont = new ComboBoxFonts();
		panelTop.add(cbFont.getComboBoxFamily());
		
		//------------JCOMBOBOX SIZE------------
		cbSize = new ComboBoxSize();
		panelTop.add(cbSize.getComboBoxSize());
		
		//----------JMENUBAR COLORS----------
		jmb = new JMenuBar();
		jmColor = new JMenu("Font Color");
		popUpColor = jmColor.getPopupMenu();
		popUpColor.setLayout(new GridLayout(3, 3));
		
		cm = new ColorMenuItem();
		cm.createColorMenu(jmColor, "Black", "resources" + File.separator + "Colors" + File.separator + "black.png", Color.BLACK);
		cm.createColorMenu(jmColor, "Blue", "resources" + File.separator + "Colors" + File.separator + "blue.png", Color.BLUE);
		cm.createColorMenu(jmColor, "Gray", "resources" + File.separator + "Colors" + File.separator + "gray.png", Color.GRAY);
		cm.createColorMenu(jmColor, "Green", "resources" + File.separator + "Colors" + File.separator + "green.png", Color.GREEN);
		cm.createColorMenu(jmColor, "Orange", "resources" + File.separator + "Colors" + File.separator + "orange.png", Color.ORANGE);
		cm.createColorMenu(jmColor, "Pink", "resources" + File.separator + "Colors" + File.separator + "pink.png", Color.PINK);
		cm.createColorMenu(jmColor, "Red", "resources" + File.separator + "Colors" + File.separator + "red.png", Color.RED);
		cm.createColorMenu(jmColor, "White", "resources" + File.separator + "Colors" + File.separator + "white.png", Color.WHITE);
		cm.createColorMenu(jmColor, "Yellow", "resources" + File.separator + "Colors" + File.separator + "yellow.png", Color.YELLOW);
		
		jmb.add(jmColor);
		panelTop.add(jmb);
		
		//----------JTOOLBAR-------------
		tb = new JToolBar();
		//---------JTOOLBAR BUTTONS----------
		tbButton = new ToolBarButton();
		tbButton.createStyleButton(tb, "Bold", "resources" + File.separator + "Bold.png");
		tbButton.createStyleButton(tb, "Italic", "resources" + File.separator + "Italic.png");
		tbButton.createStyleButton(tb, "Underline", "resources" + File.separator + "Underline.png");
		tbButton.createStyleButton(tb, "Align Left", "resources" + File.separator + "aLeft.png");
		tbButton.createStyleButton(tb, "Align Right", "resources" + File.separator + "aRight.png");
		tbButton.createStyleButton(tb, "Align Center", "resources" + File.separator + "aCenter.png");
		tbButton.createStyleButton(tb, "Align Justify", "resources" + File.separator + "aJustify.png");
		panelTop.add(tb);
		
		//-----------TEXTAREA-----------
		tsPane = new TextScrollPane(cbFont);
		panelMid.add(tsPane.getScrollPane());
		
		//------------ADD PANELS------------
		add(panelTop, BorderLayout.NORTH);
		add(panelMid, BorderLayout.CENTER);
		
		//----------BACKGROUND IMAGE-----------
		try {
			backImg = ImageIO.read(getClass().getResource("resources" + File.separator + "backImg.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		tsPane.getTextPane().requestFocus(true);
		
		panelTop.setOpaque(false);
		panelMid.setOpaque(false);
		
		Graphics2D g2 = (Graphics2D) g;
		g2.drawImage(backImg, 0, 0, getWidth(), getHeight(), null);
		
	}

}
