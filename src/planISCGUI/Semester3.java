package planISCGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Semester3 {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Semester3 window = new Semester3();
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
	public Semester3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 227);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JCheckBox chckbxEstructuraDeDatos = new JCheckBox("Estructura de datos");
		
		JCheckBox chckbxProbabilidadYEstadstica = new JCheckBox("Probabilidad y estadística");
		
		JCheckBox chckbxElectricidadYMagnetismo = new JCheckBox("Electricidad y magnetismo");
		
		JCheckBox chckbxMatemticas = new JCheckBox("Matemáticas 3");
		
		JCheckBox chckbxFundamentosDeIngenieria = new JCheckBox("Fundamentos de ingenieria de software");
		
		JCheckBox chckbxticaPersonaY = new JCheckBox("Ética, persona y sociedad");
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(chckbxticaPersonaY)
							.addPreferredGap(ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
							.addComponent(btnNewButton))
						.addComponent(chckbxEstructuraDeDatos)
						.addComponent(chckbxProbabilidadYEstadstica)
						.addComponent(chckbxElectricidadYMagnetismo)
						.addComponent(chckbxMatemticas)
						.addComponent(chckbxFundamentosDeIngenieria))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(chckbxEstructuraDeDatos)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxProbabilidadYEstadstica)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxElectricidadYMagnetismo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxMatemticas)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxFundamentosDeIngenieria)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxticaPersonaY)
					.addContainerGap(35, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(174, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}
