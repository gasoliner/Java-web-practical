package Practical;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
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
	 * @throws UnknownHostException 
	 * 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub

		Socket socket=new Socket(InetAddress.getLocalHost().getHostName(),54321);
		String s=new String();
		Scanner in=new Scanner(System.in);
		s=in.nextLine();
		
		OutputStream out=socket.getOutputStream();
		
		int x=1;
		InputStream is=socket.getInputStream();
		byte buf[]=new byte[5120];
		int len =is.read(buf);
		s=new String(buf,0,len);
		System.out.println(s);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
