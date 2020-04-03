package com.madhu.memorygame;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GamePlay extends AppCompatActivity {


    int[] imageIds={R.drawable.ic_account_box_red_100dp, R.drawable.ic_camera_yellow_100dp,
            R.drawable.ic_android_black_24dp, R.drawable.ic_man_black_24dp,
            R.drawable.ic_lock_lightblue_100dp, R.drawable.ic_snow_blue_100dp, R.drawable.ic_wallet_brown_100dp,
            R.drawable.ic_airplane_pink_100dp
    };

    int[][] grid_2d=new int[4][4];


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.game_layout);
    }
}
