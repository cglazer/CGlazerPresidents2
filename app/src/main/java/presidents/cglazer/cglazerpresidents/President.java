package presidents.cglazer.cglazerpresidents;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Chaya Glazer on 10/23/2015.
 */
public class President implements Serializable {
    private int number;
    private String president;
    private int birth_year;
    private int death_year;
    //below is another option so you can change from gson to cammlecase.
   @SerializedName("took_office")
    private String tookOffice;
   // @SerializedName("left_office")
    private String left_office;
    private String party;

    public String getPresident() {

        return this.president;
    }

    public int getNumber() {

        return this.number;
    }

    public int getBirthYear() {

        return this.birth_year;
    }

    public int getDeathYear() {

        return this.death_year;
    }

    public String getTookOffice() {

        return this.tookOffice;
    }

    public String getLeftOffice() {

        return this.left_office;
    }

    public String getParty() {

        return this.party;
    }
}

