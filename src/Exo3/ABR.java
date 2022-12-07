package Exo3;

public class ABR {
    private Integer value = null;
    private ABR left;
    private ABR right;
    public void add(int i) {

        if(value == null) {
            value = Integer.valueOf(i);
        }
        else if(i < value) {
            if (left == null) left = new ABR();
            left.add(i);
        }
        else if(i > value) {
            if (right == null) right = new ABR();
            right.add(i);
        }
        //on ne fait rien si il y a egalite
    }
    public void inWalk() {
        if (left != null) left.inWalk();
        if (value != null) System.out.print(value + "\t");
        if (right != null) right.inWalk();
    }
    public int max() {
        if (value == null) {
            return Integer.MIN_VALUE;
        }
        if (right == null) {
            return value;
        }
        return right.max();
    }
    public boolean contains(int i) {
        if(value == null) {
            return false;
        }
        else if(i < value) {
            if (left == null) return false;
            return left.contains(i);
        }
        else if(i > value) {
            if (right == null) return false;
            return right.contains(i);
        }
        //else i == value
        return true;
    }

}


/* SOLUTION :
On n'est pas obligés d'utiliser des int, on peut le faire avec n'importe
quel autre type (du moment qu'il est comparable)
On aurait pu mettre float par exemple (MAIS PAS CHAR)
 */
