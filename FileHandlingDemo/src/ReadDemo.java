import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadDemo {
	static final int EOF=-1;

	public static void main(String[] args) throws IOException {
		FileInputStream fi=new FileInputStream("G:\\Movie2/X.Men.Apocalypse.2016.720p.HDTC.PINK.EDITION.x264.AAC-ETRG/Sample.mp4");
		FileOutputStream fo=new FileOutputStream("G:\\Movie2/X.Men.Apocalypse.2016.720p.HDTC.PINK.EDITION.x264.AAC-ETRG/Copy.mp4");
		BufferedInputStream bi=new BufferedInputStream(fi);
		BufferedOutputStream bo=new BufferedOutputStream(fo);
		long startTime=System.currentTimeMillis();
		//int singleByte=fi.read();
		int singleByte=bi.read();
		while(singleByte!=EOF){
			//fo.write(singleByte);
			bo.write(singleByte);
            //singleByte=fi.read();
			singleByte=bi.read();
		}
		long endTime=System.currentTimeMillis();
		System.out.println("Time Taken:-"+(endTime-startTime));


System.out.println("Done....");
fi.close();
fo.close();
bo.close();
bi.close();
	}
	

}
