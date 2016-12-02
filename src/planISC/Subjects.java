package planISC;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.util.ArrayList;
import java.util.List;
import java.awt.Font;
import javax.swing.JTextField;

/**
 * @author Ilse Monserrat Sánchez Genereux and Mark Octavio Rivera Acosta.
 *
 * The Subjects class implements a window where the user selects the
 * vertexes that the List student will contain.
 * Brings to the user the possibility to interact with the methods in
 * Graph class using a GUI.
 */
public class Subjects {
    
    JFrame frame;
    Vertex root;
    List<Vertex> student;
    private JTextField textField;
    Graph grafo = new Graph();
    public Subjects() {
        initialize();
    }
    
    /**
     * Creates all the vertexes inside the Graph and its Edges and these
     * are the one used by the methods in the Graph class.
     * Initialize the contents of the frame.
     */
    void initialize() {
        
        student = new ArrayList<Vertex>();
        
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
        grafo.addEdge(root, DTC1001, 0);
        grafo.addEdge(root, DF1001, 0);
        grafo.addEdge(root, DMA1001, 0);
        grafo.addEdge(root, DH1015, 0);
        grafo.addEdge(root, DH1001, 0);
        grafo.addEdge(root, DTC1023, 0);
        grafo.addEdge(root, DDS1003, 0);
        grafo.addEdge(root, DTC1019, 0);
        grafo.addEdge(root, DTC2019, 0);
        grafo.addEdge(root, DAD1005, 0);
        grafo.addEdge(root, DEM1005, 0);
        grafo.addEdge(root, DHS2005, 0);
        grafo.addEdge(root, DTC2007, 0);
        grafo.addEdge(root, DTI2011, 0);
        grafo.addEdge(root, DTI3035, 0);
        grafo.addEdge(root, DHS2006, 0);
        grafo.addEdge(root, DVA2010, 0);
        grafo.addEdge(root, DVA2011, 0);
        grafo.addEdge(root, DVA2012, 0);
        grafo.addEdge(root, DVA2013, 0);
        grafo.addEdge(root, DVA2014, 0);
        grafo.addEdge(root, DVA2015, 0);
        
        
        //Edges between nodes in degree graph
        grafo.addEdge(DTC1001, DTC1014, 0);
        grafo.addEdge(DF1001, DF1002, 0);
        grafo.addEdge(DMA1001, DTC1003, 0);
        grafo.addEdge(DMA1001, DMA1015, 0);
        grafo.addEdge(DH1015, DH1040, 0);
        grafo.addEdge(DH1001, DH1002, 0);
        grafo.addEdge(DH1002, DH1003, 0);
        grafo.addEdge(DH1003, DH1004, 0);
        grafo.addEdge(DH1004, DH1005, 0);
        grafo.addEdge(DH1005, DH1016, 0);
        grafo.addEdge(DTC1014, DTC2016, 0);
        grafo.addEdge(DTC1014, DTC1016, 0);
        grafo.addEdge(DTC1014, DTC1015, 0);
        grafo.addEdge(DF1002, DF1005, 0);
        grafo.addEdge(DMA1015, DMA1017, 0);
        grafo.addEdge(DTC2016, DTC1018, 0);
        grafo.addEdge(DTC1016, DTC2008, 0);
        grafo.addEdge(DMA1017, DMA1019, 0);
        grafo.addEdge(DTC1016, DTC2018, 0);
        grafo.addEdge(DMA1017, DMA1006, 0);
        grafo.addEdge(DMA1017, DF1005, 0);
        grafo.addEdge(DMA1017, DMA2009, 0);
        grafo.addEdge(DH1040, DH1018, 0);
        grafo.addEdge(DH1040, DH2001, 0);
        grafo.addEdge(DH1040, DHS2000, 0);
        grafo.addEdge(DTC1018, DTC2017, 0);
        grafo.addEdge(DTC1018, DTC1021, 0);
        grafo.addEdge(DTC1018, DTC2020, 0);
        grafo.addEdge(DTC1019, DTC1020, 0);
        grafo.addEdge(DTC2017, DTC3022, 0);
        grafo.addEdge(DTC2017, DTC2025, 0);
        grafo.addEdge(DTC2018, DTC2027, 0);
        grafo.addEdge(DTC2018, DTC2022, 0);
        grafo.addEdge(DTC1020, DTC3041, 0);
        grafo.addEdge(DTC1020, DTC2004, 0);
        grafo.addEdge(DTC2008, DTC2025, 0);
        grafo.addEdge(DTC2008, DTC2027, 0);
        grafo.addEdge(DTC2022, DTC2026, 0);
        grafo.addEdge(DTC2020, DTC2006, 0);
        grafo.addEdge(DTC2004, DTC3002, 0);
        grafo.addEdge(DTC2004, DTC2024, 0);
        grafo.addEdge(DTC2004, DTC3045, 0);
        grafo.addEdge(DTC2004, DTC3049, 0);
        grafo.addEdge(DTI2011, DTC3002, 0);
        grafo.addEdge(DTC2024, DTC3054, 0);
        grafo.addEdge(DTC2026, DTC3052, 0);
        grafo.addEdge(DTC2006, DTC2011, 0);
        grafo.addEdge(DTC2006, DTC3048, 0);
        
        grafo.computePaths(root); //"Crea" las conexiones en el árbol
        
        student.add(root);
        frame = new JFrame();
        frame.setBounds(100, 100, 1282, 777);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel lblNewLabel = new JLabel("Remedials");
        
        JCheckBox chckbxIntroduccinALa = new JCheckBox("Introducción a la computación");
        chckbxIntroduccinALa.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxIntroduccinALa_1 = new JCheckBox("Introducción a la física");
        chckbxIntroduccinALa_1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxIntrouccinALas = new JCheckBox("Introducción a las matemáticas");
        chckbxIntrouccinALas.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxInglsRemedial = new JCheckBox("Inglés remedial 1");
        chckbxInglsRemedial.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxInglsRemedial_1 = new JCheckBox("Inglés remedial 2");
        chckbxInglsRemedial_1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxInglesRemedial = new JCheckBox("Inglés remedial 3");
        chckbxInglesRemedial.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxInglsRemedial_2 = new JCheckBox("Inglés remedial 4");
        chckbxInglsRemedial_2.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxInglsRemedial_3 = new JCheckBox("Inglés remedial 5");
        chckbxInglsRemedial_3.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxFundamentosDeEscritura = new JCheckBox("Fundamentos de escritura");
        chckbxFundamentosDeEscritura.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        //Primer semestre
        JLabel lblSemester = new JLabel("Semester 1");
        
        JCheckBox chckbxFundamentosProg = new JCheckBox("Fundamentos de Programación");
        chckbxFundamentosProg.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxFsica = new JCheckBox("Física 1");
        chckbxFsica.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxMatemticasDiscretas = new JCheckBox("Matemáticas Discretas");
        chckbxMatemticasDiscretas.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxMatemticas = new JCheckBox("Matemáticas 1");
        chckbxMatemticas.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxIntroduccinALa_2 = new JCheckBox("Introducción a la Ingeniería en Sistemas Computacionales");
        chckbxIntroduccinALa_2.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxCienciasNat = new JCheckBox("Ciencias Naturales y Desarrollo Sustentable");
        chckbxCienciasNat.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxLenguaExtranjera = new JCheckBox("Lengua Extranjera");
        chckbxLenguaExtranjera.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        
        
        //segundo semestre
        JLabel lblSemester_1 = new JLabel("Semester 2");
        
        JCheckBox chckbxProgramacinOrientadaA = new JCheckBox("Programación Orientada a Objetos");
        chckbxProgramacinOrientadaA.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxOrganizacinComputacional = new JCheckBox("Organización Computacional");
        chckbxOrganizacinComputacional.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxMatemticas_1 = new JCheckBox("Matemáticas 2");
        chckbxMatemticas_1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxFundamentosDeDiseo = new JCheckBox("Fundamentos de Diseño Interactivo");
        chckbxFundamentosDeDiseo.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxAdministracinEInnovacin = new JCheckBox("Administración e Innovación en Modelos de Negocio");
        chckbxAdministracinEInnovacin.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxAnlisisYExpresin = new JCheckBox("Análisis y Expresión Verbal");
        chckbxAnlisisYExpresin.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        //Semestre 3
        
        JLabel lblSemester_2 = new JLabel("Semester 3");
        
        JCheckBox chckbxEstructuraDeDatos = new JCheckBox("Estructura de Datos");
        chckbxEstructuraDeDatos.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxProbabilidadYEstadstica = new JCheckBox("Probabilidad y estadística");
        chckbxProbabilidadYEstadstica.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxElectricidadYMagnetismo = new JCheckBox("Electricidad y Magnetismo");
        chckbxElectricidadYMagnetismo.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxMatemticas_2 = new JCheckBox("Matemáticas 3");
        chckbxMatemticas_2.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxFundamentosDeIngeniera = new JCheckBox("Fundamentos de Ingeniería de Software");
        chckbxFundamentosDeIngeniera.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxticaPersonaY = new JCheckBox("Ética, Persona y Sociedad");
        chckbxticaPersonaY.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        //Semester 4
        
        JLabel lblSemester_3 = new JLabel("Semester 4");
        
        JCheckBox chckbxAnlisisYDiseo = new JCheckBox("Análisis y Diseño de Algoritmos");
        chckbxAnlisisYDiseo.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxProyectoDeDesarrollo = new JCheckBox("Proyecto de Desarrollo de Videojuegos");
        chckbxProyectoDeDesarrollo.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxFundamentosDeRedes = new JCheckBox("Fundamentos de Redes");
        chckbxFundamentosDeRedes.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxMtodosNumricosEn = new JCheckBox("Métodos Numéricos en Ingeniería");
        chckbxMtodosNumricosEn.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxBasesDeDatos = new JCheckBox("Bases de Datos");
        chckbxBasesDeDatos.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxExpresinVerbalEn = new JCheckBox("Expresión Verbal en el Ámbito Profesional");
        chckbxExpresinVerbalEn.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        //Semester 5
        
        JLabel lblSemester_4 = new JLabel("Semester 5");
        JCheckBox chckbxSistemasOperativos = new JCheckBox("Sistemas Operativos");
        chckbxSistemasOperativos.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxlgebraLineal = new JCheckBox("Álgebra Lineal");
        chckbxlgebraLineal.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxInterconexinDeRedes = new JCheckBox("Interconexión de Redes");
        chckbxInterconexinDeRedes.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxMatemticasComputacionales = new JCheckBox("Matemáticas Computacionales");
        chckbxMatemticasComputacionales.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxAnlisisYModelacin = new JCheckBox("Análisis y Modelación de Sistemas de Software");
        chckbxAnlisisYModelacin.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxHumanidadesYBellas = new JCheckBox("Humanidades y Bellas Artes");
        chckbxHumanidadesYBellas.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        //Semester 6
        JLabel lblSemester_5 = new JLabel("Semester 6");
        JCheckBox chckbxProgramacinAvanzada = new JCheckBox("Programación Avanzada");
        chckbxProgramacinAvanzada.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxEmprendimiento = new JCheckBox("Emprendimiento");
        chckbxEmprendimiento.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxEvaluacinYAdministracin = new JCheckBox("Evaluación y Administración de Proyectos");
        chckbxEvaluacinYAdministracin.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxBasesDeDatos_1 = new JCheckBox("Bases de Datos Avanzadas");
        chckbxBasesDeDatos_1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxProyectoDeDesarrollo_1 = new JCheckBox("Proyecto de Desarrollo para Dispositivos Móviles");
        chckbxProyectoDeDesarrollo_1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxCalidadYPruebas = new JCheckBox("Calidad y Pruebas de Software");
        chckbxCalidadYPruebas.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        //semester 7
        
        JLabel lblSemester_6 = new JLabel("Semester 7");
        
        JCheckBox chckbxTpicos = new JCheckBox("Tópicos 1");
        chckbxTpicos.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxSeguridadInformtica = new JCheckBox("Seguridad Informática");
        chckbxSeguridadInformtica.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxAdministracinDeProyectos = new JCheckBox("Administración de Proyectos de Ingeniería de SW");
        chckbxAdministracinDeProyectos.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxDesarrolloDeAplicaciones = new JCheckBox("Desarrollo de Aplicaciones Web");
        chckbxDesarrolloDeAplicaciones.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxLenguajesDeProgramacin = new JCheckBox("Lenguajes de Programación");
        chckbxLenguajesDeProgramacin.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxCiudadania = new JCheckBox("Ciudadania");
        chckbxCiudadania.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        //Semester 8
        
        
        JLabel lblSemester_7 = new JLabel("Semester 8");
        
        JCheckBox chckbxGrficasComputacionales = new JCheckBox("Gráficas Computacionales");
        chckbxGrficasComputacionales.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxMtodosCuantitativosY = new JCheckBox("Métodos Cuantitativos y Simulación");
        chckbxMtodosCuantitativosY.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxTpicos_1 = new JCheckBox("Tópicos 2");
        chckbxTpicos_1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxLaboratorioDeDesarrollo = new JCheckBox("Laboratorio de Desarrollo de Aplicaciones Web");
        chckbxLaboratorioDeDesarrollo.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxDiseoDeCompiadores = new JCheckBox("Diseño de Compiladores");
        chckbxDiseoDeCompiadores.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxDiseoYArquitectura = new JCheckBox("Diseño y Arquitectura de Software");
        chckbxDiseoYArquitectura.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxTpicos_2 = new JCheckBox("Tópicos 3");
        chckbxTpicos_2.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        
        //Semester 9
        JLabel lblSemester_8 = new JLabel("Semester 9");
        
        JCheckBox chckbxTpicos_3 = new JCheckBox("Tópicos 4");
        chckbxTpicos_3.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxTpicos_4 = new JCheckBox("Tópicos 5");
        chckbxTpicos_4.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxTpicos_5 = new JCheckBox("Tópicos 6");
        chckbxTpicos_5.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxIntroduccinALa_3 = new JCheckBox("Introducción a la vida Profesional");
        chckbxIntroduccinALa_3.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxSistemasInteligentes = new JCheckBox("Sistemas Inteligentes");
        chckbxSistemasInteligentes.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JCheckBox chckbxProyectoIntegradorPara = new JCheckBox("Proyecto Integrador para el Desarrollo de Soluciones Empresariales");
        chckbxProyectoIntegradorPara.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        JCheckBox chckbxticaAplicada = new JCheckBox("Ética Aplicada");
        chckbxticaAplicada.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        
        JButton btnSaveResults = new JButton("Save Results");
        btnSaveResults.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==btnSaveResults)
                    student.clear();
                student.add(root);
                
