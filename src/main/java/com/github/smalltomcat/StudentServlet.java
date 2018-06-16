package com.github.smalltomcat;

import java.io.IOException;

public class StudentServlet extends MyServlet {
    @Override
    public void doGet(MyRquest rquest, MyResponse response) {
        try {
            response.write("I am a Student");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(MyRquest request, MyResponse response) {
        try {
            response.write("I am a Student");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
