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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.Box;

public class Remedials {

	JFrame frame;
	Vertex root;
	List<Vertex> student;

	public Remedials() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Dijkstra degree = new Dijkstra();
		student = new ArrayList<Vertex>();
		String a = null;
		Scanner in = new Scanner(System.in);

		//Grafo Carrera
		//Nodo Raíz
		root = new Vertex(-1, "Ingeniería en Sistemas Computacionales" , "ISC");
		
		//Remediales
		Vertex DTC1001 = new Vertex(0,"Introducción a la Computación","TC1001");
		Vertex DF1001 = new Vertex(0,"Introducción a la Física","F1001");
		Vertex DMA1001 = new Vertex(0,"Introducción a las Matemáticas","MA1001");
		Vertex DH1015 = new Vertex(0,"Fundamentos de escritura","H1015");
		Vertex DH1001 = new Vertex(0,"Inglés Remedial 1","H1001");
		Vertex DH1002 = new Vertex(0,"Inglés Remedial 2","H1002");
		Vertex DH1003 = new Vertex(0,"Inglés Remedial 3","H1003");
		Vertex DH1004 = new Vertex(0,"Inglés Remedial 4","H1004");
		Vertex DH1005 = new Vertex(0,"Inglés Remedial 5","H1005");		
		//Semestre 1
		Vertex DTC1014 = new Vertex(1,"Fundamentos de programación","TC1014");
		Vertex DF1002 = new Vertex(1,"Física 1","F1002");
		Vertex DTC1003 = new Vertex(1,"Matemáticas Discretas","TC1003");
		Vertex DMA1015 = new Vertex(1,"Matemáticas 1","MA1015");
		Vertex DTC1023 = new Vertex(1,"Introducción a la ingeniería en sistemas Computacionales","TC1023");
		Vertex DDS1003 = new Vertex(1,"Ciencias Naturales y Desarrollo Sustentable","DS1003");
		Vertex DH1016 = new Vertex(1,"Lengua Extranjera","H1016");		
		//Semestre 2
		Vertex DTC2016 = new Vertex(2,"Programación Orientada a Objetos","TC2016");
		Vertex DTC1016 = new Vertex(2,"Organización Computacional","TC1016");
		Vertex DMA1017 = new Vertex(2,"Matemáticas 2","MA1017");
		Vertex DTC1015 = new Vertex(2,"Fundamentos de Diseño Interactivo","TC1015");
		Vertex DAD1005 = new Vertex(2,"Administración e Innovación en Modelos de Negocio","AD1005");
		Vertex DH1040 = new Vertex(2,"Análisis y Expresión Verbal","H1040");		
		//Semestre 3
		Vertex DTC1018 = new Vertex(3,"Estructura de Datos","TC1018");
		Vertex DMA1006 = new Vertex(3,"Probabilidad y Estadítica","MA1006");
		Vertex DF1005 = new Vertex(3,"Electricidad y Magnetismo","F1005");
		Vertex DMA2009 = new Vertex(3,"Matemáticas 3","MA2009");
		Vertex DTC1019 = new Vertex(3,"Fundamentos de ingeniería de Software","TC1019");
		Vertex DH1018 = new Vertex(3,"Ética Persona y Sociedad","H1018");
		//Semestre 4
		Vertex DTC2017 = new Vertex(4,"Análisis y Diseño de Algoritmos","TC2017");
		Vertex DTC1021 = new Vertex(4,"Proyecto de Desarrollo de Videojuegos","TC1021");
		Vertex DTC2018 = new Vertex(4,"Fundamentos de Redes","TC2018");
		Vertex DTC2019 = new Vertex(4,"Métodos Númericos en Ingeniería","TC2019");
		Vertex DTC1020 = new Vertex(4,"Bases de Datos","TC1020");
		Vertex DH2001 = new Vertex(4,"Expresión Verbal en el Ámbito Profesional","H2001");
		//Semestre 5
		Vertex DTC2008 = new Vertex(5,"Sistemas Operativos","TC2008");
		Vertex DMA1019 = new Vertex(5,"Álgebra Lineal","MA1019");
		Vertex DTC2022 = new Vertex(5,"Interconexión de Redes","TC2022");
		Vertex DTC2020 = new Vertex(5,"Matemáticas computacionales","TC2020");
		Vertex DTC2004 = new Vertex(5,"Análisis y Modelación de Sistemas de Software","TC2004");
		Vertex DHS2000 = new Vertex(5,"Humanidades y Bellas Artes","HS2000");
		//Semestre 6
		Vertex DTC2025 = new Vertex(6,"Programación Avanzada","TC2025");
		Vertex DEM1005 = new Vertex(6,"Emprendimiento","EM1005");
		Vertex DTI2011 = new Vertex(6,"Evaluación y Administración de Proyectos","TI2011");
		Vertex DTC3041 = new Vertex(6,"Bases de Datos Avanzadas","TC3041");
		Vertex DTC2024 = new Vertex(6,"Proyecto de Desarrollo para Dispositivos Móviles","TC2024");
		Vertex DTC3045 = new Vertex(6,"Calidad y Pruebas de Software","TC3045");
		//Semestre 7
		Vertex DTC2027 = new Vertex(7,"Seguridad Informática","TC2027");
		Vertex DTC3002 = new Vertex(7,"Administración de Proyectos de Ingeniería de Software","TC3002");
		Vertex DTC2026 = new Vertex(7,"Desarrollo de Aplicaciones Web","TC2026");
		Vertex DTC2006 = new Vertex(7,"Lenguajes de Programación","TC2006");
		Vertex DHS2005 = new Vertex(7,"Ciudadanía","HS2005");
		Vertex DVA2010 = new Vertex(7,"Tópicos 1","VA2010");
		
