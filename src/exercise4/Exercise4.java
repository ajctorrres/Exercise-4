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
public class Exercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Rectangle rec = new Rectangle(20,50);
        System.out.println(rec.toString());
        System.out.println("Perimeter: "+rec.getPerimeter());
        System.out.println("Area: "+rec.getArea()+"sq. unit");
        
        Circle cir = new Circle(13);
        System.out.println(cir.toString());
        System.out.println("Circumference: "+cir.getCircumference());
        System.out.println("Area: "+cir.getArea()+"sq. unit");
        
    }
    
}
