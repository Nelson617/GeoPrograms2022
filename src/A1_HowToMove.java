public class A1_HowToMove extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        System.out.println("This message will be printed to the window below.");
        System.out.println("That window is called the dos window");
        plane.pausetime = 2;
        plane.trailWidth = 15;
        plane.setColor(0, 0, 255);
        plane.isTrail = true;
        plane.turn(0);
        plane.setColor(0, 255, 0);
        plane.turn(0);
        plane.isTrail = true;
        plane.move(100);
        plane.setColor(0, 0, 255);
        plane.turn(0);
        plane.isTrail = true;
        plane.move(110);



    }

}

/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.

*/