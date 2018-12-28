package com.google.customlistview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EmployeeAdapter extends ArrayAdapter<Employee> {

    private Context context;
    private  ArrayList<Employee> employees;


    public EmployeeAdapter(Context context, ArrayList<Employee> employees) {
        super(context, R.layout.custom_row, employees);

        this.context = context;
        this.employees = employees;
    }

    @Override
    public int getCount() {
        return employees.size();
    }


    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.custom_row,parent,false);

        //For Test what is convertView
        if(convertView != null){
            Log.e("not null pos",position+"");
        }
        else {
            Log.e(" null pos",position+"");
        }


        TextView name = view.findViewById(R.id.name);
        TextView job = view.findViewById(R.id.job);

        name.setText(employees.get(position).getName());
        job.setText(employees.get(position).getJob());


        return view;
    }
}
