public class ellipsis extends figure implements Print{

    private int x1,y1;
    private int height,length;

    public ellipsis(int x1, int y1, int height, int length) {
        this.x1 = x1;
        this.y1 = y1;
        this.height = height;
        this.length = length;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }
    public void print() {
        System.out.println("Ellipsis(" + getX1()+","+getY1()+","+getHeight()+","+getLength()+")");
    }
}
