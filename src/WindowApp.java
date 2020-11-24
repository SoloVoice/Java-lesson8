import javafx.scene.layout.BorderRepeat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowApp extends JFrame {
    String randomText = "Просто рандомный текст";
    public WindowApp() {
        setTitle("Заголовок окна приложения");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 100, 600, 700);
        JButton[] buttons = new JButton[10];
        buttons[0] = new JButton("Кнопка верх");
        buttons[1] = new JButton("Кнопка лево");
        buttons[2] = new JButton("Кнопка право");
        buttons[3] = new JButton("Кнопка 1");
        buttons[4] = new JButton("Кнопка 2");
        buttons[5] = new JButton("Кнопка 3");
        buttons[6] = new JButton("Кнопка 4");
        buttons[7] = new JButton("Выйти");
        JPanel panelGridBottom = new JPanel(new GridLayout(1,5));
        panelGridBottom.add(buttons[3]);
        panelGridBottom.add(buttons[4]);
        panelGridBottom.add(buttons[5]);
        panelGridBottom.add(buttons[6]);
        panelGridBottom.add(buttons[7]);
        buttons[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        JTextField textArea = new JTextField(randomText);
        setLayout(new BorderLayout());
        add(buttons[0], BorderLayout.NORTH);
        add(buttons[1], BorderLayout.WEST);
        add(textArea, BorderLayout.CENTER);
        add(buttons[2], BorderLayout.EAST);
        add(panelGridBottom, BorderLayout.SOUTH);
        setVisible(true);
    }
}
