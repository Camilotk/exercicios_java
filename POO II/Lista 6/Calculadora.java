package Lista6;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora {

	private JFrame frmCalculadora;
	private JTextField textField;
	
	double primeironum;
	double segundonum;
	double resultado;
	String operacoes;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setResizable(false);
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setForeground(Color.BLACK);
		frmCalculadora.getContentPane().setForeground(Color.BLACK);
		frmCalculadora.setBounds(100, 100, 243, 390);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		textField.setBounds(12, 12, 216, 41);
		frmCalculadora.getContentPane().add(textField);
		textField.setColumns(10);
		
		// ---- primeira linha
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn7.getText();
				textField.setText(enterNumber);
			}
		});
		btn7.setFont(new Font("Ubuntu", Font.BOLD, 17));
		btn7.setBounds(12, 119, 50, 50);
		frmCalculadora.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn8.getText();
				textField.setText(enterNumber);
			}
		});
		btn8.setFont(new Font("Ubuntu", Font.BOLD, 17));
		btn8.setBounds(65, 119, 50, 50);
		frmCalculadora.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn9.getText();
				textField.setText(enterNumber);
			}
		});
		btn9.setFont(new Font("Ubuntu", Font.BOLD, 17));
		btn9.setBounds(122, 119, 50, 50);
		frmCalculadora.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primeironum = Double.parseDouble(textField.getText());
				textField.setText("");
				operacoes = "+";
			}
		});
		btnPlus.setFont(new Font("Ubuntu", Font.BOLD, 17));
		btnPlus.setBounds(178, 119, 50, 50);
		frmCalculadora.getContentPane().add(btnPlus);
		
		// --- segunda linha
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn1.getText();
				textField.setText(enterNumber);
			}
		});
		btn1.setFont(new Font("Ubuntu", Font.BOLD, 17));
		btn1.setBounds(12, 234, 50, 50);
		frmCalculadora.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn2.getText();
				textField.setText(enterNumber);
			}
		});
		btn2.setFont(new Font("Ubuntu", Font.BOLD, 17));
		btn2.setBounds(65, 234, 50, 50);
		frmCalculadora.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn3.getText();
				textField.setText(enterNumber);
			}
		});
		btn3.setFont(new Font("Ubuntu", Font.BOLD, 17));
		btn3.setBounds(122, 234, 50, 50);
		frmCalculadora.getContentPane().add(btn3);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primeironum = Double.parseDouble(textField.getText());
				textField.setText("");
				operacoes = "*";
			}
		});
		btnMult.setFont(new Font("Ubuntu", Font.BOLD, 17));
		btnMult.setBounds(178, 234, 50, 50);
		frmCalculadora.getContentPane().add(btnMult);
		
		// --- terceira linha
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn4.getText();
				textField.setText(enterNumber);
			}
		});
		btn4.setFont(new Font("Ubuntu", Font.BOLD, 17));
		btn4.setBounds(12, 178, 50, 50);
		frmCalculadora.getContentPane().add(btn4);
				
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn5.getText();
				textField.setText(enterNumber);
			}
		});
		btn5.setFont(new Font("Ubuntu", Font.BOLD, 17));
		btn5.setBounds(65, 178, 50, 50);
		frmCalculadora.getContentPane().add(btn5);
				
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn6.getText();
				textField.setText(enterNumber);
			}
		});
		btn6.setFont(new Font("Ubuntu", Font.BOLD, 17));
		btn6.setBounds(122, 178, 50, 50);
		frmCalculadora.getContentPane().add(btn6);
				
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primeironum = Double.parseDouble(textField.getText());
				textField.setText("");
				operacoes = "-";
			}
		});
		btnSub.setFont(new Font("Ubuntu", Font.BOLD, 17));
		btnSub.setBounds(178, 178, 50, 50);
		frmCalculadora.getContentPane().add(btnSub);
		
		// --- quarta linha
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btn0.getText();
				textField.setText(enterNumber);
			}
		});
		btn0.setFont(new Font("Ubuntu", Font.BOLD, 17));
		btn0.setBounds(12, 290, 50, 50);
		frmCalculadora.getContentPane().add(btn0);
						
		JButton btnPonto = new JButton(".");
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumber = textField.getText() + btnPonto.getText();
				textField.setText(enterNumber);
			}
		});
		btnPonto.setFont(new Font("Ubuntu", Font.BOLD, 17));
		btnPonto.setBounds(65, 290, 50, 50);
		frmCalculadora.getContentPane().add(btnPonto);
						
		JButton btnInverte = new JButton("±");
		btnInverte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops *= -1;
				textField.setText(String.valueOf(ops));
			}
		});
		btnInverte.setFont(new Font("Ubuntu", Font.BOLD, 17));
		btnInverte.setBounds(122, 290, 50, 50);
		frmCalculadora.getContentPane().add(btnInverte);
						
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				segundonum = Double.parseDouble(textField.getText());
				if(operacoes.equals("+")) {
					resultado = primeironum + segundonum;
					textField.setText(String.format("%.2f", resultado));
				} else if(operacoes.equals("-")) {
					resultado = primeironum - segundonum;
					textField.setText(String.format("%.2f", resultado));
				} else if(operacoes.equals("/")) {
					resultado = primeironum / segundonum;
					textField.setText(String.format("%.2f", resultado));
				} else if(operacoes.equals("*")) {
					resultado = primeironum * segundonum;
					textField.setText(String.format("%.2f", resultado));
				} else if(operacoes.equals("%")) {
					resultado = primeironum % segundonum;
					textField.setText(String.format("%.2f", resultado));
				} else {
					textField.setText("NaN");
				} 
			}
		});
		btnIgual.setFont(new Font("Ubuntu", Font.BOLD, 17));
		btnIgual.setBounds(178, 290, 50, 50);
		frmCalculadora.getContentPane().add(btnIgual);
		
		// --- ultima linha
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primeironum = Double.parseDouble(textField.getText());
				textField.setText("");
				operacoes = "/";
			}
		});
		btnDiv.setFont(new Font("Ubuntu", Font.BOLD, 14));
		btnDiv.setBounds(178, 65, 50, 50);
		frmCalculadora.getContentPane().add(btnDiv);
		
		JButton btnMod = new JButton("%");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primeironum = Double.parseDouble(textField.getText());
				textField.setText("");
				operacoes = "%";
			}
		});
		btnMod.setFont(new Font("Ubuntu", Font.BOLD, 17));
		btnMod.setBounds(122, 65, 50, 50);
		frmCalculadora.getContentPane().add(btnMod);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Ubuntu", Font.BOLD, 17));
		btnClear.setBounds(65, 65, 50, 50);
		frmCalculadora.getContentPane().add(btnClear);
		
		JButton btnBackspace = new JButton("<-");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if(textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
			}
		});
		btnBackspace.setFont(new Font("Ubuntu", Font.BOLD, 14));
		btnBackspace.setBounds(12, 65, 50, 50);
		frmCalculadora.getContentPane().add(btnBackspace);
	}
}
