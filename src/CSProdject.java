public class CSProdject extends World {

    public int red;
    public int blue;
    public int green;

    public void go() {

        plane.loadBackGround("TTGcs.jpeg");          //*** new method to load a diffrent JPG
        System.out.println("This will be printed to the  window. ");
        plane.teleport(0, 0);
        plane.showBackGround();
        System.out.println(plane.howMuchRed());

        for (int row = 1; row < 900; row++) {
            for (int col = 1; col < 900; col++) {
                plane.teleport(col, row);
            }
        }

        red = plane.howMuchRed();
        green = plane.howMuchGreen();
        blue = plane.howMuchBlue();

        if ((red >= 237 && green >= 237 && blue >= 237)) //&&green<240 && blue< 100)
        {
            plane.setPixelColor(255, 220, 220);
        }

        for (int row = 201; row < 401; row++) {
            for (int col = 113; col < 313; col++) {

                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                if ((red >= 40 && green >= 45 && blue >= 130) && (red < 50 && green < 55 && blue < 145)) {
                    plane.setPixelColor(255, 242, 0); //ravens hood
                }
                if ((red >= 50 && green >= 0 && blue >= 0) && (red < 140 && green < 40 && blue < 50)) {
                    plane.setPixelColor(144, 238, 144); //ravens gem
                }

            }
        }
        for (int row = 0; row < 1000; row++) {
            for (int col = 0; col < 1000; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

//                if ((red >= 230 && green >= 230 && blue blue>= 230)) {
                if ((red == 254 && green == 254 && blue == 254)) {

                    System.out.println(25);
//                    plane.setPixelColor(255, 242, 0);
                    // plane.teleport(row, col);
                    mysquare();

                }

            }
        }
        for (int row = 0; row < 1000; row++) {
            for (int col = 0; col < 1000; col++) {

            }

            public void mysquare () {
                plane.pausetime = 0;
                plane.startingAngle(90);
                plane.isTrail = true;
                plane.trailWidth = 1;
                plane.setColor((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
                plane.move(1);
//        plane.turn(90);
//        plane.move(50);
//        plane.turn(90);
//        plane.move(50);
//        plane.turn(90);
//        plane.move(50);
            }
        }
    }
}






