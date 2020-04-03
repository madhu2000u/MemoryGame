package com.madhu.memorygame;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.ImageView;

import androidx.cardview.widget.CardView;

public class CircularRevealAnim implements Animator.AnimatorListener {

    private ImageView memoryCard;
    private boolean revealOut;
    //private int cx, cy;
    //private float finalRadius;
    private Animator animator;

    public CircularRevealAnim(ImageView view, boolean revealOut)
    {
        this.memoryCard=view;
        this.revealOut=revealOut;
        init();

    }


    @SuppressLint("NewApi")
    private void init()
    {

        int cx = memoryCard.getWidth() / 2;
        int cy = memoryCard.getHeight() / 2;
        Log.d("msg","Testing debugging");

        // get the final radius for the clipping circle
        float finalRadius = (float) Math.hypot(cx, cy);
        animator = ViewAnimationUtils.createCircularReveal(memoryCard, cx, cy,  revealOut? 0f: finalRadius,revealOut?finalRadius:0f); // starts form 0 to radius
        animator.setDuration(200);
        animator.addListener(this);
        memoryCard.setVisibility(View.VISIBLE);

    }

    public void animate()
    {
        animator.start();

    }


    @Override
    public void onAnimationStart(Animator animator) {


    }

    @Override
    public void onAnimationEnd(Animator animator) {
        Log.d("msg",String.valueOf(animator.isRunning()));
        Log.d("msg","Reached animation end function");
        if (!revealOut)
        {
            Log.d("msg","Reached here");
            memoryCard.setVisibility(View.INVISIBLE);
        }

    }

    @Override
    public void onAnimationCancel(Animator animator) {
        Log.d("msg","Animaion cancelled");

    }

    @Override
    public void onAnimationRepeat(Animator animator) {

    }
}
