package codedot2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai5 {

    public static void main(String[] args) {
        // Tạo frame chính
        JFrame frame = new JFrame("Tìm Ước Số Chung Lớn Nhất");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLayout(new GridLayout(3, 2, 5, 5)); // 3 hàng, 2 cột, khoảng cách 5px

        // Thành phần nhập số
        JLabel labelA = new JLabel("Nhập số thứ nhất:");
        JTextField fieldA = new JTextField();
        JLabel labelB = new JLabel("Nhập số thứ hai:");
        JTextField fieldB = new JTextField();

        // Nút kiểm tra
        JButton btnFindGCD = new JButton("Tìm ƯSCLN");

        // Nhãn hiển thị kết quả
        JLabel resultLabel = new JLabel("Kết quả: ");

        // Xử lý sự kiện khi nhấn nút "Tìm ƯSCLN"
        btnFindGCD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(fieldA.getText());
                    int b = Integer.parseInt(fieldB.getText());

                    int gcd = findGCD(a, b);
                    resultLabel.setText("Kết quả: ƯSCLN là " + gcd);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Vui lòng nhập số nguyên hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Thêm các thành phần vào frame
        frame.add(labelA);
        frame.add(fieldA);
        frame.add(labelB);
        frame.add(fieldB);
        frame.add(btnFindGCD);
        frame.add(resultLabel);

        // Hiển thị giao diện
        frame.setVisible(true);
    }

    // Hàm tìm ƯSCLN dùng thuật toán Euclid
    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}