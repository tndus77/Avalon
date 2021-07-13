package com.example.sjapp;

import java.net.URISyntaxException;

import io.socket.client.IO;
import io.socket.client.Socket;

public class SocketHandler {
    private static Socket mSocket;


    public static synchronized void setSocket(String uri){
        try{
            mSocket = IO.socket(uri);
        }catch (URISyntaxException e){
        }
    }

    public static synchronized Socket getSocket(){
        return mSocket;
    }

}
