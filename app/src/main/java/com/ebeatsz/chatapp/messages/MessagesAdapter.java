package com.ebeatsz.chatapp.messages;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ebeatsz.chatapp.R;

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

    }

    @Override
    public int getItemCount() {
        return messagesList.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        private CircleImageView profilePic;
        private TextView name;
        private TextView lastMessages;
        private TextView unSeenMessages;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            profilePic = itemView.findViewById(R.id.profilePic);
            name = itemView.findViewById(R.id.name);
            lastMessages = itemView.findViewById(R.id.lastMessages);
            unSeenMessages = itemView.findViewById(R.id.unSeenMessages);
        }
    }
}
