package com.company;

public class Main {

    public static void main(String[] args) {
	KundeRepository kundeRepository=new KundeRepository();
    kundeRepository.getFileData();
    kundeRepository.printKunden();
    kundeRepository.sortKunden();
    kundeRepository.topDerOrteStatistik();
    }
}
