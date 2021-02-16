	package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
public class Calculator {

	protected static final String Null = null;
	private JFrame frame;
	private JTextField txtDisplay;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

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
		frame.setBounds(100, 100, 284, 429);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtDisplay.setBounds(10, 11, 248, 43);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		//-------------ROW 1-------------//
		
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() +btn7.getText();
				txtDisplay.setText(EnterNumber);
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 130, 60, 60);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() +btn8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(73, 130, 60, 60);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() +btn9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(135, 130, 60, 60);
		frame.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(198, 68, 60, 60);
		frame.getContentPane().add(btnPlus);
		
		
		//-------------ROW 0-------------//
		
		
				JButton btnClear = new JButton("C");
				btnClear.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						
						txtDisplay.setText(Null);
						
					}
				});
				btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnClear.setBounds(73, 68, 60, 60);
				frame.getContentPane().add(btnClear);
				
				JButton btnEquals = new JButton("=");
				btnEquals.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					String answer;
					secondnum = Double.parseDouble(txtDisplay.getText());
						if (operations == "+")
						{
							result = firstnum + secondnum;
							answer = String.format("%.2f", result);
							txtDisplay.setText(answer);
						}
						else if (operations == "-")
						{
							result = firstnum - secondnum;
							answer = String.format("%.2f", result);
							txtDisplay.setText(answer);
						}
						else if (operations == "*")
						{
							result = firstnum * secondnum;
							answer = String.format("%.2f", result);
							txtDisplay.setText(answer);
						}
						else if (operations == "/")
						{
							result = firstnum / secondnum;
							answer = String.format("%.2f", result);
							txtDisplay.setText(answer);
						}
						else if (operations == "%")
						{
							result = firstnum % secondnum;
							answer = String.format("%.2f", result);
							txtDisplay.setText(answer);
						}
					}
				});
				btnEquals.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnEquals.setBounds(198, 316, 60, 60);
				frame.getContentPane().add(btnEquals);
				
				JButton btnPercent = new JButton("%");
				btnPercent.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						firstnum = Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations = "%";
					}
				});
				btnPercent.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnPercent.setBounds(135, 68, 60, 60);
				frame.getContentPane().add(btnPercent);
				
				JButton btnBackSpace = new JButton("\uf0e7");
				btnBackSpace.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String backspace=null;
						
						if(txtDisplay.getText().length() > 0) {
							StringBuilder strB = new StringBuilder(txtDisplay.getText());
							strB.deleteCharAt(txtDisplay.getText().length() - 1);
							backspace = strB.toString();
							txtDisplay.setText(backspace);
						}
						
					}
				});
				btnBackSpace.setFont(new Font("Wingdings", Font.BOLD, 20));
				btnBackSpace.setBounds(10, 68, 60, 60);
				frame.getContentPane().add(btnBackSpace);
		
		
		//-------------ROW 2-------------//
		
		
				JButton btn4 = new JButton("4");
				btn4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = txtDisplay.getText() +btn4.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn4.setBounds(10, 194, 60, 60);
				frame.getContentPane().add(btn4);
				
				JButton btn5 = new JButton("5");
				btn5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = txtDisplay.getText() +btn5.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn5.setBounds(73, 194, 60, 60);
				frame.getContentPane().add(btn5);
				
				JButton btn6 = new JButton("6");
				btn6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = txtDisplay.getText() +btn6.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn6.setBounds(135, 194, 60, 60);
				frame.getContentPane().add(btn6);
				
				JButton btnSub = new JButton("-");
				btnSub.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						firstnum = Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations = "-";
					}
				});
				btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnSub.setBounds(198, 130, 60, 60);
				frame.getContentPane().add(btnSub);
				
				
				//-------------ROW 3-------------//
				
				
				JButton btn1 = new JButton("1");
				btn1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = txtDisplay.getText() +btn1.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn1.setBounds(10, 255, 60, 60);
				frame.getContentPane().add(btn1);
				
				JButton btn2 = new JButton("2");
				btn2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = txtDisplay.getText() +btn2.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn2.setBounds(73, 255, 60, 60);
				frame.getContentPane().add(btn2);
				
				JButton btn3 = new JButton("3");
				btn3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = txtDisplay.getText() +btn3.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn3.setBounds(135, 255, 60, 60);
				frame.getContentPane().add(btn3);
				
				JButton btnMult = new JButton("*");
				btnMult.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						firstnum = Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations = "*";
					}
				});
				btnMult.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnMult.setBounds(198, 194, 60, 60);
				frame.getContentPane().add(btnMult);
				
				
//-------------ROW 4-------------//
				
				
				JButton btn0 = new JButton("0");
				btn0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber = txtDisplay.getText() +btn0.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn0.setBounds(10, 316, 60, 60);
				frame.getContentPane().add(btn0);
				
				JButton btnDot = new JButton(".");
				btnDot.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnDot.setBounds(73, 316, 60, 60);
				frame.getContentPane().add(btnDot);
				
				JButton btnPM = new JButton("\u00B1");
				btnPM.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
						ops = ops * (-1);
						txtDisplay.setText(String.valueOf(ops));
					}
				});
				btnPM.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnPM.setBounds(135, 316, 60, 60);
				frame.getContentPane().add(btnPM);
				
				JButton btnDiv = new JButton("/");
				btnDiv.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					
						firstnum = Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations = "/";
					
					}
				});
				btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnDiv.setBounds(198, 254, 60, 60);
				frame.getContentPane().add(btnDiv);
		
	}
}
