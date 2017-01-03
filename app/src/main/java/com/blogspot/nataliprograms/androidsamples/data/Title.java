package com.blogspot.nataliprograms.androidsamples.data;

import android.support.annotation.IntRange;
import android.support.annotation.NonNull;

/**
 * Created by NataliLA on 3-1-17.
 */

public class Title {

    private int itemID;
    private String title;

    public Title(int itemID, String title) {
        this.itemID = itemID;
        this.title = title;
    }

    @IntRange(from = 0)
    public int getItemID() {
        return itemID;
    }

    public void setItemID( @IntRange(from = 0) int itemID) {
        this.itemID = itemID;
    }

    @NonNull
    public String getTitle() {
        return title;
    }

    public void setTitle(@NonNull String title) {
        this.title = title;
    }
}
