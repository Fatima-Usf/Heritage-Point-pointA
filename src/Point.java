/**
 * Created by Fatima on 02/11/16.
 */


    public class Point {
    private double x,y;


    public Point (double x, double y){
        this.x= x;
        this.y=y;
    }


    public Point (double x){

        this.x= this.y = x;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void deplace(int dx, int dy){
        //x= x+dx
        x+=dx;
        //y=y+dy
        y+=dy;
    }






}
