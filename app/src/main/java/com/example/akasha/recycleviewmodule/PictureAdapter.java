package com.example.akasha.recycleviewmodule;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;




public class PictureAdapter extends RecyclerView.Adapter {

    private List<Picture> thumbnails = Arrays.asList(
            new Picture(R.drawable.ka_bronze_thumb, "Bronze", " by Keshia Als"),
            new Picture(R.drawable.ka_reptile_thumb, "Reptile", " by Keshia Als"),
            new Picture(R.drawable.ka_snake_thumb, "Snake", " by Keshia Als"),
            new Picture(R.drawable.mc_caliente_thumb, "Caliente", " by Marie Collette"),
            new Picture(R.drawable.mc_phoenix_thumb, "Phoenix", " by Marie Collette"),
            new Picture(R.drawable.mc_sizzle_thumb, "Sizzle", " by Marie Collette"),
            new Picture(R.drawable.nb_kuu_thumb, "Kuu", " by Nadia Batson"),
            new Picture(R.drawable.nb_maisha_thumb, "Maisha", " by Nadia Batson"),
            new Picture(R.drawable.nb_malkia_thumb, "Malkia", " by Nadia Batson"),
            new Picture(R.drawable.rc_fountainyouth_thumb, "Fountain of Youth", " by Ryan Chan"),
            new Picture(R.drawable.rc_scarletfire_thumb, "Scarlet Fire", " by Ryan Chan"),
            new Picture(R.drawable.rc_willow_thumb, "Willow", " by Ryan Chan")
    );


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new PictureViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        PictureViewHolder viewHolder = (PictureViewHolder) holder;
        Picture thumbnail = thumbnails.get(position);
        String name = thumbnails.get(position).getTitle();
        viewHolder.bind(thumbnail);
        viewHolder.setOnClickListener(buildThumbnailClickListener(thumbnail));
        viewHolder.setOnClickListener(navigateToThumbnailViewListener(name));
    }

    private View.OnClickListener buildThumbnailClickListener(Picture thumbnail) {
        if (thumbnail != null) {
            return navigateToThumbnailViewListener(thumbnail.getDesignerName());
        }
        return defaultClickListener();
    }

    private View.OnClickListener navigateToThumbnailViewListener(final String designerName) {
        return new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(view.getContext(), DetailsTab.class);
                intent.putExtra(DetailView.COSTUME_NAME, designerName);
                view.getContext().startActivity(intent);
            }
        };
    }

    private View.OnClickListener defaultClickListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Do Nothing
            }
        };
    }

    @Override
    public int getItemCount() {
        return thumbnails.size();
    }

}
