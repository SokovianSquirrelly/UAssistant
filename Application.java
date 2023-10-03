import javax.swing.*;

public class Application extends JFrame {
    private JPanel homePanel;
    private JButton manageClientsButton;
    private JButton drugTestingButton;

    public Application() {
        add(homePanel);

        setTitle("UAssistant");
        setSize(1200, 800);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Application();
    }
}
