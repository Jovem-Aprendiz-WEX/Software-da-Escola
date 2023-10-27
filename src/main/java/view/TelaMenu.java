package view;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TelaMenu extends JFrame{


    public TelaMenu(){

        setTitle("Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(720, 480);
        setLocationRelativeTo(null);
    }


    public static void main(String[] args) {
        
            
                TelaMenu telaMenu = new TelaMenu();
                telaMenu.setVisible(true);

    }
}