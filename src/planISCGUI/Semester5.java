package planISCGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class Semester5 {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Semester5 window = new Semester5();
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
	public Semester5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 238);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JCheckBox chckbxSistemasOperativos = new JCheckBox("Sistemas operativos");
		
		JCheckBox chckbxlgebraLineal = new JCheckBox("Álgebra lineal");
		
		JCheckBox chckbxInterconexinDeRedes = new JCheckBox("Interconexión de redes");
		
		JCheckBox chckbxMatemticasComputacionales = new JCheckBox("Matemáticas computacionales");
		
		JCheckBox chckbxAnlisisYModelacin = new JCheckBox("Análisis y modelación de sistemas de software");
		
		JCheckBox chckbxHumanidadesYBellas = new JCheckBox("Humanidades y bellas artes");
		
		JButton btnSave = new JButton("Save");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxSistemasOperativos)
						.addComponent(chckbxlgebraLineal)
						.addComponent(chckbxInterconexinDeRedes)
						.addComponent(chckbxMatemticasComputacionales)
						.addComponent(chckbxAnlisisYModelacin)
						.addComponent(chckbxHumanidadesYBellas))
					.addContainerGap(118, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(327, Short.MAX_VALUE)
					.addComponent(btnSave)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(chckbxSistemasOperativos)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxlgebraLineal)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxInterconexinDeRedes)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxMatemticasComputacionales)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxAnlisisYModelacin)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxHumanidadesYBellas)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSave)
					.addContainerGap(69, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}