		//Semestre 8
		Vertex DTC3022 = new Vertex(8,"Gráficas Computacionales","TC3022");
		Vertex DTC2007 = new Vertex(8,"Métodos Cuantitativos y Simulación","TC2007");
		Vertex DTC3052 = new Vertex(8,"Laboratorio de Desarrollo de aplicaciones Web","TC3052");
		Vertex DTC3048 = new Vertex(8,"Diseño de Compiladores","TC3048");
		Vertex DTC3049 = new Vertex(8,"Diseño y Arquitectura de Software","TC3049");
		Vertex DVA2011 = new Vertex(7,"Tópicos 2","VA2011");
		Vertex DVA2012 = new Vertex(7,"Tópicos 3","VA2012");
		//Semestre 9
		Vertex DTI3035 = new Vertex(9,"Introducción a la Vida Profesional","TI3035");
		Vertex DTC2011 = new Vertex(9,"Sistemas Inteligentes","TC2011");
		Vertex DTC3054 = new Vertex(9,"Proyecto Integrador para el Desarrollo de Soluciones Empresariales","TC3054");
		Vertex DHS2006 = new Vertex(9,"Ética Aplicada","HS2006");
		Vertex DVA2013 = new Vertex(7,"Tópicos 4","VA2013");
		Vertex DVA2014 = new Vertex(7,"Tópicos 5","VA2014");
		Vertex DVA2015 = new Vertex(7,"Tópicos 6","VA2015");
		
