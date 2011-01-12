package interfataGrafica;

import java.awt.event.*;
import javax.swing.*;
import command.*;


/**
 * Interfata Grafica construita cu ajutorul plugin-ului Eclipse JIGLOO
 * @author Ordog Dorottya
 *
 */
public class InterfataGrafica extends JFrame implements KeyListener,ActionListener {

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private JLabel text;
	private JButton Grafic;
	private JLabel fct_d_x0;
	private JTextField f4;
	private JTextField f3;
	private JLabel fct_s_x0;
	private JTextField x;
	private JLabel x0;
	private JButton redo;
	private JButton undo;
	private JTextField f2;
	private JLabel fct_d;
	private JTextField f1;
	private JLabel fct_s;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				InterfataGrafica inst = new InterfataGrafica();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public InterfataGrafica() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Evaluarea functiilor");
			{
				text = new JLabel();
				text.setText("Evaluarea functiilor de o singura variabila reala");
			}
			{
				f2 = new JTextField();
			}			
			{
				x0 = new JLabel();
				x0.setText("x0=");
			}
			{
				fct_s_x0 = new JLabel();
				fct_s_x0.setText("f(x0)=");
			}
			{
				f3 = new JTextField();
			}
			{
				fct_d_x0 = new JLabel();
				fct_d_x0.setText("f ' (x0)=");
			}
			{
				f4 = new JTextField();
			}
			{
				x = new ApasaEnterVal(f3,f4);
				x.addKeyListener(this);
			}
			{
				Grafic = new Grafic();
				Grafic.setText("Grafic");
				Grafic.addActionListener(this);
			}
			{
				fct_s = new JLabel();
				fct_s.setText("f(x)=");
			}
			{
				f1 = new ApasaEnter(f2);
				f1.addKeyListener(this);
			}
			{
				undo = new Undo(f1);
				undo.setText("Undo");
				undo.addActionListener(this);
			}
			{
				redo = new Redo(f1);
				redo.setText("Redo");
				redo.addActionListener(this);
			}
			{
				fct_d = new JLabel();
				fct_d.setText("f ' (x)=");
			}
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(51, 51)
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(fct_d_x0, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(fct_s_x0, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
				        .addGap(6))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(x0, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
				        .addGap(6))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(fct_d, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				        .addGap(6))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(fct_s, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				        .addGap(14)))
				.addGap(10)
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(text, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGap(8)
				        .addGroup(thisLayout.createParallelGroup()
				            .addComponent(f4, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
				            .addComponent(f3, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
				            .addComponent(x, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
				            .addComponent(f2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
				            .addComponent(f1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
				        .addGap(39)
				        .addGroup(thisLayout.createParallelGroup()
				            .addComponent(Grafic, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
				            .addComponent(redo, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
				            .addComponent(undo, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))))
				.addContainerGap(111, Short.MAX_VALUE));
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addComponent(text, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(31)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(fct_s, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
				    .addComponent(f1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(undo, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(21)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(f2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(fct_d, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(redo, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(23)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(Grafic, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				        .addGap(9))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGap(9)
				        .addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				            .addComponent(x, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				            .addComponent(x0, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))))
				.addGap(19)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(f3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(fct_s_x0, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(24)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(f4, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(fct_d_x0, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(67, 67));
			pack();
			this.setSize(411, 359);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

	/**
	 * Metoda care se lanseaza in executie la apasarea tastei Enter
	 */
	public void keyPressed(KeyEvent e) {
		
        if (e.getKeyCode()==KeyEvent.VK_ENTER) {
        	
        	((Command)e.getSource()).execute();        	
        }
	}

	@Override
	public void keyReleased(KeyEvent e) {		
	}

	@Override
	public void keyTyped(KeyEvent e) {		
	}

	/**
	 * Metoda care se lanseaza in executie la apasarea butoanelor din interfata
	 */
	public void actionPerformed(ActionEvent e) {
		
		((Command)e.getSource()).execute();
	}

}
