import enums.GameDifficulty;

import javax.swing.*;
import java.awt.*;

public class GameMenu extends JPanel {
    private JTextField opponentIP;
    private ButtonGroup gamemode;
    private JRadioButton bot;
    private JRadioButton lan;
    private JComboBox<String> difficulty;
    private JButton startGame = new JButton("Start");

    private GameManager gm;

    public GameMenu(GameManager gm) {
        this.gm = gm;

        setLayout(new FlowLayout(FlowLayout.CENTER));
        setPreferredSize(new Dimension(350, 75));

        gamemode = new ButtonGroup();
        bot = new JRadioButton("Bot");
        lan = new JRadioButton("Lan");
        gamemode.add(bot);
        gamemode.add(lan);

        opponentIP = new JTextField("192.168.1.");
        opponentIP.setColumns(10);
        difficulty = new JComboBox<>();
        difficulty.addItem("Easy");
        difficulty.addItem("Medium");
        difficulty.addItem("Hard");
        difficulty.addItem("Unbeatable");
        difficulty.setSelectedIndex(2);

        opponentIP.setVisible(false);
        difficulty.setVisible(false);

        bot.addActionListener(_ -> {
            opponentIP.setVisible(false);
            difficulty.setVisible(true);

            gm.getFrame().pack();
        });

        lan.addActionListener(_ -> {
            opponentIP.setVisible(true);
            difficulty.setVisible(false);

            gm.getFrame().pack();
        });

        startGame.addActionListener(_ -> {
            if(bot.isSelected()){
                if(difficulty.getSelectedIndex() >= 0){

                }
                gm.startLocalGame(switch (difficulty.getSelectedIndex()) {
                    case 0 -> GameDifficulty.EASY;
                    case 1 -> GameDifficulty.MEDIUM;
                    case 2 -> GameDifficulty.HARD;
                    case 3 -> GameDifficulty.UNBEATABLE;
                    default -> throw new IllegalStateException("Unexpected value: " + difficulty.getSelectedIndex());
                });
            }else if(lan.isSelected()){

                gm.startLANGame("placeholder");
            }else{
                JFrame f = new JFrame("Wait!");
                JButton b = new JButton("Close");
                b.addActionListener(_ -> f.setVisible(false));
                f.add(new JLabel("You need to select an option before starting the game!"));
                f.setVisible(true);
            }
        });

        add(difficulty);
        add(startGame);
        add(bot);
        add(lan);
        add(opponentIP);
        add(difficulty);
    }
}
