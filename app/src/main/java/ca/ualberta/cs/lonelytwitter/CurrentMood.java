package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/*
* Add three new model classes to LonelyTwitter: the first should be an abstract base class which
 * represents the current mood. The second and third should be non-abstract classes which represent
 * different moods and inherit from the abstract class. Each mood should have a date and getters and
  * setters to access the date. A constructor which sets the date to a default and a constructor
   * which takes a date as an argument should be provided.  Encapuslation should be followed. Each
    * mood should also have a mood-dependent format method which returns a string representing the mood.
Your new code should have examples of: classes, methods, attributes, access modifiers,
encapsulation, constructors, inheritance and abstract base classes.


Please submit a link to the specific commit of your modified version of LonelyTwitter!

(https://github.com/<username>/lonelyTwitter/tree/<commit_hash>)
*
* */
public abstract class CurrentMood {
    Date date = new Date();
    String currentMood;
    String dateString = date.toString();

    // Constructor
    CurrentMood() {
        this.currentMood = "Happy"; // default value is happy
    }
    CurrentMood(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCurrentMood() {
        return currentMood;
    }

    public void setCurrentMood(String currentMood) {
        this.currentMood = currentMood;
    }

    public String getDateNow() {
        return dateString;
    }

}
