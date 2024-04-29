/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drawingProgram;

/**
 *
 * @author zayed
 */
public class Constraint {
    int north;
    int west;

    public Constraint() {
    }
    
    
    public Constraint(int north, int west) {
        this.north = north;
        this.west = west;
    }
    
    public int getNorth() {
        return north;
    }

    public int getWest() {
        return west;
    }

    public void setNorth(int north) {
        this.north = north;
    }

    public void setWest(int west) {
        this.west = west;
    }
    
}
