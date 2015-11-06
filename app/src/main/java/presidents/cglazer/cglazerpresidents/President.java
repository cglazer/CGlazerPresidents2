package presidents.cglazer.cglazerpresidents;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Chaya Glazer on 10/23/2015.
 */
public class President implements Serializable{
    private int number;
    private String president;
    private int birthYear;
    private int deathYear;
    //below is another option so you can change from gson to cammlecase.
    //@SerializedName("took_office")
    private String tookOffice;
    private String leftOffice;
    private String party;

    public String getPresident() {

        return this.president;
    }

    public int getNumber() {

        return this.number;
    }

    public int getBirthYear() {

        return this.birthYear;
    }

    public int getDeathYear() {

        return this.deathYear;
    }

    public String getTookOffice() {
        return this.tookOffice;
    }

    public String getLeftOffice() {

        return this.leftOffice;
    }

    public String getParty() {

        return this.party;
    }
}

