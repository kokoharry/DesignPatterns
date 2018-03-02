package com.kokoharry.io.aio;

import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousChannelGroup;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by lu_yb on 2018/2/27.
 */
public class Server {
    //�̳߳�
    private ExecutorService executorService;
    //�߳���
    private AsynchronousChannelGroup channelGroup;
    //������ͨ��
    public AsynchronousServerSocketChannel channel;

    public Server(int port) {
        try {
            //�����̳߳�
            executorService  = Executors.newCachedThreadPool();
            //�����߳���
            channelGroup = AsynchronousChannelGroup.withCachedThreadPool(executorService, 1);
            //����������ͨ��
            channel = AsynchronousServerSocketChannel.open(channelGroup);
            //�󶨵�ַ
            channel.bind(new InetSocketAddress(port));
            System.out.println("server start, port��" + port);
            channel.accept(this, new ServerCompletionHandler());
            Thread.sleep(Integer.MAX_VALUE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server(8379);
    }
}
