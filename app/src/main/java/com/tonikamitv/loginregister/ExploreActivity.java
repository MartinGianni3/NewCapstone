package com.tonikamitv.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExploreActivity extends AppCompatActivity {

    public Button bHome;
    public void Homeinit(){
        bHome = (Button) findViewById(R.id.bHome);
        bHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Home = new Intent(ExploreActivity.this, HomeActivity.class );
                startActivity(Home);
            }
        });


    }

    public Button bExplore;
    public void Exploreinit(){
        bExplore = (Button) findViewById(R.id.bExplore);
        bExplore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Explore = new Intent(ExploreActivity.this, ExploreActivity.class );
                startActivity(Explore);
            }
        });


    }

    public Button bNews;
    public void Newsinit(){
        bNews = (Button) findViewById(R.id.bNews);
        bNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent News = new Intent(ExploreActivity.this, NewsActivity.class );
                startActivity(News);
            }
        });


    }

    public Button bProfile;
    public void Profileinit(){
        bProfile = (Button) findViewById(R.id.bProfile);
        bProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Profile = new Intent(ExploreActivity.this, UserAreaActivity.class );
                startActivity(Profile);
            }
        });


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);
        Homeinit();
        Exploreinit();
        Newsinit();
        Profileinit();
    }
}
