public class rectangle extends figure implements Print{
    private int x,y;
    private int height,length;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }



    public rectangle(int x, int y, int height, int length) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.length = length;

    }


    public void print() {
        System.out.println("Rectangle(" + getX()+","+getY()+","+getHeight()+","+getLength()+")");
    }
}
