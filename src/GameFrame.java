import javax.swing.*;

public class GameFrame extends JFrame {
    public GameFrame(GameManager gm) {
        setVisible(true);
        add(new GameMenu(gm));
        pack();
    }
}
