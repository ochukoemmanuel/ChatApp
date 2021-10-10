package com.ebeatsz.chatapp.chat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.ebeatsz.chatapp.R;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

public class chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        final ImageView backBtn = findViewById(R.id.backBtn);
        final TextView nameTv = findViewById(R.id.name);
        final EditText messageEditText = findViewById(R.id.messageEditText);
        final CircleImageView profilepic =findViewById(R.id.profilePic);
        final  ImageView sendBtn = findViewById(R.id.sendBtn);

        final String getName = getIntent().getStringExtra("name");
        final String getProfilepic = getIntent().getStringExtra("profile_pic");

        nameTv.setText("getName");
        Picasso.get().load(getProfilepic).into(profilepic);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}