package t1;

public class Main {

	public static void main(String[] args)  throws Exception {
	    //
	    // check args and get plaintext
	    if (args.length != 3) {
	      System.err.println("Usage: DigestCalculator <SP> Tipo_Digest <SP>Caminho_da_Pasta_dos_Arquivos <SP> Caminho_ArqListaDigest");
	      System.exit(1);
	    }
		
	    //TO DO
	    String tipoDigest = args[0];
	    String dirPath = args[1];
	    String dirDigestPath = args[2];
	    
	    CreateDigest.createDigest (tipoDigest, dirPath, dirDigestPath);
	    
	    /* funcao que:
	    	
	    
	    
	    */
		 //String[] fileName = {"example.txt", "another.txt", "isso.txt"} ;
		
		
		/*for(int i = 0; i < fileName.length ;i++){
		try {
			MessageDigestExample.createDigest(fileName[i]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("");
		}*/
	}

}
	