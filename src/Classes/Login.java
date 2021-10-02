package Classes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class Login extends JFrame {

    private JPanel contentPane;
    private JTextField ShopPassword;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login frame = new Login();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Login() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 486);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Login");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lblNewLabel.setBounds(330, 99, 79, 50);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("User");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_1.setBounds(262, 184, 46, 34);
        contentPane.add(lblNewLabel_1);

        JComboBox ShopUser = new JComboBox();

        ShopUser.setModel(new DefaultComboBoxModel(new String[]{"User"}));
        ShopUser.setBounds(340, 193, 112, 22);
        contentPane.add(ShopUser);

        JLabel ShopPasswordLabel = new JLabel("Password");
        ShopPasswordLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        ShopPasswordLabel.setBounds(242, 255, 88, 34);
        contentPane.add(ShopPasswordLabel);

        ShopPassword = new JTextField();
        ShopPassword.setBounds(340, 265, 112, 20);
        contentPane.add(ShopPassword);
        ShopPassword.setColumns(10);


    }
}