/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dao.CriaTabelas;
import db.DB;
import javax.swing.UIManager;
import gui.CriarPropertiesGUI;
import gui.MainView;

/**
 *
 * @author Matheus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        
        
        CriaTabelas tabela = new CriaTabelas();
        CriarPropertiesGUI tela = new CriarPropertiesGUI();
        MainView view = new MainView();
        DB criar = new DB();
        if (tela.ler()) {
            if (criar.validaBanco()) {
                if (tabela.CriaTabelas()) {
                    tela.verifica = true;
                    view.setVisible(true);
                }
            }
        } else {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new CriarPropertiesGUI().setVisible(true);
                }
            });
        }

    }
    

}
