package com.example.david.swnhelper;

public class CharacterName {
    private String characterFName;
    private String characterLName;
    private String characterEthnicity;
    // constructors
    public CharacterName() {}
    public CharacterName(String characterFName, String characterLName, String characterEthnicity) {
        this.characterFName = characterFName;
        this.characterLName = characterLName;
        this.characterEthnicity = characterEthnicity;
    }
    // properties
    public void setCharacterFName(String characterFName) {
        this.characterFName = characterFName;
    }
    public String getCharacterFName() {
        return this.characterFName;
    }

    public void setCharacterLName(String characterLName) {
        this.characterLName = characterLName;
    }
    public String getCharacterLName() {
        return this.characterLName;
    }

    public void setCharacterEthnicity(String characterEthnicity) {
        this.characterEthnicity = characterEthnicity;
    }
    public String getCharacterEthnicity() {
        return this.characterEthnicity;
    }

}
