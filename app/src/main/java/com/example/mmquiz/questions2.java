package com.example.mmquiz;

public class questions2 {
    public String mQuestions[]={
            "Care specializare nu este una a marketingului clasic:",
            "Un avantaj al segmentării piețelor:",
            "Publicitatea presupune:",
            "Care este prima etapă a procesului de adoptare a produsului?",
            "Care dintre următoarele exemple nu este o piață de clienți:",
            "În care etapă a ciclului de viață a unei firme, vânzările ating punctul maxim?",
            "Ce factor nu trebuie luat in considerare la stabilirea prețului?",
            "Care dintre următoarele exemple nu este o caracteristică a serviciilor:",
            "Micromediul firmei nu include:",
            "Cei 4 \"P\" ai mixului de marketing semnifică:"
    };

    private String mChoice[][]={
            {"Marketingul bunurilor de consum","Marketingul agricol","Marketingul industrial","Marketingul social"},
            {"Oferă o mai bună înțelegere a pieței","Informațiile noi sunt limitate","Îngreunează dezvoltarea planurilor de marketing","Număr limitat de piețe"},
            {"Promovare plătită din partea firmei","Promovarea fără costuri din partea firmei","Promovarea direct la client","Valoare adăugată oferită"},
            {"Etapa de luare la cunoștință","Etapa de interes","Etapa de evaluare","Etapa de adoptare"},
            {"Piețe de consum","Piața neagră","Piețe de afaceri","Piețe gobale"},
            {"Creștere","Introducere în piață","Maturitate","Dezvoltarea produsului"},
            {"Cererea","Concurența","Ambiții personale","Constrângeri legale"},
            {"Intangibilitate","Inseparabilitate","Tangibilitate","Perisabilitate"},
            {"Clienți","Consilieri","Furnizori","Intermediari"},
            {"Produs,Preț,\nPromovare,Plasare","Profit,Preț,\nPromovare.Plasare","Piață,Profit,\nPreț,Promovare","Produs,Piață,\nPreț,Promovare"}
    };

    private String mCorrectAnswers[]={"Marketingul social","Oferă o mai bună înțelegere a pieței","Promovarea fără costuri din partea firmei","Etapa de luare la cunoștință","Piața neagră",",Maturitate","Ambiții personale","Tangibilitate","Consilieri","Produs,Preț,\nPromovare,Plasare"};

    public String getQuestion(int a)
    {
        String question=mQuestions[a];
        return question;
    }

    public String getChoice1(int a)
    {
        String choice=mChoice[a][0];
        return choice;
    }

    public String getChoice2(int a)
    {
        String choice=mChoice[a][1];
        return choice;
    }

    public String getChoice3(int a)
    {
        String choice=mChoice[a][2];
        return choice;
    }

    public String getChoice4(int a)
    {
        String choice=mChoice[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a)
    {
        String answer=mCorrectAnswers[a];
        return answer;
    }
}
