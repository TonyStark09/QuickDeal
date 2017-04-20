package com.example.kavitayadav.quickdeal;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private DetailsAdapter adapter;
    private List<Details> detailList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        detailList = new ArrayList<>();
        prepareDetail();
        adapter = new DetailsAdapter(this, detailList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);



       android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void prepareDetail() {
                Details detail = new Details("RAKESH PATEL", "need 1000pcs of Electric fans" , "posted 30 min ago");
                detailList.add(detail);

                detail = new Details("JOSEPH SMITH", "500 LED Television for New Showroom","posted 45 min ago");
                detailList.add(detail);

                detail = new Details("SHAILEE SHAH", "Need 10000pcs of Electric fans","posted 1 hr ago");
                detailList.add(detail);

                detail = new Details("VAIBHAV GUPTA", "Requirment of 500 LED TV","posted 1 day ago");
                detailList.add(detail);

                detail = new Details("HARRY D'SOUZA", "Need 100pcs of DEll Laptops","posted 3 days ago");
                detailList.add(detail);

                //adapter.notifyDataSetChanged();
            }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if (id == R.id.chat) {

            Intent intent = new Intent(this,ChatMain.class);
            this.startActivity(intent);
            return true;
        }
        if (id == R.id.person) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
