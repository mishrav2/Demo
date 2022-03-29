import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
public static void main(String[] args) throws IOException {
	FileOutputStream fos=new FileOutputStream("b.txt");
	FileInputStream fis=new FileInputStream("a.txt");
	int i=0;
	while((i=fis.read())!=-1)
	{
		fos.write(i);
	}
}
}
	