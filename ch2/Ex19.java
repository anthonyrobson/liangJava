public class Ex19 {
    public static void main(String[] args) {
        int asciiCode = (int)System.currentTimeMillis() % 26 + 65;
        System.out.println("Random uppercase character: " + (char)asciiCode);
    }
}

