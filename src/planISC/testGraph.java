package planISC;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testGraph {
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
	

		Dijkstra degree = new Dijkstra();
		List<Vertex> student = new ArrayList<Vertex>();
		String a = null;
		Scanner in = new Scanner(System.in);

		//Grafo Carrera
		//Nodo Raíz
		Vertex root = new Vertex(-1, "Ingeniería en Sistemas Computacionales" , "ISC");
		
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
		
		//Semestre 8
		Vertex DTC3022 = new Vertex(8,"Gráficas Computacionales","TC3022");
		Vertex DTC2007 = new Vertex(8,"Métodos Cuantitativos y Simulación","TC2007");
		Vertex DTC3052 = new Vertex(8,"Laboratorio de Desarrollo de aplicaciones Web","TC3052");
		Vertex DTC3048 = new Vertex(8,"Diseño de Compiladores","TC3048");
		Vertex DTC3049 = new Vertex(8,"Diseño y Arquitectura de Software","TC3049");
		//Semestre 9
		Vertex DTI3035 = new Vertex(9,"Introducción a la Vida Profesional","TI3035");
		Vertex DTC2011 = new Vertex(9,"Sistemas Inteligentes","TC2011");
		Vertex DTC3054 = new Vertex(9,"Proyecto Integrador para el Desarrollo de Soluciones Empresariales","TC3054");
		Vertex DHS2006 = new Vertex(9,"Ética Aplicada","HS2006");
		
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
		
		student.add(DTC1001);
		student.add(DF1001);
		student.add(DMA1001);
		student.add(DH1015);
		student.add(DH1001);
		student.add(DH1002);
		student.add(DH1003);
		student.add(DH1004);
		student.add(DH1005);
		
		student.add(DTC1014);
		student.add(DF1002);
		student.add(DTC1003);
		student.add(DMA1015);
		student.add(DTC1023);
		student.add(DDS1003);
		student.add(DH1016);
		
		degree.canI(student, "Estructura de Datos", root);//Te dice si puede llevar una materia
		degree.nextSem(student);
		
		List<Vertex> path = degree.getShortestPathTo(DTC3002);
		System.out.println("Path: " + path);
		degree.requirements(root, "Programación Avanzada");
		
		//List<Vertex> path = degree.getShortestPathTo(degree.returnVertex(root, "Programación Avanzada"));
		//System.out.println("Path: " + path);
		
		/*while(true){
			System.out.println("Ingresa las materias que ya cursaste: ");
			a = in.nextLine();
			if (a.equals("hola"))
				break;
			Vertex sub = degree.returnVertex(root, a);
			
			if (sub != null){
				if(!student.contains(sub)){
					student.add(sub);
				}
			}
		}*/
	}
}