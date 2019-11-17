package com.swqsv.main;


import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Lin_YongLiang
 */
public class RandomPassword {

    /**
     * 生成的密码
     */
    private static StringBuilder password = new StringBuilder();

    public static void main(String[] args) {
        //密码的长度
        int passwordLength;
        //初始化数字英文和符号,可以根据需要添加
        String num = "0123456789";
        String english = "qwertyuiopasdfghjklzxcvbnm";
        String englishBig = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String symbol = "!@#$%^&*_+-{}<>.*";
        String stringSum = num + english + englishBig + symbol;
        int length = stringSum.length();
        //定义密码长度,写死8,可以根据需要填写
        passwordLength = 8;
        for (int i = 0; i < passwordLength; i++) {
            Random random = new Random();
            int a = random.nextInt(length + 1);
            char one = stringSum.charAt(a);
            password.append(one);
        }
        System.out.print(password + "  ");
    }
}
