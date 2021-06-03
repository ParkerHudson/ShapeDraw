import javax.swing.*;


public class squareCreator {


    public static void main(String[] args){
        JFrame f = new JFrame("Square Creator");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        squareDraw s = new squareDraw();
        f.add(s);
        f.setSize(500,500);
        f.setVisible(true);
    }
    
}
