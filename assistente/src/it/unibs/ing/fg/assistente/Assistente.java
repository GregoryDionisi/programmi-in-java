package it.unibs.ing.fg.assistente;

public class Assistente {
    //attributi
    private String testo;

    //Un costruttore è un metodo speciale di una classe che serve a INIZIALIZZARE un oggetto quando viene creato
    //se non si specifica il costruttore java ne crea uno di default vuoto

    //Costruttore
    /* public Assistente(String _testo){
        //testo = attributo di classe
        //_testo = parametro di classe
        testo = _testo;
    } */
    public Assistente(String testo){
        this.testo = testo; //si utilizza this per distinguere l'attributo di classe (this.testo) e il parametro (testo)
    }
    //metodi
    public void saluta() {
        System.out.println(testo); //scriviamo testo in modo da generalizzare visto che non indica solo il nome ma anche il saluto
    }
}
