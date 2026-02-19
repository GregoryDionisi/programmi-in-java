package it.unibs.ing.fg.assistente;

public class AssistenteMain {
    public static void main(String[] args) {
        //Creare istanza della classe assistente
        //Dichiarazione della variabile
        Assistente assistenteA;
        //Assegnamento
        assistenteA = new Assistente("LUCA"); //newAssistente() crea effettivamente uno spazio in memoria del tipo Assistente
        assistenteA.saluta();
    }
}