		//Edges from root to semester 0
		degree.addEdge(root, DTC1001, 0);
		degree.addEdge(root, DF1001, 0);
		degree.addEdge(root, DMA1001, 0);
		degree.addEdge(root, DH1015, 0);
		degree.addEdge(root, DH1001, 0);
		degree.addEdge(root, DTC1023, 0);
		degree.addEdge(root, DDS1003, 0);
		degree.addEdge(root, DTC1019, 0);
		degree.addEdge(root, DTC2019, 0);
		degree.addEdge(root, DAD1005, 0);
		degree.addEdge(root, DEM1005, 0);
		degree.addEdge(root, DHS2005, 0);
		degree.addEdge(root, DTC2007, 0);
		degree.addEdge(root, DTI2011, 0);
		degree.addEdge(root, DTI3035, 0);
		degree.addEdge(root, DHS2006, 0);
		degree.addEdge(root, DVA2010, 0);
		degree.addEdge(root, DVA2011, 0);
		degree.addEdge(root, DVA2012, 0);
		degree.addEdge(root, DVA2013, 0);
		degree.addEdge(root, DVA2014, 0);
		degree.addEdge(root, DVA2015, 0);
		
		
		//Edges between nodes in degree graph
		degree.addEdge(DTC1001, DTC1014, 0);
		degree.addEdge(DF1001, DF1002, 0);
		degree.addEdge(DMA1001, DTC1003, 0);
		degree.addEdge(DMA1001, DMA1015, 0);
		degree.addEdge(DH1015, DH1040, 0);
		degree.addEdge(DH1001, DH1002, 0);
		degree.addEdge(DH1002, DH1003, 0);
		degree.addEdge(DH1003, DH1004, 0);
		degree.addEdge(DH1004, DH1005, 0);
		degree.addEdge(DH1005, DH1016, 0);
		degree.addEdge(DTC1014, DTC2016, 0);
		degree.addEdge(DTC1014, DTC1016, 0);
		degree.addEdge(DTC1014, DTC1015, 0);
		degree.addEdge(DF1002, DF1005, 0);
		degree.addEdge(DMA1015, DMA1017, 0);
		degree.addEdge(DTC2016, DTC1018, 0);
		degree.addEdge(DTC1016, DTC2008, 0);
		degree.addEdge(DMA1017, DMA1019, 0);
		degree.addEdge(DTC1016, DTC2018, 0);
		degree.addEdge(DMA1017, DMA1006, 0);
		degree.addEdge(DMA1017, DF1005, 0);
		degree.addEdge(DMA1017, DMA2009, 0);
		degree.addEdge(DH1040, DH1018, 0);
		degree.addEdge(DH1040, DH2001, 0);
		degree.addEdge(DH1040, DHS2000, 0);
		degree.addEdge(DTC1018, DTC2017, 0);
		degree.addEdge(DTC1018, DTC1021, 0);
		degree.addEdge(DTC1018, DTC2020, 0);
		degree.addEdge(DTC1019, DTC1020, 0);
		degree.addEdge(DTC2017, DTC3022, 0);
		degree.addEdge(DTC2017, DTC2025, 0);
		degree.addEdge(DTC2018, DTC2027, 0);
		degree.addEdge(DTC2018, DTC2022, 0);
		degree.addEdge(DTC1020, DTC3041, 0);
		degree.addEdge(DTC1020, DTC2004, 0);
		degree.addEdge(DTC2008, DTC2025, 0);
		degree.addEdge(DTC2008, DTC2027, 0);
		degree.addEdge(DTC2022, DTC2026, 0);
		degree.addEdge(DTC2020, DTC2006, 0);
		degree.addEdge(DTC2004, DTC3002, 0);
		degree.addEdge(DTC2004, DTC2024, 0);
		degree.addEdge(DTC2004, DTC3045, 0);
		degree.addEdge(DTC2004, DTC3049, 0);
		degree.addEdge(DTI2011, DTC3002, 0);
		degree.addEdge(DTC2024, DTC3054, 0);
		degree.addEdge(DTC2026, DTC3052, 0);
		degree.addEdge(DTC2006, DTC2011, 0);
		degree.addEdge(DTC2006, DTC3048, 0);

		degree.computePaths(root); //"Crea" las conexiones en el árbol
		
		student.add(root);
		frame = new JFrame();
		frame.setBounds(100, 100, 1282, 777);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Remedials");
		
		JCheckBox chckbxIntroduccinALa = new JCheckBox("Introducción a la computación");
		
		JCheckBox chckbxIntroduccinALa_1 = new JCheckBox("Introducción a la física");
		
		JCheckBox chckbxIntrouccinALas = new JCheckBox("Introducción a las matemáticas");
		
		JCheckBox chckbxInglsRemedial = new JCheckBox("Inglés remedial 1");
		
		JCheckBox chckbxInglsRemedial_1 = new JCheckBox("Inglés remedial 2");
		
		JCheckBox chckbxInglesRemedial = new JCheckBox("Inglés remedial 3");
		
		JCheckBox chckbxInglsRemedial_2 = new JCheckBox("Inglés remedial 4");
		
		JCheckBox chckbxInglsRemedial_3 = new JCheckBox("Inglés remedial 5");
		
		JCheckBox chckbxFundamentosDeEscritura = new JCheckBox("Fundamentos de escritura");
		//Primer semestre
				JLabel lblSemester = new JLabel("Semester 1");
				
				JCheckBox chckbxFundamentosProg = new JCheckBox("Fundamentos de Programación");
				
				JCheckBox chckbxFsica = new JCheckBox("Física 1");
				
				JCheckBox chckbxMatemticasDiscretas = new JCheckBox("Matemáticas Discretas");
				
				JCheckBox chckbxMatemticas = new JCheckBox("Matemáticas 1");
				
				JCheckBox chckbxIntroduccinALa_2 = new JCheckBox("Introducción a la Ingeniería en Sistemas Computacionales");
				
				JCheckBox chckbxCienciasNat = new JCheckBox("Ciencias Naturales y Desarrollo Sustentable");
				
				JCheckBox chckbxLenguaExtranjera = new JCheckBox("Lengua Extranjera");
				
				
				
