package com.example.kavitayadav.quickdeal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kavita yadav on 20-04-17.
 */

public class ChatMain extends AppCompatActivity{

    private RecyclerView recyclerView;
    private ChatAdapter adapter;
    private List<ChatDetails> chatdetailList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_chat);

        chatdetailList = new ArrayList<>();
        adapter = new ChatAdapter(this, chatdetailList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        prepareDetail();

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.chatmain, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void prepareDetail() {
        ChatDetails chatdetail = new ChatDetails("GLOBAL ELECTRONICS", "Fine sir, Will deliver sample on your registed..." , "2 min ago");
        chatdetailList.add(chatdetail);

        chatdetail = new ChatDetails("PATEL ELECTRONICS", "Yes Sir!We have product available in stock sir..","5 min ago");
        chatdetailList.add(chatdetail);

        chatdetail = new ChatDetails("BOMBAY ELECTRONICS", "Thank you sir!","10 min ago");
        chatdetailList.add(chatdetail);

        chatdetail = new ChatDetails("OPERA SOLUTIONS", "No problem sir.Willupdate you soon.","30 min ago");
        chatdetailList.add(chatdetail);

        chatdetail = new ChatDetails("HARI OM ELECTRONICS", "Sorry sir. But you can check out in other sha..","2 days ago");
        chatdetailList.add(chatdetail);

        chatdetail = new ChatDetails("KRISHNA LIGHT JUNCTION", "Your requirement have been recevied sir :)","3 days ago");
        chatdetailList.add(chatdetail);

        adapter.notifyDataSetChanged();
    }

}
