
package model;

import java.awt.Component;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class LookAndFeel {

    //variaveis staticas finais
    public final int VISUALJAVA = 1;

    /////////////////////////////////////////////////////////////////////
    //Estilo de visualização
    public  boolean lookAndFeel(Component comp, int visual) {
        boolean mudou = true; //se mudar o visual manda true senão false
        try {

            switch (visual) {
                case VISUALJAVA:UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                
            }
            //adiciona look and feel ao componente
            SwingUtilities.updateComponentTreeUI(comp);
        } catch (Exception ex) {
            mudou = false;
        }

        return mudou;
    }
}
