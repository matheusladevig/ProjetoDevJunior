/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Matheus
 */
public class GerenciadorCaracteres extends PlainDocument{
    
    private int maximo;
    
    public GerenciadorCaracteres(int maxLen){
        super();
        if(maxLen<=0)
            throw new IllegalArgumentException("Especifique a quantidade!");
        maximo = maxLen;
    }

    @Override
    public void insertString(int i, String string, AttributeSet as) throws BadLocationException {
        if(string==null||getLength()==maximo)
            return;
        int total = (getLength()+string.length());
        if(total<=maximo){
            super.insertString(i, string.replaceAll(" ", " "), as);
            return;
        }
        String nova = string.substring(0,getLength()-maximo);
        super.insertString(i, nova, as);
    }

}
