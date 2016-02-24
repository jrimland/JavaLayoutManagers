
package containers;
import javax.swing.JFrame;

/**
 *
 * @author jrimland
 */
public class MainFrame extends JFrame {
    public MainFrame()
    {
        super("Let's use layout managers");
        MainPanel mPanel = new MainPanel();
        getContentPane().add(mPanel);
        this.setSize(600, 400);
        this.setVisible(true);        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
