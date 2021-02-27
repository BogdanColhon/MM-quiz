package com.example.mmquiz;

public class questions3 {
    public String mQuestions[]={
            "Deciziile clasificate după orizontul de timp pentru care se adoptă sunt:",
            "Care dintre teoriile următoare nu este una de leadership:",
            "Planurile permanente includ:",
            "Tipurile de nevoi care aparțin teoriei nevoilor satisfăcute sunt:",
            "Care specializare nu este una a marketingului clasic:",
            "Un avantaj al segmentării piețelor:",
            "Publicitatea presupune:",
            "Care este prima etapă a procesului de adoptare a produsului?",
            "Care dintre următoarele exemple nu este o piață de clienți:",
            "În care etapă a ciclului de viață a unei firme, vânzările ating punctul maxim?",
            "Ce factor nu trebuie luat in considerare la stabilirea prețului?",
            "Care dintre următoarele exemple nu este o caracteristică a serviciilor:",
            "Micromediul firmei nu include:",
            "Cei 4 \"P\" ai mixului de marketing semnifică:",
            "Care este ultima etapă de dezvoltare a unei organizații:",
            "Dupa resursele și activitățile controlate avem:",
            "Care dintre următoarele afirmații nu este o etapă a procesului de control:",
            "Care sunt rolurile interpersonale ale managerilor?",
            "Activitățile de planificare și previzionare sunt activități:",
            "Fabricarea unor produse la un cost mai mic pe bucată este specifică strategiei:"
    };

    private String mChoice[][]={
            {"de grup","sigure,riscante,nesigure","programate și neprogramate","strategice,tactice,curente"},
            {"Teoria Caracteristicilor","Teoria Comportamentală","Teoria nevoi-scop","Teoria Transformațională"},
            {"Politicile,procedurile,\nregulile","Bugetele","Proiectele","Programele"},
            {"Nevoi de împlinire, nevoi de putere, nevoi de afiliație","Nevoi fiziologice, nevoi de securitate","Nevoi de putere, nevoi de apartenență,nevoi de securitate","Nevoi existențiale, nevoi relaționare"},
            {"Marketingul bunurilor de consum","Marketingul agricol","Marketingul industrial","Marketingul social"},
            {"Oferă o mai bună înțelegere a pieței","Informațiile noi sunt limitate","Îngreunează dezvoltarea planurilor de marketing","Număr limitat de piețe"},
            {"Promovare plătită din partea firmei","Promovarea fără costuri din partea firmei","Promovarea direct la client","Valoare adăugată oferită"},
            {"Etapa de luare la cunoștință","Etapa de interes","Etapa de evaluare","Etapa de adoptare"},
            {"Piețe de consum","Piața neagră","Piețe de afaceri","Piețe gobale"},
            {"Creștere","Introducere în piață","Maturitate","Dezvoltarea produsului"},
            {"Cererea","Concurența","Ambiții personale","Constrângeri legale"},
            {"Intangibilitate","Inseparabilitate","Tangibilitate","Perisabilitate"},
            {"Clienți","Consilieri","Furnizori","Intermediari"},
            {"Produs,Preț,\nPromovare,Plasare","Profit,Preț,\nPromovare.Plasare","Piață,Profit,\nPreț,Promovare","Produs,Piață,\nPreț,Promovare"},
            {"Direcționare","Delegare","Colaborare","Coordonare"},
            {"Control total, control selectiv","Control tehnic,control economic, control financiar","Control normativ,control practic, control teoretic","Control direct, control indirect"},
            {"Măsurarea performanțelor actuale","Compararea performanțelor cu standardele","Direcționare","Corectarea abaterilor"},
            {"Negociator","Reprezentant,lider,de legătură","Purtător de cuvânt,lider,negociator","Coordonator"},
            {"Urgente și neimportante","Urgente și importante","Neurgente și neimportante","Neurgente și importante"},
            {"Lider de cost","Lider de produs","Nișe de piață","Niciunul din răspunsuri"}
    };

    private String mCorrectAnswers[]={"strategice,tactice,curente","Teoria nevoi-scop","Politicile,procedurile,\nregulile","Nevoi de împlinire, nevoi de putere, nevoi de afiliație","Marketingul social","Oferă o mai bună înțelegere a pieței","Promovarea fără costuri din partea firmei","Etapa de luare la cunoștință","Piața neagră",",Maturitate","Ambiții personale","Tangibilitate","Consilieri","Produs,Preț,\nPromovare,Plasare","Colaborare","Control tehnic,control economic, control financiar","Direcționare","Reprezentant,lider,de legătură","Neurgente și importante","Lider de cost"};

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
