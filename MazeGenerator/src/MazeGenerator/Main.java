package MazeGenerator;

public class Main {
    public static void main(String[] args) {
        int x = args.length >= 1 ? (Integer.parseInt(args[0])) : 10;
        int y = args.length == 2 ? (Integer.parseInt(args[1])) : 10;
        Display maze = new Display(x, y);
        maze.display();
    }
}
