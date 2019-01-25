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
#### Question 2.1
tigreNoir : 6 , Tigre , true , joueurNoir

