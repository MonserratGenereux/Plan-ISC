package planISCGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class Semester9 {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Semester9 window = new Semester9();
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
	public Semester9() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 457, 264);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JCheckBox chckbxTpicos = new JCheckBox("Tópicos 4");
		
		JCheckBox chckbxTpicos_1 = new JCheckBox("Tópicos 5");
		
		JCheckBox chckbxTpicos_2 = new JCheckBox("Tópicos 6");
		
		JCheckBox chckbxIntroduccinALa = new JCheckBox("Introducción a la vida profesional");
		
		JCheckBox chckbxSistemasInteligentes = new JCheckBox("Sistemas inteligentes");
		
		JCheckBox chckbxProyectoIntegradorPara = new JCheckBox("Proyecto integrador para el desarrollo de soluciones empresariales");
		
		JCheckBox chckbxticaAplicada = new JCheckBox("Ética aplicada");
		
		JButton btnSave = new JButton("Save");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxTpicos)
						.addComponent(chckbxTpicos_1)
						.addComponent(chckbxTpicos_2)
						.addComponent(chckbxIntroduccinALa)
						.addComponent(chckbxSistemasInteligentes)
						.addComponent(chckbxProyectoIntegradorPara)
						.addComponent(chckbxticaAplicada)))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(334, Short.MAX_VALUE)
					.addComponent(btnSave)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(chckbxTpicos)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxTpicos_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxTpicos_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxIntroduccinALa)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxSistemasInteligentes)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxProyectoIntegradorPara)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxticaAplicada)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSave)
					.addContainerGap(40, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}
