import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class AngryFace extends Applet implements KeyListener
{
int x=50,y=50;
Label l;
 public void init()
    {
        addKeyListener(this);
	setFocusable(true);
      requestFocusInWindow();
    }
 
 public void paint(Graphics g)
 {
// setBackground(Color.yellow);
         g.setColor(Color.red);
	 g.drawOval(x,y,185,200);
	 g.fillOval(x+30,y+70,30,30);
	 g.drawLine(x+45,y+57,x+70,y+90);
	 g.fillOval(x+130,y+70,30,30);
	 g.drawLine(x+140,y+57,x+125,y+90);
	 g.drawLine(x+90,y+50,x+90,y+100);
	 g.drawArc(x+50,y+130,80,25,0,180);
	 g.fillArc(x+50,y+129,80,35,0,180);
    
   
   
 }
public void keyPressed(KeyEvent k)
    {
        int key = k.getKeyCode();
 
        switch(key)
        {
            
            case KeyEvent.VK_RIGHT:
                x= x+ 10;
                break;
            case KeyEvent.VK_LEFT:
                x= x- 10;
                break;
            case KeyEvent.VK_UP:
                y= y-10;
                break;
             
            case KeyEvent.VK_DOWN:
               y=y+10;
                break;
 
        }
 
        repaint();
    }
public void keyTyped(KeyEvent ke) { }
public void keyReleased(KeyEvent ke) { }

public static void main(String[] args) {
   
      new AngryFace().show();
}










}