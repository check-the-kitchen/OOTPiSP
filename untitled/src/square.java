public class square extends figure implements Print{
    private int x,y;
    private int sideLength;


    public square(int x, int y, int sideLength) {
        this.x = x;
        this.y = y;
        this.sideLength = sideLength;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void print(){
        System.out.println("Square(" + getX()+","+getY()+")"+", Side length:"+getSideLength());
    }
}
