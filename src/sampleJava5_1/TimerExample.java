package sampleJava5_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerExample {
    public static void main(String[] args) {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Tick");
            }
        });

        timer.start(); // タイマー開始

        // 終わらないようにフレームで待機（※コンソールアプリだけでは止まるので）
        JOptionPane.showMessageDialog(null, "タイマー実行中。閉じると終了します。");
    }
}