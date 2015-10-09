import greenfoot.*;

public class Pianinko extends World
{
    GreenfootSound dzwiek;
   
    public Pianinko()
    {    
        
       super(600, 400, 1); 
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            dzwiek = new GreenfootSound("e.wav");
            dzwiek.play();
        }
        
        if(Greenfoot.isKeyDown("right"))
        {
            dzwiek = new GreenfootSound("g.wav");
            dzwiek.play();
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
            dzwiek = new GreenfootSound("a.wav");
            dzwiek.play();
        }
        
        if(Greenfoot.isKeyDown("down"))
        {
            dzwiek = new GreenfootSound("h.wav");
            dzwiek.play();
        }
        
        if(Greenfoot.isKeyDown("space"))
        {
            dzwiek = new GreenfootSound("d.wav");
            dzwiek.play();
        }
            
}
}