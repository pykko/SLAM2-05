# SLAM2-05
## Pions et forces

* Rat : 1
* Chat : 2
* Loup : 3
* Chien : 4
* Panthère : 5
* Tigre : 6
* Lion : 7
* Éléphant : 8

Un pion ne peut capturer que les pions adverses de force inférieure ou égale.

**_Au sujet de l'éléphant :_** "C'est l'animal le plus fort, il peut écraser tous les autres. Il a cependant un irréductible ennemi: le rat. Un éléphant peut être pris par un autre éléphant, mais aussi par le rat! Levons une ambiguïté: il est en effet a priori difficile de comprendre que l'éléphant soit à la fois plus fort que tous les autres animaux (donc, y compris le rat) et soit néanmoins vulnérable à son attaque. Disons tout d'abord que, selon les cas, l'un ou l'autre peut prendre son adversaire. S'ils sont sur des cases contiguës, c'est le premier qui joue qui prend l'autre. Il en ira toujours de même quand deux adversaires de forces égales sont dans des cases contiguës."

## Conditions de déplacement

Un pion peut se déplacer sur une case :
- Si la case est libre ;
- Si la case est occupée par un pion adverse de force inférieure ou égale. Dans ce cas, il y a capture du pion adverse.

## Résultats attendus

### Question 1 - Création des deux joueuses
#### Question 1.3
- joueurBlanc : Latifa , Blanc
- joueurNoir : Ilona, Noir

### Question 2 - Création du tigre noir
#### Question 2.2
- tigreNoir : 6 , Tigre , true , joueurNoir

### Question 3 - Création du loup blanc
#### Question 3.2
- loupBlanc : 3 , Loup , false , joueurBlanc

### Question 4 - Création de la case (5,4)
#### Question 4.2
- case54 : 5 , 4 , null

#### Question 4.3
- Case libre

### Question 5 - Positionner le loup blanc sur la case (5,4)
#### Question 5.2
- loupBlanc : 3 , Loup , false , joueurBlanc
- case54 : 5 , 4 , loupBlanc

#### Question 5.3
- Loup

#### Question 5.4
- false

#### Question 5.5
- Latifa , Blanc

#### Question 5.6
- Latifa

#### Question 5.7
- Blanc

### Question 6 - Déplacer le tigre noir sur la case (5,5)
#### Question 6.2
- Tigre noir non déplacé

#### Question 6.3
- tigreNoir : 6 , Tigre , true , joueurNoir
- case55 : 5 , 5 , null

### Question 7 - Déplacer le loup blanc sur la case (5,3)
#### Question 7.3
- chatBlanc : 2 , Chat , false , joueurBlanc
- loupBlanc : 3 , Loup , false , joueurBlanc

#### Question 7.4
- Loup blanc non déplacé

#### Question 7.5
- chatBlanc : 2 , Chat , false , joueurBlanc
- loupBlanc : 3 , Loup , false , joueurBlanc
- case53 : 5 , 3 , chatBlanc
- case54 : 5 , 4 , loupBlanc

### Question 8 - Déplacer le loup blanc sur la case (5,5)
#### Question 8.1
- Loup blanc déplacé

#### Question 8.2
- loupBlanc : 3 , Loup , false , joueurBlanc
- case54 : 5 , 4 , null
- case55 : 5 , 5 , loupBlanc

### Question 9 - Déplacer le loup blanc sur la case (6,5)
#### Question 9.3
- chatNoir : 2 , Chat , false , joueurNoir
- case65 : 6 , 5 , chatNoir

#### Question 9.4
- Loup blanc déplacé

#### Question 9.5
- loupBlanc : 3 , Loup , false , joueurBlanc
- chatNoir : 2 , Chat , true , joueurNoir
- case55 : 5 , 5 , null
- case65 : 6 , 5 , loupBlanc













