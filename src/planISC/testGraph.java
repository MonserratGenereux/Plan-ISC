package planISC;

import java.util.PriorityQueue;

import Queue.LinkedUnbndQueue;
import Queue.UnboundedQueueInterface;

public class testGraph {

	@SuppressWarnings({ "rawtypes" })
	public static void main(String[] args) {
		
		Dijkstra system = new Dijkstra();
		Dijkstra degree = new Dijkstra();
		Dijkstra student = new Dijkstra();
		
		//WeightedGraph<gNode> system = new WeightedGraph<gNode>(100);
		//WeightedGraph<gNode> degree = new WeightedGraph<gNode>(100);
		
		//Grafo Systema
		
		//Remediales
		Vertex SYTC1001 = new Vertex("TC1001","Introducción a la Computación","info");
		system.addVertexSystem(SYTC1001);
		Vertex SYF1001 = new Vertex("F1001","Introducción a la Física","info");
		system.addVertexSystem(SYF1001);
		Vertex SYMA1001 = new Vertex("MA1001","Introducción a las Matemáticas","info");
		system.addVertexSystem(SYMA1001);
		Vertex SYH1015 = new Vertex("H1015","Fundamentos de escritura","info");
		system.addVertexSystem(SYH1015);
		Vertex SYH1001 = new Vertex("H1001","Inglés Remedial 1","info");
		system.addVertexSystem(SYH1001);
		Vertex SYH1002 = new Vertex("H1002","Inglés Remedial 2","info");
		system.addVertexSystem(SYH1002);
		Vertex SYH1003 = new Vertex("H1003","Inglés Remedial 3","info");
		system.addVertexSystem(SYH1003);
		Vertex SYH1004 = new Vertex("H1004","Inglés Remedial 4","info");
		system.addVertexSystem(SYH1004);
		Vertex SYH1005 = new Vertex("H1005","Inglés Remedial 5","info");
		system.addVertexSystem(SYH1005);
		
	
		//Semestre 1
		Vertex SYTC1014 = new Vertex("TC1014","Fundamentos de Programación","info");
		system.addVertexSystem(SYTC1014);
		Vertex SYF1002 = new Vertex("F1002","Física 1","info");
		system.addVertexSystem(SYF1002);
		Vertex SYTC1003 = new Vertex("TC1003","Matemáticas Discretas","info");
		system.addVertexSystem(SYTC1003);
		Vertex SYMA1015 = new Vertex("Ma1015","Matemáticas 1","info");
		system.addVertexSystem(SYMA1015);
		Vertex SYTC1023 = new Vertex("TC1023","Introducción a la ingeniería en sistemas Computacionales","info");
		system.addVertexSystem(SYTC1023);
		Vertex SYDS1003 = new Vertex("DS1003","Ciencias Naturales y Desarrollo Sustentable","info");
		system.addVertexSystem(SYDS1003);
		Vertex SYH1016 = new Vertex("H1016","Lengua Extranjera","info");
		system.addVertexSystem(SYH1016);
		
		//Semestre 2
		Vertex SYTC2016 = new Vertex("TC2016","Programación Orientada a Objetos","info");
		system.addVertexSystem(SYTC2016);
		Vertex SYTC1016 = new Vertex("TC1016","Organización Computacional","info");
		system.addVertexSystem(SYTC1016);
		Vertex SYMA1017 = new Vertex("MA1017","Matemáticas 2","info");
		system.addVertexSystem(SYMA1017);
		Vertex SYTC1015 = new Vertex("TC1015","Fundamentos de Diseño Interactivo","info");
		system.addVertexSystem(SYTC1015);
		Vertex SYAD1005 = new Vertex("AD1005","Administración e Innovación en Modelos de Negocio","info");
		system.addVertexSystem(SYAD1005);
		Vertex SYH1040 = new Vertex("H1040","Análisis y Expresión Verbal","info");
		system.addVertexSystem(SYH1040);
		
		//Semestre 3
		Vertex SYTC1018 = new Vertex("TC1018","Estructura de Datos","info");
		system.addVertexSystem(SYTC1018);
		Vertex SYMA1006 = new Vertex("MA1006","Probabilidad y Estadítica","info");
		system.addVertexSystem(SYMA1006);
		Vertex SYF1005 = new Vertex("F1005","Electricidad y Magnetismo","info");
		system.addVertexSystem(SYF1005);
		Vertex SYMA2009 = new Vertex("MA2009","Matemáticas 3","info");
		system.addVertexSystem(SYMA2009);
		Vertex SYTC1019 = new Vertex("TC1019","Fundamentos de ingeniería de Software","info");
		system.addVertexSystem(SYTC1019);
		Vertex SYH1018 = new Vertex("H1018","Ética Persona y Sociedad","info");
		
		//Semestre 4
		system.addVertexSystem(SYH1018);
		Vertex SYTC2017 = new Vertex("TC2017","Análisis y Diseño de Algoritmos","info");
		system.addVertexSystem(SYTC2017);
		Vertex SYTC1021 = new Vertex("TC1021","Proyecto de Desarrollo de Videojuegos","info");
		system.addVertexSystem(SYTC1021);
		Vertex SYTC2018 = new Vertex("TC2018","Fundamentos de Redes","info");
		system.addVertexSystem(SYTC2018);
		Vertex SYTC2019 = new Vertex("TC2019","Métodos Númericos en Ingeniería","info");
		system.addVertexSystem(SYTC2019);
		Vertex SYTC1020 = new Vertex("TC1020","Bases de Datos","info");
		system.addVertexSystem(SYTC1020);
		Vertex SYH2001 = new Vertex("H2001","Expresión Verbal en el Ámbito Profesional","info");
		system.addVertexSystem(SYH2001);
		
		//Semestre 5
		Vertex SYTC2008 = new Vertex("TC2008","Sistemas Operativos","");
		system.addVertexSystem(SYTC2008);
		Vertex SYMA1019 = new Vertex("MA1019","Álgebra Lineal","");
		system.addVertexSystem(SYMA1019);
		Vertex SYTC2022 = new Vertex("TC2022","Interconexión de Redes","");
		system.addVertexSystem(SYTC2022);
		Vertex SYTC2020 = new Vertex("TC2020","Matemáticas computacionales","");
		system.addVertexSystem(SYTC2020);
		Vertex SYTC2004 = new Vertex("TC2004","Análisis y Modelación de Sistemas de Software","");
		system.addVertexSystem(SYTC2004);
		Vertex SYHS2000 = new Vertex("HS2000","Humanidades y Bellas Artes","");
		system.addVertexSystem(SYHS2000);

		//Semestre 6
		Vertex SYTC2025 = new Vertex("TC2025","Programación Avanzada","");
		system.addVertexSystem(SYTC2025);
		Vertex SYEM1005 = new Vertex("EM1005","Emprendimiento","");
		system.addVertexSystem(SYEM1005);
		Vertex SYTI2011 = new Vertex("TI2011","Evaluación y Administración de Proyectos","");
		system.addVertexSystem(SYTI2011);
		Vertex SYTC3041 = new Vertex("TC3041","Bases de Datos Avanzadas","");
		system.addVertexSystem(SYTC3041);
		Vertex SYTC2024 = new Vertex("TC2024","Proyecto de Desarrollo para Dispositivos Móviles","");
		system.addVertexSystem(SYTC2024);
		Vertex SYTC3045 = new Vertex("TC3045","Calidad y Pruebas de Software","");
		system.addVertexSystem(SYTC3045);
		
		//Semestre 7
		Vertex SYTC2027 = new Vertex("TC2027","Seguridad Informática","");
		system.addVertexSystem(SYTC2027);
		Vertex SYTC3002 = new Vertex("TC3002","Administración de Proyectos de Ingeniería de Software","");
		system.addVertexSystem(SYTC3002);
		Vertex SYTC2026 = new Vertex("TC2026","Desarrollo de Aplicaciones Web","");
		system.addVertexSystem(SYTC2026);
		Vertex SYTC2006 = new Vertex("TC2006","Lenguajes de Programación","");
		system.addVertexSystem(SYTC2006);
		Vertex SYHS2005 = new Vertex("HS2005","Ciudadanía","");
		system.addVertexSystem(SYHS2005);
		
		//Semestre 8
		Vertex SYTC3022 = new Vertex("TC3022","Gráficas Computacionales","");
		system.addVertexSystem(SYTC3022);
		Vertex SYTC2007 = new Vertex("TC2007","Métodos Cuantitativos y Simulación","");
		system.addVertexSystem(SYTC2007);
		Vertex SYTC3052 = new Vertex("TC3052","Laboratorio de Desarrollo de aplicaciones Web","");
		system.addVertexSystem(SYTC3052);
		Vertex SYTC3048 = new Vertex("TC3048","Diseño de Compiladores","");
		system.addVertexSystem(SYTC3048);
		Vertex SYTC3049 = new Vertex("TC3049","Diseño y Arquitectura de Software","");
		system.addVertexSystem(SYTC3049);
		
		//Semestre 9
		Vertex SYTI3035 = new Vertex("TI3035","Introducción a la Vida Profesional","");
		system.addVertexSystem(SYTI3035);
		Vertex SYTC2011 = new Vertex("TC2011","Sistemas Inteligentes","");
		system.addVertexSystem(SYTC2011);
		Vertex SYTC3054 = new Vertex("TC3054","Proyecto Integrador para el Desarrollo de Soluciones Empresariales","");
		system.addVertexSystem(SYTC3054);
		Vertex SYH2006 = new Vertex("H2006","Ética Aplicada","");
		system.addVertexSystem(SYH2006);
		
		//Grafo Carrera
		//Remediales
		Vertex DTC1001 = new Vertex(0,"Introducción a la Computación","TC1001");
		degree.addVertexDegree(DTC1001);
		Vertex DF1001 = new Vertex(0,"Introducción a la Física","F1001");
		degree.addVertexDegree(DF1001);
		Vertex DMA1001 = new Vertex(0,"Introducción a las Matemáticas","MA1001");
		degree.addVertexDegree(DMA1001);
		Vertex DH1015 = new Vertex(0,"Fundamentos de escritura","H1015");
		degree.addVertexDegree(DH1015);
		Vertex DH1001 = new Vertex(0,"Inglés Remedial 1","H1001");
		degree.addVertexDegree(DH1001);
		Vertex DH1002 = new Vertex(0,"Inglés Remedial 2","H1002");
		degree.addVertexDegree(DH1002);
		Vertex DH1003 = new Vertex(0,"Inglés Remedial 3","H1003");
		degree.addVertexDegree(DH1003);
		Vertex DH1004 = new Vertex(0,"Inglés Remedial 4","H1004");
		degree.addVertexDegree(DH1004);
		Vertex DH1005 = new Vertex(0,"Inglés Remedial 5","H1005");
		degree.addVertexDegree(DH1005);
		
		//Semestre 1
		Vertex DTC1014 = new Vertex(1,"Fundamentos de programación","TC1014");
		degree.addVertexDegree(DTC1014);
		Vertex DF1002 = new Vertex(1,"Física 1","F1002");
		degree.addVertexDegree(DF1002);
		Vertex DTC1003 = new Vertex(1,"Matemáticas Discretas","TC1003");
		degree.addVertexDegree(DTC1003);
		Vertex DMA1015 = new Vertex(1,"Matemáticas 1","MA1015");
		degree.addVertexDegree(DMA1015);
		Vertex DTC1023 = new Vertex(1,"Introducción a la ingeniería en sistemas Computacionales","TC1023");
		degree.addVertexDegree(DTC1023);
		Vertex DDS1003 = new Vertex(1,"Ciencias Naturales y Desarrollo Sustentable","DS1003");
		degree.addVertexDegree(DDS1003);
		Vertex DH1016 = new Vertex(1,"Lengua Extranjera","H1016");
		degree.addVertexDegree(DH1016);
		
		//Semestre 2
		Vertex DTC2016 = new Vertex(2,"Programación Orientada a Objetos","TC2016");
		degree.addVertexDegree(DTC2016);
		Vertex DTC1016 = new Vertex(2,"Organización Computacional","TC1016");
		degree.addVertexDegree(DTC1016);
		Vertex DMA1017 = new Vertex(2,"Matemáticas 2","MA1017");
		degree.addVertexDegree(DMA1017);
		Vertex DTC1015 = new Vertex(2,"Fundamentos de Diseño Interactivo","TC1015");
		degree.addVertexDegree(DTC1015);
		Vertex DAD1005 = new Vertex(2,"Administración e Innovación en Modelos de Negocio","AD1005");
		degree.addVertexDegree(DAD1005);
		Vertex DH1040 = new Vertex(2,"Análisis y Expresión Verbal","H1040");
		degree.addVertexDegree(DH1040);
		
		//Semestre 3
		Vertex DTC1018 = new Vertex(3,"Estructura de Datos","TC1018");
		degree.addVertexDegree(DTC1018);
		Vertex DMA1006 = new Vertex(3,"Probabilidad y Estadítica","MA1006");
		degree.addVertexDegree(DMA1006);
		Vertex DF1005 = new Vertex(3,"Electricidad y Magnetismo","F1005");
		degree.addVertexDegree(DF1005);
		Vertex DMA2009 = new Vertex(3,"Matemáticas 3","MA2009");
		degree.addVertexDegree(DMA2009);
		Vertex DTC1019 = new Vertex(3,"Fundamentos de ingeniería de Software","TC1019");
		degree.addVertexDegree(DTC1019);
		Vertex DH1018 = new Vertex(3,"Ética Persona y Sociedad","H1018");
		degree.addVertexDegree(DH1018);
		
		//Semestre 4
		Vertex DTC2017 = new Vertex(4,"Análisis y Diseño de Algoritmos","TC2017");
		degree.addVertexDegree(DTC2017);
		Vertex DTC1021 = new Vertex(4,"Proyecto de Desarrollo de Videojuegos","TC1021");
		degree.addVertexDegree(DTC1021);
		Vertex DTC2018 = new Vertex(4,"Fundamentos de Redes","TC2018");
		degree.addVertexDegree(DTC2018);
		Vertex DTC2019 = new Vertex(4,"Métodos Númericos en Ingeniería","TC2019");
		degree.addVertexDegree(DTC2019);
		Vertex DTC1020 = new Vertex(4,"Bases de Datos","TC1020");
		degree.addVertexDegree(DTC1020);
		Vertex DH2001 = new Vertex(4,"Expresión Verbal en el Ámbito Profesional","H2001");
		degree.addVertexDegree(DH2001);
		
		//Semestre 5
		Vertex DTC2008 = new Vertex(5,"Sistemas Operativos","TC2008");
		degree.addVertexDegree(DTC2008);
		Vertex DMA1019 = new Vertex(5,"Álgebra Lineal","MA1019");
		degree.addVertexDegree(DMA1019);
		Vertex DTC2022 = new Vertex(5,"Interconexión de Redes","TC2022");
		degree.addVertexDegree(DTC2022);
		Vertex DTC2020 = new Vertex(5,"Matemáticas computacionales","TC2020");
		degree.addVertexDegree(DTC2020);
		Vertex DTC2004 = new Vertex(5,"Análisis y Modelación de Sistemas de Software","TC2004");
		degree.addVertexDegree(DTC2004);
		Vertex DHS2000 = new Vertex(5,"Humanidades y Bellas Artes","HS2000");
		degree.addVertexDegree(DHS2000);
		
		//Semestre 6
		Vertex DTC2025 = new Vertex(6,"Programación Avanzada","DTC2025");
		degree.addVertexDegree(DTC2025);
		Vertex DEM1005 = new Vertex(6,"Emprendimiento","DEM1005");
		degree.addVertexDegree(DEM1005);
		Vertex DTI2011 = new Vertex(6,"Evaluación y Administración de Proyectos","DTI2011");
		degree.addVertexDegree(DTI2011);
		Vertex DTC3041 = new Vertex(6,"Bases de Datos Avanzadas","DTI2011");
		degree.addVertexDegree(DTC3041);
		Vertex DTC2024 = new Vertex(6,"Proyecto de Desarrollo para Dispositivos Móviles","DTC2024");
		degree.addVertexDegree(DTC2024);
		Vertex DTC3045 = new Vertex(6,"Calidad y Pruebas de Software","TC3045");
		degree.addVertexDegree(DTC3045);
		
		//Semestre 7
		Vertex DTC2027 = new Vertex(7,"Seguridad Informática","TC2027");
		degree.addVertexDegree(DTC2027);
		Vertex DTC3002 = new Vertex(7,"Administración de Proyectos de Ingeniería de Software","TC3002");
		degree.addVertexDegree(DTC3002);
		Vertex DTC2026 = new Vertex(7,"Desarrollo de Aplicaciones Web","TC2026");
		degree.addVertexDegree(DTC2026);
		Vertex DTC2006 = new Vertex(7,"Lenguajes de Programación","TC2006");
		degree.addVertexDegree(DTC2006);
		Vertex DHS2005 = new Vertex(7,"Ciudadanía","HS2005");
		degree.addVertexDegree(DHS2005);	
		
		//Semestre 8
		Vertex DTC3022 = new Vertex(8,"Gráficas Computacionales","TC3022");
		degree.addVertexDegree(DTC3022);
		Vertex DTC2007 = new Vertex(8,"Métodos Cuantitativos y Simulación","TC2007");
		degree.addVertexDegree(DTC2007);
		Vertex DTC3052 = new Vertex(8,"Laboratorio de Desarrollo de aplicaciones Web","TC3052");
		degree.addVertexDegree(DTC3052);
		Vertex DTC3048 = new Vertex(8,"Diseño de Compiladores","TC3048");
		degree.addVertexDegree(DTC3048);
		Vertex DTC3049 = new Vertex(8,"Diseño y Arquitectura de Software","TC3049");
		degree.addVertexDegree(DTC3049);
		
		//Semestre 9
		Vertex DTI3035 = new Vertex(9,"Introducción a la Vida Profesional","TI3035");
		degree.addVertexDegree(DTI3035);
		Vertex DTC2011 = new Vertex(9,"Sistemas Inteligentes","TC2011");
		degree.addVertexDegree(DTC2011);
		Vertex DTC3054 = new Vertex(9,"Proyecto Integrador para el Desarrollo de Soluciones Empresariales","TC3054");
		degree.addVertexDegree(DTC3054);
		Vertex DH2006 = new Vertex(9,"Ética Aplicada","H2006");
		degree.addVertexDegree(DH2006);
		
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
		UnboundedQueueInterface<Vertex> queue = new LinkedUnbndQueue<Vertex>();
		UnboundedQueueInterface<Vertex> vertexQueue = new LinkedUnbndQueue<Vertex>();
		//UnboundedQueueInterface<gNode> upNodes = new LinkedUnbndQueue<gNode>();
		Vertex vertex;
		Vertex item;
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
	
	
	public static void computePaths(WeightedGraph<Vertex> iscGraphgNode source)
    {
        //source.minDistance = 0.;
        PriorityQueue<gNode> vertexQueue = new PriorityQueue<gNode>();
        vertexQueue.add(source);

    while (!vertexQueue.isEmpty()) {
        gNode u = vertexQueue.poll();

            // Visit each edge exiting u
            for (Edge e : u.adjacencies)
            {
                Vertex v = e.target;
                double weight = e.weight;
                double distanceThroughU = u.minDistance + weight;
        if (distanceThroughU < v.minDistance) {
            vertexQueue.remove(v);

            v.minDistance = distanceThroughU ;
            v.previous = u;
            vertexQueue.add(v);
        }
            }
        }
    }

	private static void agregar(){
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
		
	}

}