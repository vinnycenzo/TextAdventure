import java.util.ArrayList;
import java.util.List;
public class MapTile {
    private int x;
    private int y;

    public MapTile(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public List<MapTile> adjacentMoves() {
        List<MapTile> moves = new ArrayList<>();
        // Add moves to the left and right
        moves.add(new MapTile(x - 1, y));
        moves.add(new MapTile(x + 1, y));
        // Add moves up and down
        moves.add(new MapTile(x, y - 1));
        moves.add(new MapTile(x, y + 1));
        return moves;
    }
}