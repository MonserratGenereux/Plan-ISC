package planISCGUI;



import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Semestres {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Semestres window = new Semestres();
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
	public Semestres() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnSem0 = new JButton("Remedials");
		btnSem0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getSource()==btnSem0){
					Remedials window = new Remedials();
					window.frame.setVisible(true);
					frame.setVisible(false);
				}
			}
		});
		
		JButton btnSem1 = new JButton("Semester 1");
		btnSem1.addMouseListener(new MouseAdapter() {
			@Override
				public void mouseClicked(MouseEvent e) {
					if(e.getSource()==btnSem1){
						Semester1 window = new Semester1();
						window.frame.setVisible(true);
						frame.setVisible(false);
					}
			}
		});
		
		JButton btnSem2 = new JButton("Semester 2");
		btnSem2.addMouseListener(new MouseAdapter() {
			@Override
				public void mouseClicked(MouseEvent e) {
					if(e.getSource()==btnSem2){
						Semester2 window = new Semester2();
						window.frame.setVisible(true);
						frame.setVisible(false);
					}
			}
		});
		
		JButton btnSem3 = new JButton("Semester 3");
		btnSem3.addMouseListener(new MouseAdapter() {
			@Override
				public void mouseClicked(MouseEvent e) {
					if(e.getSource()==btnSem3){
						Semester3 window = new Semester3();
						window.frame.setVisible(true);
						frame.setVisible(false);
					}
			}
		});
		
		JButton btnSem6 = new JButton("Semester 6");
		btnSem6.addMouseListener(new MouseAdapter() {
			@Override
				public void mouseClicked(MouseEvent e) {
					if(e.getSource()==btnSem6){
						Semester6 window = new Semester6();
						window.frame.setVisible(true);
						frame.setVisible(false);
					}
			}
		});
		
		JButton btnSem9 = new JButton("Semester 9");
		btnSem9.addMouseListener(new MouseAdapter() {
			@Override
				public void mouseClicked(MouseEvent e) {
					if(e.getSource()==btnSem9){
						Semester9 window = new Semester9();
						window.frame.setVisible(true);
						frame.setVisible(false);
					}
			}
		});
		
		JButton btnSem4 = new JButton("Semester4");
		btnSem4.addMouseListener(new MouseAdapter() {
			@Override
				public void mouseClicked(MouseEvent e) {
					if(e.getSource()==btnSem4){
						Semester4 window = new Semester4();
						window.frame.setVisible(true);
						frame.setVisible(false);
					}
			}
		});
		
		JButton btnSem7 = new JButton("Semester 7");
		btnSem7.addMouseListener(new MouseAdapter() {
			@Override
				public void mouseClicked(MouseEvent e) {
					if(e.getSource()==btnSem7){
						Semester7 window = new Semester7();
						window.frame.setVisible(true);
						frame.setVisible(false);
					}
			}
		});
		
		JButton btnSem5 = new JButton("Semester 5");
		btnSem5.addMouseListener(new MouseAdapter() {
			@Override
				public void mouseClicked(MouseEvent e) {
					if(e.getSource()==btnSem5){
						Semester5 window = new Semester5();
						window.frame.setVisible(true);
						frame.setVisible(false);
					}
			}
		});
		
		JButton btnSem8 = new JButton("Semester 8");
		btnSem8.addMouseListener(new MouseAdapter() {
			@Override
				public void mouseClicked(MouseEvent e) {
					if(e.getSource()==btnSem8){
						Semester8 window = new Semester8();
						window.frame.setVisible(true);
						frame.setVisible(false);
					}
			}
		});
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(16)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnSem9)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnSem0)
								.addComponent(btnSem3)
								.addComponent(btnSem6))
							.addGap(41)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnSem7, Alignment.TRAILING)
								.addComponent(btnSem1, Alignment.TRAILING)
								.addComponent(btnSem4, Alignment.TRAILING))))
					.addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnSem5)
						.addComponent(btnSem2)
						.addComponent(btnSem8))
					.addGap(10))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(55)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSem0)
						.addComponent(btnSem2)
						.addComponent(btnSem1))
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSem3)
						.addComponent(btnSem5)
						.addComponent(btnSem4))
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSem6)
						.addComponent(btnSem7)
						.addComponent(btnSem8))
					.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
					.addComponent(btnSem9)
					.addGap(18))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
