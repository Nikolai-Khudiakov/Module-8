import java.io.File;

class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Asus\\Desktop\\test\\");
        File[] files = file.listFiles();
        for(File t: files) {
            t.delete();
        }
        file.delete();
    }
}