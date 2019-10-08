package com.example.ranjeetkumarrana.studenterpmodel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    private ImageView imageE,imageSt,imageNewPath;
    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageE = (ImageView)findViewById(R.id.e);
        imageSt = (ImageView)findViewById(R.id.st);
        imageNewPath = (ImageView)findViewById(R.id.imageView);
        //todo :- animations
        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.push_down);
        imageE.setAnimation(animation);

        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.push_left);
        imageSt.setAnimation(animation);

        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.push_right);
        imageNewPath.setAnimation(animation);
        //todo end animations

        Thread thread = new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    sleep(3000);
                    Intent intent = new Intent(MainActivity.this,StudentLoginActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                super.run();
            }
        };
        thread.start();
    }

}
