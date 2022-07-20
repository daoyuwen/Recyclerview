package com.alap.recyclerview;

import android.graphics.Color;
import android.text.TextUtils;
import android.widget.ImageView;


import androidx.databinding.BindingAdapter;

import com.squareup.picasso.Picasso;

public class ImageAdapter {



    //加载网络图片
    @BindingAdapter("itemImage")
    public static void setImage(ImageView imageView, String url) {

        if (!TextUtils.isEmpty(url)) {
            Picasso.get()
                    .load(url)
                    .placeholder(R.drawable.ic_launcher_background)
                    .into(imageView);
        } else {
            imageView.setBackgroundColor(Color.GRAY);
        }
    }
}
