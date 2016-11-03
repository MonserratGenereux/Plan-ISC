public class testGraph {

	@SuppressWarnings({ "rawtypes" })
	public static void main(String[] args) {
		String ACREDITADO = "acreditado";
		String CURSANDO = "acreditado";
		String NO_ACREDITADO = "acreditado";
		
		WeightedGraph<gNode> system = new WeightedGraph<gNode>();
		WeightedGraph<gNode> degree = new WeightedGraph<gNode>();
		
		//Grafo Systema
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
		//Semestre 5
		gNode DTC1001 = new gNode(5,"Sistemas Operativos","TC2008");
		degree.addVertex(DTC1001);
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
	}

}
