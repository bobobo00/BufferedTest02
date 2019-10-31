package cn.io.study3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ����������
 * 1������Դ   �����ַ�������
 * 2��ѡ����
 * 3������
 * 4���ͷ���Դ
 * 
 * ʹ�û�������������ַ��Ķ�ȡ
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
		copy("E:\\workspace-java\\IO������\\aaa.txt","E:\\workspace-java\\IO������\\copy-aaa.txt");
	}

}
