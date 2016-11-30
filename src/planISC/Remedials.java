package planISC;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.Box;

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
		frame.setBounds(100, 100, 1282, 777);
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
		
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnSave){
					if(chckbxIntroduccinALa.isSelected()==true){
						
					}if(chckbxIntroduccinALa_1.isSelected()==true){
						
					}if(chckbxIntrouccinALas.isSelected()==true){
					
					}if(chckbxInglesRemedial.isSelected()==true){
						
					}if(chckbxInglsRemedial_1.isSelected()==true){
						
					}if(chckbxInglesRemedial .isSelected()==true){
	
					}if(chckbxInglsRemedial_2.isSelected()==true){
	
					}if(chckbxInglsRemedial_3.isSelected()==true){
	
					}if(chckbxFundamentosDeEscritura.isSelected()==true){
	
					}
				}
			}
		});
		
		JLabel lblNewLabel = new JLabel("Remedials");
		
		//Primer semestre
		JLabel lblSemester = new JLabel("Semester 1");
		
		JCheckBox chckbxFundamentosProg = new JCheckBox("Fundamentos de Programación");
		
		JCheckBox chckbxFsica = new JCheckBox("Física 1");
		
		JCheckBox chckbxMatemticasDiscretas = new JCheckBox("Matemáticas Discretas");
		
		JCheckBox chckbxMatemticas = new JCheckBox("Matemáticas 1");
		
		JCheckBox chckbxIntroduccinALa_2 = new JCheckBox("Introducción a la Ingeniería en Sistemas Computacionales");
		
		JCheckBox chckbxCienciasNat = new JCheckBox("Ciencias Naturales y Desarrollo Sustentable");
		
		JCheckBox chckbxLenguaExtranjera = new JCheckBox("Lengua Extranjera");
		
		if(chckbxFundamentosProg.isSelected()==true){
			
		}if(chckbxFsica.isSelected()==true){
			
		}if(chckbxMatemticasDiscretas.isSelected()==true){
			
		}if(chckbxMatemticas.isSelected()==true){
			
		}if(chckbxIntroduccinALa_2.isSelected()==true){
			
		}if(chckbxCienciasNat.isSelected()==true){
			
		}if(chckbxLenguaExtranjera.isSelected()==true){
			
		}
		
		//segundo semestre
		JLabel lblSemester_1 = new JLabel("Semester 2");
		
		JCheckBox chckbxProgramacinOrientadaA = new JCheckBox("Programación Orientada a Objetos");
		
		JCheckBox chckbxOrganizacinComputacional = new JCheckBox("Organización Computacional");
		
		JCheckBox chckbxMatemticas_1 = new JCheckBox("Matemáticas 2");
		
		JCheckBox chckbxFundamentosDeDiseo = new JCheckBox("Fundamentos de Diseño Interactivo");
		
		JCheckBox chckbxAdministracinEInnovacin = new JCheckBox("Administración e Innovación en Modelos de Negocio");
		
		JCheckBox chckbxAnlisisYExpresin = new JCheckBox("Análisis y Expresión Verbal");
		
		if(chckbxProgramacinOrientadaA.isSelected()==true){
			
		}if(chckbxOrganizacinComputacional.isSelected()==true){
			
		}if(chckbxMatemticas_1.isSelected()==true){
			
		}if(chckbxFundamentosDeDiseo.isSelected()==true){
			
		}if(chckbxAdministracinEInnovacin.isSelected()==true){
			
		}if(chckbxAnlisisYExpresin.isSelected()==true){
			
		}
		
		//Semestre 3
		
		JLabel lblSemester_2 = new JLabel("Semester 3");
		
		JCheckBox chckbxEstructuraDeDatos = new JCheckBox("Estructura de Datos");
		
		JCheckBox chckbxProbabilidadYEstadstica = new JCheckBox("Probabilidad y estadística");
		
		JCheckBox chckbxElectricidadYMagnetismo = new JCheckBox("Electricidad y Magnetismo");
		
		JCheckBox chckbxMatemticas_2 = new JCheckBox("Matemáticas 3");
		
		JCheckBox chckbxFundamentosDeIngeniera = new JCheckBox("Fundamentos de Ingeniería de Software");
		
		JCheckBox chckbxticaPersonaY = new JCheckBox("Ética, Persona y Sociedad");
		
		if(chckbxEstructuraDeDatos.isSelected()==true){
			
		}if(chckbxProbabilidadYEstadstica.isSelected()==true){
			
		}if(chckbxElectricidadYMagnetismo.isSelected()==true){
			
		}if(chckbxMatemticas_2.isSelected()==true){
			
		}if(chckbxFundamentosDeIngeniera.isSelected()==true){
			
		}if(chckbxticaPersonaY.isSelected()==true){
			
		}
		
		//Semester 4
		
		JLabel lblSemester_3 = new JLabel("Semester 4");
		
		JCheckBox chckbxAnlisisYDiseo = new JCheckBox("Análisis y Diseño de Algoritmos");
		
		JCheckBox chckbxProyectoDeDesarrollo = new JCheckBox("Proyecto de Desarrollo de Videojuegos");
		
		JCheckBox chckbxFundamentosDeRedes = new JCheckBox("Fundamentos de Redes");
		
		JCheckBox chckbxMtodosNumricosEn = new JCheckBox("Métodos Numéricos en Ingeniería");
		
		JCheckBox chckbxBasesDeDatos = new JCheckBox("Bases de Datos");
		
		JCheckBox chckbxExpresinVerbalEn = new JCheckBox("Expresión Verbal en el Ámbito Profesional");
		
		if(chckbxAnlisisYDiseo.isSelected()==true){
			
		}if(chckbxProyectoDeDesarrollo.isSelected()==true){
			
		}if(chckbxFundamentosDeRedes.isSelected()==true){
			
		}if(chckbxMtodosNumricosEn.isSelected()==true){
			
		}if(chckbxBasesDeDatos.isSelected()==true){
			
		}if(chckbxExpresinVerbalEn.isSelected()==true){
			
		}
		
		//Semester 5
		
		JLabel lblSemester_4 = new JLabel("Semester 5");
		
		JCheckBox chckbxSistemasOperativos = new JCheckBox("Sistemas Operativos");
		
		JCheckBox chckbxlgebraLineal = new JCheckBox("Álgebra Lineal");
		
		JCheckBox chckbxInterconexinDeRedes = new JCheckBox("Interconexión de Redes");
		
		JCheckBox chckbxMatemticasComputacionales = new JCheckBox("Matemáticas Computacionales");
		
		JCheckBox chckbxAnlisisYModelacin = new JCheckBox("Análisis y Modelación de Sistemas de Software");
		
		JCheckBox chckbxHumanidadesYBellas = new JCheckBox("Humanidades y Bellas Artes");
		
		if(chckbxSistemasOperativos.isSelected()==true){
			
		}if(chckbxlgebraLineal.isSelected()==true){
			
		}if(chckbxInterconexinDeRedes.isSelected()==true){
			
		}if(chckbxMatemticasComputacionales.isSelected()==true){
			
		}if(chckbxAnlisisYModelacin.isSelected()==true){
			
		}if(chckbxHumanidadesYBellas.isSelected()==true){
			
		}
		
		//Semester 6
		JLabel lblSemester_5 = new JLabel("Semester 6");
		
		JCheckBox chckbxProgramacinAvanzada = new JCheckBox("Programación Avanzada");
		
		JCheckBox chckbxEmprendimiento = new JCheckBox("Emprendimiento");
		
		JCheckBox chckbxEvaluacinYAdministracin = new JCheckBox("Evaluación y Administración de Proyectos");
		
		JCheckBox chckbxBasesDeDatos_1 = new JCheckBox("Bases de Datos Avanzadas");
		
		JCheckBox chckbxProyectoDeDesarrollo_1 = new JCheckBox("Proyecto de Desarrollo para Dispositivos Móviles");
		
		JCheckBox chckbxCalidadYPruebas = new JCheckBox("Calidad y Pruebas de Software");
		
		if(chckbxProgramacinAvanzada.isSelected()==true){
			
		}if(chckbxEmprendimiento.isSelected()==true){
			
		}if(chckbxEvaluacinYAdministracin.isSelected()==true){
			
		}if(chckbxBasesDeDatos_1.isSelected()==true){
			
		}if(chckbxProyectoDeDesarrollo_1.isSelected()==true){
			
		}if(chckbxCalidadYPruebas.isSelected()==true){
			
		}
		
		//semester 7
		
		JLabel lblSemester_6 = new JLabel("Semester 7");
		
		JCheckBox chckbxTpicos = new JCheckBox("Tópicos 1");
		
		JCheckBox chckbxSeguridadInformtica = new JCheckBox("Seguridad Informática");
		
		JCheckBox chckbxAdministracinDeProyectos = new JCheckBox("Administración de Proyectos de Ingeniería de SW");
		
		JCheckBox chckbxDesarrolloDeAplicaciones = new JCheckBox("Desarrollo de Aplicaciones Web");
		
		JCheckBox chckbxLenguajesDeProgramacin = new JCheckBox("Lenguajes de Programación");
		
		JCheckBox chckbxCiudadania = new JCheckBox("Ciudadania");
		
		if(chckbxTpicos.isSelected()==true){
			
		}if(chckbxSeguridadInformtica.isSelected()==true){
			
		}if(chckbxAdministracinDeProyectos.isSelected()==true){
			
		}if(chckbxDesarrolloDeAplicaciones.isSelected()==true){
			
		}if(chckbxLenguajesDeProgramacin.isSelected()==true){
			
		}if(chckbxCiudadania.isSelected()==true){
			
		}
		
		//Semester 8
		
		
		JLabel lblSemester_7 = new JLabel("Semester 8");
		
		JCheckBox chckbxGrficasComputacionales = new JCheckBox("Gráficas Computacionales");
		
		JCheckBox chckbxMtodosCuantitativosY = new JCheckBox("Métodos Cuantitativos y Simulación");
		
		JCheckBox chckbxTpicos_1 = new JCheckBox("Tópicos 2");
		
		JCheckBox chckbxLaboratorioDeDesarrollo = new JCheckBox("Laboratorio de Desarrollo de Aplicaciones Web");
		
		JCheckBox chckbxDiseoDeCompiadores = new JCheckBox("Diseño de Compiadores");
		
		JCheckBox chckbxDiseoYArquitectura = new JCheckBox("Diseño y Arquitectura de Software");
		
		JCheckBox chckbxTpicos_2 = new JCheckBox("Tópicos 3");
		
		if(chckbxGrficasComputacionales.isSelected()==true){
			
		}if(chckbxMtodosCuantitativosY.isSelected()==true){
			
		}if(chckbxTpicos_1.isSelected()==true){
			
		}if(chckbxLaboratorioDeDesarrollo.isSelected()==true){
			
		}if(chckbxDiseoDeCompiadores.isSelected()==true){
			
		}if(chckbxDiseoYArquitectura.isSelected()==true){
			
		}if(chckbxTpicos_2.isSelected()==true){
			
		}
		//Semester 9
		JLabel lblSemester_8 = new JLabel("Semester 9");
		
		JCheckBox chckbxTpicos_3 = new JCheckBox("Tópicos 4");
		
		JCheckBox chckbxTpicos_4 = new JCheckBox("Tópicos 5");
		
		JCheckBox chckbxTpicos_5 = new JCheckBox("Tópicos 6");
		
		JCheckBox chckbxIntroduccinALa_3 = new JCheckBox("Introducción a la vida Profesional");
		
		JCheckBox chckbxSistemasInteligentes = new JCheckBox("Sistemas Inteligentes");
		
		JCheckBox chckbxProyectoIntegradorPara = new JCheckBox("Proyecto Integrador para el Desarrollo de Soluciones Empresariales");
		
		if(chckbxTpicos_3.isSelected()==true){
			
		}if(chckbxTpicos_4.isSelected()==true){
			
		}if(chckbxTpicos_5.isSelected()==true){
			
		}if(chckbxIntroduccinALa_3.isSelected()==true){
			
		}if(chckbxSistemasInteligentes.isSelected()==true){
			
		}if(chckbxProyectoIntegradorPara.isSelected()==true){
			
		}
		
		JCheckBox chckbxticaAplicada = new JCheckBox("Ética Aplicada");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxInglsRemedial_2)
								.addComponent(chckbxInglsRemedial_3)
								.addComponent(lblSemester_2)
								.addComponent(chckbxEstructuraDeDatos)
								.addComponent(chckbxProbabilidadYEstadstica)
								.addComponent(chckbxElectricidadYMagnetismo)
								.addComponent(chckbxMatemticas_2)
								.addComponent(chckbxFundamentosDeIngeniera))
							.addGap(21)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblSemester_3)
								.addComponent(chckbxAnlisisYDiseo)
								.addComponent(chckbxProyectoDeDesarrollo)
								.addComponent(chckbxFundamentosDeRedes)
								.addComponent(chckbxMtodosNumricosEn)
								.addComponent(chckbxBasesDeDatos)
								.addComponent(chckbxExpresinVerbalEn)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxInglesRemedial)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel)
										.addComponent(chckbxIntroduccinALa)
										.addComponent(chckbxIntrouccinALas)
										.addComponent(chckbxIntroduccinALa_1)
										.addComponent(chckbxFundamentosDeEscritura)
										.addComponent(chckbxInglsRemedial)
										.addComponent(chckbxInglsRemedial_1))
									.addGap(42)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(6)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
												.addGroup(groupLayout.createSequentialGroup()
													.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(chckbxFsica)
														.addComponent(chckbxFundamentosProg)
														.addComponent(chckbxMatemticasDiscretas)
														.addComponent(chckbxMatemticas)
														.addComponent(chckbxIntroduccinALa_2)
														.addComponent(chckbxCienciasNat))
													.addGap(108)
													.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(chckbxProgramacinOrientadaA)
														.addComponent(chckbxOrganizacinComputacional)
														.addComponent(chckbxMatemticas_1)
														.addComponent(chckbxFundamentosDeDiseo)
														.addComponent(chckbxAdministracinEInnovacin)
														.addComponent(chckbxAnlisisYExpresin)))
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(chckbxLenguaExtranjera)
													.addGap(196)
													.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addGroup(groupLayout.createSequentialGroup()
															.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																.addComponent(lblSemester_4)
																.addComponent(chckbxSistemasOperativos)
																.addComponent(chckbxlgebraLineal)
																.addComponent(chckbxInterconexinDeRedes)
																.addComponent(chckbxMatemticasComputacionales)
																.addComponent(chckbxHumanidadesYBellas))
															.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																.addGroup(groupLayout.createSequentialGroup()
																	.addPreferredGap(ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
																	.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																		.addComponent(chckbxBasesDeDatos_1)
																		.addComponent(lblSemester_5)
																		.addComponent(chckbxProgramacinAvanzada)
																		.addComponent(chckbxEmprendimiento)
																		.addComponent(chckbxEvaluacinYAdministracin)))
																.addGroup(groupLayout.createSequentialGroup()
																	.addPreferredGap(ComponentPlacement.UNRELATED)
																	.addComponent(chckbxProyectoDeDesarrollo_1))))
														.addGroup(groupLayout.createSequentialGroup()
															.addComponent(chckbxAnlisisYModelacin)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(chckbxCalidadYPruebas))))))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblSemester)
											.addGap(441)
											.addComponent(lblSemester_1))))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(chckbxDesarrolloDeAplicaciones))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(6)
									.addComponent(chckbxticaPersonaY))
								.addGroup(groupLayout.createSequentialGroup()
									.addContainerGap()
									.addComponent(lblSemester_6))
								.addGroup(groupLayout.createSequentialGroup()
									.addContainerGap()
									.addComponent(chckbxAdministracinDeProyectos))
								.addGroup(groupLayout.createSequentialGroup()
									.addContainerGap()
									.addComponent(chckbxTpicos))
								.addGroup(groupLayout.createSequentialGroup()
									.addContainerGap()
									.addComponent(chckbxSeguridadInformtica))
								.addGroup(groupLayout.createSequentialGroup()
									.addContainerGap()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(chckbxLenguajesDeProgramacin)
										.addComponent(chckbxCiudadania))))
							.addGap(32)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblSemester_7)
								.addComponent(chckbxMtodosCuantitativosY)
								.addComponent(chckbxTpicos_1)
								.addComponent(chckbxTpicos_2)
								.addComponent(chckbxLaboratorioDeDesarrollo)
								.addComponent(chckbxDiseoYArquitectura)
								.addComponent(chckbxGrficasComputacionales)
								.addComponent(chckbxDiseoDeCompiadores))
							.addGap(79)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxticaAplicada)
								.addComponent(chckbxSistemasInteligentes)
								.addComponent(chckbxIntroduccinALa_3)
								.addComponent(chckbxTpicos_5)
								.addComponent(chckbxTpicos_4)
								.addComponent(chckbxTpicos_3)
								.addComponent(lblSemester_8)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(btnSave)
									.addComponent(chckbxProyectoIntegradorPara)))))
					.addContainerGap(50, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(6)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(lblSemester)
						.addComponent(lblSemester_1))
					.addGap(2)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxIntroduccinALa))
							.addGap(6)
							.addComponent(chckbxIntrouccinALas)
							.addGap(6)
							.addComponent(chckbxIntroduccinALa_1)
							.addGap(6)
							.addComponent(chckbxFundamentosDeEscritura)
							.addGap(6)
							.addComponent(chckbxInglsRemedial)
							.addGap(6)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(chckbxInglsRemedial_1)
								.addComponent(chckbxCienciasNat)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(chckbxFundamentosProg)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxFsica)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxMatemticasDiscretas)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxMatemticas)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxIntroduccinALa_2))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(chckbxProgramacinOrientadaA)
							.addGap(6)
							.addComponent(chckbxOrganizacinComputacional)
							.addGap(6)
							.addComponent(chckbxMatemticas_1)
							.addGap(6)
							.addComponent(chckbxFundamentosDeDiseo)
							.addGap(6)
							.addComponent(chckbxAdministracinEInnovacin)
							.addGap(6)
							.addComponent(chckbxAnlisisYExpresin)))
					.addGap(6)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxInglesRemedial)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(chckbxLenguaExtranjera)
							.addComponent(lblSemester_4)
							.addComponent(lblSemester_5)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(chckbxInglsRemedial_2)
									.addGap(6)
									.addComponent(chckbxInglsRemedial_3)
									.addGap(12)
									.addComponent(lblSemester_2)
									.addGap(6)
									.addComponent(chckbxEstructuraDeDatos)
									.addGap(6)
									.addComponent(chckbxProbabilidadYEstadstica)
									.addGap(6)
									.addComponent(chckbxElectricidadYMagnetismo)
									.addGap(6)
									.addComponent(chckbxMatemticas_2)
									.addGap(6)
									.addComponent(chckbxFundamentosDeIngeniera))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(20)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblSemester_3)
											.addPreferredGap(ComponentPlacement.RELATED)
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
											.addComponent(chckbxExpresinVerbalEn))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(96)
											.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(chckbxAnlisisYModelacin)
												.addComponent(chckbxCalidadYPruebas))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(chckbxHumanidadesYBellas)
												.addComponent(chckbxProyectoDeDesarrollo_1)))))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(chckbxSistemasOperativos)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(chckbxlgebraLineal)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(chckbxInterconexinDeRedes)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(chckbxMatemticasComputacionales)))
							.addGap(6)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(chckbxticaPersonaY)
								.addComponent(lblSemester_7)
								.addComponent(lblSemester_8)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(chckbxProgramacinAvanzada)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxEmprendimiento)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxEvaluacinYAdministracin)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxBasesDeDatos_1)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblSemester_6)
							.addGap(7)
							.addComponent(chckbxAdministracinDeProyectos)
							.addGap(6)
							.addComponent(chckbxTpicos)
							.addGap(6)
							.addComponent(chckbxSeguridadInformtica)
							.addGap(6)
							.addComponent(chckbxDesarrolloDeAplicaciones)
							.addGap(6)
							.addComponent(chckbxLenguajesDeProgramacin)
							.addGap(6)
							.addComponent(chckbxCiudadania))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(chckbxMtodosCuantitativosY)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxTpicos_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxTpicos_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxLaboratorioDeDesarrollo)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxDiseoYArquitectura)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxGrficasComputacionales)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxDiseoDeCompiadores))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(chckbxTpicos_3)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxTpicos_4)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxTpicos_5)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxIntroduccinALa_3)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxSistemasInteligentes)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxProyectoIntegradorPara)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxticaAplicada)))
					.addGap(20)
					.addComponent(btnSave)
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
