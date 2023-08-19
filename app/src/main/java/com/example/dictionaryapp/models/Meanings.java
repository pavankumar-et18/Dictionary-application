package com.example.dictionaryapp.models;

import java.util.List;

public class Meanings {
    String partOfSpeech="";
    List<Definitions> definitions=null;

    public String getPartsOfSpeech() {
        return partOfSpeech;
    }

    public void setPartsOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    public List<Definitions> getDefinitions() {
        return definitions;
    }

    public void setDefinitions(List<Definitions> definitions) {
        this.definitions = definitions;
    }
}
