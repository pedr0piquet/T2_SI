DigestCalculator <SP> Tipo_Digest <SP> Caminho_da_Pasta_dos_Arquivos <SP>Caminho_ArqListaDigest

Tipo_Digest - switch case para as chamadas

Caminho_da_Pasta_dos_Arquivos - diretorio 

Caminho_ArqListaDigest - 




//for file in directory...

// cria digest 
		
// procura comparacao em digestPath

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
		return NOT FOUND
	
		



// retorna:
Nome_Arq1<SP>Tipo_Digest<SP>Digest_Hex_Arq1<SP>(STATUS)

STATUS: 
OK - digest calculado == digest armazenado, sem colisao 
- 

NOT OK - digest calculado != digest armazenado, sem colisao
-

NOT FOUND - digest armazenado nao encontrado, sem colisao
- cria ou adiciona em arq existente

COLISION - colisao com algum 
- nao adiciona


			
