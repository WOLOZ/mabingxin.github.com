package com.captain.demo.socketThread;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//public class SocketServerDemo {
//	public static void main (String [] args){
//		ServerSocket serverSocket = null; //打开服务器
//		try{
//			serverSocket = new ServerSocket(7070);
//		}catch(IOException e){
//			e.printStackTrace();
//		}
//		if (serverSocket == null){
//			return;
//		}
//		System.out.println("服务器打开完成");
//		while(true){
//			try{
//				System.out.println("服务器等待客户连接");
//				Socket socket = serverSocket.accept();//等待客户连接 阻塞
//				SocketServerThread socketThread = new SocketServerThread(socket);
//				new Thread(socketThread).start();
//				System.out.println("服务器处理客户连接完成");
//			}catch(IOException e){
//				e.printStackTrace();
//			}
//			 
//			}
//	}
//	
//
//}
public class SocketServerDemo {

    public static void main(String[] args) {
    	//创建一个线程池
    	ExecutorService threadPool = Executors.newCachedThreadPool();
    	
    	
        ServerSocket serverSocket = null;  //打开服务器
        try {
            serverSocket = new ServerSocket(7070);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(serverSocket==null){
            return;
        }
        System.out.println("服务器打开完成");
        while(true){
            try {
                System.out.println("服务器等待客户端连接");
                Socket socket = serverSocket.accept();  //等待客户端的连接 阻塞
                
                //new 一个runnable的实现类，即告诉线程要执行的任务
                SocketServerThread socketThread = new SocketServerThread(socket);
                
                //若不用线程池，则直接自己new一个线程，然后让此线程执行
                //new Thread(socketThread).start();
                //用线程池之后，就不用自己new线程了，线程会由线程池自动创建和销毁，提高了效率
                //调用线程池的execute方法即可让池子里面的线程自动执行你想要执行的任务，即runnable里面的run方法
                threadPool.execute(socketThread);
                
                System.out.println("服务器处理客户端连接完成");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
