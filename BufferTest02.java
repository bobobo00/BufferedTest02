package cn.io.study3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 理解操作步骤
 * 1，创建源   加入字符缓冲流
 * 2，选择流
 * 3，操作
 * 4，释放资源
 * 
 * 使用缓冲容器按多个字符的读取
 * @author dell
 *
 */

public class BufferTest02 {
	public static void copy(String srcpath,String destpath) {
		File src=new File(srcpath);
		File dest=new File(destpath);
		try(BufferedWriter bw=new BufferedWriter(new FileWriter(dest,true));
			BufferedReader br=new BufferedReader(new FileReader(src));) {
			String line=null;
			while((line=br.readLine())!=null){
				System.out.println(line);
				bw.append(line);
				bw.newLine();
			}
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		copy("E:\\workspace-java\\IO流技术\\aaa.txt","E:\\workspace-java\\IO流技术\\copy-aaa.txt");
	}

}
