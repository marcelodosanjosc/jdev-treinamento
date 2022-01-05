package cursojava.thread;

import javax.swing.*;
import java.awt.*;

public class TelaTimeThread extends JDialog {

    public TelaTimeThread(){
        setTitle("Tela da Thread");
        setSize(new Dimension(240, 240));
        setLocationRelativeTo(null);
        setResizable(false);

        setVisible(true);
    }
}
