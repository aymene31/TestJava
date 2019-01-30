
Semaine A (Java)
===

**LUNDI :**
Veille sur Java et la Jvm (Jre/jdk)
Introduction générale
Cahier de suivi perso à tenir : 
- chaque question doit avoir une reponse repertoriée ici
- toute bonne pratique ou point important doit y figurer

Installer les outils de dev pour java 8(1.8) sous ubuntu (openjdk)
Réaliser votre premier programme java à l'aide de sublime text par ex
puis compiler et executer toujours en ligne de commande

**Exercice 1 : premiers programme**
- 1.1 Ecrire une classe "Hello.java", ajouter une méthode main pour afficher le message "bonjour et bienvenu sur mon programme java"
- 1.2 puis ajouter "quel est votre nom ?" + saisir le nom puis afficher "bonjour nom"
- 1.3 faire de même pour le prénom
- 1.4 puis saisir l'âge et afficher "bienvenu nom prénom, vous êtes majeur"

**Exercice 2 : programme sur les conditions**
- 2.1 Ecrivez une autre classe "Test.java", ajouter une méthode main qui lit un nombre et indique s'il est positif, négatif ou s'il vaut zéro
- 2.2 Ajouter la possibilitée de savoir si le nombre est pair ou impair. 


**MARDI :**
veille sur les EDI (Environnement de dévellopement intégrés) pour Java
install et prise en main d'Eclipse (création d'un projet par Exercice)

**Exercice 3 : les boucles (projet TP3-Boucles, tous les exercices ci-dessous sont à réaliser dans le même projet)**
- 3.1 Ecrire une classe avec un main qui affiche les valeurs de 1 à 100 en utilisant for
- 3.2 Ecrire une nouvelle classe qui fait l'inverse du programme précédent en utilisant while
- 3.3 Reprendre l'un des programmes précédent et lorsqu'on arrive à la moitié (ici 50) afficher "moitié" : ...47-48-49-moitié-51-52-53...
- 3.4 Généraliser le programme en demandant à l'utilisateur l'intervalle à afficher.
    exemple d'utilisation -> saisissez une première valeur : 1 / puis une seconde : 6 / résultat : 1-2-moitié-4-5-6
- 3.5 Que faire si l'utilisateur saisi l'intervalle 10...-3 ?


**MERCREDI :**
veille sur les logigrammes

**(projet Kata-jeu)**
Kata : programme demande à l'utilisateur s'il souhaite jouer, si non alors sortir du programme, si oui, alors proposer de saisir un chiffre entre 1 et 100 et dire à chaque itération si le chiffre est plus petit ou plus grand... une fois le chiffre trouvé, sortir avec un message : vous avez trouvé en x coups

**REVISIONS**

NB : Réaliser une classe qui contient toutes les bonnes pratique

**JEUDI :**
veille sur l'API java

**Exercice 4 : les tableaux (projet TP4-Tabeaux)**
- 4.1 : Parcourir un tableau contenant des notes, écrire la note la plus petite, la plus grande et la moyenne
- 4.2 : Une variante de l'ex précédent consiste à demander à l'utilisateur, ici un professeur, qui saisi à chaque fois les notes d'un élève, une fois fini, afficher nom et prénom de l'élève + moyenne, l'action est répétée autant de fois qu'il y a d'élèves
- 4.3 : Parcourir un tableau d'élèves avec la boucle foreach, lorsque vous trouvez un élève donné, arrêté le parcours et affichez un message "élève X trouvé"

**Exercice 5 : les opérations (projet TP5-Opérations)**
- 5.1 : Proposer de faire les opérations : + * / - l'utilisateur doit saisir un caractère correspondant, puis 2 valeurs -> résultat attendu : 5 + 12 = 17

**Exercice 6 : String (projet TP6-String)**
- 6.1 : Dans une chaine(phrase) donnée, trouver s'il existe un mot, si oui, afficher trouvé sinon pas trouvé. ex : "il fait beau aujourd'hui" /mot recherché "beau" donc trouvé !
- 6.2 : Reprendre 6.1 et retirer le mot de la chaine si trouvé puis afficher la nouvelle chaine. ex : "il fait beau aujourd'hui" donne "il fait aujourd'hui"
- 6.3 : Reprendre 6.2 et remplacer le mot si trouvé par un autre saisi par l'utilisateur. ex : "il fait beau aujourd'hui" donne "il fait chaud aujourd'hui"
- 6.3 : Ecrire un programme qui dit si une chaine est un palindrome, ex : akka, otto
- 6.4 : Trouver une solution lorsqu'il y a des majuscules
- 6.5 : Tester votre programme avec : "Elu par cette crapule"


**VENDREDI :**
veille sur comment utiliser git-github avec Eclipse

**Exercice 7 : méthodes statiques (projet TP7-static)**
- 7.1 : reprendre l'exercice 5.1 et écrire les méthodes correspondantes : mul add sub div / les tester dans votre main -> System.out.println(add(x,y));
- 7.2 : refaire les mêmes opérations avec les méthodes de l'Api cette fois ci.
- 7.3 : Exercice du Menu

  **(projet TP7-Concessionnaire à réaliser en vous servant uniquement des notions déjà vues)**        
- 7.3 : UN CONCESSIONNAIRE VOUS DEMANDE DE CREER UNE APPLI QUI GERE SON STOCK DE VOITURES, COMMENT S'Y PRENDRE SACHANT QU'UNE VOITURE EST CARACTERISE PAR UNE MARQUE(ex:Renault), UN TYPE(ex:Clio). Ajouter un main pour créer des véhicules et les afficher.
- 7.4 : Le client demande à automatiser l'appli et donc d'avoir la possibilitée d'ajouter autant de voitures qu'il souhaite, d'afficher son stock de voitures, de vendre une voiture ce qui reviendra ici à la supprimer de son stock.
- 7.5 : Il vous demande d'ajouter d'autres caractéristiques : MOTEUR(ex : diesel) ANNEE Mise en Circulation(ex:2010), NB Km(ex:120000), Prix Argus(ex:3500), NB Chevaux(ex:6)...

Terminer tous les exercices de la semaine et les mettre sur GitHub via Eclipse une fois fonctionnels 

Site de référence sur Java & Eclipse : 
[Oracle Technology Network for Java Developers \| Oracle Technology Network | Oracle](https://www.oracle.com/technetwork/java/index.html)
[Enabling Open Innovation & Collaboration \| The Eclipse Foundation](https://www.eclipse.org/)
[Developpez.com, le club des d�veloppeurs et IT Pro](https://www.developpez.com/)