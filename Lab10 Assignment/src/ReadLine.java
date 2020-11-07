//Author:Shakamuri Sushma
//Date:11/07/2020
//Desc:Code  with a line number before each line
import java.io.*;

public class ReadLine {
	public static void main(String args[])
	{
		int count=0;
		try
		{
			FileReader fr=new FileReader(new File("D://Sushma.txt"));//Created text in the document
			BufferedReader br=new BufferedReader(fr);
			FileWriter fw=new FileWriter(new File("D://target.txt"));//Shows output in this file
			BufferedWriter bw=new BufferedWriter(fw);
			String str;int index=0;
			count=0;
			while((str=br.readLine())!=null)//If the file has content
			{
				String k=Integer.toString(index)+str;
				
				System.out.println(k);
				bw.write(k);
				count=count+1;
				bw.newLine();
				index++;
			}
			bw.flush();
			fw.flush();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("no of line: "+count);
		}
	}

}
