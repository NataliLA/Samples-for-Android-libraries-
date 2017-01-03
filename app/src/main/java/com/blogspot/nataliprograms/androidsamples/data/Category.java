package com.blogspot.nataliprograms.androidsamples.data;

import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created by NataliLA on 2-1-17.
 */

public class Category {

    private int itemID;
    private String title;
    private String imageUrl;

    public Category(@IntRange(from = 0) int itemID, @NonNull String title, @Nullable String imageUrl) {
        this.title = title;
        this.imageUrl = imageUrl;
    }

    @IntRange(from = 0)
    public int getItemID() {
        return itemID;
    }

    public void setItemID(@IntRange(from = 0) int itemID) {
        this.itemID = itemID;
    }

    @NonNull
    public String getTitle() {
        return title;
    }

    public void setTitle(@NonNull String title) {
        this.title = title;
    }

    @Nullable
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(@Nullable String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
