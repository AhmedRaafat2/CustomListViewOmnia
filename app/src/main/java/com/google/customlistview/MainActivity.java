package com.google.customlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView employees;
    private ArrayList<Employee> employeesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        employees = findViewById(R.id.employees);


        Employee emp1 = new Employee("1","Ahmed","Alex","2500.0","Enginer",R.drawable.ic_launcher_background);
        Employee emp2 = new Employee("2","Ali","Cairo","3200.0","Teaster",R.drawable.ic_launcher_foreground);
        Employee emp3 = new Employee("3","Hussien","Assuit","1450.5","IOS",R.drawable.ic_launcher_background);
        Employee emp4 = new Employee("4","Asmaa","Egypt","1625.5","Design",R.drawable.ic_launcher_foreground);
        Employee emp5 = new Employee("5","Omnia","London","2020.0","Enginer",R.drawable.ic_launcher_background);
        Employee emp6 = new Employee("6","Mahmoud","UAE","3800.5","IOS",R.drawable.ic_launcher_foreground);
        Employee emp7 = new Employee("7","Raafat","Abu Zabui","4900.0","Design",R.drawable.ic_launcher_background);
        Employee emp8 = new Employee("8","Emad","Alex","5280.0","Team Leader",R.drawable.ic_launcher_foreground);
        Employee emp9 = new Employee("9","Ahmed","cairo","2490.5","Enginer",R.drawable.ic_launcher_background);
        Employee emp10 = new Employee("10","Ibtesam","Kuwait","8540.5","Design",R.drawable.ic_launcher_foreground);
        Employee emp11 = new Employee("11","Walled","Saudia","7400.5","Manger",R.drawable.ic_launcher_background);
        Employee emp12 = new Employee("12","Hossam","Argentina","3875.5","Enginer",R.drawable.ic_launcher_foreground);


        employeesList = new ArrayList<>();
        employeesList.add(emp1);
        employeesList.add(emp2);
        employeesList.add(emp3);
        employeesList.add(emp4);
        employeesList.add(emp5);
        employeesList.add(emp6);
        employeesList.add(emp7);
        employeesList.add(emp8);
        employeesList.add(emp9);
        employeesList.add(emp10);
        employeesList.add(emp11);
        employeesList.add(emp12);


        EmployeeAdapter adapter = new EmployeeAdapter(this,employeesList);
        employees.setAdapter(adapter);
        employees.setOnItemClickListener(this);



    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


        Employee employee = employeesList.get(position);
        Intent intent = new Intent(this,EmployeeDetails.class);
        intent.putExtra("employee",employee);
        startActivity(intent);
    }
}
