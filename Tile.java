import java.util.Scanner;

class Floor{
    float length;
    float width;
    Floor(float l,float w){
        length = l;
        width = w;
    }
    void totalTiles(Tile t){
        float sarea = t.squarearea();
        float farea = length*width;
        float tiles = farea/sarea;
        System.out.println("no of tiles requires:\t"+tiles);


    }
}


public class Tile {
    float edgelen;
    float area;
    Tile(float e){
        this.edgelen = e;
        this.area = edgelen*edgelen;
    }
    float squarearea()
    {
        return area;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the tile edge length");
        float edge = sc.nextInt();
        System.out.println("Enter the floor lenght and width");
        float length = sc.nextFloat();
        float width = sc.nextFloat();
        Tile t = new Tile(edge);
        Floor f = new Floor(length,width);
        f.totalTiles(t);


    }
}

