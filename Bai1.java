/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codedot2;

/**
 *
 * @author pc
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai1 {

    public static void main(String[] args) {
        // Tạo frame chính
        JFrame frame = new JFrame("Giải phương trình bậc nhất");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(4, 2, 5, 5)); // 4 dòng, 2 cột, khoảng cách 5px

        // Thành phần nhập a và b
        JLabel labelA = new JLabel("Nhập a:");
        JTextField fieldA = new JTextField();
        JLabel labelB = new JLabel("Nhập b:");
        JTextField fieldB = new JTextField();

        // Nút giải
        JButton btnSolve = new JButton("Giải");

        // Nhãn hiển thị kết quả
        JLabel resultLabel = new JLabel("Kết quả: ");

        // Xử lý sự kiện khi nhấn nút "Giải"
        btnSolve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(fieldA.getText());
                    double b = Double.parseDouble(fieldB.getText());

                    if (a == 0) {
                        if (b == 0) {
                            resultLabel.setText("Kết quả: Phương trình có vô số nghiệm");
                        } else {
                            resultLabel.setText("Kết quả: Phương trình vô nghiệm");
                        }
                    } else {
                        double x = -b / a;
                        resultLabel.setText("Kết quả: x = " + x);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Vui lòng nhập số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Thêm các thành phần vào frame
        frame.add(labelA);
        frame.add(fieldA);
        frame.add(labelB);
        frame.add(fieldB);
        frame.add(btnSolve);
        frame.add(new JLabel()); // Chừa khoảng trống
        frame.add(resultLabel);

        // Hiển thị giao diện
        frame.setVisible(true);
    }
}
