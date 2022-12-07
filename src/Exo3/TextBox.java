package Exo3;

public class TextBox extends Box {
    private String text;

    public TextBox(){
        super();
        this.text = null;
    }

    public TextBox(int absHG, int ordHG, int absBD, int ordBD, String text) {
        super(absHG, ordHG, absBD, ordBD);
        this.text = text;
    }

    @Override
    public String toString() {
        return super.toString() + "| Text : " + text;
    }


    @Override
    public boolean equals(Object o){
        if (o instanceof TextBox){
            TextBox t = (TextBox) o;
            if (super.equals(t) && text.equals(t.text)){
                return true;
            }
        }
        return false;
    }
}
