package planISCGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class Semester4 {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Semester4 window = new Semester4();
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
	public Semester4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 236);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JCheckBox chckbxAnlisisYDiseo = new JCheckBox("Análisis y diseño de algoritmos");
		
		JCheckBox chckbxProyectoDeDesarrollo = new JCheckBox("Proyecto de desarrollo de videojuegos");
		
		JCheckBox chckbxFundamentosDeRedes = new JCheckBox("Fundamentos de redes");
		
		JCheckBox chckbxMtodosNumricosEn = new JCheckBox("Métodos numéricos en ingeniería");
		
		JCheckBox chckbxBasesDeDatos = new JCheckBox("Bases de datos");
		
		JCheckBox chckbxExpresionVerbalEn = new JCheckBox("Expresion verbal en el ámbito profesional");
		
		JButton btnSave = new JButton("Save");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxAnlisisYDiseo)
						.addComponent(chckbxProyectoDeDesarrollo)
						.addComponent(chckbxFundamentosDeRedes)
						.addComponent(chckbxMtodosNumricosEn)
						.addComponent(chckbxBasesDeDatos)
						.addComponent(chckbxExpresionVerbalEn))
					.addContainerGap(173, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(327, Short.MAX_VALUE)
					.addComponent(btnSave)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(chckbxAnlisisYDiseo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxProyectoDeDesarrollo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxFundamentosDeRedes)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxMtodosNumricosEn)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxBasesDeDatos)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxExpresionVerbalEn)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSave)
					.addContainerGap(17, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}
