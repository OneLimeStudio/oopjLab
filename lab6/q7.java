
abstract class FileSystem{
    static  int totalSize = 0;
    abstract  int getSize();
}

class File extends  FileSystem {
    int size;
    public File(int size){
        this.size = size;
        super.totalSize += size;
    }
    int getSize(){
        return this.size;
    }
}
class Directory extends  FileSystem{
    int getSize(){
        return  super.totalSize;
    }
}
public class q7 {
    public static void main(String[] args) {
        Directory d1 = new Directory();
        File f1 = new File(10);
        File f2 = new File(4);
        System.out.println("The File Size : " + f1.getSize());
        System.out.println("The File Size : " + f2.getSize());
        System.out.println("The Dir Size : " + d1.getSize());
    }
    
}
