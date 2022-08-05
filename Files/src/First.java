
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class First {

	public static void main(String[] args) {
		File f = new File("a.txt");
		try{
			
			FileReader fr=new FileReader(f);
			int c =fr.read();
			while(c!=-1){
				System.out.print(c);
				char k=(char)c;
				System.out.print("("+k+") ");
				c=fr.read();
			}
			fr.close();
			System.out.println();
			f=new File("a.txt");
			BufferedReader br=new BufferedReader(new FileReader(f));
			System.out.println(br.readLine());
			br.close();
			File output=new File("output.txt");
			FileWriter fw=new FileWriter(output);
			fw.write("i have come !");
			fw.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
			
	}
}
