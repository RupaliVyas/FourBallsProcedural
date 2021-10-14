import processing.core.PApplet;

public class FourBallsProcedural extends PApplet {

    int b1 = 0;
    int b2 = 0;
    int b3 = 0;
    int b4 = 0;
    int x = 0;

    public static void main(String[] args) {

        PApplet.main("FourBallsProcedural", args);


    }

    @Override
    public void settings() {
        int width = 640;
        int height = 480;
        size(width, height);
    }

    public void draw(){
        firstBall();
        secondBall();
        thirdBall();
        fourthBall();
    }



    private void firstBall() {
        ellipse(b1, 1*height/5, 10, 10);
        b1++;
    }

    private void secondBall() {
        ellipse(b2, 2*height/5, 10, 10);
        b2+=2;
    }

    private void thirdBall() {
        ellipse(b3, 3*height/5, 10, 10);
        b3+=3;
    }

    private void fourthBall() {
        ellipse(b4, 4*height/5, 10, 10);
        b4+=4;
    }
}
