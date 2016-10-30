package com.example.akasha.recycleviewmodule;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Akasha on 10/28/16.
 */

public class PictureViewHolder extends RecyclerView.ViewHolder {

    private final View view;
    private final ImageView thumbnailPic;
    private final TextView costumeTitle;
    private final TextView designerName;


    public PictureViewHolder(ViewGroup parent) {
        super(inflateView(parent));
        view = itemView;
        thumbnailPic = (ImageView) view.findViewById(R.id.ivThumbnail);
        costumeTitle = (TextView) view.findViewById(R.id.tvTitle);
        designerName = (TextView) view.findViewById(R.id.tvDesigner);
    }

    private static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.thumbnail_layout, parent, false);
    }

    public void bind(Picture picture) {
        costumeTitle.setText(picture.getTitle());
        designerName.setText(picture.getDesignerName());
        Integer resource = picture.getImageResource();
        if (resource != null) {
            thumbnailPic.setImageResource(resource);
        }
    }

    public TextView getTitle() {
        return costumeTitle;
    }

    public TextView getName() {
        return designerName;
    }

    public void setOnClickListener(View.OnClickListener clickListener) {
        view.setOnClickListener(clickListener);
    }


}
