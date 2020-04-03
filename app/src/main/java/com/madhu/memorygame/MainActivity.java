package com.madhu.memorygame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private boolean isFlipped=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // previously invisible view
        final CardView memoryCard = findViewById(R.id.image);
        final ImageView imageView=findViewById(R.id.imageView);
        imageView.setVisibility(View.INVISIBLE);

        memoryCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isFlipped)
                {
                    CircularRevealAnim animOut=new CircularRevealAnim(imageView, true);
                    animOut.animate();
                    isFlipped=true;
                }
                else if (isFlipped)
                {
                    CircularRevealAnim animOut=new CircularRevealAnim(imageView, false);
                    animOut.animate();
                    isFlipped=false;

                }

            }
        });



// Check if the runtime version is at least Lollipop
       /* if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

            myView.post(new Runnable() {
                @Override
                public void run() {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        // get the center for the clipping circle
                        int cx = myView.getWidth() / 2;
                        int cy = myView.getHeight() / 2;

                        // get the final radius for the clipping circle
                        float finalRadius = (float) Math.hypot(cx, cy);
                        Animator anim = ViewAnimationUtils.createCircularReveal(myView, cx, cy,  0f,finalRadius);

                        myView.setVisibility(View.VISIBLE);
                        anim.setDuration(5000);
                        anim.start();
                        anim.addListener(new Animator.AnimatorListener() {
                            @Override
                            public void onAnimationStart(Animator animator) {

                            }

                            @Override
                            public void onAnimationEnd(Animator animator) {
                                myView.setVisibility(View.INVISIBLE);

                            }

                            @Override
                            public void onAnimationCancel(Animator animator) {

                            }

                            @Override
                            public void onAnimationRepeat(Animator animator) {

                            }
                        });


                    } else {
                        // set the view to invisible without a circular reveal animation below Lollipop
                        myView.setVisibility(View.INVISIBLE);
                    }
                }});

            // make the view visible and start the animation

        }*/



    }
}
