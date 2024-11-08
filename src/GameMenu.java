import javax.swing.*;

public class GameMenu extends JPanel {
    private JTextField opponentIP;
    private ButtonGroup gamemode;
    private JRadioButton bot;
    private JRadioButton lan;
    private JComboBox<String> difficulty;
    private JButton startGame = new JButton("Start");

    private boolean isGamemodeBot;

    public GameMenu() {
        gamemode = new ButtonGroup();
        bot = new JRadioButton("Bot");
        lan = new JRadioButton("Lan");
        gamemode.add(bot);
        gamemode.add(lan);

        opponentIP = new JTextField("192.168.1.");
        difficulty = new JComboBox<>();
        difficulty.addItem("Easy");
        difficulty.addItem("Medium");
        difficulty.addItem("Hard");
        difficulty.addItem("Unbeatable");
        difficulty.setSelectedIndex(2);

        bot.addActionListener(e -> {
            isGamemodeBot = true;
        });
        lan.addActionListener(e -> {
            isGamemodeBot = false;
        });

        startGame.addActionListener(e -> {
            if(isGamemodeBot){

            }
        });
    }
}
