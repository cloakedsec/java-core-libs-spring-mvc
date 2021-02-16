//-------------A little project with a few discrepencies made in Swing Windows Builder by Ahmad Faraz----------//

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Restaurant {

	protected static final String Null = null;
	private JFrame frame;
	private JTextField jTxtChicBurger;
	private JTextField jTxtChicBurgerMeal;
	private JTextField jTxtCBBurger;
	private JTextField jTxtQty;
	private JTextField jtxtConvert;
	
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	
	double[] i = new double[5];
	
	double Nigerian_Naira = 302.96;
	double US_Dollar = 1.52;
	double Kenyan_Shilling = 156.21;
	double Brazilian_Real = 5.86;
	double Canadian_Dollar = 2.03;
	double Indian_Rupee = 100.68;
	double Philippine_Peso = 71.74;
	double Indonesian_Rupiah = 20746.75;
	protected JLabel jlblConvert;
	private JTextField jtxtConversion;
	private JTextField txtDisplay;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurant window = new Restaurant();
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
	public Restaurant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBounds(51, 91, 577, 279);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel jlblChickenBurger = new JLabel("Chicken Burger");
		jlblChickenBurger.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblChickenBurger.setBounds(28, 18, 227, 32);
		panel.add(jlblChickenBurger);
		
		jTxtChicBurger = new JTextField();
		jTxtChicBurger.setHorizontalAlignment(SwingConstants.RIGHT);
		jTxtChicBurger.setFont(new Font("Tahoma", Font.BOLD, 24));
		jTxtChicBurger.setBounds(283, 25, 227, 25);
		panel.add(jTxtChicBurger);
		jTxtChicBurger.setColumns(10);
		
		jTxtChicBurgerMeal = new JTextField();
		jTxtChicBurgerMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		jTxtChicBurgerMeal.setFont(new Font("Tahoma", Font.BOLD, 24));
		jTxtChicBurgerMeal.setColumns(10);
		jTxtChicBurgerMeal.setBounds(283, 65, 227, 25);
		panel.add(jTxtChicBurgerMeal);
		
		jTxtCBBurger = new JTextField();
		jTxtCBBurger.setHorizontalAlignment(SwingConstants.RIGHT);
		jTxtCBBurger.setFont(new Font("Tahoma", Font.BOLD, 24));
		jTxtCBBurger.setColumns(10);
		jTxtCBBurger.setBounds(283, 105, 227, 25);
		panel.add(jTxtCBBurger);
		
		JLabel jlblChickenBurgerMeal = new JLabel("Chicken Burger Meal");
		jlblChickenBurgerMeal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblChickenBurgerMeal.setBounds(28, 61, 227, 29);
		panel.add(jlblChickenBurgerMeal);
		
		JLabel jlblCheeseBurger = new JLabel("Cheese Burger");
		jlblCheeseBurger.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblCheeseBurger.setBounds(28, 101, 227, 29);
		panel.add(jlblCheeseBurger);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblDrink.setBounds(28, 150, 227, 32);
		panel.add(lblDrink);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblQty.setBounds(283, 150, 227, 32);
		panel.add(lblQty);
		
		jTxtQty = new JTextField();
		jTxtQty.setHorizontalAlignment(SwingConstants.RIGHT);
		jTxtQty.setFont(new Font("Tahoma", Font.BOLD, 24));
		jTxtQty.setColumns(10);
		jTxtQty.setBounds(283, 193, 227, 28);
		panel.add(jTxtQty);
		
		JCheckBox jCDelivery = new JCheckBox("Home Delivery");
		jCDelivery.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jCDelivery.setBounds(28, 228, 227, 32);
		panel.add(jCDelivery);
		
		JCheckBox jCTax = new JCheckBox("Tax");
		jCTax.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jCTax.setBounds(283, 228, 227, 32);
		panel.add(jCTax);
		
		JComboBox jCmbDrink = new JComboBox();
		jCmbDrink.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jCmbDrink.setModel(new DefaultComboBoxModel(new String[] {"Select a drink", "Apple Juice", "Tea", "Cola", "Coke", "Coffee", "Ice Tea", "Ice Coffee", "Orange"}));
		jCmbDrink.setBounds(28, 193, 177, 32);
		panel.add(jCmbDrink);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(28, 141, 482, 6);
		panel.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1.setBounds(638, 91, 310, 279);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		jtxtConvert = new JTextField();
		jtxtConvert.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtConvert.setFont(new Font("Tahoma", Font.BOLD, 24));
		jtxtConvert.setColumns(10);
		jtxtConvert.setBounds(42, 132, 227, 32);
		panel_1.add(jtxtConvert);
		
		JComboBox jcmbCurrency = new JComboBox();
		jcmbCurrency.setModel(new DefaultComboBoxModel(new String[] {"Choose One...", "USA", "Nigeria", "Kenyan", "Brazil", "Canada", "India", "Philippine", "Indonesia"}));
		jcmbCurrency.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jcmbCurrency.setBounds(42, 75, 227, 32);
		panel_1.add(jcmbCurrency);
		
		JLabel jtxtConversion = new JLabel("");
		jtxtConversion.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtConversion.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtConversion.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jtxtConversion.setBounds(42, 189, 227, 32);
		panel_1.add(jtxtConversion);
		
		JButton jbtnConvert = new JButton("Convert");
		jbtnConvert.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jbtnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double British_Pound = Double.parseDouble(jtxtConvert.getText());
				if(jcmbCurrency.getSelectedItem().equals("Nigeria"))
				{
					String cConvert1 = String.format("N %.2f", British_Pound * Nigerian_Naira);
					jtxtConversion.setText( cConvert1);
				}
				
				if(jcmbCurrency.getSelectedItem().equals("USA"))
				{
					String cConvert1 = String.format("$ %.2f", British_Pound * US_Dollar);
					jtxtConversion.setText( cConvert1);
				}
				
				if(jcmbCurrency.getSelectedItem().equals("Kenyan"))
				{
					String cConvert2 = String.format("KS %.2f", British_Pound * Kenyan_Shilling);
					jtxtConversion.setText( cConvert2);
				}
				
				if(jcmbCurrency.getSelectedItem().equals("Canada"))
				{
					String cConvert4 = String.format("C$ %.2f", British_Pound * Canadian_Dollar);
					jtxtConversion.setText( cConvert4);
				}
				
				if(jcmbCurrency.getSelectedItem().equals("Brazil"))
				{
					String cConvert5 = String.format("Bra %.2f", British_Pound * Brazilian_Real);
					jtxtConversion.setText( cConvert5);
				}
				
				if(jcmbCurrency.getSelectedItem().equals("India"))
				{
					String cConvert6 = String.format("INR %.2f", British_Pound * Indian_Rupee);
					jtxtConversion.setText( cConvert6);
				}
				
				if(jcmbCurrency.getSelectedItem().equals("Philippine"))
				{
					String cConvert7 = String.format("PHP %.2f", British_Pound * Philippine_Peso);
					jtxtConversion.setText( cConvert7);
				}
				
				if(jcmbCurrency.getSelectedItem().equals("Indonesia"))
				{
					String cConvert8 = String.format("IDR %.2f", British_Pound * Indonesian_Rupiah);
					jtxtConversion.setText( cConvert8);
				}
			}
		});
		jbtnConvert.setBounds(42, 232, 113, 23);
		panel_1.add(jbtnConvert);
		
		JButton jBtnClose = new JButton("Close");
		jBtnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtConversion.setText(Null);
				jtxtConvert.setText(Null);
				jcmbCurrency.setSelectedItem("Choose One...");
			}
		});
		jBtnClose.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jBtnClose.setBounds(186, 232, 83, 23);
		panel_1.add(jBtnClose);
		
		JLabel lblCurrencyConvertor = new JLabel("Currency Convertor");
		lblCurrencyConvertor.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblCurrencyConvertor.setBounds(30, 22, 256, 32);
		panel_1.add(lblCurrencyConvertor);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_2.setBounds(51, 381, 577, 165);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCostOfDrinks = new JLabel("Cost of Drinks");
		lblCostOfDrinks.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCostOfDrinks.setBounds(26, 24, 227, 29);
		panel_2.add(lblCostOfDrinks);
		
		JLabel lblCostofMeal = new JLabel("Cost of Meal");
		lblCostofMeal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCostofMeal.setBounds(26, 67, 227, 29);
		panel_2.add(lblCostofMeal);
		
		JLabel lblCostOfDelivery = new JLabel("Cost of Delivery");
		lblCostOfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCostOfDelivery.setBounds(26, 107, 227, 32);
		panel_2.add(lblCostOfDelivery);
		
		JLabel jlblCostOfDrinks = new JLabel("");
		jlblCostOfDrinks.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostOfDrinks.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblCostOfDrinks.setBounds(373, 24, 163, 32);
		jlblCostOfDrinks.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.add(jlblCostOfDrinks);
		
		JLabel jlblCostOfMeal = new JLabel("");
		jlblCostOfMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostOfMeal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblCostOfMeal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblCostOfMeal.setBounds(373, 64, 163, 32);
		panel_2.add(jlblCostOfMeal);
		
		JLabel jlblCostOfDelivery = new JLabel("");
		jlblCostOfDelivery.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostOfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblCostOfDelivery.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblCostOfDelivery.setBounds(373, 107, 163, 32);
		panel_2.add(jlblCostOfDelivery);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_3.setBounds(638, 381, 310, 165);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel jlblTax = new JLabel("");
		jlblTax.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblTax.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblTax.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblTax.setBounds(137, 22, 163, 32);
		panel_3.add(jlblTax);
		
		JLabel jlblSubTotal = new JLabel("");
		jlblSubTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblSubTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblSubTotal.setBounds(137, 65, 163, 32);
		panel_3.add(jlblSubTotal);
		
		JLabel jlblTotal = new JLabel("");
		jlblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblTotal.setBounds(137, 108, 163, 32);
		panel_3.add(jlblTotal);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTax.setBounds(10, 25, 98, 29);
		panel_3.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblSubTotal.setBounds(10, 65, 117, 29);
		panel_3.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTotal.setBounds(10, 108, 98, 29);
		panel_3.add(lblTotal);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_4.setBounds(958, 91, 335, 455);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 35, 315, 409);
		panel_4.add(tabbedPane);
		
		JPanel jtxtReceipts = new JPanel();
		tabbedPane.addTab("Receipt", null, jtxtReceipts, null);
		jtxtReceipts.setLayout(null);
		
		JTextArea textAreaReceipt = new JTextArea();
		textAreaReceipt.setBounds(0, 0, 310, 381);
		jtxtReceipts.add(textAreaReceipt);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_7, null);
		panel_7.setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtDisplay.setColumns(10);
		txtDisplay.setBounds(34, 11, 248, 43);
		panel_7.add(txtDisplay);
		
		JButton btnBackSpace = new JButton("\uF0E7");
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
		btnBackSpace.setBounds(34, 68, 60, 60);
		panel_7.add(btnBackSpace);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtDisplay.setText(Null);

			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(97, 68, 60, 60);
		panel_7.add(btnClear);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPercent.setBounds(159, 68, 60, 60);
		panel_7.add(btnPercent);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(222, 68, 60, 60);
		panel_7.add(btnPlus);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSub.setBounds(222, 130, 60, 60);
		panel_7.add(btnSub);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() +btn9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(159, 130, 60, 60);
		panel_7.add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() +btn8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(97, 130, 60, 60);
		panel_7.add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() +btn7.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(34, 130, 60, 60);
		panel_7.add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() +btn4.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(34, 194, 60, 60);
		panel_7.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() +btn5.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(97, 194, 60, 60);
		panel_7.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() +btn6.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(159, 194, 60, 60);
		panel_7.add(btn6);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMult.setBounds(222, 194, 60, 60);
		panel_7.add(btnMult);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDiv.setBounds(222, 254, 60, 60);
		panel_7.add(btnDiv);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() +btn3.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(159, 255, 60, 60);
		panel_7.add(btn3);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() +btn1.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(34, 255, 60, 60);
		panel_7.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() +btn2.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(97, 255, 60, 60);
		panel_7.add(btn2);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBounds(97, 316, 60, 60);
		panel_7.add(btnDot);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() +btn0.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(34, 316, 60, 60);
		panel_7.add(btn0);
		
		JButton btnPM = new JButton("\u00B1");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = ops * (-1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPM.setBounds(159, 316, 60, 60);
		panel_7.add(btnPM);
		
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
		btnEquals.setBounds(222, 316, 60, 60);
		panel_7.add(btnEquals);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(51, 557, 1242, 82);
		frame.getContentPane().add(panel_5);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_5.setLayout(null);
		
		JButton jBtnTotal = new JButton("Total");
		jBtnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			double ChicBurger = Double.parseDouble(jTxtChicBurger.getText());
			double iChicBurger = 2.39;
			double Burger;
			Burger = (ChicBurger * iChicBurger);
			String pMeal = String.format("%.2f", Burger);
			jlblCostOfMeal.setText(pMeal);
			
			double ChicBurgerMeal = Double.parseDouble(jTxtChicBurgerMeal.getText());
			double iChicBurgerMeal = 4.39;
			double BurgerMeal;
			BurgerMeal = (ChicBurgerMeal * iChicBurgerMeal);
			String cbMeal = String.format("%.2f", BurgerMeal + Burger);
			jlblCostOfMeal.setText(cbMeal);
			
			double CheeseBurger = Double.parseDouble(jTxtCBBurger.getText());
			double CheeseBurgerPrice = 3.39;
			double CheeseBurgerMeal;
			CheeseBurgerMeal = (CheeseBurger * CheeseBurgerPrice);
			String cheese = String.format("%.2f", CheeseBurgerMeal + BurgerMeal + Burger);
			jlblCostOfMeal.setText(cheese);
			//-------------Home Delivery------------//
			double iDelivery = 3.39;
			if (jCDelivery.isSelected())
			{
				String pDelivery = String.format("%.2f", iDelivery);
				jlblCostOfDelivery.setText(pDelivery);
				
			}
			else
			{
				jlblCostOfDelivery.setText("0");
			}
			
			 double Drinks = Double.parseDouble(jTxtQty.getText());
			 double Tea= 1.20 * Drinks;
			 double Ice_Tea= 0.90 * Drinks;
			 double Coffee= 2.50 * Drinks;
			 double Ice_Coffee = 1.10 * Drinks;
			 double Cola= 2.10 * Drinks;
			 double Coke= 1.60 * Drinks;
			 double Orange= 1.70 * Drinks;
			 double Apple_Juice= 1.99 * Drinks;
			 
			 if(jCmbDrink.getSelectedItem().equals("Apple Juice")) {
				 
				 String cApple_Juice = String.format("%.2f", Apple_Juice);
				 jlblCostOfDrinks.setText(cApple_Juice);
			 }
			 
			 if(jCmbDrink.getSelectedItem().equals("Tea")) {
				 String cTea = String.format("%.2f", Tea);
				 jlblCostOfDrinks.setText( cTea);
			 }
			 
			 if(jCmbDrink.getSelectedItem().equals("Ice Tea")) {
				 String cIce_Tea = String.format("%.2f", Ice_Tea);
				 jlblCostOfDrinks.setText( cIce_Tea);
			 }
			 
			 if(jCmbDrink.getSelectedItem().equals("Coke")) {
				 String cCoke = String.format("%.2f", Coke);
				 jlblCostOfDrinks.setText( cCoke);
			 }
			 
			 if(jCmbDrink.getSelectedItem().equals("Cola")) {
				 String cCola = String.format("%.2f", Cola);
				 jlblCostOfDrinks.setText( cCola);
			 }
			 
			 if(jCmbDrink.getSelectedItem().equals("Orange")) {
				 String cOrange = String.format("%.2f", Orange);
				 jlblCostOfDrinks.setText( cOrange);
			 }
			 
			 if(jCmbDrink.getSelectedItem().equals("Coffee")) {
				 String cCoffee = String.format("%.2f", Coffee);
				 jlblCostOfDrinks.setText( cCoffee);
			 }
			 
			 
			 if(jCmbDrink.getSelectedItem().equals("Ice Coffee")) {
				 String cIceCoffee = String.format("%.2f", Ice_Coffee);
				 jlblCostOfDrinks.setText( cIceCoffee);
			 } 
			 
			 if(jCmbDrink.getSelectedItem().equals("Select a drink")) {
				 
				 jlblCostOfDrinks.setText("0");
			 }
			 
			 
			 //=====================Tax RATE======================//
			
			double cTotal1 = Double.parseDouble(jlblCostOfDrinks.getText());
			double cTotal2 = Double.parseDouble(jlblCostOfMeal.getText());
			double cTotal3 = Double.parseDouble(jlblCostOfDelivery.getText());
			double AllTotal = (cTotal1 + cTotal2 + cTotal3) /100;
				if(jCTax.isSelected())
				{
					String iTotal = String.format("%.2f", AllTotal);
					jlblTax.setText(iTotal);
				}
				//------------Total Here---------------//
			 
				double cTotal4 = Double.parseDouble(jlblTax.getText());
				
				double subTotal = (cTotal1 + cTotal2 + cTotal3 );
				String isubTotal = String.format("£ %.2f", subTotal);
				jlblSubTotal.setText(isubTotal);
				
				double allTotal = (cTotal1 + cTotal2 + cTotal3 + cTotal4);
				String iTotal = String.format("£ %.2f", allTotal);
				jlblTotal.setText(iTotal);
				
				String iTaxTotal = String.format("£ %.2f", cTotal4);
				jlblTax.setText(iTaxTotal);
				
				
				
				
				
			}
		});
		jBtnTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jBtnTotal.setBounds(188, 23, 105, 28);
		panel_5.add(jBtnTotal);
		
		JButton jBtnReceipt = new JButton("Receipt");
		jBtnReceipt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jBtnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Qty1 = Double.parseDouble(jTxtChicBurger.getText());
				double Qty2 = Double.parseDouble(jTxtChicBurgerMeal.getText());
				double Qty3 = Double.parseDouble(jTxtCBBurger.getText());
				
				textAreaReceipt.append("\t\nRestaurant Management Systems:\n\n" + "Chicken Burger:\t\t"
				+ Qty1 + "\nChicken Burger Meal:\t\t" +
					Qty2 + "\nBacon and Cheese Burger:\t\t"
					+ Qty3 + "\n\nThanks for using Bill Emulator");
			}
		});
		jBtnReceipt.setBounds(402, 23, 119, 28);
		panel_5.add(jBtnReceipt);
		
		JButton jBtnReset = new JButton("Reset");
		jBtnReset.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jBtnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblCostOfDelivery.setText(null);
				lblSubTotal.setText(null);
				lblTotal.setText(null);
				lblTax.setText(null);
				jtxtConversion.setText(null);
				jlblCostOfDelivery.setText(null);
				jlblCostOfDrinks.setText(null);
				jlblCostOfMeal.setText("0");
				jlblSubTotal.setText(null);
				jlblTax.setText(null);
				jlblTotal.setText(null);
				jTxtChicBurger.setText(null);
				jTxtChicBurgerMeal.setText(null);
				jTxtCBBurger.setText(null);
				jTxtQty.setText(null);
				jtxtConvert.setText(null);
				jCmbDrink.setSelectedItem("Select a drink");
				jcmbCurrency.setSelectedItem("Choose One...");
				
			}
		});
		jBtnReset.setBounds(633, 23, 105, 28);
		panel_5.add(jBtnReset);
		
		JButton jBtnExit = new JButton("Exit");
		jBtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		jBtnExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jBtnExit.setBounds(870, 21, 100, 33);
		panel_5.add(jBtnExit);
		
		JLabel lblNewLabel = new JLabel("Loan Management Systems");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 65));
		lblNewLabel.setBounds(231, 11, 952, 69);
		frame.getContentPane().add(lblNewLabel);
	}
}
