package Exo3;
import java.util.ArrayList;
import java.util.Comparator;

/*

Differents types de collections :

liste (=sequence d element) : ArrayList ou LinkedList

ArrayList (taille pas fixée : on peut ajouter / supprimer des elements)
Complexité pourrie

ou LinkedList : liste doublement chainee
On connait le premier et le dernier element et un pointeur vers un element

METHODES DES LISTES + LEUR COMPLEXITE :
    - Methode size(n) : donne la taille de la liste à un moment donnée) :O(1) pour les deux types de listes
    - Methode add : ajoute un element à la fin de la liste (par defaut; on peut ajouter un argument à la fonction si on veut le mettre ailleurs) :  O(1) pour les deux types de listes
    - Methode get(i) : permet d'accéder à un élément à un indice : O(1) pour ArrayList, O(n) pour LinkedList
    - Methode remove(i) : permet de supprimer l'élément à la position i : O(n) pour ArrayList ( O(1) pour accéder à l'élément + O(n) pour tout décaler) et O(1)* pour LinkedList (on a juste à modifier le pointeur)
    - Methode remove(objet) : permet de supprimer la premiere occurence de l'objet dans la liste
    - Methode add(Element, i) : permet d'ajouter un element à l indice i : O(n) pour ArrayList ( O(1) pour accéder à l'élélement + O(n) pour tout décaler) et O(1)* pour LinkedList (On modfiei le pointeur)

EXEMPLE :

On suppose qu'on a une liste de Box
for (int i = 0 ; i<list.size() ; i++){
    System.out.println(list.get(i));
}

Complexité : ArrayList : O(n)
             LinkedList : O(n^2)    ( O(n) avec les iterator )


COMMENT PALIER AU PB DE COMPLEXITE DE GET POUR LES LINKED LIST : ITERATOR
Il sauvegarde où on en est dans la liste
Iterator<Box> it = list.iterator();
while (it.hasnext() ) {
    Box b = it.next();
    System.out.println(b);
}


 */
public class ListGI {

    //Dans cette classe on va stocker toutes nos box dans une liste
    private ArrayList<Box> maListe;

    //Constructeur :
    public ListGI(){
        maListe = new ArrayList<Box>();
    }

    //Getter :
    public ArrayList<Box> getMaListe() {
        return maListe;
    }

    public void addBox(int tl_x, int tl_y, int br_x, int br_y){
        Box newBox = new Box(tl_x, tl_y, br_x, br_y);
        maListe.add(newBox);
    }

    // Methode qui affiche les infos de la box
    public void display(int n){
        boolean found = false ; //Ce boolean permet de vérifier que le n-ieme élément appartient bien à la liste

        for(int i = 0 ; i < maListe.size() ; i++){
            if(n == maListe.get(i).getId()){
                System.out.println(maListe.get(i).toString());
                found = true;
            }
        }
        if (found == false){
            System.out.println ("Erreur : l'identifiant correspond à une Box qui n'existe pas");
        }
    }


    // Fonction qui enleve une Box dont l'identifiant est n
    /*
    public void removeBox(int n){
        if (n>maListe.size()){
            System.out.println("Erreur : l'identifiant correspond à une Box qui n'existe pas");
        }
        else{
            maListe.remove(n);
        }
    }

     */
    //CORRECTION :
    public void removeBox(int n) {
        for (int i = 0; i < maListe.size(); i++) {
            if (n == maListe.get(i).getId()) {
                maListe.remove(i);
            }
        }
    }


    //Fonction qui affiche toutes les Box pa rordre de l'ordonnée du coin en haut à gauche
    //Methode :
    // 1 : faire CompareTo avec les box (en les triant par ordre de l ordonnéee en haut a gauche)
    // 2 : faire CompareTo avec les listes (en les triant par box ??)
    public void listAllTopToBottom(){
        maListe.sort( new Comparator<Box>(){
            public int compare(Box b1, Box b2){ //ici on défini comment on va comparer les deux box
                Pixel p1 = b1.getCoinHG(), p2 = b2.getCoinHG();
                return(p1.getOrd() - p2.getOrd());
            }
        });
        for (Box b : maListe){
            System.out.println(b.toString());
        }
    }

    //Fonction qui  affiche toutes les Box par ordre des identifiants
    public void listAll(){
        maListe.sort(new Comparator<Box>() {
            @Override
            public int compare(Box b1, Box b2) {
                return (b1.getId() - b2.getId());
            }
        });
        for (Box b : maListe){
            System.out.println(b.toString());
        }
    }




}
