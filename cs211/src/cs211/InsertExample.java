package cs211;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class InsertExample {

	public static void main(String[] args) {
		File f = new File("text1.txt");
		File f2 = new File("text2.txt");
		try (RandomAccessFile rf = new RandomAccessFile(f,"rw");
				FileInputStream fi = new FileInputStream(f2);	
				){
			int loc = 8;
			byte remainingData[] = new byte[(int) (rf.length()-loc)];
			rf.seek(8);
			rf.read(remainingData);
			byte insertData[] = new byte[(int) (f2.length())];		
			long pos = rf.getFilePointer() - (rf.length()-loc);
			rf.seek(pos);
			fi.read(insertData);
			rf.write(insertData);
			rf.write(remainingData);
			rf.close();			
		} catch ( IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
