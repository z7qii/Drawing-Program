/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drawingProgram;

import java.awt.Graphics;

/**
 *
 * @author zayed
 */
public class Circle extends Shape {
    private int diameter;
    private int radius;
    @Override
    public void draw(Graphics g){
        int x = (point1.x + point2.x)/2;
        int y = (point1.y + point2.y)/2;
        
        radius = (int)Math.sqrt(Math.pow(point1.x - x, 2)+ Math.pow(point1.y - y, 2));
        
        x = x - radius;
        y = y - radius;
        
        diameter = 2 * radius;
        
        g.drawOval(x, y, diameter, diameter);
    }
}
