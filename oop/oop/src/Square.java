public class Square {
    private int a;
    //Constructors
    public Square() {}
    public Square(int a) {
        this.a = a;
    }
    //Method for finding Perimeter
    public int findPerimeter(){
        return this.a*4;
    }
    //Method for finding Area
    public int findArea(){
        return this.a*this.a;
    }
    //Method for finding Diagonal
    public double findDiagonal(){
        return this.a*Math.sqrt(2);
    }
    @Override
    public String toString() {
        return String.format(
                "For side: %s, perimeter: %s, area: %s, diagonal: %.2f.",
                this.a, findPerimeter(), findArea(), findDiagonal()
        );
    }
}