                if(chckbxIntroduccinALa.isSelected()==true && !student.contains(DTC1001)){
                    student.add(DTC1001);
                }if(chckbxIntroduccinALa_1.isSelected()==true && !student.contains(DF1001)){
                    student.add(DF1001);
                }if(chckbxIntrouccinALas.isSelected()==true && !student.contains(DMA1001)){
                    student.add(DMA1001);
                }if(chckbxInglesRemedial.isSelected()==true && !student.contains(DH1001)){
                    student.add(DH1001);
                }if(chckbxInglsRemedial_1.isSelected()==true && !student.contains(DH1002)){
                    student.add(DH1002);
                }if(chckbxInglesRemedial .isSelected()==true && !student.contains(DH1003)){
                    student.add(DH1003);
                }if(chckbxInglsRemedial_2.isSelected()==true && !student.contains(DH1004)){
                    student.add(DH1004);
                }if(chckbxInglsRemedial_3.isSelected()==true && !student.contains(DH1005)){
                    student.add(DH1005);
                }if(chckbxFundamentosDeEscritura.isSelected()==true && !student.contains(DH1015)){
                    student.add(DH1015);
                }if(chckbxFundamentosProg.isSelected()==true && !student.contains(DTC1014)){
                    student.add(DTC1014);
                }if(chckbxFsica.isSelected()==true && !student.contains(DF1002)){
                    student.add(DF1002);
                }if(chckbxMatemticasDiscretas.isSelected()==true && !student.contains(DTC1003)){
                    student.add(DTC1003);
                }if(chckbxMatemticas.isSelected()==true && !student.contains(DMA1015)){
                    student.add(DMA1015);
                }if(chckbxIntroduccinALa_2.isSelected()==true && !student.contains(DTC1023)){
                    student.add(DTC1023);
                }if(chckbxCienciasNat.isSelected()==true && !student.contains(DDS1003)){
                    student.add(DDS1003);
                }if(chckbxLenguaExtranjera.isSelected()==true && !student.contains(DH1016)){
                    student.add(DH1016);
                }if(chckbxProgramacinOrientadaA.isSelected()==true && !student.contains(DTC2016)){
                    student.add(DTC2016);
                }if(chckbxOrganizacinComputacional.isSelected()==true && !student.contains(DTC1016)){
                    student.add(DTC1016);
                }if(chckbxMatemticas_1.isSelected()==true && !student.contains(DMA1017)){
                    student.add(DMA1017);
                }if(chckbxFundamentosDeDiseo.isSelected()==true && !student.contains(DTC1015)){
                    student.add(DTC1015);
                }if(chckbxAdministracinEInnovacin.isSelected()==true && !student.contains(DAD1005)){
                    student.add(DAD1005);
                }if(chckbxAnlisisYExpresin.isSelected()==true && !student.contains(DH1040)){
                    student.add(DH1040);
                }if(chckbxEstructuraDeDatos.isSelected()==true && !student.contains(DTC1018)){
                    student.add(DTC1018);
                }if(chckbxProbabilidadYEstadstica.isSelected()==true && !student.contains(DMA1006)){
                    student.add(DMA1006);
                }if(chckbxElectricidadYMagnetismo.isSelected()==true && !student.contains(DF1005)){
                    student.add(DF1005);
                }if(chckbxMatemticas_2.isSelected()==true && !student.contains(DMA2009)){
                    student.add(DMA2009);
                }if(chckbxFundamentosDeIngeniera.isSelected()==true && !student.contains(DTC1019)){
                    student.add(DTC1019);
                }if(chckbxticaPersonaY.isSelected()==true && !student.contains(DH1018)){
                    student.add(DH1018);
                }if(chckbxAnlisisYDiseo.isSelected()==true && !student.contains(DTC2017)){
                    student.add(DTC2017);
                }if(chckbxProyectoDeDesarrollo.isSelected()==true && !student.contains(DTC1021)){
                    student.add(DTC1021);
                }if(chckbxFundamentosDeRedes.isSelected()==true && !student.contains(DTC2018)){
                    student.add(DTC2018);
                }if(chckbxMtodosNumricosEn.isSelected()==true && !student.contains(DTC2019)){
                    student.add(DTC2019);
                }if(chckbxBasesDeDatos.isSelected()==true && !student.contains(DTC1020)){
                    student.add(DTC1020);
                }if(chckbxExpresinVerbalEn.isSelected()==true && !student.contains(DH2001)){
                    student.add(DH2001);
                }if(chckbxSistemasOperativos.isSelected()==true && !student.contains(DTC2008)){
                    student.add(DTC2008);
                }if(chckbxlgebraLineal.isSelected()==true && !student.contains(DMA1019)){
                    student.add(DMA1019);
                }if(chckbxInterconexinDeRedes.isSelected()==true && !student.contains(DTC2022)){
                    student.add(DTC2022);
                }if(chckbxMatemticasComputacionales.isSelected()==true && !student.contains(DTC2020)){
                    student.add(DTC2020);
                }if(chckbxAnlisisYModelacin.isSelected()==true && !student.contains(DTC2004)){
                    student.add(DTC2004);
                }if(chckbxHumanidadesYBellas.isSelected()==true && !student.contains(DHS2000)){
                    student.add(DHS2000);
                }if(chckbxProgramacinAvanzada.isSelected()==true && !student.contains(DTC2025)){
                    student.add(DTC2025);
                }if(chckbxEmprendimiento.isSelected()==true && !student.contains(DEM1005)){
                    student.add(DEM1005);
                }if(chckbxEvaluacinYAdministracin.isSelected()==true && !student.contains(DTI2011)){
                    student.add(DTI2011);
                }if(chckbxBasesDeDatos_1.isSelected()==true && !student.contains(DTC3041)){
                    student.add(DTC3041);
                }if(chckbxProyectoDeDesarrollo_1.isSelected()==true && !student.contains(DTC2024)){
                    student.add(DTC2024);
                }if(chckbxCalidadYPruebas.isSelected()==true && !student.contains(DTC3045)){
                    student.add(DTC3045);
                }if(chckbxTpicos.isSelected()==true && !student.contains(DVA2010)){
                    student.add(DVA2010);
                }if(chckbxSeguridadInformtica.isSelected()==true && !student.contains(DTC2027)){
                    student.add(DTC2027);
                }if(chckbxAdministracinDeProyectos.isSelected()==true && !student.contains(DTC3002)){
                    student.add(DTC3002);
                }if(chckbxDesarrolloDeAplicaciones.isSelected()==true && !student.contains(DTC2026)){
                    student.add(DTC2026);
                }if(chckbxLenguajesDeProgramacin.isSelected()==true && !student.contains(DTC2006)){
                    student.add(DTC2006);
                }if(chckbxCiudadania.isSelected()==true && !student.contains(DHS2005)){
                    student.add(DHS2005);
                }if(chckbxGrficasComputacionales.isSelected()==true && !student.contains(DTC3022)){
                    student.add(DTC3022);
                }if(chckbxMtodosCuantitativosY.isSelected()==true && !student.contains(DTC2007)){
                    student.add(DTC2007);
                }if(chckbxTpicos_1.isSelected()==true && !student.contains(DVA2011)){
                    student.add(DVA2011);
                }if(chckbxLaboratorioDeDesarrollo.isSelected()==true && !student.contains(DTC3052)){
                    student.add(DTC3052);
                }if(chckbxDiseoDeCompiadores.isSelected()==true && !student.contains(DTC3048)){
                    student.add(DTC3048);
                }if(chckbxDiseoYArquitectura.isSelected()==true && !student.contains(DTC3049)){
                    student.add(DTC3049);
                }if(chckbxTpicos_2.isSelected()==true && !student.contains(DVA2012)){
                    student.add(DVA2012);
                }if(chckbxTpicos_3.isSelected()==true && !student.contains(DVA2013)){
                    student.add(DVA2013);
                }if(chckbxTpicos_4.isSelected()==true && !student.contains(DVA2014)){
                    student.add(DVA2014);
                }if(chckbxTpicos_5.isSelected()==true && !student.contains(DVA2015)){
                    student.add(DVA2015);
                }if(chckbxIntroduccinALa_3.isSelected()==true && !student.contains(DTI3035)){
                    student.add(DTI3035);
                }if(chckbxSistemasInteligentes.isSelected()==true && !student.contains(DTC2011)){
                    student.add(DTC2011);
                }if(chckbxProyectoIntegradorPara.isSelected()==true && !student.contains(DTC3054)){
                    student.add(DTC3054);
                }if(chckbxticaAplicada.isSelected()==true && !student.contains(DHS2006)){
                    student.add(DHS2006);
                }
            }
        });
        
        JLabel lblEnterTheKey = new JLabel("Enter the key or name of the subject:");
        
        textField = new JTextField();
        textField.setColumns(10);
        
        textField.setText("");
        
        JButton btnThisIsRequirement = new JButton("This is Requirement for course ...");
        btnThisIsRequirement.addActionListener(new ActionListener() {
            String req = "";
            public void actionPerformed(ActionEvent e) {
                if(textField.getText().equals("")){
                    JOptionPane.showMessageDialog(frame, "Enter a Subject");
                }else{
                    if(grafo.returnVertex(root, textField.getText()).adjacencies==null){
                        JOptionPane.showMessageDialog(frame, "This Course does not have dependencies");
                    }else{
                        for (int i = 0; i < grafo.returnVertex(root, textField.getText()).adjacencies.size(); i++) {
                            req =  req + "\n " + grafo.returnVertex(root, textField.getText()).adjacencies.get(i).target.name;
                        }
                        JOptionPane.showMessageDialog(frame, req);
                        
                    }
                }
                
            }
        });
        
        JButton btnRequirements = new JButton("Requirements");
        btnRequirements.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String req = "";
                if(textField.getText().equals("")){
                    JOptionPane.showMessageDialog(frame, "Enter a Subject");
                }else{
                    for (int i = 0; i < grafo.requirements(root, textField.getText()).size(); i++) {
                        req =  req + "\n " + grafo.requirements(root, textField.getText()).get(i);
                    }
                    JOptionPane.showMessageDialog(frame, req);
                }
            }
        });
        
        JButton btnCanICourse = new JButton("Can I course ...");
        btnCanICourse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(textField.getText().equals("")){
                    JOptionPane.showMessageDialog(frame, "Enter a Subject");
                }else{
                    JOptionPane.showMessageDialog(frame, grafo.canI(student, textField.getText(), root));
                }
            }
        });
        
        JButton btnRecomendatioForNext = new JButton("Recomendation for next Semester");
        btnRecomendatioForNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String req = "";
                for (int i = 0; i < grafo.nextSem(student).size(); i++) {
                    req =  req + "\n " + grafo.nextSem(student).get(i);
                }
                JOptionPane.showMessageDialog(frame, req);
                
            }
        });
        
        GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
        groupLayout.setHorizontalGroup(
                                       groupLayout.createParallelGroup(Alignment.LEADING)
                                       .addGroup(groupLayout.createSequentialGroup()
                                                 .addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
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
                                                                               .addGroup(groupLayout.createSequentialGroup()
                                                                                         .addPreferredGap(ComponentPlacement.RELATED)
                                                                                         .addComponent(chckbxDesarrolloDeAplicaciones))
                                                                               .addGroup(groupLayout.createSequentialGroup()
                                                                                         .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                                                                   .addComponent(chckbxIntroduccinALa)
                                                                                                   .addComponent(chckbxIntrouccinALas)
                                                                                                   .addComponent(chckbxIntroduccinALa_1)
                                                                                                   .addComponent(chckbxFundamentosDeEscritura)
                                                                                                   .addComponent(chckbxInglsRemedial)
                                                                                                   .addComponent(chckbxInglsRemedial_1)
                                                                                                   .addComponent(chckbxInglesRemedial)
                                                                                                   .addGroup(groupLayout.createSequentialGroup()
                                                                                                             .addPreferredGap(ComponentPlacement.RELATED)
                                                                                                             .addComponent(lblNewLabel)))
                                                                                         .addGap(25)
                                                                                         .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                                                                   .addComponent(chckbxFundamentosProg)
                                                                                                   .addComponent(chckbxFsica)
                                                                                                   .addComponent(chckbxMatemticasDiscretas)
                                                                                                   .addComponent(chckbxMatemticas)
                                                                                                   .addComponent(chckbxIntroduccinALa_2)
                                                                                                   .addComponent(chckbxCienciasNat)
                                                                                                   .addComponent(chckbxLenguaExtranjera)
                                                                                                   .addComponent(lblSemester))
                                                                                         .addGap(4)
                                                                                         .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                                                                                                   .addGroup(groupLayout.createSequentialGroup()
                                                                                                             .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                                                                                       .addComponent(lblSemester_4)
                                                                                                                       .addComponent(chckbxSistemasOperativos)
                                                                                                                       .addComponent(chckbxlgebraLineal)
                                                                                                                       .addComponent(chckbxInterconexinDeRedes)
                                                                                                                       .addComponent(chckbxMatemticasComputacionales))
                                                                                                             .addGap(93)
                                                                                                             .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                                                                                       .addComponent(chckbxBasesDeDatos_1)
                                                                                                                       .addComponent(chckbxEvaluacinYAdministracin)
                                                                                                                       .addComponent(chckbxEmprendimiento)
                                                                                                                       .addComponent(chckbxProgramacinAvanzada)
                                                                                                                       .addComponent(lblSemester_5, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)))
                                                                                                   .addGroup(groupLayout.createSequentialGroup()
                                                                                                             .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                                                                                       .addComponent(chckbxAnlisisYModelacin)
                                                                                                                       .addComponent(chckbxHumanidadesYBellas))
                                                                                                             .addGap(18)
                                                                                                             .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                                                                                       .addComponent(chckbxCalidadYPruebas)
                                                                                                                       .addComponent(chckbxProyectoDeDesarrollo_1)))
                                                                                                   .addGroup(groupLayout.createSequentialGroup()
                                                                                                             .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                                                                                       .addComponent(lblSemester_1)
                                                                                                                       .addComponent(chckbxProgramacinOrientadaA)
                                                                                                                       .addComponent(chckbxOrganizacinComputacional)
                                                                                                                       .addComponent(chckbxMatemticas_1)
                                                                                                                       .addComponent(chckbxFundamentosDeDiseo)
                                                                                                                       .addGroup(groupLayout.createSequentialGroup()
                                                                                                                                 .addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                                 .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                                                                                                           .addComponent(chckbxAdministracinEInnovacin)
                                                                                                                                           .addComponent(chckbxAnlisisYExpresin))))
                                                                                                             .addPreferredGap(ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                                                                                                             .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                                                                                       .addComponent(btnCanICourse)
                                                                                                                       .addComponent(btnRequirements)
                                                                                                                       .addComponent(btnThisIsRequirement)
                                                                                                                       .addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
                                                                                                                                 .addComponent(textField)
                                                                                                                                 .addComponent(lblEnterTheKey, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                                                       .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                                                                                                                                 .addComponent(btnSaveResults)
                                                                                                                                 .addComponent(btnRecomendatioForNext))))))))
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
                                                                               .addComponent(chckbxTpicos_1)
                                                                               .addComponent(chckbxTpicos_2)
                                                                               .addComponent(chckbxLaboratorioDeDesarrollo)
                                                                               .addComponent(chckbxDiseoYArquitectura)
                                                                               .addComponent(chckbxGrficasComputacionales)
                                                                               .addComponent(chckbxDiseoDeCompiadores)
                                                                               .addComponent(chckbxMtodosCuantitativosY))
                                                                     .addGap(79)
                                                                     .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                                               .addComponent(chckbxticaAplicada)
                                                                               .addComponent(chckbxSistemasInteligentes)
                                                                               .addComponent(chckbxIntroduccinALa_3)
                                                                               .addComponent(chckbxTpicos_5)
                                                                               .addComponent(chckbxTpicos_4)
                                                                               .addComponent(chckbxTpicos_3)
                                                                               .addComponent(lblSemester_8)
                                                                               .addComponent(chckbxProyectoIntegradorPara))))
                                                 .addContainerGap(87, Short.MAX_VALUE))
                                       );
        groupLayout.setVerticalGroup(
                                     groupLayout.createParallelGroup(Alignment.LEADING)
                                     .addGroup(groupLayout.createSequentialGroup()
                                               .addGap(24)
                                               .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                                         .addComponent(lblSemester)
                                                         .addComponent(lblNewLabel)
                                                         .addComponent(lblSemester_1)
                                                         .addComponent(lblEnterTheKey))
                                               .addPreferredGap(ComponentPlacement.RELATED)
                                               .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                                         .addComponent(chckbxIntroduccinALa)
                                                         .addComponent(chckbxFundamentosProg)
                                                         .addComponent(chckbxProgramacinOrientadaA)
                                                         .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                               .addGap(6)
                                               .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                                         .addComponent(chckbxIntrouccinALas)
                                                         .addComponent(chckbxFsica)
                                                         .addComponent(chckbxOrganizacinComputacional)
                                                         .addComponent(btnThisIsRequirement))
                                               .addGap(6)
                                               .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                                         .addComponent(chckbxIntroduccinALa_1)
                                                         .addComponent(chckbxMatemticasDiscretas)
                                                         .addComponent(chckbxMatemticas_1)
                                                         .addComponent(btnRequirements))
                                               .addGap(6)
                                               .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                                         .addComponent(chckbxFundamentosDeEscritura)
                                                         .addComponent(chckbxMatemticas)
                                                         .addComponent(chckbxFundamentosDeDiseo)
                                                         .addComponent(btnCanICourse))
                                               .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                         .addGroup(groupLayout.createSequentialGroup()
                                                                   .addPreferredGap(ComponentPlacement.RELATED)
                                                                   .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                                                             .addComponent(chckbxInglsRemedial)
                                                                             .addComponent(chckbxIntroduccinALa_2)
                                                                             .addComponent(chckbxAnlisisYExpresin))
                                                                   .addPreferredGap(ComponentPlacement.RELATED)
                                                                   .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                                                                             .addGroup(groupLayout.createSequentialGroup()
                                                                                       .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                                                                                 .addComponent(chckbxInglsRemedial_1)
                                                                                                 .addComponent(chckbxCienciasNat))
                                                                                       .addGap(6))
                                                                             .addGroup(groupLayout.createSequentialGroup()
                                                                                       .addComponent(chckbxAdministracinEInnovacin)
                                                                                       .addPreferredGap(ComponentPlacement.UNRELATED)))
                                                                   .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                                             .addComponent(chckbxInglesRemedial)
                                                                             .addComponent(chckbxLenguaExtranjera)))
                                                         .addGroup(groupLayout.createSequentialGroup()
                                                                   .addGap(46)
                                                                   .addComponent(btnRecomendatioForNext)))
                                               .addPreferredGap(ComponentPlacement.RELATED)
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
                                                                   .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                                                             .addComponent(lblSemester_3)
                                                                             .addComponent(lblSemester_4)
                                                                             .addComponent(lblSemester_5, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
                                                                   .addPreferredGap(ComponentPlacement.RELATED)
                                                                   .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                                                             .addComponent(chckbxAnlisisYDiseo)
                                                                             .addComponent(chckbxSistemasOperativos)
                                                                             .addComponent(chckbxProgramacinAvanzada))
                                                                   .addPreferredGap(ComponentPlacement.RELATED)
                                                                   .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                                                             .addComponent(chckbxProyectoDeDesarrollo)
                                                                             .addComponent(chckbxlgebraLineal)
                                                                             .addComponent(chckbxEmprendimiento))
                                                                   .addPreferredGap(ComponentPlacement.RELATED)
                                                                   .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                                                             .addComponent(chckbxFundamentosDeRedes)
                                                                             .addComponent(chckbxInterconexinDeRedes)
                                                                             .addComponent(chckbxEvaluacinYAdministracin))
                                                                   .addPreferredGap(ComponentPlacement.RELATED)
                                                                   .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                                                             .addComponent(chckbxMtodosNumricosEn)
                                                                             .addComponent(chckbxMatemticasComputacionales)
                                                                             .addComponent(chckbxBasesDeDatos_1))
                                                                   .addPreferredGap(ComponentPlacement.RELATED)
                                                                   .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                                             .addGroup(groupLayout.createSequentialGroup()
                                                                                       .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                                                                                 .addComponent(chckbxBasesDeDatos)
                                                                                                 .addComponent(chckbxAnlisisYModelacin))
                                                                                       .addPreferredGap(ComponentPlacement.RELATED)
                                                                                       .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                                                                                 .addComponent(chckbxExpresinVerbalEn)
                                                                                                 .addComponent(chckbxHumanidadesYBellas)))
                                                                             .addGroup(groupLayout.createSequentialGroup()
                                                                                       .addComponent(chckbxProyectoDeDesarrollo_1)
                                                                                       .addPreferredGap(ComponentPlacement.RELATED)
                                                                                       .addComponent(chckbxCalidadYPruebas)))))
                                               .addGap(6)
                                               .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                                         .addComponent(chckbxticaPersonaY)
                                                         .addComponent(lblSemester_7)
                                                         .addComponent(lblSemester_8))
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
                                                                   .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                                                             .addComponent(chckbxSistemasInteligentes)
                                                                             .addComponent(btnSaveResults))
                                                                   .addPreferredGap(ComponentPlacement.RELATED)
                                                                   .addComponent(chckbxProyectoIntegradorPara)
                                                                   .addPreferredGap(ComponentPlacement.RELATED)
                                                                   .addComponent(chckbxticaAplicada)))
                                               .addGap(49))
                                     );
        frame.getContentPane().setLayout(groupLayout);
    }
    public Vertex root(){
        return root;
    }
    public List<Vertex> listaAlum(){
        return student;
    }

}
