import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;

public class Demo07 {

    public static void main(String[] args) throws UnknownHostException, IOException {
// TODO Auto-generated method stub
        Socket socket = new Socket("baidu.com",80);
        OutputStream os = socket.getOutputStream();
        String get = "GET / HTTP/1.1\n" +
                "Host: baidu.com:80\n" +
                "Proxy-Connection: keep-alive\n" +
                "Cache-Control: no-cache\n" +
                "User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36\n" +
                "Postman-Token: 57ba7d0e-b45d-0785-40a2-e555e5a2d3cc\n" +
                "Accept: */*\n" +
                "Accept-Encoding: gzip, deflate, br\n" +
                "Accept-Language: zh-CN,zh;q=0.9,en;q=0.8\n\n" ;
        os.write(get.getBytes());
        InputStream is = socket.getInputStream();
        BufferedReader bufr = new BufferedReader(new InputStreamReader(is));
        String temp = null;
        while((temp=bufr.readLine())!=null){
            if(temp.length()==0)
                break;
            System.out.println(temp);
        }
        FileOutputStream fos = new FileOutputStream("/Users/zhouqinchun/Desktop/t.txt");
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(fos));
        byte[] bytes;
        while((temp=bufr.readLine())!=null&&!"".equals(temp)){ //最后程序就停留在这行，并且抛出java.net.SocketException:
        //Connection reset异常

            bytes = temp.getBytes("iso-8859-1");
            temp = new String(bytes,"UTF-8");
            bufw.write(temp+"\n");

        }
        bufr.close();
        bufw.close();
        socket.close();
    }

}