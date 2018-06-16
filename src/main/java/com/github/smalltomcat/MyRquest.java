package com.github.smalltomcat;

import java.io.InputStream;

public class MyRquest {

    private String url;
    private String method;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public String toString() {
        return "MyRquest{" +
                "url='" + url + '\'' +
                ", method='" + method + '\'' +
                '}';
    }

    public MyRquest(InputStream inputStream) throws Exception {
        StringBuilder httpRequest = new StringBuilder();
        byte[] httpRequestByte = new byte[1014];
        int length = 0;
        if ((length = inputStream.read(httpRequestByte)) > 0) {
            httpRequest.append(new String(httpRequestByte, 0, length));
            System.out.println("httpRequest=[" + httpRequest + "]");
            String httpHead = httpRequest.toString().split("\n")[0];
            url = httpHead.split("\\s")[1];
            method = httpHead.split("\\s")[0];

        }

    }

}
