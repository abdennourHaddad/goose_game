# Jeu de l'oie - goosegame

[@abdennour.haddad.etu](mailto:abdennour.haddad.etu@univ-lille.fr)

## Contexte

L’objectif est l’implémentation du « jeu de l’oie » (goose game), bien connu des plus jeunes.

[Jouez quelques parties du jeu de l’oie](http://files.acticdn.com/278374/22341/index.html?an_game_version=201705091101)

## Le jeu

Ce jeu se présente sous la forme d’un plateau constitué de cases numérotées à partir de 1, plus une position de départ,
qui peut être considérée comme une 64ème case numérotée 0. Pour gagner et finir la partie, il faut qu’un joueur arrive
exactement sur la dernière case.
Les différents joueurs, en nombre quelconque, jouent chacun leur tour. Selon la case oû il se trouve un joueur a ou
non le droit de quitter cette case. Si ce n’est pas le cas, il passe son tour.S’il est autorisé à jouer, il lance 2 dés à 6
faces et avance son pion d’un nombre de cases égal à la somme des dés pour arriver sur sa case destination. Si son
lancer de dés lui fait « dépasser » la dernière case, il revient en arrire du nombre de cases en excès. Par exemple, un
joueur situé sur la case 57 fait 9 aux dés, il avance jusque la case 63 en dépensant 6 points et recule ensuite des 3
points restants pour arriver sur la case 60.

Pour récupérer le dossier contenant les fichiers du projet et les enregistrer dans le dossier de votre choix.Tapez la commande suivante depuis le dossier de base de votre choix :

```bash
git pull
```

Comme vous pouvez le constatez, vous avez :

- un dossier **src/** contenant les fichiers sources qui sont dans un paquetage **goosegame**
- un dossier **test/** contenant les fichiers de test

### Génération de la documentation

```java
javadoc -sourcepath src -d docs -subpackages goosegame
```

### Compilation

```java
javac -sourcepath src -d classes src/goosegame/*.java
```

### Compilation des tests

```java
javac -classpath test4poo.jar test/goosegame/*.java
```

### Exécution des tests

```java
java -jar test4poo.jar someClassTest

```

### Exécution du programme

```java
java -classpath classes goosegame.Main player1 player2
```

### Création d’un jar exécutable

On récupère le fichier `manifest-ex` qui définit la classe `Main` du paquetage `goosegame`.
On exécute la commande suivante à partir du dossier `classes`

```java
jar cvfm ../goosegameExe.jar ../manifest-ex goosegame
```

### Consultation du contenu de l'archive

```java
jar tvf goosegameExe.jar
```

### Exécution du fichier jar

PS : On peut mettre un nombre illimité de joueur $1<=n$

```java
java -jar goosegameExe.jar player1 player2 playerN
```
