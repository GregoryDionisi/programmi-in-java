package it.unibs.ing.fg.assistente;

public class Assistente {
    //attributi
    private String nome;

    //Un costruttore è un metodo speciale di una classe che serve a INIZIALIZZARE un oggetto quando viene creato
    //se non si specifica il costruttore java ne crea uno di default vuoto

    //Costruttore
    public Assistente(String n){
        nome = n;
    }
    //metodi
    public void saluta() {
        System.out.println("Buongiorno " + nome);
    }
}
