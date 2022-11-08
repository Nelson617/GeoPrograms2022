public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.pausetime = 0;
        plane.isTrail=true;
        for(int x=0;x<20;x=x+1) {

            for(int y=0;y<20;y=y+1) {


                int a = (int) (Math.random() * 10) + 1;
                System.out.println(a);
                plane.teleport(90 * y, x * 30);
//                plane.teleport(25 + (100 * y), 50+(75*x));
                plane.setColor(10*x, 12*y, 150);
//                plane.setColor(200,x * 25,y * 10);
//                plane.setColor(75 + (5 * y), 75 + (10 * y), 75 + (10 * y));
                house(10);
            }
        }
        }

    private void house(int x) {
        plane.isTrail = true;
        plane.trailWidth = 3;
        plane.pausetime = 0;
//        plane.setColor((int)(Math.random()*256), (int)(Math.random()*256),(int)(Math.random()*256));

        plane.startingAngle(90);
        mysquare(x);
        mytriangle(x);
    }


    private void mytriangle(int x) {
        plane.turn(0);
        plane.move(x);
        plane.turn(220);
        plane.move(x);
        plane.turn(280);
        plane.move(x);
    }

    private void mysquare(int x) {
        plane.pausetime = 0;
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 5;
//        plane.setColor((int)(Math.random()*255), (int)(Math.random()*255),(int)(Math.random()*255));
        plane.move(x);
        plane.turn(90);
        plane.move(x);
        plane.turn(90);
        plane.move(x);
        plane.turn(90);
        plane.move(x);
    }
}
//    public void go() {
//        plane.isTrail = true;
//        plane.pausetime = 1;
//        for (int x = 0; x < 10; x = x + 1) {
//
//            int a = (int) (Math.random() * 10) + 1;
//            System.out.println(a);
//            plane.pausetime=0;
//            plane.teleport(100 * x, 100);
//            plane.setColor((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
//            plane.house(25 * (x + 1));
//            //plane.isTrail = false;
//            //plane.move(100);

