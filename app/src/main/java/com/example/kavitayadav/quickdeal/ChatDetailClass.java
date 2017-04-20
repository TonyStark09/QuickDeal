package com.example.kavitayadav.quickdeal;

/**
 * Created by kavita yadav on 20-04-17.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ChatDetailClass extends AppCompatActivity {

    TextView title;



    /*@BindView(R.id.ivMovieBackdrop)
    ImageView ivMovieBackdrop;
    @BindView(R.id.tvOverview)
    TextView tvOverview;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_details);
        title = (TextView)findViewById(R.id.title2);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent in = getIntent();
        String value1 = in.getStringExtra("key1");
        String value2 = in.getStringExtra("key2");
        String value3 = in.getStringExtra("key3");
        //description.setText(value2);
        actionBar.setTitle(value1);




        //ButterKnife.bind(this);
       /* Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
*/
       /* Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Details details = (Details) extras.getSerializable("MOVIE");
            this.setTitle(Details.getTitle());
            tvOverview.setText(Details.getDesc());

        }*/
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.sidetitle, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
