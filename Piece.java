import java.util.Arrays;
import java.util.String;

public class Piece {
    public int posX;
    public int posY;
    private String name;
    public boolean isWhite;
    public int moveX=0;
    public int moveY=0;

    Piece(int posX,int posY,boolean isWhite){
        this.posX=posX;
        this.posY=posY;
        this.isWhite=isWhite;
        if(posY==2){
            this.name="Pawn";
            this.moveX=0;
            this.moveY=1;
        }else if (posY==7){
            this.name="Pawn";
            this.moveX=0;
            this.moveY=-1;
        }else{
            switch (posX){
                case 1
                    this.name="Tower";
                    break;
                case 2
                    this.name="Horse";
                    break;
                case 3
                    this.name="Fool";
                    break;
                case 4
                    if (isWhite){
                        this.name="Queen";
                    }else {
                        this.name="King";
                    }
                    break;
                case 5
                    if (!isWhite){
                        this.name="Queen";
                    }else {
                        this.name="King";
                    }
                    break;
                case 6
                    this.name="Fool";
                    break;
                case 7
                    this.name="Horse";
                    break;
                case 8
                    this.name="Tower";
                    break;
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}