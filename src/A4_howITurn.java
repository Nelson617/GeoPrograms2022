

public class A4_howITurn extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.pausetime = 1;
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(200, 0, 100);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(220);
        plane.move(70);
        plane.turn(280);
        plane.move(60);





    }


}
