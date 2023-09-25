import javax.swing.*;

public class Application extends JFrame {
    private JPanel homePanel;

    public Application() {
        add(homePanel);

        setTitle("UAssistant");
        setSize(650, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        Application application = new Application();
    }
}
