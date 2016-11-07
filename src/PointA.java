/**
 * Created by fatima on 02/11/16.
 */
    public class PointA extends Point {



    public PointA(double x,double y){

        super(x,y);

    }

    public PointA(double x){

        super(x);

    }



    public  void afficheCoord(){
        System.out.println("  cordonnée ( "+ super.getX()+ " , "+ super.getY()+ ")");
    }
    //remarque: la méthode afficheCoord() peut etre remplacé par ToString



}
