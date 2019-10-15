package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String asnwer;
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 215, 353);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(6, 6, 200, 63);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//*------------------Raw1----------------------------------
		JButton BTNbackspace = new JButton("<-");
		BTNbackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace =null;
				
				if(textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					backspace  = strB.toString();
					textField.setText(backspace);
						
						
				}
			}
		});
		BTNbackspace.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		BTNbackspace.setBounds(6, 78, 50, 50);
		frame.getContentPane().add(BTNbackspace);
		
		
		JButton BTNclear = new JButton("C");
		BTNclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
				
			}
		});
		BTNclear.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		BTNclear.setBounds(56, 78, 50, 50);
		frame.getContentPane().add(BTNclear);
		
		JButton BTNpercentage = new JButton("%");
		BTNpercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		BTNpercentage.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		BTNpercentage.setBounds(106, 78, 50, 50);
		frame.getContentPane().add(BTNpercentage);
		
		JButton BTNPlus = new JButton("+");
		BTNPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
				
			}
		});
		BTNPlus.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		BTNPlus.setBounds(156, 78, 50, 50);
		frame.getContentPane().add(BTNPlus);
		
		//*-----------------Raw2-----------------------------------
		
		JButton BTN7 = new JButton("7");
		BTN7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + BTN7.getText();
				textField.setText(EnterNumber);
			}
		});
		BTN7.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		BTN7.setBounds(6, 128, 50, 50);
		frame.getContentPane().add(BTN7);
		
		JButton BTN8 = new JButton("8");
		BTN8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + BTN8.getText();
				textField.setText(EnterNumber);
			}
		});
		BTN8.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		BTN8.setBounds(56, 128, 50, 50);
		frame.getContentPane().add(BTN8);
		
		JButton BTN9 = new JButton("9");
		BTN9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + BTN9.getText();
				textField.setText(EnterNumber);
			}
		});
		BTN9.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		BTN9.setBounds(106, 128, 50, 50);
		frame.getContentPane().add(BTN9);
		
		JButton BTNsub = new JButton("-");
		BTNsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		BTNsub.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		BTNsub.setBounds(156, 128, 50, 50);
		frame.getContentPane().add(BTNsub);
		
		//*-----------------Raw3-----------------------------------
		
		JButton BTN4 = new JButton("4");
		BTN4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String EnterNumber = textField.getText() + BTN4.getText();
				textField.setText(EnterNumber);
			}
		});
		BTN4.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		BTN4.setBounds(6, 178, 50, 50);
		frame.getContentPane().add(BTN4);
		
		JButton BTN5 = new JButton("5");
		BTN5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String EnterNumber = textField.getText() + BTN5.getText();
				textField.setText(EnterNumber);
			}
		});
		BTN5.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		BTN5.setBounds(56, 178, 50, 50);
		frame.getContentPane().add(BTN5);
		
		JButton BTN6 = new JButton("6");
		BTN6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + BTN6.getText();
				textField.setText(EnterNumber);
			}
		});
		BTN6.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		BTN6.setBounds(106, 178, 50, 50);
		frame.getContentPane().add(BTN6);
		
		JButton BTNmult = new JButton("*");
		BTNmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		BTNmult.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		BTNmult.setBounds(156, 178, 50, 50);
		frame.getContentPane().add(BTNmult);
		
		//*-----------------Raw4-----------------------------------
		
		JButton BTN3 = new JButton("3");
		BTN3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + BTN3.getText();
				textField.setText(EnterNumber);
			}
		});
		BTN3.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		BTN3.setBounds(6, 228, 50, 50);
		frame.getContentPane().add(BTN3);
		
		JButton BTN2 = new JButton("2");
		BTN2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + BTN2.getText();
				textField.setText(EnterNumber);
			}
		});
		BTN2.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		BTN2.setBounds(56, 228, 50, 50);
		frame.getContentPane().add(BTN2);
		
		JButton BTN1 = new JButton("1");
		BTN1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + BTN1.getText();
				textField.setText(EnterNumber);
			}
		});
		BTN1.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		BTN1.setBounds(106, 228, 50, 50);
		frame.getContentPane().add(BTN1);
		
		JButton BTNdiv = new JButton("/");
		BTNdiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		BTNdiv.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		BTNdiv.setBounds(156, 228, 50, 50);	
		frame.getContentPane().add(BTNdiv);
		
		
		
		//*-----------------Raw5-----------------------------------
		
		JButton BTN0 = new JButton("0");
		BTN0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + BTN0.getText();
				textField.setText(EnterNumber);
			}
		});
		BTN0.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		BTN0.setBounds(6, 278, 50, 50);
		frame.getContentPane().add(BTN0);
		
		JButton BTNdot = new JButton(".");
		BTNdot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + BTNdot.getText();
				textField.setText(EnterNumber);
			}
		});
		BTNdot.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		BTNdot.setBounds(56, 278, 50, 50);
		frame.getContentPane().add(BTNdot);
		
		JButton BTNPM = new JButton("+/-");
		BTNPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double ops = Double.parseDouble(String.valueOf(textField.getText()));
			ops= ops * (-1);
			textField.setText(String.valueOf(ops));
			
			
			}
		});
		BTNPM.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		BTNPM.setBounds(106, 278, 50, 50);
		frame.getContentPane().add(BTNPM);
		
		JButton BTNequal = new JButton("=");
		BTNequal.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum = Double.parseDouble(textField.getText());
				if(operations =="+")
				{
					result = firstnum + secondnum;
					answer = String.format("%.2f",result);
					textField.setText(answer);
					
				}
				else if  (operations == "-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f",result);
					textField.setText(answer);
					
				}
				else if (operations == "*")
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f",result);
					textField.setText(answer);
										
			}
				else if (operations == "/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f",result);
					textField.setText(answer);
										
			}
				else if (operations == "%")
				{
					result = firstnum % secondnum;
					answer = String.format("%.2f",result);
					textField.setText(answer);
										
			}
				}
		});
		BTNequal.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		BTNequal.setBounds(156, 278, 50, 50);
		frame.getContentPane().add(BTNequal);
		
	}
}
