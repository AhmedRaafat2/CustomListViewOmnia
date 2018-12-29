package com.google.customlistview;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class EmployeeDetails  extends AppCompatActivity {


    private TextView title,name_tag,name,id_tag,id,adress_tag,adress,salary_tag,salary,job_tag,job;
    private ImageView image;
    Employee employee;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee_details);

        title = findViewById(R.id.title);
        name = findViewById(R.id.name);
        name_tag = findViewById(R.id.name_tag);
        id = findViewById(R.id.id);
        id_tag = findViewById(R.id.id_tag);
        adress = findViewById(R.id.adress);
        adress_tag = findViewById(R.id.adress_tag);
        salary = findViewById(R.id.salary);
        salary_tag = findViewById(R.id.salary_tag);
        job = findViewById(R.id.job);
        job_tag = findViewById(R.id.job_tag);
        image = findViewById(R.id.image);


        Intent intent = getIntent();
        employee = (Employee) intent.getSerializableExtra("employee");

        //another way to not make intent object........
        //employee = (Employee)getIntent().getSerializableExtra("employee");

        name.setText(employee.getName().toString());
        id.setText(employee.getId().toString());
        adress.setText(employee.getAddress().toString());
        salary.setText(employee.getSalary().toString());
        job.setText(employee.getJob().toString());
        image.setImageResource(employee.getImage());



    }
}
