package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalcApp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField txtQwer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcApp frame = new CalcApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalcApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 335, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(12, 103, 66, 66);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(90, 103, 66, 66);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(168, 103, 66, 66);
		contentPane.add(btn9);
		
		JButton btnN = new JButton("%");
		btnN.setBounds(246, 103, 66, 66);
		contentPane.add(btnN);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(88, 179, 66, 66);
		contentPane.add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(10, 179, 66, 66);
		contentPane.add(btn4);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(166, 179, 66, 66);
		contentPane.add(btn6);
		
		JButton btnG = new JButton("*");
		btnG.setBounds(244, 179, 66, 66);
		contentPane.add(btnG);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(88, 255, 66, 66);
		contentPane.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(10, 255, 66, 66);
		contentPane.add(btn1);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(166, 255, 66, 66);
		contentPane.add(btn3);
		
		JButton btnM = new JButton("-");
		btnM.setBounds(244, 255, 66, 66);
		contentPane.add(btnM);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(88, 331, 66, 66);
		contentPane.add(btn0);
		
		JButton btnC = new JButton("c");
		btnC.setBounds(10, 331, 66, 66);
		contentPane.add(btnC);
		
		JButton btnE = new JButton("=");
		btnE.setBounds(166, 331, 66, 66);
		contentPane.add(btnE);
		
		JButton btnP = new JButton("+");
		btnP.setBounds(244, 331, 66, 66);
		contentPane.add(btnP);
		
		table = new JTable();
		table.setBounds(12, 10, 1, 1);
		contentPane.add(table);
		
		txtQwer = new JTextField();
		txtQwer.setText("0");
		txtQwer.setHorizontalAlignment(SwingConstants.RIGHT);
		txtQwer.setEditable(false);
		txtQwer.setBounds(12, 10, 300, 66);
		contentPane.add(txtQwer);
		txtQwer.setColumns(10);
	}
}
