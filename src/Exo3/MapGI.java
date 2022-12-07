package Exo3;
import java.util.*;



public class MapGI {
    //Dans cette classe on va stocker toutes nos Box dans une map
    private HashMap<Integer,Box> monMap;

    //Constructeur :
    public MapGI(){
        monMap = new HashMap<Integer,Box>();
    }

    //Getter :
    public HashMap<Integer,Box> getMonMap() {
        return monMap;
    }


    //Methode qui ajoute une Box
    public void addBox(int tl_x, int tl_y, int br_x, int br_y){
        Box newBox = new Box(tl_x, tl_y, br_x, br_y);
        int key = newBox.getId();
        monMap.put(key,newBox);
    }


    //Methode qui affiche les infos d une box dont l'identifiant est passé en paramètre
    public void display(int n) {
        boolean found = false;
        for (int i = 0; i < monMap.size(); i++) {
            if (n == monMap.get(i).getId()) {
                System.out.println(monMap.get(i).toString());
                found = true;
            }
        }
        if (found == false){
            System.out.println ("Erreur : l'identifiant correspond à une Box qui n'existe pas");
        }
    }


    // Methode qui eneleve une Box dont l'identifiant est n
    public void removeBox(int n){
        if (n>monMap.size()){
            System.out.println("Erreur : l'identifiant correspond à une Box qui n'existe pas");
        }
        else{
            monMap.remove(n);
        }
    }


    //Fonction qui affiche toutes les Box par ordre de l'identificateur = la clef
    public void listAll(){
        TreeMap<Integer, Box> sorted = new TreeMap<>(monMap);
        System.out.println("Affichage du map trié par identifiant : \n" + sorted.toString());
    }







}
