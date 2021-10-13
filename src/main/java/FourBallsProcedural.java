import processing.core.PApplet;

public class FourBallsProcedural extends PApplet {

    int b1 = 0;
    int b2 = 0;
    int b3 = 0;
    int b4 = 0;

    public static void main(String[] args) {

        PApplet.main("FourBallsProcedural", args);


    }

    @Override
    public void settings() {
        int width = 640;
        int height = 480;
        size(width, height);
    }

    @Override
    public void draw() {
        ellipse(b1, 1*height/5, 10, 10);
        b1++;
        ellipse(b2, 2*height/5, 10, 10);
        b2+=2;
        ellipse(b3, 3*height/5, 10, 10);
        b3+=3;
        ellipse(b4, 4*height/5, 10, 10);
        b4+=4;
    }
}
