public class Table {
    String color = "White";
    int weight = 1000;
    String model;
    String sound = "Styk, styk...";



    public Table(int w, String m, String c) {
        this.model = m;
        if(w < 0) {
            this.weight = 1000;
        } else {
            this.weight = w;
        }
        this.color = c;
    }

    public void knock() {
        System.out.println(sound);
    }

    public void printInformation() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
    }
}
