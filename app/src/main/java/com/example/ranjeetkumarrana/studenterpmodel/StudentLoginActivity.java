package com.example.ranjeetkumarrana.studenterpmodel;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.rengwuxian.materialedittext.MaterialEditText;

public class StudentLoginActivity extends AppCompatActivity
{
    private MaterialEditText username,password;
    private Button login,skipButton,signUp;
    private TextView fogotenPassword;
    private ImageView imageE;

    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

        username = (MaterialEditText)findViewById(R.id.userName);
        password = (MaterialEditText)findViewById(R.id.password);
        login = (Button)findViewById(R.id.loginButton);
        signUp = (Button) findViewById(R.id.signButton);
        skipButton = (Button) findViewById(R.id.skip_button);
        fogotenPassword = (TextView)findViewById(R.id.forgotPassword);
        imageE = (ImageView)findViewById(R.id.e);

        //todo:- Animation
        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.push_down);
        imageE.setAnimation(animation);
        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.push_down);
        imageE.setAnimation(animation);

        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.push_left);
        login.setAnimation(animation);

        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.push_right);
        signUp.setAnimation(animation);

        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.push_down);
        skipButton.setAnimation(animation);
        //todo end animations

        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast toast=Toast.makeText(getApplicationContext(),"You are clicked login button",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        signUp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast toast=Toast.makeText(getApplicationContext(),"You are clicked sign up button",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        fogotenPassword.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(),"You want to forgot the password",Toast.LENGTH_SHORT).show();
            }
        });
        skipButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                skipDialog();
            }
        });
    }

    private void skipDialog()
    {
        startActivity(new Intent(StudentLoginActivity.this,HomeActivity.class));
    }
}
