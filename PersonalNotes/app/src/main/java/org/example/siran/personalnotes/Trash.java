package org.example.siran.personalnotes;

/**
 * Created by Siran on 8/11/2015.
 */
public class Trash {
    private int mId;
    private String mTitle, mDescription, mDateTime;

    public Trash(int id, String title, String description, String dateTime) {
        mId = id;
        mTitle = title;
        mDescription = description;
        mDateTime = dateTime;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getDateTime() {
        return mDateTime;
    }

    public void setDateTime(String dateTime) {
        mDateTime = dateTime;
    }
}
