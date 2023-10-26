package org.lessons.java.listaRegali;

public class Regalo {
    String descrizione;
    String destinatario;

    public Regalo(String descrizione, String destinatario) {
        this.descrizione = descrizione;
        this.destinatario = destinatario;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String toString(){
        return descrizione + " - " +  destinatario;
    }
}
