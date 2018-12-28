package com.google.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView employees;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        employees = findViewById(R.id.employees);


        Employee emp1 = new Employee("Ahmed","Enginer",R.drawable.ic_launcher_background);
        Employee emp2 = new Employee("Ali","Teaster",R.drawable.ic_launcher_foreground);
        Employee emp3 = new Employee("Hussien","IOS",R.drawable.ic_launcher_background);
        Employee emp4 = new Employee("Asmaa","Design",R.drawable.ic_launcher_foreground);
        Employee emp5 = new Employee("Omnia","Design",R.drawable.ic_launcher_background);
        Employee emp6 = new Employee("Mahmoud","Android",R.drawable.ic_launcher_foreground);
        Employee emp7 = new Employee("Raafat","Web",R.drawable.ic_launcher_background);
        Employee emp8 = new Employee("Emad","BackEnd",R.drawable.ic_launcher_foreground);
        Employee emp9 = new Employee("Ibtesam","FrontEnd",R.drawable.ic_launcher_background);
        Employee emp10 = new Employee("Walled","Teaster",R.drawable.ic_launcher_foreground);
        Employee emp11 = new Employee("Hossam","Manger",R.drawable.ic_launcher_background);

        ArrayList<Employee> employeesList = new ArrayList<>();
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

        EmployeeAdapter adapter = new EmployeeAdapter(this,employeesList);
        employees.setAdapter(adapter);

    }
}
