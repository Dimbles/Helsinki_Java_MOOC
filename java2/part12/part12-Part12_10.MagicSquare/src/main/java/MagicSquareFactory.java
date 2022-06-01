
import java.util.ArrayList;

public class MagicSquareFactory {

    int size;
    int start;
    int jump;

//    public MagicSquareFactory(int size) {
//
//        //must be an odd numbered square for this to work
//        if (size % 2 == 0) {
//            this.size = size + 1;
//        } else {
//            this.size = size;
//        }
//
//        this.start = 1;
//        this.jump = 1;
//
//    }
    public MagicSquareFactory() {
        this.size = 3;
        this.start = 1;
        this.jump = 1;
    }

    public MagicSquareFactory(int size) {

        //must be an odd numbered square for this to work
        if (size % 2 == 0) {
            this.size = size + 1;
        } else {
            this.size = size;
        }

        this.start = 1;
        this.jump = 1;

    }

    public MagicSquareFactory(int size, int start, int jump) {

        //must be an odd numbered square for this to work
        if (size % 2 == 0) {
            this.size = size + 1;
        } else {
            this.size = size;
        }

        this.start = start;
        this.jump = jump;

    }

    private ArrayList<Integer> createProgression( int size) {

        //creating arithmetic progression for use with the square
        ArrayList<Integer> progression = new ArrayList<>();
        int numValues = size * size;
        for (int i = 0; i < numValues; i++) {
            int value = this.start + (this.jump * i);
            progression.add(value);
        }
        return progression;
    }

    public MagicSquare createMagicSquare(int sizeSquare) {

        if (sizeSquare % 2 == 0) {
            sizeSquare = sizeSquare + 1;
        } 

        MagicSquare square = new MagicSquare(sizeSquare);

        //creating progression
        ArrayList<Integer> progression = this.createProgression(sizeSquare);
        System.out.println("progression: " + progression);

        // implement the creation of a magic square with the Siamese method algorithm here
        int x = (sizeSquare / 2);
        int y = 0;

        for (int i = 0; i < sizeSquare * sizeSquare; i++) {

            //saving previous values of x and y
            int xTemp = x - 1;
            int yTemp = y + 1;

            if (x >= sizeSquare || x < 0) {
                x = 0;
            }
            if (y >= sizeSquare || y < 0) {
                y = sizeSquare - 1;
            }
            if (square.readValue(x, y) != 0) {
                x = xTemp;
                y = yTemp + 1;
            }

            square.placeValue(x, y, progression.get(i));

            //System.out.println("x: " + x);
            //System.out.println("y: " + y);
            x += 1;
            y -= 1;

        }

        return square;

    }
    
    public MagicSquare createMagicSquare() {

        if (size % 2 == 0) {
            size = size + 1;
        } 

        MagicSquare square = new MagicSquare(size);

        //creating progression
        ArrayList<Integer> progression = this.createProgression(this.size);
        System.out.println("progression: " + progression);

        // implement the creation of a magic square with the Siamese method algorithm here
        int x = (size / 2);
        int y = 0;

        for (int i = 0; i < size * size; i++) {

            //saving previous values of x and y
            int xTemp = x - 1;
            int yTemp = y + 1;

            if (x >= size || x < 0) {
                x = 0;
            }
            if (y >= size || y < 0) {
                y = size - 1;
            }
            if (square.readValue(x, y) != 0) {
                x = xTemp;
                y = yTemp + 1;
            }

            square.placeValue(x, y, progression.get(i));

            //System.out.println("x: " + x);
            //System.out.println("y: " + y);
            x += 1;
            y -= 1;

        }

        return square;

    }

}
