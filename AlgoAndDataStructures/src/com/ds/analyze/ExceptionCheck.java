package com.ds.analyze;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionCheck {
	
	public static final String pegaRULES = "pegaRULES";
	public static final String pegaAlerts = "pegaAlerts";

	public static void getExceptionFile() throws FileNotFoundException, IOException{
		try(
			BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\muddm\\Documents\\SR\\SR-B46622\\CSW Logs (1)\\CSW Logs\\4115 - ON\\S01\\PegaRULES.log")));
			FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\muddm\\Documents\\SR\\SR-B46622\\CSW Logs (1)\\CSW Logs\\4115 - ON\\S01\\PegaRULES_Modified.log"))
			) {
			
			System.out.println(printLines(br,fos,0));
	  
	}
	}
	
	private static String printLines(BufferedReader br, FileOutputStream fos,int lines) throws IOException {
		// TODO Auto-generated method stub
		while(lines<20){
			 for(String line; (line = br.readLine()) != null; ) {
			        // process the line.
			    	if(line.contains("Venk") /*|| line.contains("Email")*/){
			    		line = line+"\n\n\n";
			    		fos.write(line.getBytes(), 0, line.getBytes().length);
			    		//printLines(br, fos, lines+1);
			    	}
			    }
		}
		return null;
	}

	public static void main(String args[]) throws FileNotFoundException, IOException{
		ExceptionCheck.getExceptionFile();
	}
}

 
