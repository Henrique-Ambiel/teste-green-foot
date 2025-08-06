import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Actor
{
    public Bomb()
    {
        GreenfootImage myImage = getImage();
        myImage.scale(50, 50);
    }
    public void act()
    {
        move(15);
        if (Greenfoot.getRandomNumber(100) < 10) {
            turn(Greenfoot.getRandomNumber(15) - 30);
        }
        sumirPersonagem();
    }

    /**
     * 
     */
    public void sumirPersonagem()
    {
        if (isTouching(Jovem.class)) {
            removeTouching(Jovem.class);
            getWorld().showText("GAME OVER", 400, 300);
        }
    }
}
