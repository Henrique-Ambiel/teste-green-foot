import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Jovem extends Actor
{
    private int placar = 0;
    private final int gravidade = 1;
    private int velocidade;
    public Jovem (){
        velocidade = 20;
    }
    public void act()
    {
        cair();
        if(Greenfoot.isKeyDown("space")&&getY()>getWorld().getHeight()-50)pular();
        mover();
        
    }
    public void cair (){
        setLocation(getX(), getY()+velocidade);
        if(getY()>getWorld().getHeight()-50)velocidade = 0;
        else velocidade += gravidade;
    }
    public void pular(){
        velocidade=-20;
    }
    public void mover(){
        getWorld().showText("Placar: " + placar, 50, 20);
        int y = getY();
        int x = getX();
        if(Greenfoot.isKeyDown("A"))x--;
        if(Greenfoot.isKeyDown("D"))x++;
        setLocation(x,y);
      if (Greenfoot.isKeyDown("A")) {
            setRotation(180);
            move(8);
        }
      if (Greenfoot.isKeyDown("D")) {
            setRotation(0);
            move(8);
        }
        sumirPAO();
        sumirpoint();
    }

    /**
     * 
     */
    public void sumirPAO()
    {
        if (isTouching(PAO.class)) {
            removeTouching(PAO.class);
            placar = placar + 1;
        }
    }
    public void sumirpoint()
    {
        if (isTouching(point.class)) {
            removeTouching(point.class);
            getWorld().showText("NÍVEL 1 CONCLUÍDO", 450, 350);
        }
    }
}
