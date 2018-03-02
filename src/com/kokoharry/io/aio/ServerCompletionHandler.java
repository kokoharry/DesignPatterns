package com.kokoharry.io.aio;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

/**
 * Created by lu_yb on 2018/2/27.
 */
public class ServerCompletionHandler implements CompletionHandler<AsynchronousSocketChannel, Server> {
    @Override
    public void completed(AsynchronousSocketChannel channel, Server attachment) {
        //������һ���ͻ��˽����ʱ��ֱ�ӵ���Server��accept��������������ִ����ȥ����֤����ͻ��˶���������
        attachment.channel.accept(attachment, this);
        read(channel);
    }

    private void read(AsynchronousSocketChannel channel) {
        //��ȡ����
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        channel.read(buffer, buffer, new CompletionHandler<Integer, ByteBuffer>() {
            @Override
            public void completed(Integer resultSize, ByteBuffer attachment) {
                attachment.flip();
                System.out.println("Server->" + "�յ��ͻ��˷��͵����ݳ���Ϊ��" + resultSize);
                String data = new String(buffer.array()).trim();
                System.out.println("Server->" + "�յ��ͻ��˷��͵�����Ϊ��" + data);
                String response = "����������Ӧ�˿ͻ��ˡ�����������";
                write(channel, response);
            }

            @Override
            public void failed(Throwable exc, ByteBuffer attachment) {
                exc.printStackTrace();
            }
        });
    }

    private void write(AsynchronousSocketChannel channel, String response) {
        try {
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            buffer.put(response.getBytes());
            buffer.flip();
            channel.write(buffer).get();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void failed(Throwable exc, Server attachment) {
        exc.printStackTrace();
    }
}
