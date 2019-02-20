
package gui_jframe;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewClass extends JFrame{
    private JLabel item1;
    
    public NewClass(){
        super("The title bar");
        setLayout(new FlowLayout());
        
        item1 = new JLabel("THis is a Sentence");
        item1.setToolTipText("This is gona show up on hover");
        add(item1);
    }
}
