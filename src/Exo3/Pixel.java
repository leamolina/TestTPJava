package Exo3;

public class Pixel {

    private int abs;
    private int ord;

    public Pixel() {}

    public Pixel(int abs, int ord){
    this.abs = abs; this.ord = ord;
    }


    public String toString() {
        return "("+abs+", "+ord+")";
    }

    public void translate(int vx, int vy) {
        this.abs+=vx;
        this.ord+=vy;
    }

    //Getters
    public int getAbs() {
        return abs;
    }

    public int getOrd() {
        return ord;
    }


    //Setters :

    public void setAbs(int abs) {
        this.abs = abs;
    }

    public void setOrd(int ord) {
        this.ord = ord;
    }
}
