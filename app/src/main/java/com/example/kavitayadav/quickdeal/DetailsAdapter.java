package com.example.kavitayadav.quickdeal;

/**
 * Created by kavita yadav on 19-04-17.
 */
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.Serializable;
import java.util.List;
import com.example.kavitayadav.quickdeal.R;

import butterknife.BindView;
import butterknife.ButterKnife;

import static java.security.AccessController.getContext;

public class DetailsAdapter extends RecyclerView.Adapter<DetailsAdapter.ViewHolder> {
    private Context mContext;
    private List<Details> detailList;



    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView title, desc, post;
        private LinearLayout main2;

        public ViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            desc = (TextView) view.findViewById(R.id.desc);
            post = (TextView)view.findViewById(R.id.post);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Details movie = detailList.get(getPosition());
            Intent intent = new Intent(mContext, ChatDetailClass.class);
            Bundle bun = new Bundle();
            String message = title.getText().toString();
            String message2 = desc.getText().toString();
            String message3 = post.getText().toString();
            bun.putString("key1", message);
            bun.putString("key2", message2);
            bun.putString("key3", message3);
            intent.putExtras(bun);
           // intent.putExtra("MOVIE_TITLE",
                  //  (CharSequence) movie);
            mContext.startActivity(intent);
        }
    }

    public DetailsAdapter(Context mContext, List<Details> detailList) {
        this.mContext = mContext;
        this.detailList = detailList;
    }

    @Override
    public DetailsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.detail_card, parent, false);
      //  itemView.setOnClickListener((View.OnClickListener) mContext);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Details album = detailList.get(position);
        holder.title.setText(album.getTitle());
        holder.desc.setText(album.getDesc());
        holder.post.setText(album.getPost());
    }


 /*   public  class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        @BindView(R.id.tvOverview)
        TextView tvTitle;
        @BindView(R.id.chat_card)
        CardView chat_card;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
            view.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {


        }
    }*/




    @Override
    public int getItemCount() {
        return detailList.size();
    }

}
