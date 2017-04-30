package com.magicmob.javawy.expertsystem;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import java.util.HashMap;

public class RuleActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    FloatingActionButton  send;
    String rul,fac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rule);
        recyclerView=(RecyclerView) findViewById(R.id.recycler);
        recyclerView.setAdapter(new RuleAdapter(RuleActivity.this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        send=(FloatingActionButton) findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RuleActivity.this,HomeActivity.class));
                overridePendingTransition(R.anim.slide_down, R.anim.slide_up);
                finish();
            }
        });
        SharedPreferences settins = PreferenceManager
                .getDefaultSharedPreferences(RuleActivity.this);
        rul=settins.getString("rule", "no");
        fac=settins.getString("fact", "no");

        HashMap<String ,String> map=new HashMap<>();
       map.put(rul,fac);
        for (int i=0;i<map.size();i++){

        }
    }
}
