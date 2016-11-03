/**
 * Created by fatima on 02/11/16.
 */
    public class PointA extends Point {

    private String nom;

    public PointA(double x,double y,String nom){

        super(x,y);
        this.nom=nom;
    }

    public PointA(double x,String nom){

        super(x);
        this.nom=nom;
    }

    public String getNom() {
        return nom;
    }

    public  void afficheCoord(){
        System.out.println(" votre point " +this.nom +"  a commme cordonnée ( "+ super.getX()+ " , "+ super.getY()+ ")");
    }
    //remarque: la méthode afficheCoord() peut etre remplacé par ToString



}
