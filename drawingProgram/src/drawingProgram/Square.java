/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drawingProgram;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author zayed
 */
public class Square extends Shape {
    private int width;
    private int height;
    
    @Override
    public void draw(Graphics g){
        
        int x = Math.min(point1.x, point2.x);
        int y = Math.min(point1.y, point2.y);
        calcualteWidth();
        calcualteHeight();
        
        g.drawRect(x,y ,width, height);
        
        
        
    }
    
    public void calcualteWidth(){
        width = Math.max(Math.abs(point1.x - point2.x), Math.abs(point1.y - point2.y));
    }
    
    public void calcualteHeight(){
        height = Math.max(Math.abs(point1.x - point2.x), Math.abs(point1.y - point2.y));
    }
    
    public int getWidth(){
        return width;
    }
    
    public int getHeight(){
        return height;
    }
}
