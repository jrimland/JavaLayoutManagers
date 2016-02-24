package containers;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author jrimland
 */
public class MainPanel extends JPanel{
    public MainPanel()
    {
        
        

//        GridLayout Example
//        GridLayout grid = new GridLayout(10,3);
//        this.setLayout(grid);
        
        JButton[] buttons = new JButton[30];
        for (int i=0;i<30; i++)
        {
            buttons[i] = new JButton("Button" + i);
            add(buttons[i]);
        }           
        
        //Border Layout Example
//        BorderLayout border = new BorderLayout();
//        this.setLayout(border);
//        
//        JButton northButton = new JButton("North");
//        add(northButton, BorderLayout.NORTH);
//        
//        JButton southButton = new JButton("South");
//        add(southButton, BorderLayout.SOUTH);
//        
//        JButton eastButton = new JButton("East");
//        add(eastButton, BorderLayout.EAST);        
//        
//        JButton westButton = new JButton("West");
//        add(westButton, BorderLayout.WEST);
//                
//        JButton centerButton = new JButton("Center");
//        add(centerButton, BorderLayout.CENTER);
        
        //Null Layout example
//        setLayout(null);
//        JButton anywhereButton = new JButton("Where are I?");
//        add(anywhereButton);
//        anywhereButton.setBounds(25, 25, 200, 100);
        
        
        
    }
}
