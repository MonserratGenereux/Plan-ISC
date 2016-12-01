package planISC;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class materia {

	JFrame frame;
	private JTextField textField;

	Dijkstra grafo = new Dijkstra();
	Remedials root = new Remedials();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					materia window = new materia();
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
	public materia() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.window);
		frame.getContentPane().setForeground(new Color(32, 178, 170));
		frame.setBounds(100, 100, 338, 224);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton btnRequisitos = new JButton("See Requirements");
		btnRequisitos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(frame, grafo.requirements(root.root, textField.getText()));
			}
		});
		
		JButton btnRec = new JButton("Recomendation");
		btnRec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, grafo.nextSem(root.student));

			}
		});
		
		JLabel lblIngresaLaClave = new JLabel("Enter key or name of the subject:");
		
		JButton btnEsRequisitoPara = new JButton("This is requirement for:");
		btnEsRequisitoPara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnEsRequisitoPara)
						.addComponent(btnRequisitos)
						.addComponent(btnRec)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(textField, Alignment.LEADING)
							.addComponent(lblIngresaLaClave, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addContainerGap(110, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addComponent(lblIngresaLaClave)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnRec)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnRequisitos)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnEsRequisitoPara)
					.addContainerGap(7, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
