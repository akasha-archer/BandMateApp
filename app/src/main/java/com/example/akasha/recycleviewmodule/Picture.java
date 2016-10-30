package com.example.akasha.recycleviewmodule;

import android.support.annotation.DrawableRes;

/**
 * Created by Akasha on 10/27/16.
 */

public class Picture {
    private Integer image;
    private String title;
    private String designerName;


    public Picture(@DrawableRes Integer resource, String title, String designerName) {
        this.image = resource;
        this.title = title;
        this.designerName = designerName;
    }


    public Integer getImageResource() {
        return image;
    }

    public void setImageResource(Integer image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesignerName() {
        return designerName;
    }

    public void setDesignerName(String designerName) {
        this.designerName = designerName;
    }
}
