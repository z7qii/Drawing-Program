/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drawingProgram;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.*;
/**
 *
 * @author zayed
 */
public abstract class Shape {
            Point point1 ;
            Point point2;
           
        public abstract void draw(Graphics g);

   
  
    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }
          
           
            
            
}


