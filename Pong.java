import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pong extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Pong()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 625, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PowerUp powerUp = new PowerUp();
        addObject(powerUp,554,237);
        powerUp.setLocation(542,236);
        powerUp.setLocation(542,236);
        removeObject(powerUp);
        Timer timer = new Timer();
        addObject(timer,943,30);
        Player1 player1 = new Player1();
        addObject(player1,23,312);
        Player2 player2 = new Player2();
        addObject(player2,976,308);
        PowerUp powerUp2 = new PowerUp();
        addObject(powerUp2,512,78);
        PowerUp powerUp3 = new PowerUp();
        addObject(powerUp3,512,132);
        PowerUp powerUp4 = new PowerUp();
        addObject(powerUp4,511,184);
        powerUp4.setLocation(511,188);
        PowerUp powerUp5 = new PowerUp();
        addObject(powerUp5,512,237);
        PowerUp powerUp6 = new PowerUp();
        addObject(powerUp6,514,356);
        PowerUp powerUp7 = new PowerUp();
        addObject(powerUp7,515,412);
        PowerUp powerUp8 = new PowerUp();
        addObject(powerUp8,516,468);
        PowerUp powerUp9 = new PowerUp();
        addObject(powerUp9,516,524);
        PowerUp powerUp10 = new PowerUp();
        addObject(powerUp10,548,27);
        PowerUp powerUp11 = new PowerUp();
        addObject(powerUp11,548,78);
        PowerUp powerUp12 = new PowerUp();
        addObject(powerUp12,548,132);
        PowerUp powerUp13 = new PowerUp();
        addObject(powerUp13,548,185);
        PowerUp powerUp14 = new PowerUp();
        addObject(powerUp14,548,240);
        PowerUp powerUp15 = new PowerUp();
        addObject(powerUp15,550,356);
        PowerUp powerUp16 = new PowerUp();
        addObject(powerUp16,548,298);
        PowerUp powerUp17 = new PowerUp();
        addObject(powerUp17,550,413);
        PowerUp powerUp18 = new PowerUp();
        addObject(powerUp18,549,469);
        PowerUp powerUp19 = new PowerUp();
        addObject(powerUp19,548,524);
        PowerUp powerUp20 = new PowerUp();
        addObject(powerUp20,548,586);
        PowerUp powerUp21 = new PowerUp();
        addObject(powerUp21,476,27);
        PowerUp powerUp22 = new PowerUp();
        addObject(powerUp22,476,80);
        PowerUp powerUp23 = new PowerUp();
        addObject(powerUp23,476,133);
        PowerUp powerUp24 = new PowerUp();
        addObject(powerUp24,476,188);
        PowerUp powerUp25 = new PowerUp();
        addObject(powerUp25,476,242);
        PowerUp powerUp26 = new PowerUp();
        addObject(powerUp26,476,298);
        PowerUp powerUp27 = new PowerUp();
        addObject(powerUp27,476,355);
        PowerUp powerUp28 = new PowerUp();
        addObject(powerUp28,476,411);
        PowerUp powerUp29 = new PowerUp();
        addObject(powerUp29,476,468);
        PowerUp powerUp30 = new PowerUp();
        addObject(powerUp30,476,523);
        PowerUp powerUp31 = new PowerUp();
        addObject(powerUp31,476,584);
        Brick brick = new Brick();
        addObject(brick,442,28);
        Brick brick2 = new Brick();
        addObject(brick2,443,76);
        Brick brick3 = new Brick();
        addObject(brick3,444,125);
        Brick brick4 = new Brick();
        addObject(brick4,444,174);
        Brick brick5 = new Brick();
        addObject(brick5,444,223);
        Brick brick6 = new Brick();
        addObject(brick6,444,274);
        Brick brick7 = new Brick();
        addObject(brick7,444,324);
        Brick brick8 = new Brick();
        addObject(brick8,444,373);
        Brick brick9 = new Brick();
        addObject(brick9,444,422);
        Brick brick10 = new Brick();
        addObject(brick10,444,472);
        Brick brick11 = new Brick();
        addObject(brick11,444,523);
        Brick brick12 = new Brick();
        addObject(brick12,444,574);
        Brick2 brick22 = new Brick2();
        addObject(brick22,583,28);
        Brick2 brick23 = new Brick2();
        addObject(brick23,583,80);
        Brick2 brick24 = new Brick2();
        addObject(brick24,582,133);
        Brick2 brick25 = new Brick2();
        addObject(brick25,583,186);
        Brick2 brick26 = new Brick2();
        addObject(brick26,583,241);
        Brick2 brick27 = new Brick2();
        addObject(brick27,584,298);
        brick27.setLocation(583,290);
        Brick2 brick28 = new Brick2();
        addObject(brick28,584,345);
        Brick2 brick29 = new Brick2();
        addObject(brick29,584,398);
        Brick2 brick210 = new Brick2();
        addObject(brick210,584,451);
        Brick2 brick211 = new Brick2();
        addObject(brick211,584,504);
        Brick2 brick212 = new Brick2();
        addObject(brick212,584,556);
        Brick2 brick213 = new Brick2();
        addObject(brick213,585,604);
        brick213.setLocation(588,604);
        Brick brick13 = new Brick();
        addObject(brick13,444,623);
        Ball ball = new Ball();
        addObject(ball,812,308);
        Ball ball2 = new Ball();
        addObject(ball2,140,306);
        ScorePlayer1 scorePlayer1 = new ScorePlayer1();
        addObject(scorePlayer1,194,32);
        ScorePlayer1 scorePlayer12 = new ScorePlayer1();
        addObject(scorePlayer12,829,29);
        brick213.setLocation(580,604);
        brick213.setLocation(591,595);
        brick.setLocation(450,32);
        brick2.setLocation(443,65);
        brick3.setLocation(442,96);
        brick4.setLocation(445,152);
        brick5.setLocation(442,218);
        brick6.setLocation(445,248);
        brick7.setLocation(442,301);
        brick8.setLocation(439,360);
        brick9.setLocation(438,402);
        brick10.setLocation(446,448);
        brick11.setLocation(440,509);
        brick12.setLocation(444,543);
        brick13.setLocation(442,602);
        brick213.setLocation(586,598);
        removeObject(brick213);
        brick.setLocation(444,21);
        brick2.setLocation(440,87);
        brick2.setLocation(440,130);
        brick2.setLocation(441,86);
        brick3.setLocation(428,226);
        brick3.setLocation(443,136);
        brick5.setLocation(444,181);
        brick4.setLocation(439,375);
        brick4.setLocation(444,244);
        brick7.setLocation(436,293);
        brick8.setLocation(441,339);
        brick6.setLocation(427,477);
        brick6.setLocation(442,400);
        brick10.setLocation(440,435);
        brick9.setLocation(437,497);
        removeObject(brick9);
        brick12.setLocation(437,565);
        removeObject(brick13);
        brick7.setLocation(437,283);
        removeObject(brick10);
        removeObject(brick12);
        removeObject(brick11);
        removeObject(brick6);
        removeObject(brick8);
        removeObject(brick7);
        brick2.setLocation(447,84);
        brick.setLocation(442,21);
        brick2.setLocation(440,68);
        brick5.setLocation(438,177);
        brick4.setLocation(436,228);
        brick4.setLocation(428,297);
        removeObject(brick4);
        removeObject(brick5);
        removeObject(brick3);
        brick2.setLocation(444,84);
        brick.setLocation(447,34);
        brick2.setLocation(439,73);
        removeObject(brick2);
        brick.setLocation(443,27);
        Brick brick14 = new Brick();
        addObject(brick14,443,81);
        Brick brick15 = new Brick();
        addObject(brick15,444,135);
        Brick brick16 = new Brick();
        addObject(brick16,444,188);
        Brick brick17 = new Brick();
        addObject(brick17,444,243);
        Brick brick18 = new Brick();
        addObject(brick18,444,296);
        Brick brick19 = new Brick();
        addObject(brick19,445,350);
        Brick brick20 = new Brick();
        addObject(brick20,445,403);
        Brick brick21 = new Brick();
        addObject(brick21,445,455);
        Brick brick30 = new Brick();
        addObject(brick30,445,504);
        Brick brick31 = new Brick();
        addObject(brick31,445,556);
        Brick brick32 = new Brick();
        addObject(brick32,444,609);
        brick32.setLocation(448,611);
        Brick2 brick214 = new Brick2();
        addObject(brick214,584,610);
        brick32.setLocation(444,606);
        brick32.setLocation(439,605);
        brick32.setLocation(437,604);
    }
}
