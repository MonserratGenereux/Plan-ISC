package planISCGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class Semester7 {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Semester7 window = new Semester7();
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
	public Semester7() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 234);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JCheckBox chckbxTopicos = new JCheckBox("Tópicos 1");
		
		JCheckBox chckbxSeguridadInformtica = new JCheckBox("Seguridad informática");
		
		JCheckBox chckbxAdministracinDeProyectos = new JCheckBox("Administración de proyectos de ingenieria de software");
		
		JCheckBox chckbxDesarrolloDeAplicaciones = new JCheckBox("Desarrollo de aplicaciones web");
		
		JCheckBox chckbxLenguajesDeProgramacin = new JCheckBox("Lenguajes de programación");
		
		JCheckBox chckbxCiudadania = new JCheckBox("Ciudadania");
		
		JButton btnSave = new JButton("Save");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxTopicos)
						.addComponent(chckbxSeguridadInformtica)
						.addComponent(chckbxAdministracinDeProyectos)
						.addComponent(chckbxDesarrolloDeAplicaciones)
						.addComponent(chckbxLenguajesDeProgramacin)
						.addComponent(chckbxCiudadania))
					.addContainerGap(69, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(327, Short.MAX_VALUE)
					.addComponent(btnSave)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(chckbxTopicos)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxSeguridadInformtica)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxAdministracinDeProyectos)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxDesarrolloDeAplicaciones)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxLenguajesDeProgramacin)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxCiudadania)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSave)
					.addContainerGap(69, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}
