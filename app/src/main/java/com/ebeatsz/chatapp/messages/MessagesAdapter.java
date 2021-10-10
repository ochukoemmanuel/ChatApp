package com.ebeatsz.chatapp.messages;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ebeatsz.chatapp.R;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class MessagesAdapter extends RecyclerView.Adapter<MessagesAdapter.MyViewHolder> {

    private final List<Messages> messagesList;
    private final Context context;

    public MessagesAdapter(List<Messages> messagesList, Context context) {
        this.messagesList = messagesList;
        this.context = context;
    }

    @NonNull
    @Override
    public MessagesAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.messages_adapter_layout, null));
    }

    @Override
    public void onBindViewHolder(@NonNull MessagesAdapter.MyViewHolder holder, int position) {
        Messages list2 = messagesList.get(position);

        if (!list2.getProfile_pic().isEmpty()){
            Picasso.get().load(list2.getProfile_pic()).into(holder.profilePic);
        }

        holder.name.setText(list2.getName());
        holder.lastMessages.setText(list2.getLastMessage());

        if (list2.getUnseenMessages() == 0){
            holder.unSeenMessages.setVisibility(View.GONE);
            holder.lastMessages.setTextColor(Color.parseColor("#959595"));
        } else {
            holder.unSeenMessages.setVisibility(View.VISIBLE);
            holder.unSeenMessages.setText(list2.getUnseenMessages() + "");
            holder.lastMessages.setTextColor(context.getResources().getColor(R.color.theme_color_8));
        }
    }

    @Override
    public int getItemCount() {
        return messagesList.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        private final CircleImageView profilePic;
        private final TextView name;
        private final TextView lastMessages;
        private final TextView unSeenMessages;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            profilePic = itemView.findViewById(R.id.profilePic);
            name = itemView.findViewById(R.id.name);
            lastMessages = itemView.findViewById(R.id.lastMessages);
            unSeenMessages = itemView.findViewById(R.id.unSeenMessages);
        }
    }
}
