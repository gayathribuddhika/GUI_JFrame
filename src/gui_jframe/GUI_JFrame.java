
package gui_jframe;

import javax.swing.JFrame;
public class GUI_JFrame {

    
    public static void main(String[] args) {
        NewClass gui = new NewClass();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(275,180);
        gui.setVisible(true);
    }
    
}
