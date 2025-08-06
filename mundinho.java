import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mundinho here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mundinho extends World
{

    /**
     * Constructor for objects of class mundinho.
     * 
     */
    public mundinho()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Jovem jovem = new Jovem();
        addObject(jovem,100,84);
        PAO pAO = new PAO();
        addObject(pAO,466,90);
        PAO pAO2 = new PAO();
        addObject(pAO2,403,288);
        pAO.setLocation(521,305);
        point point = new point();
        addObject(point,575,384);
        pAO.setLocation(490,344);
        pAO.setLocation(430,402);
        pAO.setLocation(449,354);
        pAO2.setLocation(252,360);
        Bomb bomb = new Bomb();
        addObject(bomb,486,150);
        point.setLocation(516,153);
        pAO2.setLocation(257,356);
        Plataforma plataforma = new Plataforma();
        addObject(plataforma,199,252);
        plataforma.setLocation(227,291);
        plataforma.setLocation(209,264);
        plataforma.setLocation(200,251);
        Plataforma plataforma2 = new Plataforma();
        addObject(plataforma2,311,260);
        Plataforma plataforma3 = new Plataforma();
        addObject(plataforma3,414,235);
        Plataforma plataforma4 = new Plataforma();
        addObject(plataforma4,310,181);
        Plataforma plataforma5 = new Plataforma();
        addObject(plataforma5,208,112);
        Plataforma plataforma6 = new Plataforma();
        addObject(plataforma6,431,118);
        plataforma.setLocation(68,254);
        plataforma5.setLocation(85,120);
        jovem.setLocation(76,67);
        plataforma5.setLocation(86,97);
        plataforma2.setLocation(275,272);
        plataforma4.setLocation(221,178);
        plataforma6.setLocation(343,108);
        plataforma4.setLocation(208,181);
        plataforma3.setLocation(340,212);
        removeObject(plataforma3);
        plataforma2.setLocation(441,292);
        plataforma6.setLocation(428,122);
        point.setLocation(513,148);
        point.setLocation(595,21);
        point.setLocation(462,96);
        point.setLocation(444,119);
        point.setLocation(433,58);
        plataforma6.setLocation(449,102);
        point.setLocation(446,92);
        plataforma4.setLocation(268,184);
        plataforma.setLocation(110,276);
        pAO2.setLocation(98,260);
        pAO.setLocation(412,260);
    }
}
