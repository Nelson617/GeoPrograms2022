public class A6_house extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
//       for(int x=0;x<5;x=x+1) {
//           int z = (int) (Math.random()*3)+1;
//           plane.teleport(400,250);
//           if((int) (Math.random()*3)+1 == 1) {
//               mysquare();
//       }
//
//    }
        plane.trailWidth = 5;
        plane.isTrail = true;
        plane.pausetime = 2;
        for(int h = 0; h<5; h++) {
    int Q = (int) (Math.random() * 3) + 1;
    if (Q == 1) {
        big();
    }
    if (Q == 2) {
        house();
    }
    plane.teleport((int)(Math.random()*600), (int)(Math.random()*600));
    if (Q == 3) ;
    {
        equitriangle(20);
    }
}
    }
    public void Row () {
        plane.isTrail = true;
        plane.pausetime = 1;

        plane.teleport(25, 50);
        house();
        plane.teleport(90, 50);
        house();
        plane.teleport(155, 50);
        house();
        plane.teleport(220, 50);
        house();
        plane.teleport(285, 50);
        house();

    }

    public void Rowi () {
        plane.isTrail = true;
        plane.pausetime = 1;

        plane.teleport(50, 320);
        house();
        plane.teleport(180, 320);
        house();
        plane.teleport(310, 320);
        house();
        plane.teleport(440, 320);
        house();
        plane.teleport(570, 320);
        house();
        plane.teleport(55, 460);
        plane.turn(40);
        plane.move(620);

    }

//    public void big() {
//        plane.move(111);
//        plane.turn(90);
//        plane.move(111);
//        plane.turn(90);
//        plane.move(111);
//        plane.turn(90);
//        plane.move(111);
//        plane.turn(90);
//
//
//    }

    public void small(int a, int b) {
        plane.move(a);
        plane.turn(90);
        plane.move(b);
        plane.turn(90);
        plane.move(a);
        plane.turn(90);
        plane.move(b);
        plane.turn(90);


    }


    public void house() {
        plane.isTrail = true;
        plane.trailWidth = 3;
        plane.pausetime = 2;
        plane.setColor((int)(Math.random()*256), (int)(Math.random()*256),(int)(Math.random()*256));

        plane.startingAngle(90);
        mysquare();
        mytriangle();
    }

       public void big() {
            plane.move(111);
            plane.turn(90);
            plane.move(111);
            plane.turn(90);
            plane.move(111);
            plane.turn(90);
            plane.move(111);
            plane.turn(90);
        }

        public void mysquare() {
        plane.pausetime = 0;
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.setColor((int)(Math.random()*255), (int)(Math.random()*255),(int)(Math.random()*255));
        plane.move(50);
        plane.turn(90);
        plane.move(50);
        plane.turn(90);
        plane.move(50);
        plane.turn(90);
        plane.move(50);
    }

    public void mytriangle() {
        plane.turn(0);
        plane.move(-50);
        plane.turn(220);
        plane.move(35);
        plane.turn(280);
        plane.move(30);

    }

    public void square() {
        plane.setColor(200,100,159);
        plane.move(40);
        plane.turn(90);
        plane.move(40);
        plane.turn(90);
        plane.move(40);
        plane.turn(90);
        plane.move(40);
        plane.turn(90);
    }

    public void equitriangle(int b) {
        plane.startingAngle(0);
        plane.move(b);
        plane.turn(120);
        plane.move(b);
        plane.turn(120);
        plane.move(b);

    }

    public void rectangle(int a, int b) {


    }

    public void fillRec(int a, int b) {


    }

    public void tree(int a) {

    }

    public void sun(int a) {
        plane.setColor(255, 255, 0);
        plane.fillCircle(a);
    }

}


/*

Methods:
- fillCircle(int x)
   fillCircle() draws a filled circle with a radius size specified in the parameter.
   plane.fillCircle(10); draws a circle of radius 10 pixels.

- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- setColor(int r, int g, int b)
   setColor() sets the color of the plane's trail.
   plane.setColor(0, 0, 255); sets the color of the plane's trail to blue.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.
   
- turn(int x)
   turn() rotates the plane left by the number of degrees specified in the parameter.
   plane.turn(50); will turn the plane left 50 degrees.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.
   
- int pausetime
   pausetime is used to speed up or slow down the plane. The default value is 5.
   plane.pausetime = 10; slows the plane down.
   
- int trailWidth
   trailWidth controls the width of the trail left by the plane.
   plane.trailWidth = 10; sets the width of the trail to 10.

*/

