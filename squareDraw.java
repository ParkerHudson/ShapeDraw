import java.awt.*;
import javax.swing.*;

//import java.util.NoSuchElementException;
import java.util.Scanner;

public class squareDraw extends JPanel{
    
    public void paintComponent(Graphics g){

        //try(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter in the amount of RED you want in your shape (Max of 255):");
        int red = scanner.nextInt();
        System.out.println("Enter in the amount of GREEN you want in your shape (Max of 255):");
        int green = scanner.nextInt();
        System.out.println("Enter in the amount of BLUE you want in your shape (Max of 255):");
        int blue = scanner.nextInt();
        System.out.println("Enter the desired width of the shape:");
        int width = scanner.nextInt();
        System.out.println("Enter the desired height of the shape:");
        int height = scanner.nextInt();
        //System.out.println("Would you like to print a rectangle or an oval? Please type 'rectangle' or 'oval'");
        //String shapeType = scanner.next();
        scanner.close();

        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        g.setColor(new Color(red, green, blue));
        g.fillRect(25, 25, width, height);

       // }
        //catch(NoSuchElementException e){}      

        /*
        if(shapeType.toLowerCase() == "rectangle"){

            

        }
        else if(shapeType.toLowerCase() == "oval"){
            g.setColor(new Color(red, green, blue));
            g.fillOval(25, 25, width, height);
        }
        */
        
    }

}