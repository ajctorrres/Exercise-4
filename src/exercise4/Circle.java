/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise4;
import java.lang.Math;
/**
 *
 * @author torresar_cis21035
 */
public class Circle {
    double radius;
    
    public Circle(){
        this.radius = 1.0;
    }
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        radius = this.getRadius();
    }
    
    public double getArea(){
        double area = Math.PI * Math.pow(this.radius, 2);
        return area;
    }
    
    public double getCircumference(){
        double circumference = 2 * Math.PI * this.radius;
        return circumference;
    }
    
    public String toString(){
        return "Circle[radius="+this.getRadius()+"]";
    }
            
}
