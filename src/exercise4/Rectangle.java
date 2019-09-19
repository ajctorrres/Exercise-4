/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise4;

/**
 *
 * @author torresar_cis21035
 */
public class Rectangle {
    private float length;
    private float width;
    
    public Rectangle(){
        this.length = 1.0f;
        this.width = 1.0f;
    }
    
    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }
    
    public float getLength(){
        return length;
    }
    
    public void setLength(float length){
        length = this.getLength();
    }
    
    public float getWidth(){
        return width;
    }
    
    public void setWidth(float width){
        width = this.getWidth();
    }
    
    public double getArea(){
        double area = this.width * this.length; 
        return area; 
    }
    
    public double getPerimeter(){
        double perimeter = (this.length * 2) + (this.width * 2);
        return perimeter;
    }
    
    public String toString(){
        return "Rectangle[length="+this.getLength()+",width="+this.getWidth()+"]";
    }
    
}


