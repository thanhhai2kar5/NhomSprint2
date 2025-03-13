package codedot2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai2 {

    public static void main(String[] args) {
        // Tạo frame chính
        JFrame frame = new JFrame("Tìm số lớn nhất của 2 số");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLayout(new GridLayout(3, 2, 5, 5)); // 3 hàng, 2 cột, khoảng cách 5px

        // Thành phần nhập số
        JLabel labelA = new JLabel("Nhập số thứ nhất:");
        JTextField fieldA = new JTextField();
        JLabel labelB = new JLabel("Nhập số thứ hai:");
        JTextField fieldB = new JTextField();

        // Nút tìm số lớn nhất
        JButton btnFindMax = new JButton("Tìm số lớn nhất");

        // Nhãn hiển thị kết quả
        JLabel resultLabel = new JLabel("Kết quả: ");

        // Xử lý sự kiện khi nhấn nút "Tìm số lớn nhất"
        btnFindMax.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(fieldA.getText());
                    double b = Double.parseDouble(fieldB.getText());

                    double max = Math.max(a, b);
                    resultLabel.setText("Kết quả: Số lớn nhất là " + max);
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
        frame.add(btnFindMax);
        frame.add(resultLabel);

        // Hiển thị giao diện
        frame.setVisible(true);
    }
}
