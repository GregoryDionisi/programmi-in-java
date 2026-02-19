package it.unibs.ing.fg.assistente;

public class AssistenteMain {
    //COSTANTI
    public static final String SALUTO_IT = "Buongiorno"; //final indica che quell'attributo viene inizializzato in maniera finale, ovvero che non può essere cambiato (def di costante)
    public static final String SALUTO_FR = "Bonjour";
    public static void main(String[] args) {
        //Creare istanza della classe assistente
        //Dichiarazione della variabile
        Assistente assistenteA;
        Assistente assistenteB;
        Assistente assistenteC;
        Assistente assistenteD;
        Persona personaA;
        //Assegnamento
        assistenteA = new Assistente(SALUTO_IT + " LUCA"); //newAssistente() crea effettivamente uno spazio in memoria del tipo Assistente
        assistenteA.saluta();
        assistenteB = new Assistente(SALUTO_IT + " MARCO");
        assistenteB.saluta();
        assistenteC = new Assistente(SALUTO_IT + " LAURA");
        assistenteC.saluta();
        personaA = new Persona("MARCO", "ROSSI", 22);
        assistenteD = new Assistente(SALUTO_IT + personaA.getNome());
    }
}
