package Main;

import java.awt.*;

public class MapGenerator {
    public int map[][];
    public int brickWidth;
    public int brickHeight;
    public MapGenerator(int row, int col) {
        map = new int[row][col];
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[0].length; j++) {
                map[i][j] = 1;
            }
        }
        brickWidth = 540/col;
        brickHeight = 150/row;
    }
    public void draw(Graphics2D g) {
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[0].length; j++) {

            }
        }
    }
}