				//segundo semestre
				JLabel lblSemester_1 = new JLabel("Semester 2");
				
				JCheckBox chckbxProgramacinOrientadaA = new JCheckBox("Programación Orientada a Objetos");
				
				JCheckBox chckbxOrganizacinComputacional = new JCheckBox("Organización Computacional");
				
				JCheckBox chckbxMatemticas_1 = new JCheckBox("Matemáticas 2");
				
				JCheckBox chckbxFundamentosDeDiseo = new JCheckBox("Fundamentos de Diseño Interactivo");
				
				JCheckBox chckbxAdministracinEInnovacin = new JCheckBox("Administración e Innovación en Modelos de Negocio");
				
				JCheckBox chckbxAnlisisYExpresin = new JCheckBox("Análisis y Expresión Verbal");
				//Semestre 3
				
				JLabel lblSemester_2 = new JLabel("Semester 3");
				
				JCheckBox chckbxEstructuraDeDatos = new JCheckBox("Estructura de Datos");
				
				JCheckBox chckbxProbabilidadYEstadstica = new JCheckBox("Probabilidad y estadística");
				
				JCheckBox chckbxElectricidadYMagnetismo = new JCheckBox("Electricidad y Magnetismo");
				
				JCheckBox chckbxMatemticas_2 = new JCheckBox("Matemáticas 3");
				
				JCheckBox chckbxFundamentosDeIngeniera = new JCheckBox("Fundamentos de Ingeniería de Software");
				
				JCheckBox chckbxticaPersonaY = new JCheckBox("Ética, Persona y Sociedad");
				//Semester 4
				
				JLabel lblSemester_3 = new JLabel("Semester 4");
				
				JCheckBox chckbxAnlisisYDiseo = new JCheckBox("Análisis y Diseño de Algoritmos");
				
				JCheckBox chckbxProyectoDeDesarrollo = new JCheckBox("Proyecto de Desarrollo de Videojuegos");
				
				JCheckBox chckbxFundamentosDeRedes = new JCheckBox("Fundamentos de Redes");
				
				JCheckBox chckbxMtodosNumricosEn = new JCheckBox("Métodos Numéricos en Ingeniería");
				
				JCheckBox chckbxBasesDeDatos = new JCheckBox("Bases de Datos");
				
				JCheckBox chckbxExpresinVerbalEn = new JCheckBox("Expresión Verbal en el Ámbito Profesional");
				//Semester 5
				
				JLabel lblSemester_4 = new JLabel("Semester 5");
				
				JCheckBox chckbxSistemasOperativos = new JCheckBox("Sistemas Operativos");
				
				JCheckBox chckbxlgebraLineal = new JCheckBox("Álgebra Lineal");
				
				JCheckBox chckbxInterconexinDeRedes = new JCheckBox("Interconexión de Redes");
				
				JCheckBox chckbxMatemticasComputacionales = new JCheckBox("Matemáticas Computacionales");
				
				JCheckBox chckbxAnlisisYModelacin = new JCheckBox("Análisis y Modelación de Sistemas de Software");
				
				JCheckBox chckbxHumanidadesYBellas = new JCheckBox("Humanidades y Bellas Artes");
				//Semester 6
				JLabel lblSemester_5 = new JLabel("Semester 6");
				
				JCheckBox chckbxProgramacinAvanzada = new JCheckBox("Programación Avanzada");
				
				JCheckBox chckbxEmprendimiento = new JCheckBox("Emprendimiento");
				
				JCheckBox chckbxEvaluacinYAdministracin = new JCheckBox("Evaluación y Administración de Proyectos");
				
				JCheckBox chckbxBasesDeDatos_1 = new JCheckBox("Bases de Datos Avanzadas");
				
				JCheckBox chckbxProyectoDeDesarrollo_1 = new JCheckBox("Proyecto de Desarrollo para Dispositivos Móviles");
				
				JCheckBox chckbxCalidadYPruebas = new JCheckBox("Calidad y Pruebas de Software");
				
				//semester 7
				
				JLabel lblSemester_6 = new JLabel("Semester 7");
				
				JCheckBox chckbxTpicos = new JCheckBox("Tópicos 1");
				
				JCheckBox chckbxSeguridadInformtica = new JCheckBox("Seguridad Informática");
				
				JCheckBox chckbxAdministracinDeProyectos = new JCheckBox("Administración de Proyectos de Ingeniería de SW");
				
