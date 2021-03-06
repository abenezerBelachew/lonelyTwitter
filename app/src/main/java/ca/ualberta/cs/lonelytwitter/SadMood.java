package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class SadMood extends CurrentMood {

    SadMood() {
        this.currentMood = "Sad";
    }

    SadMood(Date date) {
        this.currentMood = "Sad";
        this.date = date;
    }

    /* returns the mood this class represents */
    public String getMood() {
        return currentMood;
    }

    /* returns the date */
    public Date getDate() {
        return date;
    }


    /* sets the date */
    // was also declared in CurrentMood class and as
    // a constructor above
    public void setDate(Date date) {
        this.date = date;
    }

}
