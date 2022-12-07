/* public class MYClass<E> {
    E val;
    E[] tab1 ;
    E[] tab2 ;
    public static E shared ;
    public static int nbInst ;

    void f(){
    val = new E();
    tab2 = tab1;
    tab2 = new E[3];
    }
}
*/


/*
ERREURS DU CODE :

1.  'MYClass.this' cannot be referenced from a static context (ligne 5) :
    On n'a pas le droit de déclarer  un objet qui est statique

2.  Type parameter 'E' cannot be instantiated directly (ligne 9) :
    Instanciation d'un objet de type E, d'un tableau de type E

3.  Type parameter 'E' cannot be instantiated directly (ligne 11) :
    Les attributs d'une classe sont partagés par tous les objets de la classe

 */


