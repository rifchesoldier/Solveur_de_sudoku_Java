# Solveur de Sudoku en Java

Un programme Java pour résoudre des grilles de Sudoku en utilisant l'algorithme de backtracking.

## Fonctionnalités
- Chargement de grille depuis un fichier texte
- Saisie manuelle en console
- Affichage formaté avec des bordures
- Résolution de grilles valides

## Membre du groupe GLSI3B
El Hadji Abdourahmane Diop / 
 Mame Saye Fall /
 Bigue Badiane /
 Cherif Younouss Diedhiou


## Utilisation
```bash
# Compiler les fichiers
javac src/*.java

# Exécuter avec un fichier (avec les fichier grilleX.txt)
java src.Main .\grilles-exemple\grille2.txt


---

### Comment le coller rapidement sur ton terminal (Fedora) :
Si tu veux le faire directement en une seule commande, tu peux taper ceci :

```bash
cat <<EOF > README.md
# Solveur de Sudoku en Java

Un programme Java pour résoudre des grilles de Sudoku en utilisant l'algorithme de backtracking.

## Fonctionnalités
- Chargement de grille depuis un fichier texte
- Saisie manuelle en console
- Affichage formaté avec des bordures
- Résolution de grilles valides

## Utilisation
\`\`\`bash
# Compiler les fichiers
javac src/*.java

# Exécuter avec un fichier (grille1.txt, grille2.txt ou grille3.txt)
java -cp src Main grilles-exemple/grilleX.txt

# Exécuter en saisie manuelle
java -cp src Main
\`\`\`
EOF

