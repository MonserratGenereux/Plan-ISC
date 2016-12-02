package planISC;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * The Welcome class creates the first window in the
 * program.
 * @author Ilse Monserrat Sánchez Genereux and Mark Octavio Rivera Acosta
 * @version 1.0
 * @since 2016-12-01
 */
public class Welcome {    
    JFrame frame;
    private JTextField txtName;
    private JTextField txtA;
    
    
    public Welcome() {
        initialize();
    }
    
    /**
     * Initialize method creates the frame of the window.
     * Shows a welcome message to the user and request for
     * name and ID. It also calls for the next window to open
     * when Button btnEnter is pressed.
     */
    private void initialize() {
        
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 237);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        txtName = new JTextField();
        txtName.setColumns(10);
        txtA = new JTextField();
        txtA.setColumns(10);
        
        JLabel lblWelcomeToIsc = new JLabel("Welcome to ISC");
        JLabel lblName = new JLabel("Name:");
        JLabel lblStudentNumber = new JLabel("Student Number:");
        JButton btnEnter = new JButton("Enter");
        
        lblWelcomeToIsc.setFont(new Font("Lucida Grande", Font.PLAIN, 58));
        
        btnEnter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==btnEnter){
                    Subjects window = new Subjects();
                    window.frame.setVisible(true);
                    frame.setVisible(false);
                }
            }
        });
        
        
        GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
        groupLayout.setHorizontalGroup(
                                       groupLayout.createParallelGroup(Alignment.LEADING)
                                       .addGroup(groupLayout.createSequentialGroup()
                                                 .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                           .addGroup(groupLayout.createSequentialGroup()
                                                                     .addContainerGap()
                                                                     .addComponent(lblWelcomeToIsc))
                                                           .addGroup(groupLayout.createSequentialGroup()
                                                                     .addGap(21)
                                                                     .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                                               .addGroup(groupLayout.createSequentialGroup()
                                                                                         .addComponent(lblStudentNumber)
                                                                                         .addPreferredGap(ComponentPlacement.UNRELATED)
                                                                                         .addComponent(txtA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                               .addGroup(groupLayout.createSequentialGroup()
                                                                                         .addComponent(lblName)
                                                                                         .addPreferredGap(ComponentPlacement.UNRELATED)
                                                                                         .addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
                                                 .addContainerGap(11, Short.MAX_VALUE))
                                       .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
                                                 .addContainerGap(368, Short.MAX_VALUE)
                                                 .addComponent(btnEnter)
                                                 .addContainerGap())
                                       );
        groupLayout.setVerticalGroup(
                                     groupLayout.createParallelGroup(Alignment.LEADING)
                                     .addGroup(groupLayout.createSequentialGroup()
                                               .addContainerGap()
                                               .addComponent(lblWelcomeToIsc)
                                               .addGap(32)
                                               .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                                         .addComponent(lblName)
                                                         .addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                               .addGap(18)
                                               .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                                         .addComponent(lblStudentNumber)
                                                         .addComponent(txtA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                               .addPreferredGap(ComponentPlacement.RELATED)
                                               .addComponent(btnEnter)
                                               .addContainerGap(12, Short.MAX_VALUE))
                                     );
        frame.getContentPane().setLayout(groupLayout);
    }
    

}
