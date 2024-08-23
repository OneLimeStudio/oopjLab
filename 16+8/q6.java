class Rectangle{
    int length,width;
    Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    int area(){
        return  this.length*this.width;
    }
    
}
class  q6{
    public static void main(String[] args) {
        Rectangle newRect = new Rectangle();
        System.out.println("The area is " + newRect.area());    
    }

}