/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wargame.widgets;

import java.awt.Color;
import javax.swing.JCheckBox;

/**
 *
 * @author Hugo Sartori
 */
public class WCheckBox extends JCheckBox {
    
    public WCheckBox() {
        super();
        
        setBorderPainted(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setOpaque(false);
        setBackground(new Color(1.0f,1.0f,1.0f,0.5f));
        
    }
    
}
