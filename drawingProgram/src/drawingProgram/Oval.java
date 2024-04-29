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
public class Oval extends Shape {
    public void draw(Graphics g){
        int x = Math.min(point1.x, point2.x);
        int y = Math.min(point1.y, point2.y);
        int width = Math.abs(point1.x - point2.x);
        int height = Math.abs(point1.y - point2.y);
        
        g.drawOval(x,y ,width, height);
        
    }
}
