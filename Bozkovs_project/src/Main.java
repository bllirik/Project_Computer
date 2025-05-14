import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.
//Execute"/> icon in the gutter.
public class Main extends JFrame {



    private JPanel panelMain;
    private JComboBox<String> comboBox;
    private JButton nextButton;
    private JButton exitButton;





//}
private int step = 1;
    private String selectedType;

    public Main() {
        setTitle("Computer Shop");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panelMain = new JPanel();
        panelMain.setLayout(new FlowLayout());

        comboBox = new JComboBox<>();
        comboBox.addItem("PC");
        comboBox.addItem("Laptop");
        comboBox.addItem("Tablet");

        nextButton = new JButton("Next step");
        exitButton = new JButton("Exit");

        panelMain.add(comboBox);
        panelMain.add(nextButton);
        panelMain.add(exitButton);

        add(panelMain);


        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (step == 1) {
                    selectedType = (String) comboBox.getSelectedItem();
                    showSecondComboBox();
                    step++;
                } else if (step == 2) {
                    showFinalMessage();
                }
            }
        });


        exitButton.addActionListener(e -> System.exit(0));

        setVisible(true);
    }

    private void showSecondComboBox() {
        panelMain.remove(comboBox);

        comboBox = new JComboBox<>();

        switch (selectedType) {
            case "PC":
                comboBox.addItem("Capital, CPU: i9, GPU: RTX 4090, RAM: 64GB, Price:  $3499.99");
                comboBox.addItem("Intop, CPU: i7, GPU: RTX 4060, RAM: 32GB, Price: $1449.99");
                comboBox.addItem("DELL, CPU: i5, GPU: RTX 3050, RAM: 32GB, Price: $799.99");
                break;
            case "Laptop":
                comboBox.addItem("Asus, CPU: i9, GPU: RTX 4080, RAM: 48GB, Price: $3299.99");
                comboBox.addItem("Gigabyte, CPU: i7, GPU: RTX 4060Ti, RAM: 32GB, Price: $1399.99");
                comboBox.addItem("DELL, CPU: i5, GPU: RTX 2070, RAM: 16GB, Price: $849.99");
                break;
            case "Tablet":
                comboBox.addItem("Apple, CPU: M4, GPU: iebūvēta, RAM: 8GB, Price: $1479.99, 0.446kg");
                comboBox.addItem("Samsung, CPU: Snapdragon 8, GPU: iebūvēta, RAM: 8GB, Price: $1148.99, 0.572kg");
                comboBox.addItem("Xiaomi, CPU: Snapdragon 8s, GPU: iebūvēta, RAM: 8GB, Price: $599.99, 0.5kg");
                break;
        }

        panelMain.add(comboBox, 0); // Добавим в начало
        panelMain.revalidate();
        panelMain.repaint();
    }

    private void showFinalMessage() {
        JFrame thankYouFrame = new JFrame("Thank you");
        thankYouFrame.setSize(400, 100);
        thankYouFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        thankYouFrame.setLocationRelativeTo(null);

        JLabel thankYouLabel = new JLabel("Thank you for choosing our shop for buying one of our products.");
        thankYouLabel.setHorizontalAlignment(SwingConstants.CENTER);

        thankYouFrame.add(thankYouLabel);
        thankYouFrame.setVisible(true);


        dispose();
    }


    public static void main(String[] args) {

        SwingUtilities.invokeLater(Main::new);
        Computer.intro();
        Computer.choice();



    }
}



