package Exo3;

public class Box {
    //CHG pour coin en haut a gauche
    // CBD pour coin en bas a droite
    private Pixel pixelHG;
    private Pixel pixelBD;
    private static int nbBox;
    private int idBox;

    public Box() {
        pixelHG = new Pixel(0,0);
        pixelBD = new Pixel(0,0);
        idBox = ++nbBox;

    }

    public Box(int absHG, int ordHG, int absBD, int ordBD) {
        pixelHG = new Pixel(absHG,ordHG);
        pixelBD = new Pixel(absBD,ordBD);
        idBox = ++nbBox;

    }


    public String toString() {
        return "[Box id="+ getId() + "]" + pixelHG.toString()
                +  " -- " + pixelBD.toString();
    }

    public int getId() {
        return this.idBox;
    }

    /*
    void translate(int vx, int vy) {
        this.absBD+=vx;
        this.absHG+=vx;
        this.ordBD+=vy;
        this.ordHG+=vy;
    }
    */

    public Pixel getCoinHG() {
        return pixelHG;
    }

    public Pixel getCoinBD() {
        return pixelBD;
    }


    //Je fais le choix de ne pas considerer id dans le test @Override
    /*public boolean equals(Object o) {
        if(o instanceof Box){
            Box b = (Box) o;
            if((b.pixelBD.getAbs() == pixelBD.getAbs()) &&
                    (b.pBD.getOrd() == pBD.getOrd()) &&
                    (b.pHG.getAbs() == pHG.getAbs()) &&
                    (b.pHG.getOrd() == pHG.getOrd())){
            } }
    }
return false;

     */

}
