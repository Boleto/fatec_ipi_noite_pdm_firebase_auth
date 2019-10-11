package br.com.boleto.fatec_ipi_noite_pdm_firebase_auth_firestore;

import java.util.Date;

class Mensagem implements Comparable <Mensagem> {

    @Override
    public int compareTo(Mensagem mensagem) {
        return this.date.compareTo(mensagem.date);
    }

    private String texto;
    private Date date;
    private String email;

    public Mensagem () {

    }

    public Mensagem(String texto, Date date, String email) {
        this.texto = texto;
        this.date = date;
        this.email = email;
    }

    public String getTexto() {
        return texto;
    }

    public Date getDate() {
        return date;
    }

    public String getEmail() {
        return email;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
