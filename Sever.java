package Practical;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever {

	/**
	 * �ͻ���������ĸ���ݣ����͸��ͻ��ˣ�
	 * ������յ�����ʾ�ڿ���̨������������ת�ɴ�д���ظ��ͻ���
	 * ֪���ͻ�������over.ת��������
	 * 
	 * ����һ��Ӣ�Ĵ�дת��������
	 * 
	 * ������
	 * �пͻ��˺ͷ���ˣ�ʹ��tcp���䡣
	 * 
	 * 
	 * @param args
	 * @throws IOException 
	 * 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		ServerSocket ss=new ServerSocket(54321);
		
		Socket socket=ss.accept();
		String nm=socket.getInetAddress().getHostName();
		
//		System.out.println(nm+" is connection......");
		
		InputStream is=socket.getInputStream();
		
		byte buf[]=new byte[5120];
		is.read(buf, 0, buf.length);
		System.out.println("$$$$$$$$$");
		String s=new String(buf,0,buf.length);
		
		System.out.println(s);
		
		OutputStream os=socket.getOutputStream();

		os.write(s.toUpperCase().getBytes());
		System.out.println("$$$$$$$$$");		
		ss.close();
		socket.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
