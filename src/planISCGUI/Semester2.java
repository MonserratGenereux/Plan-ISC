package planISCGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class Semester2 {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Semester2 window = new Semester2();
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
	public Semester2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 226);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JCheckBox chckbxProgramacinOrientadaA = new JCheckBox("Programación orientada a objetos");
		
		JCheckBox chckbxOrganizacinComputacional = new JCheckBox("Organización computacional");
		
		JCheckBox chckbxMatemticas = new JCheckBox("Matemáticas 2");
		
		JCheckBox chckbxFundamentosDeDiseo = new JCheckBox("Fundamentos de diseño interactivo");
		
		JCheckBox chckbxAdministracinEInnovacin = new JCheckBox("Administración e innovación en modelos de negocio");
		
		JCheckBox chckbxAnlisisYExpresion = new JCheckBox("Análisis y expresion verbal ");
		
		JButton btnSave = new JButton("Save");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxProgramacinOrientadaA)
						.addComponent(chckbxOrganizacinComputacional)
						.addComponent(chckbxMatemticas)
						.addComponent(chckbxFundamentosDeDiseo)
						.addComponent(chckbxAdministracinEInnovacin)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(chckbxAnlisisYExpresion)
							.addPreferredGap(ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
							.addComponent(btnSave)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(chckbxProgramacinOrientadaA)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxOrganizacinComputacional)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxMatemticas)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxFundamentosDeDiseo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxAdministracinEInnovacin)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxAnlisisYExpresion)
							.addContainerGap(9, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSave)
							.addContainerGap())))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}
