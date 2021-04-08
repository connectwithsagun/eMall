package com.savatechnology.emall.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.savatechnology.emall.Fragments.AccountFragment;
import com.savatechnology.emall.R;

public class EditProfileActivity extends AppCompatActivity {
    Button etSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        etSubmit=findViewById(R.id.btSubmit);
        etSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EditProfileActivity.this, AccountFragment.class));
            }
        });
    }
}