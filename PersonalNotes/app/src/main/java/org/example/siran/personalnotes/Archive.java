package org.example.siran.personalnotes;

/**
 * Created by Siran on 8/11/2015.
 */
public class Archive {
    private String mTitle, mDescription, mDateTime, mCategory, mType;
    private int mId;

    public Archive(String title, String description, String dateTime, String category, String type, int id) {
        mTitle = title;
        mDescription = description;
        mDateTime = dateTime;
        mCategory = category;
        mType = type;
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

    public String getCategory() {
        return mCategory;
    }

    public void setCategory(String category) {
        mCategory = category;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }
}
