import java.io.*;

public class PracticeProblem {

	public static String readFile(String filename) {
		FileReader fiRe = null;
		int i;
		char o;
		String out = "";
		try{
			fiRe = new FileReader(filename);

			while ((i = fiRe.read())!=-1){
				o = ((char)i);
				out = out + String.valueOf(o);

			}
		}
		catch (Exception e){

		}

		finally {
		try {
		if (fiRe!=null){
		fiRe.close();
		}
		}
		catch (IOException e){

		}
	}

	return out;
	}

	
public static String backwardsReadFile(String filenames){
	FileReader fil = null;
	int i;
	int len =0;
	char c;
	String out = "";
	String actOut = "";
	try {
		fil = new FileReader(filenames);
		while ((i = fil.read()) != -1){
			c = ((char)i);
			out = out +c;
		}
	}
	catch (Exception e){
	}
	finally{
		len = out.length();
		for (int a = len-1; a>=0; a--){
		actOut = actOut+out.charAt(a);
	}
	try{
		if (fil != null){
		fil.close();
		}
	}
	catch (Exception e){}
	}
	return actOut;
	}
}

