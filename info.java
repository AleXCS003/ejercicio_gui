import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class info extends JFrame  {

    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton unirButton;
    private JButton suma;
    private JButton button3;
    private JButton limpiarButton;
    private JTextField resultado;

    public info (){
        super("OPERACIONES");
        setContentPane(panel1);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);

            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
            }
        });
        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double valor = Integer.parseInt(textField1.getText());
                    double valor2 = Integer.parseInt(textField2.getText());
                    double resulta = valor + valor2;
                    resultado.setText(Double.toString(resulta));
                }catch(Exception exception){
                    resultado.setText("error");
                }
            }
        });
        unirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null,"nombre completo"+textField1.getText()+""+textField2.getText());

            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"hola"+textField1.getText()+""+textField2.getText());

            }
        });
    }
}
