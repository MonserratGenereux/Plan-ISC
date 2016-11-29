package planISCGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class Remedials {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Remedials window = new Remedials();
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
	public Remedials() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 322);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JCheckBox chckbxIntroduccinALa = new JCheckBox("Introducción a la computación");
		
		JCheckBox chckbxIntroduccinALa_1 = new JCheckBox("Introducción a la física");
		
		JCheckBox chckbxIntrouccinALas = new JCheckBox("Introducción a las matemáticas");
		
		JCheckBox chckbxInglsRemedial = new JCheckBox("Inglés remedial 1");
		
		JCheckBox chckbxInglsRemedial_1 = new JCheckBox("Inglés remedial 2");
		
		JCheckBox chckbxInglesRemedial = new JCheckBox("Inglés remedial 3");
		
		JCheckBox chckbxInglsRemedial_2 = new JCheckBox("Inglés remedial 4");
		
		JCheckBox chckbxInglsRemedial_3 = new JCheckBox("Inglés remedial 5");
		
		JCheckBox chckbxFundamentosDeEscritura = new JCheckBox("Fundamentos de escritura");
		
		JButton btnSave = new JButton("Save");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxIntroduccinALa)
						.addComponent(chckbxIntroduccinALa_1)
						.addComponent(chckbxIntrouccinALas)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(chckbxInglsRemedial_3)
							.addPreferredGap(ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
							.addComponent(btnSave))
						.addComponent(chckbxInglsRemedial_2)
						.addComponent(chckbxInglesRemedial)
						.addComponent(chckbxInglsRemedial)
						.addComponent(chckbxFundamentosDeEscritura)
						.addComponent(chckbxInglsRemedial_1))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(15)
					.addComponent(chckbxIntroduccinALa)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxIntroduccinALa_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxIntrouccinALas)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxFundamentosDeEscritura)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxInglsRemedial)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxInglsRemedial_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxInglesRemedial)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxInglsRemedial_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxInglsRemedial_3)
					.addGap(25))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(265, Short.MAX_VALUE)
					.addComponent(btnSave)
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
