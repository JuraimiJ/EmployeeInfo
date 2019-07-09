package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView EmployeeLV;
    ArrayList<EmployeeDetail> EmployeeAL;
    ArrayAdapter aaEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EmployeeLV = findViewById(R.id.Employee_Info);

        EmployeeAL = new ArrayList<>();
        EmployeeAL.add(new EmployeeDetail("John Doe","Software Technical Leader",3400.0));
        EmployeeAL.add(new EmployeeDetail("May","Programmer",2200.0));
        EmployeeAL.add(new EmployeeDetail("Mary","Tester",1500.0));


        aaEmployee = new CustomAdapter(this,
                R.layout.row, EmployeeAL);

        EmployeeLV.setAdapter(aaEmployee);


    }
}
