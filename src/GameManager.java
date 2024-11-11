import enums.CellType;
import enums.GameDifficulty;

import javax.swing.*;

public class GameManager {
    private GameFrame gf;

    private Cell[][] board;

    public static void main(String[] args) {
        GameManager gm = new GameManager();
        gm.gf = new GameFrame(gm);
        gm.getFrame();
        gm.getFrame().pack();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
    }
    public void startLocalGame(GameDifficulty difficulty){

    }
    public void startLANGame(String opponentIP){

    }

    public CellType getWinner(){
        if(board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0].getType() != CellType.EMPTY){
            return board[0][0].getType();
        }else if(board[0][2] == board[1][1] && board[0][0] == board[2][0] && board[0][0].getType() != CellType.EMPTY){
            return board[0][0].getType();
        } else {
            for (int i = 0; i < 3; i++) {
                if(board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[0][0].getType() != CellType.EMPTY){
                    return board[i][0].getType();
                } else if (board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][0].getType() != CellType.EMPTY) {
                    return board[0][i].getType();
                }
            }
        }
        return null;
    }

    public GameFrame getFrame() {
        return gf;
    }

    public void setFrame(GameFrame gf) {
        this.gf = gf;
    }
}
