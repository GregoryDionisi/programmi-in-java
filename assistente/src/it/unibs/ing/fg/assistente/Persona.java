package it.unibs.ing.fg.assistente;

public class Persona {
    //attributi/campi
    private String nome;
    private String cognome;
    private int eta;

    //Costruttore
    public Persona(String nome, String cognome, int eta){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getEta() {
        return eta;
    }
}
