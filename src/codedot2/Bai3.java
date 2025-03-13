/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codedot2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai3 {

    public static void main(String[] args) {
        // Tạo frame chính
        JFrame frame = new JFrame("Kiểm tra số đối xứng");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLayout(new GridLayout(3, 2, 5, 5)); // 3 hàng, 2 cột, khoảng cách 5px

        // Thành phần nhập số
        JLabel labelNumber = new JLabel("Nhập số:");
        JTextField fieldNumber = new JTextField();

        // Nút kiểm tra
        JButton btnCheck = new JButton("Kiểm tra");

        // Nhãn hiển thị kết quả
        JLabel resultLabel = new JLabel("Kết quả: ");

        // Xử lý sự kiện khi nhấn nút "Kiểm tra"
        btnCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = fieldNumber.getText();
                if (isPalindrome(number)) {
                    resultLabel.setText("Kết quả: Số đối xứng");
                } else {
                    resultLabel.setText("Kết quả: Không phải số đối xứng");
                }
            }
        });

        // Thêm các thành phần vào frame
        frame.add(labelNumber);
        frame.add(fieldNumber);
        frame.add(btnCheck);
        frame.add(new JLabel()); // Chừa khoảng trống
        frame.add(resultLabel);

        // Hiển thị giao diện
        frame.setVisible(true);
    }

    // Hàm kiểm tra số đối xứng
    private static boolean isPalindrome(String number) {
        int left = 0;
        int right = number.length() - 1;
        while (left < right) {
            if (number.charAt(left) != number.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}