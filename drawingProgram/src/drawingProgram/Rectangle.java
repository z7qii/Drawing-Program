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
public class Rectangle extends Shape{
    private int width;
    private int height;
    @Override
    public void draw(Graphics g){
        
        int topLeftX = Math.min(point1.x, point2.x);
        int topLeftY = Math.min(point1.y, point2.y);
        int bottomRightX = Math.max(point1.x, point2.x);
        int bottomRightY = Math.max(point1.y, point2.y);
        
        calcualteWidth(bottomRightX , topLeftX);
        calcualteHeight(bottomRightY , topLeftY);
        
        g.drawRect(topLeftX, topLeftY, width, height);
        
        
    }
    
    public void calcualteWidth(int bottomRightX , int topLeftX){
        width = bottomRightX - topLeftX;
    }
    
    public void calcualteHeight(int bottomRightY , int topLeftY){
        height = bottomRightY - topLeftY;
    }
    
    public int getWidth(){
        return width;
    }
    
    public int getHeight(){
        return height;
    }
            
}
