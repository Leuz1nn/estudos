package TextFieldFrame;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
public class Textfieldframe extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPasswordField passwordField;
    public Textfieldframe(){

        super("testing JTextField and JPasswordField");
        setLayout(new FlowLayout());

        textField1 = new JTextField(10);
        add(textField1);

        textField2 = new JTextField(10);
        add(textField2);

        textField3 = new JTextField("Uneditable text field ", 21);
        textField3.setEditable(false);
        add(textField3);

        passwordField = new JPasswordField(10);
        add(passwordField);

        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }
       

        private class TextFieldHandler implements ActionListener{
            public void actionPerformed(ActionEvent event){

                String string = "";

                if (event.getSource()==textField1)
                string = String.format("Nome:%s", event.getActionCommand());

                else if (event.getSource()==textField2)
                string = String.format("Sobrenome:%s", event.getActionCommand());

                else if (event.getSource()==textField3)
                string = String.format("textfield3:%s", event.getActionCommand());

                else if (event.getSource()==passwordField)
                string = String.format("Senha:%s", event.getActionCommand());

                JOptionPane.showMessageDialog(null, string);

            }
        }   
}
