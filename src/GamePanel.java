import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    private Cell[][] cells;

    public GamePanel() {
        setBackground(new Color(0x656565));
        cells = new Cell[3][3];
    }

    private void addCells(){
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j] = new Cell(i, j, 20, 100);
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j].draw(g);
            }
        }
    }
}
