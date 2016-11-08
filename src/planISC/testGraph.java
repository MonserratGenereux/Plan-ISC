package planISC;

import Queue.LinkedUnbndQueue;
import Queue.UnboundedQueueInterface;

public class testGraph {

	@SuppressWarnings({ "rawtypes" })
	public static void main(String[] args) {
		String ACREDITADO = "acreditado";
		String CURSANDO = "acreditado";
		String NO_ACREDITADO = "acreditado";
		
		WeightedGraph<gNode> system = new WeightedGraph<gNode>(100);
		WeightedGraph<gNode> degree = new WeightedGraph<gNode>(100);
		
		//Grafo Systema
		
		//Remediales
		gNode SYTC1001 = new gNode("TC1001","Introducción a la Computación","info");
		system.addVertex(SYTC1001);
		gNode SYF1001 = new gNode("F1001","Introducción a la Física","info");
		system.addVertex(SYF1001);
		gNode SYMA1001 = new gNode("MA1001","Introducción a las Matemáticas","info");
		system.addVertex(SYMA1001);
		gNode SYH1015 = new gNode("H1015","Fundamentos de escritura","info");
		system.addVertex(SYH1015);
		gNode SYH1001 = new gNode("H1001","Inglés Remedial 1","info");
		system.addVertex(SYH1001);
		gNode SYH1002 = new gNode("H1002","Inglés Remedial 2","info");
		system.addVertex(SYH1002);
		gNode SYH1003 = new gNode("H1003","Inglés Remedial 3","info");
		system.addVertex(SYH1003);
		gNode SYH1004 = new gNode("H1004","Inglés Remedial 4","info");
		system.addVertex(SYH1004);
		gNode SYH1005 = new gNode("H1005","Inglés Remedial 5","info");
		system.addVertex(SYH1005);
		
		//Semestre 1
		gNode SYTC1014 = new gNode("TC1014","Fundamentos de Programación","info");
		system.addVertex(SYTC1014);
		gNode SYF1002 = new gNode("F1002","Física 1","info");
		system.addVertex(SYF1002);
		gNode SYTC1003 = new gNode("TC1003","Matemáticas Discretas","info");
		system.addVertex(SYTC1003);
		gNode SYMA1015 = new gNode("Ma1015","Matemáticas 1","info");
		system.addVertex(SYMA1015);
		gNode SYTC1023 = new gNode("TC1023","Introducción a la ingeniería en sistemas Computacionales","info");
		system.addVertex(SYTC1023);
		gNode SYDS1003 = new gNode("DS1003","Ciencias Naturales y Desarrollo Sustentable","info");
		system.addVertex(SYDS1003);
		gNode SYH1016 = new gNode("H1016","Lengua Extranjera","info");
		system.addVertex(SYH1016);
		
		//Semestre 2
		gNode SYTC2016 = new gNode("TC2016","Programación Orientada a Objetos","info");
		system.addVertex(SYTC2016);
		gNode SYTC1016 = new gNode("TC1016","Organización Computacional","info");
		system.addVertex(SYTC1016);
		gNode SYMA1017 = new gNode("MA1017","Matemáticas 2","info");
		system.addVertex(SYMA1017);
		gNode SYTC1015 = new gNode("TC1015","Fundamentos de Diseño Interactivo","info");
		system.addVertex(SYTC1015);
		gNode SYAD1005 = new gNode("AD1005","Administración e Innovación en Modelos de Negocio","info");
		system.addVertex(SYAD1005);
		gNode SYH1040 = new gNode("H1040","Análisis y Expresión Verbal","info");
		
		//Semestre 3
		system.addVertex(SYH1040);
		gNode SYTC1018 = new gNode("TC1018","Estructura de Datos","info");
		system.addVertex(SYTC1018);
		gNode SYMA1006 = new gNode("MA1006","Probabilidad y Estadítica","info");
		system.addVertex(SYMA1006);
		gNode SYF1005 = new gNode("F1005","Electricidad y Magnetismo","info");
		system.addVertex(SYF1005);
		gNode SYMA2009 = new gNode("MA2009","Matemáticas 3","info");
		system.addVertex(SYMA2009);
		gNode SYTC1019 = new gNode("TC1019","Fundamentos de ingeniería de Software","info");
		system.addVertex(SYTC1019);
		gNode SYH1018 = new gNode("H1018","Ética Persona y Sociedad","info");
		
		//Semestre 4
		system.addVertex(SYH1018);
		gNode SYTC2017 = new gNode("TC2017","Análisis y Diseño de Algoritmos","info");
		system.addVertex(SYTC2017);
		gNode SYTC1021 = new gNode("TC1021","Proyecto de Desarrollo de Videojuegos","info");
		system.addVertex(SYTC1021);
		gNode SYTC2018 = new gNode("TC2018","Fundamentos de Redes","info");
		system.addVertex(SYTC2018);
		gNode SYTC2019 = new gNode("TC2019","Métodos Númericos en Ingeniería","info");
		system.addVertex(SYTC2019);
		gNode SYTC1020 = new gNode("TC1020","Bases de Datos","info");
		system.addVertex(SYTC1020);
		gNode SYH2001 = new gNode("H2001","Expresión Verbal en el Ámbito Profesional","info");
		system.addVertex(SYH2001);
		
		//Semestre 5
		gNode SYTC2008 = new gNode("TC2008","Sistemas Operativos","");
		system.addVertex(SYTC2008);
		gNode SYMA1019 = new gNode("MA1019","Álgebra Lineal","");
		system.addVertex(SYMA1019);
		gNode SYTC2022 = new gNode("TC2022","Interconexión de Redes","");
		system.addVertex(SYTC2022);
		gNode SYTC2020 = new gNode("TC2020","Matemáticas computacionales","");
		system.addVertex(SYTC2020);
		gNode SYTC2004 = new gNode("TC2004","Análisis y Modelación de Sistemas de Software","");
		system.addVertex(SYTC2004);
		gNode SYHS2000 = new gNode("HS2000","Humanidades y Bellas Artes","");
		system.addVertex(SYHS2000);

		//Semestre 6
		gNode SYTC2025 = new gNode("TC2025","Programación Avanzada","");
		system.addVertex(SYTC2025);
		gNode SYEM1005 = new gNode("EM1005","Emprendimiento","");
		system.addVertex(SYEM1005);
		gNode SYTI2011 = new gNode("TI2011","Evaluación y Administración de Proyectos","");
		system.addVertex(SYTI2011);
		gNode SYTC3041 = new gNode("TC3041","Bases de Datos Avanzadas","");
		system.addVertex(SYTC3041);
		gNode SYTC2024 = new gNode("TC2024","Proyecto de Desarrollo para Dispositivos Móviles","");
		system.addVertex(SYTC2024);
		gNode SYTC3045 = new gNode("TC3045","Calidad y Pruebas de Software","");
		system.addVertex(SYTC3045);
		
		//Semestre 7
		gNode SYTC2027 = new gNode("TC2027","Seguridad Informática","");
		system.addVertex(SYTC2027);
		gNode SYTC3002 = new gNode("TC3002","Administración de Proyectos de Ingeniería de Software","");
		system.addVertex(SYTC3002);
		gNode SYTC2026 = new gNode("TC2026","Desarrollo de Aplicaciones Web","");
		system.addVertex(SYTC2026);
		gNode SYTC2006 = new gNode("TC2006","Lenguajes de Programación","");
		system.addVertex(SYTC2006);
		gNode SYHS2005 = new gNode("HS2005","Ciudadanía","");
		system.addVertex(SYHS2005);
		
		//Semestre 8
		gNode SYTC3022 = new gNode("TC3022","Gráficas Computacionales","");
		system.addVertex(SYTC3022);
		gNode SYTC2007 = new gNode("TC2007","Métodos Cuantitativos y Simulación","");
		system.addVertex(SYTC2007);
		gNode SYTC3052 = new gNode("TC3052","Laboratorio de Desarrollo de aplicaciones Web","");
		system.addVertex(SYTC3052);
		gNode SYTC3048 = new gNode("TC3048","Diseño de Compiladores","");
		system.addVertex(SYTC3048);
		gNode SYTC3049 = new gNode("TC3049","Diseño y Arquitectura de Software","");
		system.addVertex(SYTC3049);
		
		//Semestre 9
		gNode SYTI3035 = new gNode("TI3035","Introducción a la Vida Profesional","");
		system.addVertex(SYTI3035);
		gNode SYTC2011 = new gNode("TC2011","Sistemas Inteligentes","");
		system.addVertex(SYTC2011);
		gNode SYTC3054 = new gNode("TC3054","Proyecto Integrador para el Desarrollo de Soluciones Empresariales","");
		system.addVertex(SYTC3054);
		gNode SYH2006 = new gNode("H2006","Ética Aplicada","");
		system.addVertex(SYH2006);
		
		//Grafo Carrera
		//Remediales
		gNode DTC1001 = new gNode(0,"Introducción a la Computación","TC1001");
		degree.addVertex(DTC1001);
		gNode DF1001 = new gNode(0,"Introducción a la Física","F1001");
		degree.addVertex(DF1001);
		gNode DMA1001 = new gNode(0,"Introducción a las Matemáticas","MA1001");
		degree.addVertex(DMA1001);
		gNode DH1015 = new gNode(0,"Fundamentos de escritura","H1015");
		degree.addVertex(DH1015);
		gNode DH1001 = new gNode(0,"Inglés Remedial 1","H1001");
		degree.addVertex(DH1001);
		gNode DH1002 = new gNode(0,"Inglés Remedial 2","H1002");
		degree.addVertex(DH1002);
		gNode DH1003 = new gNode(0,"Inglés Remedial 3","H1003");
		degree.addVertex(DH1003);
		gNode DH1004 = new gNode(0,"Inglés Remedial 4","H1004");
		degree.addVertex(DH1004);
		gNode DH1005 = new gNode(0,"Inglés Remedial 5","H1005");
		degree.addVertex(DH1005);
		
		//Semestre 1
		gNode DTC1014 = new gNode(1,"Fundamentos de programación","TC1014");
		degree.addVertex(DTC1014);
		gNode DF1002 = new gNode(1,"Física 1","F1002");
		degree.addVertex(DF1002);
		gNode DTC1003 = new gNode(1,"Matemáticas Discretas","TC1003");
		degree.addVertex(DTC1003);
		gNode DMA1015 = new gNode(1,"Matemáticas 1","MA1015");
		degree.addVertex(DMA1015);
		gNode DTC1023 = new gNode(1,"Introducción a la ingeniería en sistemas Computacionales","TC1023");
		degree.addVertex(DTC1023);
		gNode DDS1003 = new gNode(1,"Ciencias Naturales y Desarrollo Sustentable","DS1003");
		degree.addVertex(DDS1003);
		gNode DH1016 = new gNode(1,"Lengua Extranjera","H1016");
		degree.addVertex(DH1016);
		
		//Semestre 2
		gNode DTC2016 = new gNode(2,"Programación Orientada a Objetos","TC2016");
		degree.addVertex(DTC2016);
		gNode DTC1016 = new gNode(2,"Organización Computacional","TC1016");
		degree.addVertex(DTC1016);
		gNode DMA1017 = new gNode(2,"Matemáticas 2","MA1017");
		degree.addVertex(DMA1017);
		gNode DTC1015 = new gNode(2,"Fundamentos de Diseño Interactivo","TC1015");
		degree.addVertex(DTC1015);
		gNode DAD1005 = new gNode(2,"Administración e Innovación en Modelos de Negocio","AD1005");
		degree.addVertex(DAD1005);
		gNode DH1040 = new gNode(2,"Análisis y Expresión Verbal","H1040");
		degree.addVertex(DH1040);
		
		//Semestre 3
		gNode DTC1018 = new gNode(3,"Estructura de Datos","TC1018");
		degree.addVertex(DTC1018);
		gNode DMA1006 = new gNode(3,"Probabilidad y Estadítica","MA1006");
		degree.addVertex(DMA1006);
		gNode DF1005 = new gNode(3,"Electricidad y Magnetismo","F1005");
		degree.addVertex(DF1005);
		gNode DMA2009 = new gNode(3,"Matemáticas 3","MA2009");
		degree.addVertex(DMA2009);
		gNode DTC1019 = new gNode(3,"Fundamentos de ingeniería de Software","TC1019");
		degree.addVertex(DTC1019);
		gNode DH1018 = new gNode(3,"Ética Persona y Sociedad","H1018");
		degree.addVertex(DH1018);
		
		//Semestre 4
		gNode DTC2017 = new gNode(4,"Análisis y Diseño de Algoritmos","TC2017");
		degree.addVertex(DTC2017);
		gNode DTC1021 = new gNode(4,"Proyecto de Desarrollo de Videojuegos","TC1021");
		degree.addVertex(DTC1021);
		gNode DTC2018 = new gNode(4,"Fundamentos de Redes","TC2018");
		degree.addVertex(DTC2018);
		gNode DTC2019 = new gNode(4,"Métodos Númericos en Ingeniería","TC2019");
		degree.addVertex(DTC2019);
		gNode DTC1020 = new gNode(4,"Bases de Datos","TC1020");
		degree.addVertex(DTC1020);
		gNode DH2001 = new gNode(4,"Expresión Verbal en el Ámbito Profesional","H2001");
		degree.addVertex(DH2001);
		
		//Semestre 5
		gNode DTC2008 = new gNode(5,"Sistemas Operativos","TC2008");
		degree.addVertex(DTC2008);
		gNode DMA1019 = new gNode(5,"Álgebra Lineal","MA1019");
		degree.addVertex(DMA1019);
		gNode DTC2022 = new gNode(5,"Interconexión de Redes","TC2022");
		degree.addVertex(DTC2022);
		gNode DTC2020 = new gNode(5,"Matemáticas computacionales","TC2020");
		degree.addVertex(DTC2020);
		gNode DTC2004 = new gNode(5,"Análisis y Modelación de Sistemas de Software","TC2004");
		degree.addVertex(DTC2004);
		gNode DHS2000 = new gNode(5,"Humanidades y Bellas Artes","HS2000");
		degree.addVertex(DHS2000);
		
		//Semestre 6
		gNode DTC2025 = new gNode(6,"Programación Avanzada","DTC2025");
		degree.addVertex(DTC2025);
		gNode DEM1005 = new gNode(6,"Emprendimiento","DEM1005");
		degree.addVertex(DEM1005);
		gNode DTI2011 = new gNode(6,"Evaluación y Administración de Proyectos","DTI2011");
		degree.addVertex(DTI2011);
		gNode DTC3041 = new gNode(6,"Bases de Datos Avanzadas","DTI2011");
		degree.addVertex(DTC3041);
		gNode DTC2024 = new gNode(6,"Proyecto de Desarrollo para Dispositivos Móviles","DTC2024");
		degree.addVertex(DTC2024);
		gNode DTC3045 = new gNode(6,"Calidad y Pruebas de Software","TC3045");
		degree.addVertex(DTC3045);
		
		//Semestre 7
		gNode DTC2027 = new gNode(7,"Seguridad Informática","TC2027");
		degree.addVertex(DTC2027);
		gNode DTC3002 = new gNode(7,"Administración de Proyectos de Ingeniería de Software","TC3002");
		degree.addVertex(DTC3002);
		gNode DTC2026 = new gNode(7,"Desarrollo de Aplicaciones Web","TC2026");
		degree.addVertex(DTC2026);
		gNode DTC2006 = new gNode(7,"Lenguajes de Programación","TC2006");
		degree.addVertex(DTC2006);
		gNode DHS2005 = new gNode(7,"Ciudadanía","HS2005");
		degree.addVertex(DHS2005);	
		
		//Semestre 8
		gNode DTC3022 = new gNode(8,"Gráficas Computacionales","TC3022");
		degree.addVertex(DTC3022);
		gNode DTC2007 = new gNode(8,"Métodos Cuantitativos y Simulación","TC2007");
		degree.addVertex(DTC2007);
		gNode DTC3052 = new gNode(8,"Laboratorio de Desarrollo de aplicaciones Web","TC3052");
		degree.addVertex(DTC3052);
		gNode DTC3048 = new gNode(8,"Diseño de Compiladores","TC3048");
		degree.addVertex(DTC3048);
		gNode DTC3049 = new gNode(8,"Diseño y Arquitectura de Software","TC3049");
		degree.addVertex(DTC3049);
		
		//Semestre 9
		gNode DTI3035 = new gNode(9,"Introducción a la Vida Profesional","TI3035");
		degree.addVertex(DTI3035);
		gNode DTC2011 = new gNode(9,"Sistemas Inteligentes","TC2011");
		degree.addVertex(DTC2011);
		gNode DTC3054 = new gNode(9,"Proyecto Integrador para el Desarrollo de Soluciones Empresariales","TC3054");
		degree.addVertex(DTC3054);
		gNode DH2006 = new gNode(9,"Ética Aplicada","H2006");
		degree.addVertex(DH2006);
		
		//Edges between nodes in degree graph
		degree.addEdge(DTC1001, DTC1014, 2);
		degree.addEdge(DF1001, DF1002, 2);
		degree.addEdge(DMA1001, DTC1003, 1);
		degree.addEdge(DMA1001, DMA1015, 2);
		degree.addEdge(DH1015, DH1040, 2);
		degree.addEdge(DH1001, DH1002, 2);
		degree.addEdge(DH1002, DH1003, 2);
		degree.addEdge(DH1003, DH1004, 2);
		degree.addEdge(DH1004, DH1005, 2);
		degree.addEdge(DH1005, DH1016, 2);
		degree.addEdge(DTC1014, DTC2016, 2);
		degree.addEdge(DTC1014, DTC1016, 1);
		degree.addEdge(DTC1014, DTC1015, 1);
		degree.addEdge(DF1002, DF1005, 2);
		degree.addEdge(DMA1015, DMA1017, 2);
		degree.addEdge(DTC2016, DTC1018, 2);
		degree.addEdge(DTC1016, DTC2008, 1);
		degree.addEdge(DMA1017, DMA1019, 1);
		degree.addEdge(DTC1016, DTC2018, 2);
		degree.addEdge(DMA1017, DMA1006, 2);
		degree.addEdge(DMA1017, DF1005, 2);
		degree.addEdge(DMA1017, DMA2009, 2);
		degree.addEdge(DMA1017, DMA1006, 2);
		degree.addEdge(DH1040, DH1018, 1);
		degree.addEdge(DH1040, DH2001, 2);
		degree.addEdge(DH1040, DHS2000, 1);
		degree.addEdge(DTC1018, DTC2017, 2);
		degree.addEdge(DTC1018, DTC1021, 1);
		degree.addEdge(DTC1018, DTC2020, 1);
		degree.addEdge(DTC1019, DTC1020, 1);
		degree.addEdge(DTC2017, DTC3022, 1);
		degree.addEdge(DTC2017, DTC2025, 2);
		degree.addEdge(DTC2018, DTC2027, 1);
		degree.addEdge(DTC2018, DTC2022, 2);
		degree.addEdge(DTC1020, DTC3041, 2);
		degree.addEdge(DTC1020, DTC2004, 1);
		degree.addEdge(DTC2008, DTC2025, 1);
		degree.addEdge(DTC2008, DTC2027, 1);
		degree.addEdge(DTC2022, DTC2026, 1);
		degree.addEdge(DTC2020, DTC2006, 1);
		degree.addEdge(DTC2004, DTC3002, 1);
		degree.addEdge(DTC2004, DTC2024, 1);
		degree.addEdge(DTC2004, DTC3045, 1);
		degree.addEdge(DTC2004, DTC3049, 1);
		degree.addEdge(DTI2011, DTC3002, 1);
		degree.addEdge(DTC2024, DTC3054, 2);
		degree.addEdge(DTC2026, DTC3052, 1);
		degree.addEdge(DTC2006, DTC2011, 2);
		degree.addEdge(DTC2006, DTC3048, 1);
		
		//Edges between nodes in system graph
		system.addEdge(SYTC1001, SYTC1014, 2);
		system.addEdge(SYF1001, SYF1002, 2);
		system.addEdge(SYMA1001, SYTC1003, 1);
		system.addEdge(SYMA1001, SYMA1015, 2);
		system.addEdge(SYH1015, SYH1040, 2);
		system.addEdge(SYH1001, SYH1002, 2);
		system.addEdge(SYH1002, SYH1003, 2);
		system.addEdge(SYH1003, SYH1004, 2);
		system.addEdge(SYH1004, SYH1005, 2);
		system.addEdge(SYH1005, SYH1016, 2);
		system.addEdge(SYTC1014, SYTC2016, 2);
		system.addEdge(SYTC1014, SYTC1016, 1);
		system.addEdge(SYTC1014, SYTC1015, 1);
		system.addEdge(SYF1002, SYF1005, 2);
		system.addEdge(SYMA1015, SYMA1017, 2);
		system.addEdge(SYTC2016, SYTC1018, 2);
		system.addEdge(SYTC1016, SYTC2008, 1);
		system.addEdge(SYMA1017, SYMA1019, 1);
		system.addEdge(SYTC1016, SYTC2018, 2);
		system.addEdge(SYMA1017, SYMA1006, 2);
		system.addEdge(SYMA1017, SYF1005, 2);
		system.addEdge(SYMA1017, SYMA2009, 2);
		system.addEdge(SYMA1017, SYMA1006, 2);
		system.addEdge(SYH1040, SYH1018, 1);
		system.addEdge(SYH1040, SYH2001, 2);
		system.addEdge(SYH1040, SYHS2000, 1);
		system.addEdge(SYTC1018, SYTC2017, 2);
		system.addEdge(SYTC1018, SYTC1021, 1);
		system.addEdge(SYTC1018, SYTC2020, 1);
		system.addEdge(SYTC1019, SYTC1020, 1);
		system.addEdge(SYTC2017, SYTC3022, 1);
		system.addEdge(SYTC2017, SYTC2025, 2);
		system.addEdge(SYTC2018, SYTC2027, 1);
		system.addEdge(SYTC2018, SYTC2022, 2);
		system.addEdge(SYTC1020, SYTC3041, 2);
		system.addEdge(SYTC1020, SYTC2004, 1);
		system.addEdge(SYTC2008, SYTC2025, 1);
		system.addEdge(SYTC2008, SYTC2027, 1);
		system.addEdge(SYTC2022, SYTC2026, 1);
		system.addEdge(SYTC2020, SYTC2006, 1);
		system.addEdge(SYTC2004, SYTC3002, 1);
		system.addEdge(SYTC2004, SYTC2024, 1);
		system.addEdge(SYTC2004, SYTC3045, 1);
		system.addEdge(SYTC2004, SYTC3049, 1);
		system.addEdge(SYTI2011, SYTC3002, 1);
		system.addEdge(SYTC2024, SYTC3054, 2);
		system.addEdge(SYTC2026, SYTC3052, 1);
		system.addEdge(SYTC2006, SYTC2011, 2);
		system.addEdge(SYTC2006, SYTC3048, 1);	
		
		boolean result;
		result = isPath(degree, DTC1001, DTC3022);
		result = isPath(system, DTC1001, DTC3022);
				
	}
	private static boolean isPath(WeightedGraph<gNode> iscGraph, gNode startNode, gNode endNode)
	// Returns true if a path exists on graph, from startVertex to endVertex;
	// otherwise returns false. Uses breadth-first search algorithm.
	{
		UnboundedQueueInterface<gNode> queue = new LinkedUnbndQueue<gNode>();
		UnboundedQueueInterface<gNode> vertexQueue = new LinkedUnbndQueue<gNode>();
		//UnboundedQueueInterface<gNode> upNodes = new LinkedUnbndQueue<gNode>();
		gNode vertex;
		gNode item;
		boolean found = false;

		
		iscGraph.clearMarks();
		queue.enqueue(startNode);
		
		do {
			vertex = queue.dequeue();
			System.out.println(vertex.key);
			if (vertex.equals(endNode) )
				found = true;
			else {
				if (!iscGraph.isMarked(vertex)) {
					iscGraph.markVertex(vertex);
					vertexQueue = iscGraph.getToVertices(vertex);

					while (!vertexQueue.isEmpty()) {
						item = vertexQueue.dequeue();
						if (!iscGraph.isMarked(item))
							queue.enqueue(item);
					}
				}
			}
		} while (!queue.isEmpty() && !found);
		return found;
	}

}