				JCheckBox chckbxDesarrolloDeAplicaciones = new JCheckBox("Desarrollo de Aplicaciones Web");
				
				JCheckBox chckbxLenguajesDeProgramacin = new JCheckBox("Lenguajes de Programación");
				
				JCheckBox chckbxCiudadania = new JCheckBox("Ciudadania");
				//Semester 8
				
				
				JLabel lblSemester_7 = new JLabel("Semester 8");
				
				JCheckBox chckbxGrficasComputacionales = new JCheckBox("Gráficas Computacionales");
				
				JCheckBox chckbxMtodosCuantitativosY = new JCheckBox("Métodos Cuantitativos y Simulación");
				
				JCheckBox chckbxTpicos_1 = new JCheckBox("Tópicos 2");
				
				JCheckBox chckbxLaboratorioDeDesarrollo = new JCheckBox("Laboratorio de Desarrollo de Aplicaciones Web");
				
				JCheckBox chckbxDiseoDeCompiadores = new JCheckBox("Diseño de Compiadores");
				
				JCheckBox chckbxDiseoYArquitectura = new JCheckBox("Diseño y Arquitectura de Software");
				
				JCheckBox chckbxTpicos_2 = new JCheckBox("Tópicos 3");
				
				
				//Semester 9
				JLabel lblSemester_8 = new JLabel("Semester 9");
				
				JCheckBox chckbxTpicos_3 = new JCheckBox("Tópicos 4");
				
				JCheckBox chckbxTpicos_4 = new JCheckBox("Tópicos 5");
				
				JCheckBox chckbxTpicos_5 = new JCheckBox("Tópicos 6");
				
				JCheckBox chckbxIntroduccinALa_3 = new JCheckBox("Introducción a la vida Profesional");
				
				JCheckBox chckbxSistemasInteligentes = new JCheckBox("Sistemas Inteligentes");
				
				JCheckBox chckbxProyectoIntegradorPara = new JCheckBox("Proyecto Integrador para el Desarrollo de Soluciones Empresariales");
				JCheckBox chckbxticaAplicada = new JCheckBox("Ética Aplicada");
				
