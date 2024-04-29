/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drawingProgram;

/**
 *
 * @author zayed
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyPanel extends JPanel implements MouseMotionListener , MouseListener{
    private Point newPoint = new Point();
    private Point oldPoint = new Point();
    private Image image;
    private Graphics2D graphics2d;
    private int fontSize = 4;
    private Shape shapeToDraw ;
    GraphicEditor graphicEditor = new GraphicEditor();
    boolean shapeSelected = false;
    boolean isFirstClick = true;
    private int canvasWidth, canvasHeight;
    MyPanel(int canvasWidth, int canvasHeight) {
        super();
        setPreferredSize(new Dimension(canvasWidth, canvasHeight));
        setOpaque(true);
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        this.canvasHeight = canvasHeight;
        this.canvasWidth = canvasWidth;
        
        this.addMouseMotionListener(this);
        this.addMouseListener(this);
        
    }
    
    
    public void mouseMoved(MouseEvent me) {
        oldPoint = me.getPoint();
    }
    
    public void mouseDragged(MouseEvent me) {
        graphics2d.setStroke(new BasicStroke(fontSize));
        
        
        
        newPoint = me.getPoint();
        
        if (graphics2d != null) {
            graphics2d.drawLine(oldPoint.x, oldPoint.y, newPoint.x, newPoint.y);
        }
        
        repaint();
        oldPoint = newPoint;
    
    }
    
    protected void paintComponent(Graphics g) {
        if (image == null) {
            image = createImage(getSize().width, getSize().height);
            graphics2d = (Graphics2D)image.getGraphics();
        }
        else {
            g.drawImage(image, 0,0, null);
        }
    }
    
    public void setColor(Color c){
        graphics2d.setColor(c);
    }
    
    
    
    public void setFontSize(int fontSize){
        this.fontSize = fontSize;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(shapeSelected){
            
            if(isFirstClick){
                shapeToDraw.setPoint1(e.getPoint());
                isFirstClick = false;
            }else{
                shapeToDraw.setPoint2(e.getPoint());
                isFirstClick = true;
                
                graphicEditor.drawShape(shapeToDraw, graphics2d);
                repaint();
            }
        }
        

    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
    public void setActivaited(Shape shape){
        this.shapeToDraw = shape;
        
    }
    
    public void setShapeSelected(boolean isSelected){
        
        shapeSelected = isSelected;
    }
    
    public void resetCanvas(){
        Graphics g = image.getGraphics();
        g.clearRect(0, 0, canvasWidth, canvasHeight);
        g.dispose();
        
      
       
        repaint();
        revalidate();
        
    }
    
}

