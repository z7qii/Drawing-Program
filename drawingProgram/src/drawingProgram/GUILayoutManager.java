/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drawingProgram;

import java.awt.Component;
import java.util.Map;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

/**
 *
 * @author zayed
 */
public class GUILayoutManager {
    
    public static void setConstraints(SpringLayout layout, JPanel toolbar,Component targetComponent,int targetNorthOffset, Map<Component, Constraint> components){
        
        
        layout.putConstraint(SpringLayout.NORTH , targetComponent ,targetNorthOffset , SpringLayout.NORTH , toolbar);
        
        for (Map.Entry<Component,Constraint> entry : components.entrySet()) {
            layout.putConstraint(SpringLayout.NORTH, entry.getKey(), entry.getValue().getNorth(), SpringLayout.NORTH, toolbar);
            layout.putConstraint(SpringLayout.WEST, entry.getKey(), entry.getValue().getWest(), SpringLayout.WEST, toolbar);
           
        }
        
    }
}
