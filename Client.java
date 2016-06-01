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
	 * 客户端输入字母数据，发送给客户端，
	 * 服务端收到后显示在控制台，并将该数据转成大写返回给客户端
	 * 知道客户端输入over.转换结束。
	 * 
	 * 创建一个英文大写转换服务器
	 * 
	 * 分析：
	 * 有客户端和服务端，使用tcp传输。
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
