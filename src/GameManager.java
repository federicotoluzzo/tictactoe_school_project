import enums.GameDifficulty;

public class GameManager {
    private GameFrame gf;
    public static void main(String[] args) {
        GameManager gm = new GameManager();
        gm.gf = new GameFrame(gm);
        gm.getFrame();
        gm.getFrame().pack();
    }
    public void startLocalGame(GameDifficulty difficulty){

    }
    public void startLANGame(String opponentIP){

    }

    public GameFrame getFrame() {
        return gf;
    }

    public void setFrame(GameFrame gf) {
        this.gf = gf;
    }
}
