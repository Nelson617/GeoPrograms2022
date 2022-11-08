

/**
 * Created by chales on 3/3/2018.
 */
public class RunMyProgram {
    public static void main(String[] args) {
        World run;

        run = (new CSProdject());
        run.planeIcon = "plane.png";
        run.pictureFileName="LightningMcqeen.jpeg";
        run.HEIGHT=900;
        run.WIDTH=850;
        run.Refresh();

        //new Thread(run).start();
    }
}
