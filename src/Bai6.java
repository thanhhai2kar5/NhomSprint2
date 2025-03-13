package codedot2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai6 {

    public static void main(String[] args) {
        // Tạo frame chính
        JFrame frame = new JFrame("Sắp xếp 2 số theo thứ tự tăng dần");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLayout(new GridLayout(3, 2, 5, 5)); // 3 hàng, 2 cột, khoảng cách 5px

        // Thành phần nhập số
        JLabel labelA = new JLabel("Nhập số thứ nhất:");
        JTextField fieldA = new JTextField();
        JLabel labelB = new JLabel("Nhập số thứ hai:");
        JTextField fieldB = new JTextField();

        // Nút kiểm tra
        JButton btnSort = new JButton("Sắp xếp");

        // Nhãn hiển thị kết quả
        JLabel resultLabel = new JLabel("Kết quả: ");

        // Xử lý sự kiện khi nhấn nút "Sắp xếp"
        btnSort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(fieldA.getText());
                    double b = Double.parseDouble(fieldB.getText());

                    if (a > b) {
                        resultLabel.setText("Kết quả: " + b + " , " + a);
                    } else {
                        resultLabel.setText("Kết quả: " + a + " , " + b);
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
        frame.add(btnSort);
        frame.add(resultLabel);

        // Hiển thị giao diện
        frame.setVisible(true);
    }
}


