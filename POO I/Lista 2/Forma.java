package Lista_2;

public abstract class Forma {
    int x;
    int y;
    int z;

    Forma(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    double area(){
        return 0.0d;
    }

    double perimetro(){
        return 0.0d;
    }
}
