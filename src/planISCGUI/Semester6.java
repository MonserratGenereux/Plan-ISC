package planISCGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class Semester6 {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Semester6 window = new Semester6();
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
	public Semester6() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 236);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JCheckBox chckbxProgramacinAvanzada = new JCheckBox("Programación avanzada");
		
		JCheckBox chckbxEmprendimiento = new JCheckBox("Emprendimiento");
		
		JCheckBox chckbxEvaluacinYAdministracin = new JCheckBox("Evaluación y administración de proyectos");
		
		JCheckBox chckbxBasesDeDatos = new JCheckBox("Bases de datos avanzadas");
		
		JCheckBox chckbxProyectoDeDesarrollo = new JCheckBox("Proyecto de desarrollo para dispositivos móviles");
		
		JCheckBox chckbxCalidadYPruebas = new JCheckBox("Calidad y pruebas de software");
		
		JButton btnSave = new JButton("Save");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxProgramacinAvanzada)
						.addComponent(chckbxEmprendimiento)
						.addComponent(chckbxEvaluacinYAdministracin)
						.addComponent(chckbxBasesDeDatos)
						.addComponent(chckbxProyectoDeDesarrollo)
						.addComponent(chckbxCalidadYPruebas))
					.addContainerGap(107, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(327, Short.MAX_VALUE)
					.addComponent(btnSave)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(chckbxProgramacinAvanzada)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxEmprendimiento)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxEvaluacinYAdministracin)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxBasesDeDatos)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxProyectoDeDesarrollo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxCalidadYPruebas)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSave)
					.addContainerGap(69, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}
