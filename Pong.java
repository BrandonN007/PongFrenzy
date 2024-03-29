import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pong extends SimulationWorld
{
    private long lastFrameTimeMS;
    private double timeStepDuration;
    protected int scorePlayer1 = 0;
    protected int scorePlayer2 = 0;
    
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Pong()
    {    
        super("gameplay.wav", 1000, 625, 1);
        lastFrameTimeMS = System.currentTimeMillis();
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        BrickPowerUp powerUp = new BrickPowerUp();
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
        BrickPowerUp powerUp2 = new BrickPowerUp();
        addObject(powerUp2,512,78);
        BrickPowerUp powerUp3 = new BrickPowerUp();
        addObject(powerUp3,512,132);
        BrickPowerUp powerUp4 = new BrickPowerUp();
        addObject(powerUp4,511,184);
        powerUp4.setLocation(511,188);
        BrickPowerUp powerUp5 = new BrickPowerUp();
        addObject(powerUp5,512,237);
        BrickPowerUp powerUp6 = new BrickPowerUp();
        addObject(powerUp6,514,356);
        BrickPowerUp powerUp7 = new BrickPowerUp();
        addObject(powerUp7,515,412);
        BrickPowerUp powerUp8 = new BrickPowerUp();
        addObject(powerUp8,516,468);
        BrickPowerUp powerUp9 = new BrickPowerUp();
        addObject(powerUp9,516,524);
        BrickPowerUp powerUp10 = new BrickPowerUp();
        addObject(powerUp10,548,27);
        BrickPowerUp powerUp11 = new BrickPowerUp();
        addObject(powerUp11,548,78);
        BrickPowerUp powerUp12 = new BrickPowerUp();
        addObject(powerUp12,548,132);
        BrickPowerUp powerUp13 = new BrickPowerUp();
        addObject(powerUp13,548,185);
        BrickPowerUp powerUp14 = new BrickPowerUp();
        addObject(powerUp14,548,240);
        BrickPowerUp powerUp15 = new BrickPowerUp();
        addObject(powerUp15,550,356);
        BrickPowerUp powerUp16 = new BrickPowerUp();
        addObject(powerUp16,548,298);
        BrickPowerUp powerUp17 = new BrickPowerUp();
        addObject(powerUp17,550,413);
        BrickPowerUp powerUp18 = new BrickPowerUp();
        addObject(powerUp18,549,469);
        BrickPowerUp powerUp19 = new BrickPowerUp();
        addObject(powerUp19,548,524);
        BrickPowerUp powerUp20 = new BrickPowerUp();
        addObject(powerUp20,548,586);
        BrickPowerUp powerUp21 = new BrickPowerUp();
        addObject(powerUp21,476,27);
        BrickPowerUp powerUp22 = new BrickPowerUp();
        addObject(powerUp22,476,80);
        BrickPowerUp powerUp23 = new BrickPowerUp();
        addObject(powerUp23,476,133);
        BrickPowerUp powerUp24 = new BrickPowerUp();
        addObject(powerUp24,476,188);
        BrickPowerUp powerUp25 = new BrickPowerUp();
        addObject(powerUp25,476,242);
        BrickPowerUp powerUp26 = new BrickPowerUp();
        addObject(powerUp26,476,298);
        BrickPowerUp powerUp27 = new BrickPowerUp();
        addObject(powerUp27,476,355);
        BrickPowerUp powerUp28 = new BrickPowerUp();
        addObject(powerUp28,476,411);
        BrickPowerUp powerUp29 = new BrickPowerUp();
        addObject(powerUp29,476,468);
        BrickPowerUp powerUp30 = new BrickPowerUp();
        addObject(powerUp30,476,523);
        BrickPowerUp powerUp31 = new BrickPowerUp();
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
        Brick brick22 = new Brick();
        addObject(brick22,583,28);
        Brick brick23 = new Brick();
        addObject(brick23,583,80);
        Brick brick24 = new Brick();
        addObject(brick24,582,133);
        Brick brick25 = new Brick();
        addObject(brick25,583,186);
        Brick brick26 = new Brick();
        addObject(brick26,583,241);
        Brick brick27 = new Brick();
        addObject(brick27,584,298);
        brick27.setLocation(583,290);
        Brick brick28 = new Brick();
        addObject(brick28,584,345);
        Brick brick29 = new Brick();
        addObject(brick29,584,398);
        Brick brick210 = new Brick();
        addObject(brick210,584,451);
        Brick brick211 = new Brick();
        addObject(brick211,584,504);
        Brick brick212 = new Brick();
        addObject(brick212,584,556);
        Brick brick213 = new Brick();
        addObject(brick213,585,604);
        brick213.setLocation(588,604);
        Brick brick13 = new Brick();
        addObject(brick13,444,623);
        Ball ball = new Ball(false);
        addObject(ball,812,308);
        Ball ball2 = new Ball(true);
        addObject(ball2,140,306);
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
        Brick brick214 = new Brick();
        addObject(brick214,584,610);
        brick32.setLocation(444,606);
        brick32.setLocation(439,605);
        brick32.setLocation(437,604);
        brick32.setLocation(449,608);
        brick32.setLocation(444,606);
        timer.setLocation(958,21);
        Portal portal = new Portal();
        addObject(portal,512,298);
        Portal2 portal2 = new Portal2();
        addObject(portal2,513,30);
        Portal3 portal3 = new Portal3();
        addObject(portal3,516,588);
        Brick brick38 = new Brick();
        addObject(brick38,415,25);
        brick38.setLocation(415,21);
        Brick brick39 = new Brick();
        addObject(brick39,415,81);
        Brick brick40 = new Brick();
        addObject(brick40,416,135);
        Brick brick41 = new Brick();
        addObject(brick41,416,188);
        Brick brick42 = new Brick();
        addObject(brick42,416,245);
        brick42.setLocation(419,243);
        Brick brick43 = new Brick();
        addObject(brick43,416,300);
        Brick brick44 = new Brick();
        addObject(brick44,416,350);
        Brick brick45 = new Brick();
        addObject(brick45,416,403);
        Brick brick46 = new Brick();
        addObject(brick46,415,456);
        Brick brick47 = new Brick();
        addObject(brick47,416,504);
        brick46.setLocation(416,459);
        Brick brick48 = new Brick();
        addObject(brick48,416,556);
        Brick brick49 = new Brick();
        addObject(brick49,415,602);
        brick49.setLocation(411,602);
        brick43.setLocation(411,302);
        brick49.setLocation(411,603);
        brick43.setLocation(411,303);
        brick46.setLocation(411,455);
        brick42.setLocation(411,247);
        brick46.setLocation(422,458);
        brick49.setLocation(417,596);
        brick43.setLocation(413,303);
        brick42.setLocation(418,236);
        brick38.setLocation(417,30);
        brick38.setLocation(419,14);
        brick38.setLocation(413,30);
        brick38.setLocation(419,24);
        brick38.setLocation(408,30);
        brick43.setLocation(410,294);
        brick42.setLocation(409,237);
        powerUp7.setLocation(505,415);
        powerUp8.setLocation(510,465);
        powerUp9.setLocation(507,523);
        portal3.setLocation(508,582);
        removeObject(brick38);
        removeObject(brick42);
        removeObject(brick43);
        removeObject(brick46);
        removeObject(brick49);
        Brick brick50 = new Brick();
        addObject(brick50,415,26);
        brick50.setLocation(414,27);
        Brick brick51 = new Brick();
        addObject(brick51,416,243);
        Brick brick52 = new Brick();
        addObject(brick52,415,296);
        Brick brick53 = new Brick();
        addObject(brick53,415,454);
        Brick brick54 = new Brick();
        addObject(brick54,414,605);
        brick54.setLocation(416,606);
        Brick brick55 = new Brick();
        addObject(brick55,384,27);
        Brick brick56 = new Brick();
        addObject(brick56,386,81);
        brick56.setLocation(384,81);
        Brick brick57 = new Brick();
        addObject(brick57,385,135);
        Brick brick58 = new Brick();
        addObject(brick58,385,189);
        brick58.setLocation(385,188);
        Brick brick59 = new Brick();
        addObject(brick59,385,244);
        brick59.setLocation(385,243);
        Brick brick60 = new Brick();
        addObject(brick60,384,295);
        brick60.setLocation(385,296);
        Brick brick61 = new Brick();
        addObject(brick61,386,350);
        brick61.setLocation(385,350);
        Brick brick62 = new Brick();
        addObject(brick62,386,404);
        brick62.setLocation(385,403);
        Brick brick63 = new Brick();
        addObject(brick63,386,456);
        brick63.setLocation(385,455);
        Brick brick64 = new Brick();
        addObject(brick64,385,505);
        Brick brick65 = new Brick();
        addObject(brick65,386,556);
        brick65.setLocation(385,555);
        Brick brick66 = new Brick();
        addObject(brick66,385,606);
        Brick brick67 = new Brick();
        addObject(brick67,355,27);
        Brick brick68 = new Brick();
        addObject(brick68,355,80);
        brick68.setLocation(355,81);
        Brick brick69 = new Brick();
        addObject(brick69,356,135);
        brick69.setLocation(355,135);
        Brick brick70 = new Brick();
        addObject(brick70,355,188);
        Brick brick71 = new Brick();
        addObject(brick71,354,244);
        brick71.setLocation(345,252);
        brick71.setLocation(355,242);
        Brick brick72 = new Brick();
        addObject(brick72,355,296);
        Brick brick73 = new Brick();
        addObject(brick73,355,351);
        brick73.setLocation(355,350);
        Brick brick74 = new Brick();
        addObject(brick74,355,404);
        brick74.setLocation(355,404);
        Brick brick75 = new Brick();
        addObject(brick75,356,455);
        brick75.setLocation(355,455);
        Brick brick76 = new Brick();
        addObject(brick76,355,506);
        brick76.setLocation(355,506);
        Brick brick77 = new Brick();
        addObject(brick77,355,557);
        brick77.setLocation(355,555);
        Brick brick78 = new Brick();
        addObject(brick78,355,609);
        brick78.setLocation(355,607);
        portal3.setLocation(510,585);
        powerUp31.setLocation(476,580);
        powerUp31.setLocation(473,590);
        powerUp9.setLocation(510,530);
        powerUp8.setLocation(510,457);
        powerUp7.setLocation(510,417);
        powerUp6.setLocation(510,354);
        powerUp8.setLocation(510,466);
        powerUp9.setLocation(510,529);
        powerUp31.setLocation(480,573);
        powerUp20.setLocation(550,573);
        powerUp31.setLocation(476,582);
        powerUp20.setLocation(548,580);
        Brick brick79 = new Brick();
        addObject(brick79,614,28);
        Brick brick80 = new Brick();
        addObject(brick80,644,28);
        Brick brick81 = new Brick();
        addObject(brick81,674,28);
        Brick brick82 = new Brick();
        addObject(brick82,615,80);
        Brick brick83 = new Brick();
        addObject(brick83,646,80);
        Brick brick84 = new Brick();
        addObject(brick84,675,80);
        Brick brick85 = new Brick();
        addObject(brick85,615,133);
        Brick brick86 = new Brick();
        addObject(brick86,647,133);
        Brick brick87 = new Brick();
        addObject(brick87,675,133);
        Brick brick88 = new Brick();
        addObject(brick88,615,185);
        brick88.setLocation(615,185);
        Brick brick89 = new Brick();
        addObject(brick89,647,185);
        Brick brick90 = new Brick();
        addObject(brick90,677,185);
        Brick brick91 = new Brick();
        addObject(brick91,615,241);
        Brick brick92 = new Brick();
        addObject(brick92,648,240);
        Brick brick93 = new Brick();
        addObject(brick93,677,239);
        brick93.setLocation(678,241);
        brick93.setLocation(679,243);
        brick93.setLocation(678,241);
        Brick brick94 = new Brick();
        addObject(brick94,614,291);
        Brick brick95 = new Brick();
        addObject(brick95,648,291);
        Brick brick96 = new Brick();
        addObject(brick96,678,291);
        Brick brick97 = new Brick();
        addObject(brick97,614,345);
        Brick brick98 = new Brick();
        addObject(brick98,647,345);
        Brick brick99 = new Brick();
        addObject(brick99,678,345);
        Brick brick100 = new Brick();
        addObject(brick100,615,398);
        Brick brick101 = new Brick();
        addObject(brick101,648,398);
        Brick brick102 = new Brick();
        addObject(brick102,679,398);
        Brick brick103 = new Brick();
        addObject(brick103,618,452);
        brick103.setLocation(618,458);
        Brick brick104 = new Brick();
        addObject(brick104,648,450);
        brick103.setLocation(610,446);
        Brick brick105 = new Brick();
        addObject(brick105,680,451);
        removeObject(brick103);
        Brick brick106 = new Brick();
        addObject(brick106,616,450);
        Brick brick107 = new Brick();
        addObject(brick107,617,504);
        Brick brick108 = new Brick();
        addObject(brick108,648,504);
        Brick brick109 = new Brick();
        addObject(brick109,680,504);
        Brick brick110 = new Brick();
        addObject(brick110,616,556);
        Brick brick111 = new Brick();
        addObject(brick111,649,556);
        Brick brick112 = new Brick();
        addObject(brick112,681,556);
        Brick brick113 = new Brick();
        addObject(brick113,616,610);
        Brick brick114 = new Brick();
        addObject(brick114,649,609);
        Brick brick115 = new Brick();
        addObject(brick115,680,610);
        brick115.setLocation(682,605);
        brick115.setLocation(680,608);
        portal3.setLocation(514,586);
        powerUp9.setLocation(513,525);
        powerUp8.setLocation(511,470);
        powerUp8.setLocation(512,470);
        powerUp7.setLocation(512,412);
        powerUp6.setLocation(512,356);
        powerUp5.setLocation(513,243);
        powerUp4.setLocation(513,187);
        powerUp31.setLocation(477,580);
        portal3.setLocation(512,584);
        brick57.setLocation(255,225);
        brick64.setLocation(305,476);
        portal.setLocation(509,301);
        removeObject(brick57);
        removeObject(brick64);
        removeObject(brick108);
        removeObject(brick86);
        Portal portal4 = new Portal();
        addObject(portal4,645,134);
        Portal portal5 = new Portal();
        addObject(portal5,649,501);
        Portal portal6 = new Portal();
        addObject(portal6,384,135);
        Portal portal7 = new Portal();
        addObject(portal7,384,504);
        portal3.setLocation(792,434);
        Portal2 portal22 = new Portal2();
        addObject(portal22,513,579);
        portal3.setLocation(514,411);
        Portal3 portal32 = new Portal3();
        addObject(portal32,509,190);
        portal3.setLocation(517,412);
        portal32.setLocation(519,192);
        portal.setLocation(518,297);
        portal5.setLocation(650,511);
        portal32.setLocation(510,198);
        portal.setLocation(511,300);
        portal3.setLocation(509,405);
        brick51.setLocation(283,220);
        brick100.setLocation(767,379);
        removeObject(brick51);
        removeObject(brick100);

        removeObject(portal32);
        removeObject(portal3);
        Portal3 portal33 = new Portal3();
        addObject(portal33,616,397);
        Portal3 portal34 = new Portal3();
        addObject(portal34,414,241);
        portal5.setLocation(644,503);
        portal7.setLocation(382,506);
        portal34.setLocation(417,245);
        portal6.setLocation(381,132);
        portal2.setLocation(511,34);
        portal.setLocation(516,300);
    }

    public void act()
    {
        timeStepDuration = (System.currentTimeMillis() - lastFrameTimeMS) / 1000.0;
        lastFrameTimeMS = System.currentTimeMillis();
        
        // showText("" + scorePlayer1, 175, 33);
        // showText("" + scorePlayer2, 845, 33);
        
        GreenfootImage bg = getBackground();
        bg.clear();
        bg.setColor(Color.BLACK);
        bg.fill();
        bg.setFont(new Font(50));
        bg.setColor(new Color(255,255,255,255));
        bg.drawString("" + scorePlayer1, 175, 50);
        bg.drawString("" + scorePlayer2, 845, 50);
        
        
        transitionToGameOver();
        getScorePlayer1();
        getScorePlayer2();
    }
    
    public double getTimeStepDuration()
    {
        return timeStepDuration;
    }
    
    public void increaseScorePlayer1()
    {
        scorePlayer1 += 1;
    }
    
    public int getScorePlayer1()
    {
        return scorePlayer1;
    }
    
    public void increaseScorePlayer2()
    {
        scorePlayer2 += 1;
    }
    
    public int getScorePlayer2()
    {
        return scorePlayer2;
    }
    
    public void started()
    {
        super.started();
        lastFrameTimeMS = System.currentTimeMillis();
    }
    
    public void transitionToGameOver()
    {
        List<Ball> ballList = getObjects(Ball.class);
        if (ballList.size() == 0 )
        {
           transitionToWorld(new Ending(scorePlayer1, scorePlayer2));
        } 
    }
}
