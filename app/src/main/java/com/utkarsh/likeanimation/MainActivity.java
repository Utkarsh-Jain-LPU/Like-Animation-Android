package com.utkarsh.likeanimation;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.like.LikeButton;
import com.like.OnLikeListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LikeButton likeButton = findViewById(R.id.like);

        likeButton.setOnLikeListener(new OnLikeListener() {
            @Override
            public void liked(LikeButton likeButton) {
                likeButton.setLikeDrawableRes(R.drawable.unliked);
            }
            @Override
            public void unLiked(LikeButton likeButton) {
                likeButton.setLikeDrawableRes(R.drawable.liked);
            }
        });
    }
}
