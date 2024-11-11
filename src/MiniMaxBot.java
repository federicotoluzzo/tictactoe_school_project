import enums.CellType;

public class MiniMaxBot{
    private GameManager gm;
    private CellType type;

    public MiniMaxBot(GameManager gm){
        this.gm = gm;
    }

    public void bestMove() {
        double bestScore = Double.NEGATIVE_INFINITY;
        int move = 1;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(gm.)
            }
        }

        for (int i = 0; i < COLUMNS; i++) {
            // La colonna è piena?
            if (board[0][i].getLabel() == Token.emptyToken) {
                addToken(i);
                double score = minimax(0, false);
                removeLastToken(i);
                if (score > bestScore) {
                    bestScore = score;
                    move = i;
                }
            }
        }
        addToken(move);
    }

    public double minimax(int depth, boolean isMaximizing){
        double bestScore;
        char winner = hasWon();
        switch(winner){
            case Token.darkToken  -> {
                return -10;
            }
            case Token.lightToken  -> {
                return 10;
            }
            case '=' -> {
                return 0; //patta
            }
        }
        if(isMaximizing){
            bestScore = Double.NEGATIVE_INFINITY; // mettiamo il minimo punteggio possibile in modo da cercare il punteggio maggiore
            for (int i = 0; i < COLUMNS; i++) { // controlliamo ogni colonna
                if(board[0][i].getLabel() == Token.emptyToken){ //se non è piena
                    addToken(i);
                    double score = minimax(depth + 1, false);
                    removeLastToken(i);
                    bestScore = Math.max(score, bestScore);
                }
            }
        }else{
            bestScore = Double.POSITIVE_INFINITY; // mettiamo il massimo punteggio possibile in modo da cercare il punteggio minore
            for (int i = 0; i < COLUMNS; i++) { // controlliamo ogni colonna
                if(board[0][i].getLabel() == Token.emptyToken){ //se non è piena
                    addToken(i);
                    double score = minimax(depth + 1, true);
                    removeLastToken(i);
                    bestScore = Math.min(score, bestScore);
                }
            }
        }
        return bestScore;
    }
}
