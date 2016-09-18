package com.siubie.recylcerview.models;

/**
 * Created by siubie on 18/09/16.
 */
public class MyEmail {
    public String pengirim,subject,ringkasan,waktu;

    public MyEmail(String pengirim, String subject, String ringkasan, String waktu) {
        this.pengirim = pengirim;
        this.subject = subject;
        this.ringkasan = ringkasan;
        this.waktu = waktu;
    }

    public String getPengirim() {
        return pengirim;
    }

    public void setPengirim(String pengirim) {
        this.pengirim = pengirim;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getRingkasan() {
        return ringkasan;
    }

    public void setRingkasan(String ringkasan) {
        this.ringkasan = ringkasan;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }
}
