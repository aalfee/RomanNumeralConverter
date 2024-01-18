import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RomanNumeralGUI extends JFrame {

    public RomanNumeralGUI() {
        super("Roman Numeral Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 2));

        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] numerals = line.split(",");
                for (String numeral : numerals) {
                    int arabic = RomanNumeralConverter.convertToInteger(numeral.trim());
                    JLabel label1 = new JLabel(numeral.trim());
                    JLabel label2 = new JLabel(Integer.toString(arabic));
                    add(label1);
                    add(label2);
                }
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading input file");
        }

        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void add(JLabel label1, JLabel label2) {
        super.add(label1);
        super.add(label2);
    }
}

