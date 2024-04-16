package t1;
import java.io.File;
import java.security.*;
import javax.crypto.*;
//
// Generate a Message Digest
public class CreateDigest {

	public static void createDigest (String tipoDigest, String dirPath, String DigestPath) throws Exception{
	  
		//for file in directory...
		String filePath =  dirPath + File.separator + "example.txt";
		
		
		// MD5, SHA1,SHA256, SHA512 
		MessageDigest messageDigest = MessageDigest.getInstance("MD5"); 
		if(tipoDigest == "MD5") {messageDigest = MessageDigest.getInstance("MD5");}
		else if(tipoDigest == "SHA1") {messageDigest = MessageDigest.getInstance("SHA1");}
		else if(tipoDigest == "SHA256") {messageDigest = MessageDigest.getInstance("SHA256");}
		else if(tipoDigest == "SHA512") {messageDigest = MessageDigest.getInstance("SHA512");}
	  
		System.out.println( "\n" + messageDigest.getProvider().getInfo() );
    
		// cria digest 
		String text = Read.read(filePath);
		byte[] plainText = text.getBytes("UTF8");
		
		
	    messageDigest.update( plainText);
	    byte [] digest = messageDigest.digest();
	    System.out.println( "\nDigest length: " + digest.length * 8 + "bits" );

	    
	    // converte o digist para hexadecimal
	    StringBuffer buf = new StringBuffer();
	    for(int i = 0; i < digest.length; i++) {
	       String hex = Integer.toHexString(0x0100 + (digest[i] & 0x00FF)).substring(1);
	       buf.append((hex.length() < 2 ? "0" : "") + hex);
	    }
	    // imprime o digest em hexadecimal
	    System.out.println( "\nDigest(hex): " );
	    System.out.println( buf.toString() );
		
		
		// procura comparacao em digest path
		
		/* procura comparacao em digestPath

		digestCalculado = ...
		currPath = ...  
			
		for digest in digests 
			currPath = ...

			if digestCalculado == digests[i]
				if currPath != path
					return COLISION
				else 
					return OK
			else 
				return NOT OK
			
			if(digests.length == i)
				return NOT FOUND*/
	}
		
}
