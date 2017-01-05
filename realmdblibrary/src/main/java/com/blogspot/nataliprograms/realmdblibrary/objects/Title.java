package com.blogspot.nataliprograms.realmdblibrary.objects;

import io.realm.annotations.PrimaryKey;

/**
 * Created by NataliLA on 5-1-17.
 */

public class Title {

    @PrimaryKey
    private int titleId;
    private String titleTitle;

    public int getTitleId() {
        return titleId;
    }

    public void setTitleId(int titleId) {
        this.titleId = titleId;
    }

    public String getTitleTitle() {
        return titleTitle;
    }

    public void setTitleTitle(String titleTitle) {
        this.titleTitle = titleTitle;
    }
}
