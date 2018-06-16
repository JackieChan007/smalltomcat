package com.github.smalltomcat;

public abstract class MyServlet {
    public abstract void doGet(MyRquest rquest,MyResponse response);
    public abstract void doPost(MyRquest request,MyResponse response);
    public void service(MyRquest request,MyResponse response)throws NoSuchMethodException{
        if(request.getMethod().equalsIgnoreCase("POST")){
            doPost(request,response);
        }else if(request.getMethod().equalsIgnoreCase("GET")){
            doGet(request,response);
        }else{
            throw new NoSuchMethodException("not support");
        }
    }

}
