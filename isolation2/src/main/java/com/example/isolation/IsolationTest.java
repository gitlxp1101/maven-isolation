package com.example.isolation;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class IsolationTest {

    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            Properties props = new Properties();
            inputStream = IsolationTest.class.getResourceAsStream("/data.properties");
            props.load(inputStream);
            System.out.println(props.getProperty("name"));
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
