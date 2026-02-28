package picimages;
import java.io.*;
public class ImagesStore {

	public static void main(String args[] )
	{ 
		String sourcePath = "C:/Users/sjsje/eclipse-workspace/images/20241031_072626.jpg";
		String destinationPath =  "C:\\Users\\sjsje\\eclipse-workspace\\images\\src\\picimages\\newimage.jpg";
			try {
				
		FileInputStream fis = new FileInputStream(sourcePath);
		FileOutputStream fos = new FileOutputStream(destinationPath);
		byte[]buffer = new byte[1024];
		int bytesRead;
		while((bytesRead = fis.read(buffer))!=-1)
		{
			fos.write(buffer,0,bytesRead);
		}
		fis.close();
		fos.close();
		
		System.out.print("image Stored successfully");
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}
}
