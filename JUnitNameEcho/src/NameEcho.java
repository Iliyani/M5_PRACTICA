import java.util.Scanner;

public class NameEcho {

public static String processName(String nomComplet) {
String nom1, nom2, nomRestant, cognom, noms, nomResultant;
nomComplet = nomComplet.trim();

if (nomComplet.indexOf(" ") > -1) {
  nom1 = nomComplet.substring(0, nomComplet.indexOf(" "));
  nomRestant = nomComplet.substring(nomComplet.indexOf(" ") + 1);
  
  if (nomRestant.indexOf(" ") > -1) {
    nom2 = nomRestant.substring(0, nomRestant.indexOf(" "));
    cognom = nomRestant.substring(nomRestant.indexOf(" ") + 1);
    noms = nom1.concat(" " + nom2);
    nomResultant = noms.concat(" " + cognom.toUpperCase());
    return nomResultant;
  } else { 
    nomResultant = nom1.concat(" " + nomRestant.toUpperCase());
    return nomResultant;
  }
} else {
  return nomComplet;
}
}

public static String processSecondSurname(String nomComplet) {
String nom1, nom2, nomRestant, cognom, noms, nomResultant;
nomComplet = nomComplet.trim();

if (nomComplet.indexOf(" ") > -1) {
  nom1 = nomComplet.substring(0, nomComplet.indexOf(" "));
  nomRestant = nomComplet.substring(nomComplet.indexOf(" ") + 1);
  
  if (nomRestant.indexOf(" ") > -1) {
    nom2 = nomRestant.substring(0, nomRestant.indexOf(" "));
    cognom = nomRestant.substring(nomRestant.indexOf(" ") + 1);
    noms = nom1.concat(" " + nom2);
    nomResultant = noms.concat(" " + Character.toUpperCase(cognom.charAt(0)) + cognom.substring(1));
    return nomResultant;
  } else {
    return nomComplet;
  }
} else {
  return nomComplet;
}
}
}