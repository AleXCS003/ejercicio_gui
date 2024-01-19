import javax.swing.*;

public class Mainn {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame=new info();
                frame.setSize(400,400);
                frame.setVisible(true);
            }
        });
    }
}
