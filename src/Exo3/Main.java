package Exo3;
import java.util.ArrayList;
/*
LISTES EN JAVA
Indice commence à 1 !!!!
 */

public class Main {

    public static void main(String[] args) {

        // Test avec les listes :

        ListGI liste = new ListGI();
        liste.addBox(15,16,17,17);
        liste.addBox(3,98,34,21);
        liste.addBox(13,15,77,45);

        System.out.println(liste.getMaListe() + "\n");

        System.out.println("Je commence le display");
        liste.display(1);
        liste.display(0); //Test pour vérifier que ça affiche bien un message d'erreur

        System.out.println("Suppression (remove) du premier element de la liste");
        liste.removeBox(1);
        System.out.println("Suppression effectuée. On obtient la liste modifiée \n" + liste.getMaListe());

        //Question removeBox : Est ce que c'est normal que l'id est pas modifié quand j'enlève une Box


        // Test avec les HashMap:

        MapGI m = new MapGI();

        //Ceci est une modification pour GitHub
        //Ceci est un autre commentaire inutile
        //Troisieme fois
    }
}