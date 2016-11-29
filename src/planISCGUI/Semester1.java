package planISCGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class Semester1 {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Semester1 window = new Semester1();
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
	public Semester1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 271);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JCheckBox chckbxFundamentosDeProgramacin = new JCheckBox("Fundamentos de programación");
		
		JCheckBox chckbxFsica = new JCheckBox("Física 1");
		
		JCheckBox chckbxMatemticasDiscretas = new JCheckBox("Matemáticas discretas");
		
		JCheckBox chckbxMatemticas = new JCheckBox("Matemáticas 1");
		
		JCheckBox chckbxIntrouccinALa = new JCheckBox("Introucción a la ingenieria en sistemas computacionales");
		
		JCheckBox chckbxCienciasNaturalesY = new JCheckBox("Ciencias naturales y desarrollo sustentable");
		
		JCheckBox chckbxLenguaExtranjera = new JCheckBox("Lengua extranjera ");
		
		JButton btnSave = new JButton("Save");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxFundamentosDeProgramacin)
						.addComponent(chckbxFsica)
						.addComponent(chckbxMatemticasDiscretas)
						.addComponent(chckbxMatemticas)
						.addComponent(chckbxIntrouccinALa)
						.addComponent(chckbxCienciasNaturalesY)
						.addComponent(chckbxLenguaExtranjera))
					.addContainerGap(58, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(327, Short.MAX_VALUE)
					.addComponent(btnSave)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(15)
					.addComponent(chckbxFundamentosDeProgramacin)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxFsica)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxMatemticasDiscretas)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxMatemticas)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxIntrouccinALa)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxCienciasNaturalesY)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxLenguaExtranjera)
							.addContainerGap(18, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSave)
							.addContainerGap())))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}
