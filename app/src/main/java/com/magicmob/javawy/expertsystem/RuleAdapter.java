package com.magicmob.javawy.expertsystem;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.TextView;

/**
 * Created by abdelmageed on 15/04/17.
 */

public class RuleAdapter extends RecyclerView.Adapter<RuleAdapter.MyHolder> {
    Context context;
    public RuleAdapter(Context context) {
        this.context=context;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.rule_item,parent,false);
        MyHolder holder=new MyHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class MyHolder extends RecyclerView.ViewHolder {
        TextView txtRule;
        CheckBox ch;
        public MyHolder(View itemView) {
            super(itemView);

            txtRule=(TextView) itemView.findViewById(R.id.ruleItem);
            ch=(CheckBox) itemView.findViewById(R.id.ch);
        }
    }
}
