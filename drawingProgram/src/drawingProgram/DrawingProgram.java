/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drawingProgram;

/**
 *
 * @author zayed
 */
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.swing.*;

public class DrawingProgram extends JFrame implements MouseMotionListener {

    private Point mousePnt = new Point();
    private MyPanel canvas;
    private JPanel toolbar;
    private GUIManager guiManager;
    public DrawingProgram() {
        super("Painter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1500, 800));
        pack();
        setLocationRelativeTo(null);
        addComponents();
    }

    private void addComponents() {
        toolbar = new JPanel();

        canvas = new MyPanel(1500 , 750);
        canvas.addMouseMotionListener(this);
        toolbar.add(canvas);
       
        
        this.getContentPane().add(toolbar);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        guiManager = new GUIManager(this , toolbar , canvas);
        
        
    }
    
    
    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        mousePnt = e.getPoint();

        repaint();
    }

  

}
