public class Entry {
    public static void main(String[] args) {
        Window window = new Window("飞猪");
        Window window1 = new Window("携程");
        Window window2 = new Window("美团");
        window.start();
        window1.start();
        window2.start();
    }
}
