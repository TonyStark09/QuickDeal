package com.example.kavitayadav.quickdeal;

/**
 * Created by kavita yadav on 20-04-17.
 */
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.MyViewHolder> {
    private Context mContext;
    private List<ChatDetails> chatdetailList;



    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView chattitle, chatdesc, chatpost;
        private LinearLayout main2;

        public MyViewHolder(View view) {
            super(view);
            chattitle = (TextView) view.findViewById(R.id.chattitle);
            chatdesc = (TextView) view.findViewById(R.id.chatdesc);
            chatpost = (TextView)view.findViewById(R.id.chatpost);

        }
    }

    public ChatAdapter(Context mContext, List<ChatDetails> chatdetailList) {
        this.mContext = mContext;
        this.chatdetailList = chatdetailList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.chat_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        ChatDetails album = chatdetailList.get(position);
        holder.chattitle.setText(album.getTitle());
        holder.chatdesc.setText(album.getDesc());
        holder.chatpost.setText(album.getPost());

    }

    @Override
    public int getItemCount() {
        return chatdetailList.size();
    }
}
