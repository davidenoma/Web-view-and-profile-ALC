package com.nomatechnology.challenge1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }


    public void startActivityProfile(View view) {
        Intent profileIntent = new Intent(this, MyProfile.class);

        startActivity(profileIntent);

    }

    public void startActivityAndelaHome(View view) {
        startActivity(new Intent(this, AndelaHome.class));
    }
}
