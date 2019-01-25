package fr.gns.xdq;

public class AppXDQ {
	
	private static final int NB_PIONS_JOUEUR = 8 ;
	
	private static final int NB_LIGNES = 9 ;
	private static final int NB_COLONNES = 7 ;
	
	private static String [] animaux = { 	
											"Rat" , "Chat" , "Loup" , "Chien" ,
											"Panthère" , "Tigre" , "Lion" , "Éléphant"
									} ;
	

	public static void main(String[] args) {
		
		System.out.println( "\n[Question 1] Création des deux joueuses" ) ;
		// Question 1 - Création des deux joueuses
		
		//	1.1- Créer la joueuse Latifa qui a choisi le camp des blancs
		//			Joueuse référencée par la variable joueurBlanc
		// VOTRE CODE ICI
		
		//	1.2- Créer la joueuse Mélissa qui a choisir le camp des Noirs
		//			Joueuse référencée par la variable joueurNoir
		// VOTRE CODE ICI
		
		System.out.println( "1.3" ) ;
		//	1.3- Afficher les deux joueuses
		// VOTRE CODE ICI
		
		
		
		System.out.println( "\n[Question 2] Création du tigre noir" ) ;
		// Question 2 - Création du tigre noir
		
		//	2.1- Créer le pion noir qui représente le tigre (force de niveau 6)
		//			Ce pion n'est plus dans le jeu car il a été capturé par le camp des blancs
		//			Pion référencé par la variable tigreNoir
		// VOTRE CODE ICI
		
		System.out.println( "2.2" ) ;
		//	2.2- Afficher le tigre noir
		// VOTRE CODE ICI
		
		
		
		System.out.println( "\n[Question 3] Création du loup blanc" ) ;
		// Question 3 - Création du loup blanc
		
		//	3.1- Créer le pion blanc qui représente le loup (force de niveau 3)
		//			Ce pion est toujours dans le jeu
		//			Pion référencé par la variable loupBlanc
		// VOTRE CODE ICI
		
		System.out.println( "3.2" ) ;
		//	3.2- Afficher le loup blanc
		// VOTRE CODE ICI
		
		
		
		System.out.println( "\n[Question 4] Création de la case (5,4)" ) ;
		// Question 4 - Création de la case (5,4)
		
		//	4.1- Créer la case qui se trouve en ligne 5 et en colonne 4
		//			Cette case est libre (pas occupée par un pion)
		//			Case référencée par la variable case54
		// VOTRE CODE ICI
		
		System.out.println( "4.2" ) ;
		//	4.2- Afficher la case (5,4)
		// VOTRE CODE ICI
		
		System.out.println( "4.3" ) ;
		//	4.3- Case occupée ?
		//			Tester l'état de la case (5,4)
		//			Si la case est libre, afficher le message "Case libre".
		//			Si la case est occupée, afficher le message "Case occupée par le pion ... du camp ..."
		// VOTRE CODE ICI
				
		
		
		System.out.println( "\n[Question 5] Positionner le loup blanc sur la case (5,4)" ) ;
		// Question 5 - Positionner le loup blanc
		
		//	5.1- Positionner le loup noir sur la case (5,4)
		// VOTRE CODE ICI
		
		System.out.println( "5.2" ) ;
		//	5.2- Afficher le loup blanc ainsi que la case (5,4)
		// VOTRE CODE ICI
		
		System.out.println( "5.3" ) ;
		//	5.3- Afficher le nom de l'animal représenté sur le pion qui se trouve sur la case (5,4)
		// VOTRE CODE ICI
		
		System.out.println( "5.4" ) ;
		//	5.4- Afficher la force l'animal représenté sur le pion qui se trouve sur la case (5,4)
		// VOTRE CODE ICI
			
		System.out.println( "5.5" ) ;
		//	5.5- Afficher le nom de l'animal représenté sur le pion qui se trouve sur la case (5,4)
		// VOTRE CODE ICI
		
		System.out.println( "5.6" ) ;
		//	5.6- Afficher le joueur qui possède le pion qui se trouve sur la case (5,4)
		// VOTRE CODE ICI
			
		System.out.println( "5.7" ) ;
		//	5.7- Afficher le nom du joueur qui possède le pion qui se trouve sur la case (5,4)
		// VOTRE CODE ICI
						
		System.out.println( "5.8" ) ;
		//	5.8- Afficher la couleur du pion qui se trouve sur la case (5,4)
		// VOTRE CODE ICI
							
					
			
		System.out.println( "\n[Question 6] Déplacer le tigre noir sur la case (5,5)" ) ;
		// Question 6 - Déplacer le tigre noir
		//		ATTENTION : Un pion ne peut se déplacer que s'il est en jeu
		
		//	6.1- Créer la case qui se trouve en ligne 5 et en colonne 5
		//			Cette case est libre (pas occupée par un pion)
		//			Case référencée par la variable case55
		// VOTRE CODE ICI
		
		//	6.2- Déplacer le tigre noir sur la case (5,5)
		//			Si le déplacement a été réalisé avec succès, afficher le message "Tigre noir déplacé."
		//			Si le déplacement n'a pu être réalisé, afficher le message "Tigre noir non déplacé."
		// VOTRE CODE ICI
		
		System.out.println( "6.3" ) ;
		//	6.3- Afficher le tigre noir ainsi que la case (5,5)
		// VOTRE CODE ICI
		
		
		
		System.out.println( "\n[Question 7] Déplacer le loup blanc sur la case (5,3)" ) ;
		// Question 7 - Déplacer le loup blanc
		//		ATTENTION : Un pion ne peut se déplacer que s'il est en jeu ET...
		//						Si la case de destination est vide
		//					OU  Si la case de destination est occupée par un pion adverse dont la force
		//						   est inférieure ou égale au pion qui se déplace
		
		//	7.1- Créer le pion blanc qui représente le chat (force de niveau 2)
		//			Ce pion est dans le jeu car non capturé
		//			Pion référencé par la variable chatBlanc
		// VOTRE CODE ICI
		
		//	7.2- Créer la case qui se trouve en ligne 5 et en colonne 3
		//			Cette case est occupée par le chat blanc
		//			Case référencée par la variable case53
		// VOTRE CODE ICI
		
		System.out.println( "7.3" ) ;
		//	7.3- Afficher le chat blanc ainsi que la case (5,3)
		// VOTRE CODE ICI
		
		//	7.4- Déplacer le loup blanc sur la case (5,3)
		//			Si le déplacement a été réalisé avec succès, afficher le message "Loup blanc déplacé."
		//			Si le déplacement n'a pu être réalisé, afficher le message "Loup blanc non déplacé."
		// VOTRE CODE ICI		

		System.out.println( "7.5" ) ;
		//	7.5- Afficher le chat blanc et le loup blanc ainsi que les cases (5,3) et (5,4)
		// VOTRE CODE ICI
		
		
				
		System.out.println( "\n[Question 8] Déplacer le loup blanc sur la case (5,5)" ) ;
		// Question 8 - Déplacer le loup blanc
		//		ATTENTION : Un pion ne peut se déplacer que s'il est en jeu ET...
		//						Si la case de destination est vide
		//					OU  Si la case de destination est occupée par un pion adverse dont la force
		//						   est inférieure ou égale au pion qui se déplace
		
		//	8.1- Déplacer le loup blanc sur la case (5,5)
		//			Si le déplacement a été réalisé avec succès, afficher le message "Loup blanc déplacé."
		//			Si le déplacement n'a pu être réalisé, afficher le message "Loup blanc non déplacé."
		// VOTRE CODE ICI
		
		System.out.println( "8.2" ) ;
		//	8.2- Afficher le loup blanc ainsi que les cases (5,4) et (5,5)
		// VOTRE CODE ICI
		
		
		
		System.out.println( "\n[Question 9] Déplacer le loup blanc sur la case (7,5)" ) ;
		// Question 9 - Déplacer le loup blanc
		//		ATTENTION : Un pion ne peut se déplacer que s'il est en jeu ET...
		//						Si la case de destination est vide
		//					OU  Si la case de destination est occupée par un pion adverse dont la force
		//						   est inférieure ou égale au pion qui se déplace
		
		//	9.1- Créer le pion noir qui représente la panthère (force de niveau 5)
		//			Ce pion est dans le jeu car non capturé
		//			Pion référencé par la variable panthereNoire
		// VOTRE CODE ICI
		
		//	9.2- Créer la case qui se trouve en ligne 7 et en colonne 5
		//			Cette case est occupée par la panthère noire
		//			Case référencée par la variable case75
		// VOTRE CODE ICI
		
		System.out.println( "9.3" ) ;
		//	9.3- Afficher la panthère noire ainsi que la case (7,5)
		// VOTRE CODE ICI
		
		//	9.4- Déplacer le loup blanc sur la case (7,5)
		//			Si le déplacement a été réalisé avec succès, afficher le message "Loup blanc déplacé."
		//			Si le déplacement n'a pu être réalisé, afficher le message "Loup blanc non déplacé."
		// VOTRE CODE ICI		

		System.out.println( "9.5" ) ;
		//	9.5- Afficher la panthère noire et le loup blanc ainsi que les cases (6,5) et (7,5)
		// VOTRE CODE ICI
	
		
			
		System.out.println( "\n[Question 10] Le rat noir attaque l'éléphant blanc" ) ;
		// Question 9 - Le rat noir attaque l'éléphant blanc"
		//		ATTENTION : Un pion ne peut se déplacer que s'il est en jeu ET...
		//						Si la case de destination est vide
		//					OU  Si la case de destination est occupée par un pion adverse dont la force
		//						   est inférieure ou égale au pion qui se déplace
		
		//	10.1- Créer le pion blanc qui représente l'éléphant (force de niveau 8)
		//			Ce pion est dans le jeu car non capturé
		//			Pion référencé par la variable elephantBlanc
		// VOTRE CODE ICI
		
		//	10.2- Créer la case qui se trouve en ligne 1 et en colonne 1
		//			Cette case est occupée par l'éléphant blanc
		//			Case référencée par la variable case11
		// VOTRE CODE ICI

		//	10.3- Créer le pion noir qui représente le rat (force de niveau 1)
		//			Ce pion est dans le jeu car non capturé
		//			Pion référencé par la variable ratNoir
		// VOTRE CODE ICI
		
		//	10.4- Créer la case qui se trouve en ligne 1 et en colonne 2
		//			Cette case est occupée par le rat noir
		//			Case référencée par la variable case12
		// VOTRE CODE ICI
				
		System.out.println( "10.5" ) ;
		//	10.5- Afficher l'éléphant blanc et le rat noir ainsi que les cases (1,1) et (1,2)
		// VOTRE CODE ICI
		
		//	10.6- Déplacer le rat noir sur la case (1,1)
		//			Si le déplacement a été réalisé avec succès, afficher le message "Rat noir déplacé."
		//			Si le déplacement n'a pu être réalisé, afficher le message "Rat blanc non déplacé."
		// VOTRE CODE ICI		

		System.out.println( "10.7" ) ;
		//	10.7- Afficher l'éléphant blanc et le rat noir ainsi que les cases (1,1) et (1,2)
		// VOTRE CODE ICI
		
		
		
		System.out.println( "\n[Question 11] L'éléphant noir attaque le rat blanc" ) ;
		// Question 11 - L'éléphant noir attaque le rat blanc"
		//		ATTENTION : Un pion ne peut se déplacer que s'il est en jeu ET...
		//						Si la case de destination est vide
		//					OU  Si la case de destination est occupée par un pion adverse dont la force
		//						   est inférieure ou égale au pion qui se déplace
		
		//	11.1- Créer le pion noir qui représente l'éléphant (force de niveau 8)
		//			Ce pion est dans le jeu car non capturé
		//			Pion référencé par la variable elephantNoir
		// VOTRE CODE ICI
		
		//	11.2- Créer la case qui se trouve en ligne 9 et en colonne 1
		//			Cette case est occupée par l'éléphant noir
		//			Case référencée par la variable case91
		// VOTRE CODE ICI

		//	11.3- Créer le pion blanc qui représente le rat (force de niveau 1)
		//			Ce pion est dans le jeu car non capturé
		//			Pion référencé par la variable ratBlanc
		// VOTRE CODE ICI
		
		//	11.4- Créer la case qui se trouve en ligne 9 et en colonne 2
		//			Cette case est occupée par le rat blanc
		//			Case référencée par la variable case92
		// VOTRE CODE ICI
				
		System.out.println( "11.5" ) ;
		//	11.5- Afficher l'éléphant noir et le rat blanc ainsi que les cases (9,1) et (9,2)
		// VOTRE CODE ICI
		
		//	11.6- Déplacer l'éléphant noir sur la case (9,2)
		//			Si le déplacement a été réalisé avec succès, afficher le message "Éléphant noir déplacé."
		//			Si le déplacement n'a pu être réalisé, afficher le message "Éléphant noir non déplacé."
		// VOTRE CODE ICI		

		System.out.println( "11.7" ) ;
		//	11.7- Afficher l'éléphant noir et le rat blanc ainsi que les cases (9,1) et (9,2)
		// VOTRE CODE ICI		
		
		
		
		System.out.println( "\n[Question 12] Créer les pions" ) ;
		// Question 12 - Créer les pions"
		//		Tous les pions sont dans le jeu... Aucun n'a été capturé
		Pion [] pionsBlancs = new Pion[ NB_PIONS_JOUEUR ] ;
		Pion [] pionsNoirs = new Pion[ NB_PIONS_JOUEUR ] ;
		
		//	12.1- Valoriser les variables pionsBlancs et pionsNoirs
		//			Créer tous les pions et les mémoriser dans leur tableau respectif
		// VOTRE CODE ICI

		System.out.println( "12.2" ) ;
		//	12.2- Afficher les pions blancs puis les pions noirs
		// VOTRE CODE ICI
		
		System.out.println( "12.3" ) ;
		//	12.2- Afficher la couleur de chacun des pions
		// VOTRE CODE ICI
		
		
		
		System.out.println( "\n[Question 13] Créer les cases" ) ;
		// Question 13 - Créer les cases
		//		Tourtes les cases sont libres
		Case [][] cases = new Case[ NB_LIGNES ][NB_COLONNES ] ;
		

		//	13.1- Valoriser la variable cases
		//			Créer toutes les cases et les mémoriser dans le tableau cases
		//				La case (1,1) doit être mémorisée dans l'élément case[0][0]
		//				La case (1,2) doit être mémorisée dans l'élément case[0][1]
		//				...
		// VOTRE CODE ICI

		System.out.println( "13.2" ) ;
		//	13.2- Afficher les cases
		// VOTRE CODE ICI
		
	
		
		System.out.println( "\n[Question 14] Positionner les pions" ) ;
		// Question 14 - Positionner les pions
		// 			Les pions blancs sont positionnés dans la première colonne
		//			Les pions noirs sont positionnés dans la dernière colonne
		
		//	14.1- Positionner les pions
		// VOTRE CODE ICI
		
		System.out.println( "14.2" ) ;
		//	14.2- Afficher les cases
		// VOTRE CODE ICI
		
		System.out.println( "14.3" ) ;
		//	14.3- Pour chaque case occupée afficher sa ligne, sa colonne ainsi que le nom de l'animal qui l'occupe
		// VOTRE CODE ICI

		System.out.println( "14.4" ) ;
		//	14.4- Pour chaque case occupée afficher sa ligne, sa colonne ainsi que le nom et la couleur 
		//			de l'animal qui l'occupe
		// VOTRE CODE ICI
		
	}

}
