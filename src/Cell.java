import enums.CellType;

import java.awt.*;

public class Cell{
    private CellType type;

    private int row;
    private int col;

    private int spacing;

    private int cellSize;

    private int iconSize;

    private final int THICKNESS = 10;

    private final Color X_COLOR = new Color(0xFF8080);
    private final Color O_COLOR = new Color(0x8080FF);
    private final Color BG_COLOR = new Color(0x505050);

    public Cell(int row, int col, int spacing, int cellSize){
         this.row = row;
         this.col = col;
         this.spacing = spacing;
         this.cellSize = cellSize;
         this.iconSize = (int) (cellSize * 0.8);
    }

    public void draw(Graphics g){
        g.setColor();
        g.drawRect(row * cellSize + (row - 1) * spacing, col * cellSize + (col - 1) * spacing, cellSize, cellSize);
        if (type == CellType.O){
            g.setColor(O_COLOR);
            g.fillOval((cellSize - iconSize) / 2, (cellSize - iconSize) / 2, iconSize, iconSize);
            g.fillOval((cellSize - iconSize) / 2 + THICKNESS, (cellSize - iconSize) / 2 + THICKNESS, iconSize - 2 * THICKNESS, iconSize - 2 * THICKNESS);
        } else if (type == CellType.X) {
            g.setColor(X_COLOR);
        }
    }
}
