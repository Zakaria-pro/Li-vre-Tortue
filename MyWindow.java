import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyWindow extends JFrame {

	private static final long serialVersionUID = 1L;

	/* ---------------Attributes-------------- */ 
    // components
    JButton start_race, quit;
    JButton lievre, tortue;
    JLabel title, made_by;
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 28); // style 
    Font specialFont = new Font("Monospaced", Font.PLAIN, 28); // style

    // panels : where we gonna put components
    JPanel pn, pc, ps, pe, pw; // pcenter, pnorth, psouth ..
    
    // frame : where we gonna put panels
    JFrame frame_1;

    /* ---------------Constructor-------------- */
    public MyWindow() {
        super("Main");
        initComponents();
        initPanels();
        compenentsInPanels();
        initFrame();
        panelsInFrame();
        setVisible(true);
        }   

    /* ----------------Methods----------------- */
    public void initComponents() {
        /* Initialize our component (Jbuttons, Jlabels) */
        
        // The Title label
        title = new JLabel("the Tortoise and The Hare");
        title.setFont(specialFont);
        
        // the Start button
        start_race.setText("Start");
        start_race.setFont(normalFont);
        start_race.setBackground(Color.GREEN);
        
        // the Quit button
        start_race.setText("Quit");
        start_race.setFont(normalFont);
        start_race.setBackground(Color.RED);  

        // the Toirtoise button for toirtoise movement
        tortue = new JButton();
        tortue.setIcon(new ImageIcon(Class.class.getResource("/resources/tortue.png")));

        //  The Hare button for the hare movement
        lievre = new JButton();
        tortue.setIcon(new ImageIcon(Class.class.getResource("/resources/lievre.png")));

        // // The Toirtoise
        // path_tortue = 'C:\\Users\\hp\\OneDrive\\Bureau\\Java\\Multithreading\\tortue.png'   
        // Icon icon1 = new ImageIcon(path_tortue);
        // tortue = new JButton(icon1);
        
        // // The Hare
        // path_lievre = 'C:\\Users\\hp\\OneDrive\\Bureau\\Java\\Multithreading\\lievre.png'
        // Icon icon2 = new ImageIcon(path_lievre);
        // lievre = new JButton(icon2);

        // made by Label
        made_by = new JLabel("Made with <3");
    }

    public void initPanels() {
        /* PanelsConfiguration */

        // pn : Panel North for the title
        pn = new JPanel();
        pn.setBackground(Color.ORANGE);
        pn.setLayout(new BorderLayout());

        // pc : Panel Center for the race demo
        pc = new JPanel();
        pc.setBackground(Color.ORANGE);
        pc.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        // ps : Panel south for button start_race and button quit
        ps = new JPanel();
        ps.setBackground(Color.ORANGE);
        ps.setLayout(new BorderLayout());

        // // pe : Panel east for
        // pe = new JPanel();
        // pe.setBackground(Color.ORANGE);
        // pe.setLayout(new BorderLayout());

        // // pw : Panel west for
        // pw = new JPanel();
        // pw.setBackground(Color.ORANGE);
        // pw.setLayout(new BorderLayout());

        //getContentPane().setBackground(Color.ORANGE);

        
    }

    public void compenentsInPanels() {
        pn.add(title, BorderLayout.CENTER);
    
        pc.add(tortue);
        pc.add(lievre);
        
        ps.add(start_race, BorderLayout.EAST);
        ps.add(quit, BorderLayout.WEST);
        ps.add(made_by, BorderLayout.SOUTH);

        // pe.add(esp2, BorderLayout.Center);
        // pw.add(esp3, BorderLayout.Center);
    }

    public void initFrame() {
        frame_1 = JFrame("The Race");
        
        /* GraphicsConfiguration */
        frame_1.setResizable(false);
        frame_1.setSize(450, 450);                              
        frame_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        //frame_1.setLocationRelativeTo((Component)null);        
        frame_1.setLocation(500, 100);
        JFrame.setDefaultLookAndFeelDecorated(true);

        /* ArchitectureConfiguration */
        frame_1.setLayout(new BorderLayout());
    }

    private JFrame JFrame(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public void panelsInFrame() {
        frame_1.add(pn, BorderLayout.NORTH);
        frame_1.add(pc, BorderLayout.CENTER);
        frame_1.add(ps, BorderLayout.SOUTH);
        //frame_1.add(pe, "East");
        //frame_1.add(pw, "West");
    }

        
}
