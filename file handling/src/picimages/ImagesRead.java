package picimages;

import java.io.FileInputStream;
import java.io.IOException;

public class ImagesRead {
	public static void main(String [] args )
	{
		String path = "picimages\\newimage.jpg";
		try {
			FileInputStream fis = new FileInputStream(path);
			
			int size = 0 ;
			while(fis.read()!=-1)
			{
				size++;
			}
			fis.close();
			System.out.print("images Read Sucessfully");
			System.out.print("images Size"+size+"bytes");
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
