# Run-Length Encoding


## Instructions

le but de l'exercise est d'implémenter les fonction de codage et le décodage de l'algorithme RLE.

Le codage RLE est une forme simple de compression de données:
les caractères consécutifs sont remplacés par leur valeur et leur compte.

Par exemple, nous pouvons représenter les 53 caractères originaux avec seulement 13.

```texte
"WWWWWWWWWWWWBWWWWWWWWWBBBBWWWWWWWWWWWWWWWWWWWWWB" -> "12WB12W3B24WB"
```

RLE est un algorithm de une compression de données sans perte: il permet de reconstituer parfaitement les données d'origine à partir.

#### encodage

```texte
"AABCCCDEEEE" -> "2AB3CD4E" 
```

#### decodage

```texte
"2AB3CD4E" -> "AABCCCDEEEE" 
```

Pour plus de simplicité, vous pouvez supposer que la chaîne non codée ne contiendra que
les lettres A à Z (minuscules ou majuscules) et les espaces. Par ici
les données à encoder ne contiendront jamais de nombres et de nombres à l'intérieur des données à
être décodé représentent toujours le compte pour le caractère suivant.


## Template

Vous pouvez resoudre l'exercise dans votre langague préféré (`java`, `javascript`, `python` ...). 

Chaque sous-dossier  ()`java`,`javascript`, `python`) contient un bootstrap d'application, ainsi qu'un jeu de test. 

Dans chaque sous-dossier (`java`, `javascript`, `python`), vous trouverez egalement un fichier `HELP.md` contenant les intructions de `setup` pour le language correspondant.

## Source

Wikipedia - https://en.wikipedia.org/wiki/Run-length_encoding