/**
 * Created by fatima on 02/11/16.
 */
    public class PointNom extends PointA { // il te manque PointA extends Point 

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

    public  void afficheCoord(){ // la on redéfinit afficheCoord() de PointA
        System.out.println(" votre point " +this.nom +"  a commme cordonnée"+ super.affciheCoord());
    }
    //remarque: la méthode afficheCoord() peut etre remplacé par ToString



}
