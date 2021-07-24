
package model;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;


public class GerenciadorJanela {
    
    
    public void GerenciadorJanela(JInternalFrame janela, JDesktopPane desktop){
        int lDesk = desktop.getWidth();
        int aDesk = desktop.getHeight();
        int lIFrame = janela.getWidth();
        int aIFrame = janela.getHeight();

        janela.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2 );
        if(janela.isVisible()){
            janela.toFront();
            janela.dispose();
            desktop.remove(janela);
            
        }else{
            desktop.add(janela);
            janela.setVisible(true);
            
        }
           
        
        
        
    }
    
   
    
}
