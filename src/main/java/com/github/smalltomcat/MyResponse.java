package com.github.smalltomcat;

import java.io.IOException;
import java.io.OutputStream;

public class MyResponse {
    private OutputStream out;
    public MyResponse(OutputStream outputStream){
        this.out =outputStream;
    }
    public void write(String content)throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("HTTP/1.1 200 OK\n")
                .append("Content-type:text/html\n")
                .append("\r\n")
                .append("<html><head><title>hello word</title></head><body>")
                .append(content)
                .append("</body><html>");
        out.write(stringBuffer.toString().getBytes());
        out.close();
    }


}