		JButton btnSave = new JButton("Save");
		
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnSave){
					if(chckbxIntroduccinALa.isSelected()==true){
						student.add(DTC1001);
					}if(chckbxIntroduccinALa_1.isSelected()==true){
						student.add(DF1001);
					}if(chckbxIntrouccinALas.isSelected()==true){
						student.add(DMA1001);
					}if(chckbxInglesRemedial.isSelected()==true){
						student.add(DH1001);
					}if(chckbxInglsRemedial_1.isSelected()==true){
						student.add(DH1002);
					}if(chckbxInglesRemedial .isSelected()==true){
						student.add(DH1003);
					}if(chckbxInglsRemedial_2.isSelected()==true){
						student.add(DH1004);
					}if(chckbxInglsRemedial_3.isSelected()==true){
						student.add(DH1005);
					}if(chckbxFundamentosDeEscritura.isSelected()==true){
						student.add(DH1015);
					}if(chckbxFundamentosProg.isSelected()==true){
						student.add(DTC1014);
					}if(chckbxFsica.isSelected()==true){
						student.add(DF1002);
					}if(chckbxMatemticasDiscretas.isSelected()==true){
						student.add(DTC1003);
					}if(chckbxMatemticas.isSelected()==true){
						student.add(DMA1015);
					}if(chckbxIntroduccinALa_2.isSelected()==true){
						student.add(DTC1023);
					}if(chckbxCienciasNat.isSelected()==true){
						student.add(DDS1003);
					}if(chckbxLenguaExtranjera.isSelected()==true){
						student.add(DH1016);
					}if(chckbxProgramacinOrientadaA.isSelected()==true){
						student.add(DTC2016);
					}if(chckbxOrganizacinComputacional.isSelected()==true){
						student.add(DTC1016);
					}if(chckbxMatemticas_1.isSelected()==true){
						student.add(DMA1017);
					}if(chckbxFundamentosDeDiseo.isSelected()==true){
						student.add(DTC1015);
					}if(chckbxAdministracinEInnovacin.isSelected()==true){
						student.add(DAD1005);
					}if(chckbxAnlisisYExpresin.isSelected()==true){
						student.add(DH1040);
					}if(chckbxEstructuraDeDatos.isSelected()==true){
						student.add(DTC1018);
					}if(chckbxProbabilidadYEstadstica.isSelected()==true){
						student.add(DMA1006);
					}if(chckbxElectricidadYMagnetismo.isSelected()==true){
						student.add(DF1005);
					}if(chckbxMatemticas_2.isSelected()==true){
						student.add(DMA2009);
					}if(chckbxFundamentosDeIngeniera.isSelected()==true){
						student.add(DTC1019);
					}if(chckbxticaPersonaY.isSelected()==true){
						student.add(DH1018);
					}if(chckbxAnlisisYDiseo.isSelected()==true){
						student.add(DTC2017);
					}if(chckbxProyectoDeDesarrollo.isSelected()==true){
						student.add(DTC1021);
					}if(chckbxFundamentosDeRedes.isSelected()==true){
						student.add(DTC2018);
					}if(chckbxMtodosNumricosEn.isSelected()==true){
						student.add(DTC2019);
					}if(chckbxBasesDeDatos.isSelected()==true){
						student.add(DTC1020);
					}if(chckbxExpresinVerbalEn.isSelected()==true){
						student.add(DH2001);
					}if(chckbxSistemasOperativos.isSelected()==true){
						student.add(DTC2008);
					}if(chckbxlgebraLineal.isSelected()==true){
						student.add(DMA1019);
					}if(chckbxInterconexinDeRedes.isSelected()==true){
						student.add(DTC2022);
					}if(chckbxMatemticasComputacionales.isSelected()==true){
						student.add(DTC2020);
					}if(chckbxAnlisisYModelacin.isSelected()==true){
						student.add(DTC2004);
					}if(chckbxHumanidadesYBellas.isSelected()==true){
						student.add(DHS2000);
					}if(chckbxProgramacinAvanzada.isSelected()==true){
						student.add(DTC2025);
					}if(chckbxEmprendimiento.isSelected()==true){
						student.add(DEM1005);
					}if(chckbxEvaluacinYAdministracin.isSelected()==true){
						student.add(DTI2011);
					}if(chckbxBasesDeDatos_1.isSelected()==true){
						student.add(DTC3041);
					}if(chckbxProyectoDeDesarrollo_1.isSelected()==true){
						student.add(DTC2024);
					}if(chckbxCalidadYPruebas.isSelected()==true){
						student.add(DTC3045);
					}if(chckbxTpicos.isSelected()==true){
						student.add(DVA2010);
					}if(chckbxSeguridadInformtica.isSelected()==true){
						student.add(DTC2027);
					}if(chckbxAdministracinDeProyectos.isSelected()==true){
						student.add(DTC3002);
					}if(chckbxDesarrolloDeAplicaciones.isSelected()==true){
						student.add(DTC2026);
					}if(chckbxLenguajesDeProgramacin.isSelected()==true){
						student.add(DTC2006);
					}if(chckbxCiudadania.isSelected()==true){
						student.add(DHS2005);
					}if(chckbxGrficasComputacionales.isSelected()==true){
						student.add(DTC3022);
					}if(chckbxMtodosCuantitativosY.isSelected()==true){
						student.add(DTC2007);
					}if(chckbxTpicos_1.isSelected()==true){
						student.add(DVA2011);
					}if(chckbxLaboratorioDeDesarrollo.isSelected()==true){
						student.add(DTC3052);
					}if(chckbxDiseoDeCompiadores.isSelected()==true){
						student.add(DTC3048);
					}if(chckbxDiseoYArquitectura.isSelected()==true){
						student.add(DTC3049);
					}if(chckbxTpicos_2.isSelected()==true){
						student.add(DVA2012);
					}if(chckbxTpicos_3.isSelected()==true){
						student.add(DVA2013);
					}if(chckbxTpicos_4.isSelected()==true){
						student.add(DVA2014);
					}if(chckbxTpicos_5.isSelected()==true){
						student.add(DVA2015);
					}if(chckbxIntroduccinALa_3.isSelected()==true){
						student.add(DTI3035);
					}if(chckbxSistemasInteligentes.isSelected()==true){
						student.add(DTC2011);
					}if(chckbxProyectoIntegradorPara.isSelected()==true){
						student.add(DTC3054);
					}if(chckbxticaAplicada.isSelected()==true){
						student.add(DHS2006);
					}	
					
					
					btnSave.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if(e.getSource()==btnSave){
								materia window = new materia();
								window.frame.setVisible(true);
								frame.setVisible(false);
							}
						}
					});
				}
			}
		});
		
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

	
	public Vertex root(){
		return root;
	}
}