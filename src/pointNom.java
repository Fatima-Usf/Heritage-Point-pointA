/**
 * Created by fatima on 05/11/16.
 */
public class pointNom extends  PointA {
    private String nom;



    public pointNom(double x, double y, String nom){

        super(x,y);
        this.nom=nom;

    }

    public pointNom(double x, String nom){

        super(x);
    this.nom=nom;
    }

    public String getNom() {
        return nom;
    }


    public  void afficheCoord(){
        System.out.println(" votre Point"+this.nom+ " a comme cordonnée ( "+ super.getX()+ " , "+ super.getY()+ ")");
    }
    //remarque: la méthode afficheCoord() peut etre remplacé par ToStrin


}
