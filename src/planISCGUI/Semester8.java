package planISCGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class Semester8 {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Semester8 window = new Semester8();
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
	public Semester8() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 264);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JCheckBox chckbxGrficasComputacionales = new JCheckBox("Gráficas computacionales");
		
		JCheckBox chckbxMtodosCuantitativosY = new JCheckBox("Métodos cuantitativos y simulación");
		
		JCheckBox chckbxTpicos = new JCheckBox("Tópicos 2");
		
		JCheckBox chckbxTpicos_1 = new JCheckBox("Tópicos 3");
		
		JCheckBox chckbxLaboratorioDeDesarrollo = new JCheckBox("Laboratorio de desarrollo de aplicaciones web");
		
		JCheckBox chckbxDiseoDeCompiladores = new JCheckBox("Diseño de compiladores");
		
		JCheckBox chckbxDiseoYArquitectura = new JCheckBox("Diseño y Arquitectura de software");
		
		JButton btnSave = new JButton("Save");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxGrficasComputacionales)
						.addComponent(chckbxMtodosCuantitativosY)
						.addComponent(chckbxTpicos)
						.addComponent(chckbxTpicos_1)
						.addComponent(chckbxLaboratorioDeDesarrollo)
						.addComponent(chckbxDiseoDeCompiladores)
						.addComponent(chckbxDiseoYArquitectura))
					.addContainerGap(124, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(327, Short.MAX_VALUE)
					.addComponent(btnSave)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(chckbxGrficasComputacionales)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxMtodosCuantitativosY)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxTpicos)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxTpicos_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxLaboratorioDeDesarrollo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxDiseoDeCompiladores)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxDiseoYArquitectura)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSave)
					.addContainerGap(40, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}
