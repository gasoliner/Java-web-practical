package Practical;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever {

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
