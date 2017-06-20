package com.amarpreetsinghprojects.newprojectmail;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Student> studentArrayList = new ArrayList<>();

        studentArrayList.add(new Student("Amarpreet Singh", 20, "08 - Feb - 1996","Pandora"));
        studentArrayList.add(new Student("Pawan Singh", 25, "02 - March - 1991","Pandora"));
        studentArrayList.add(new Student("Harsimran Singh", 21, "30 - Jan - 1995","Electronics and Communication"));
        studentArrayList.add(new Student("Akar", 20, "15 - Jun - 1996","Pandora"));
        studentArrayList.add(new Student("Sahiba", 20, "09 - Feb - 1996","Pandora"));
        studentArrayList.add(new Student("Jessica", 20, "26 - Dec - 1996","Pandora"));
        studentArrayList.add(new Student("Simran Kaur", 20, "14 - Aug - 1996","Pandora"));
        studentArrayList.add(new Student("Karandeep Singh", 20, "02 - Nov - 1996","Pandora"));
        studentArrayList.add(new Student("Hashneet Singh", 20, "17 - Feb - 1996","Pandora"));
        studentArrayList.add(new Student("Prabhjot Singh", 20, "01 - Apr - 1996","Pandora"));
        studentArrayList.add(new Student("Chanpreet Singh", 20, "15 - Aug - 1996","Pandora"));
        studentArrayList.add(new Student("Ajit Singh", 20, "26 - Mar - 1996","Pandora"));
        studentArrayList.add(new Student("Akshit", 40, "08 - Feb - 1967","Pandora"));
        studentArrayList.add(new Student("Shivam", 34, "01 - Apr - 1985","Pandora"));
        studentArrayList.add(new Student("Avinash", 20, "25 - Dec - 1996","Pandora"));
        studentArrayList.add(new Student("Jaskaran Singh", 20, "08 - Dec - 1996","Pandora"));
        studentArrayList.add(new Student("Zues", 20, "08 - Feb - 1996","Pandora"));
        studentArrayList.add(new Student("Robert", 27, "08 - Nov - 1989","Pandora"));
        studentArrayList.add(new Student("Alex", 23, "03 - Feb - 1993","Pandora"));
        studentArrayList.add(new Student("Xabi", 20, "26 - Mar - 1996","Pandora"));
        studentArrayList.add(new Student("Cristian", 20, "13 - Jun - 1996","Pandora"));
        studentArrayList.add(new Student("Tim", 50, "29 - Dec - 1966","Pandora"));
        studentArrayList.add(new Student("Mirenda", 30, "08 - Oct - 1986","Pandora"));
        studentArrayList.add(new Student("Sonam", 20, "22 - Apr - 1996","Pandora"));
        studentArrayList.add(new Student("Zubin", 21, "16 - Jan - 1995","Pandora"));
        studentArrayList.add(new Student("Scarlet", 26, "23 - Feb - 1990","Pandora"));
        studentArrayList.add(new Student("Jaskirat", 14, "31 - Oct - 2002","Pandora"));
        studentArrayList.add(new Student("Harsheen", 18, "15 - Sep - 1998","Pandora"));
        studentArrayList.add(new Student("Lovleen", 22, "18 - May - 1994","Pandora"));
        studentArrayList.add(new Student("Axcel", 20, "08 - Feb - 1996","Pandora"));

        ListView listView = (ListView)findViewById(R.id.listView);
        StudentAdapter adapter = new StudentAdapter(studentArrayList,this);
        listView.setAdapter(adapter);

        final FragmentDetails fragment = new FragmentDetails();
        final FragmentManager fragmentManager = getSupportFragmentManager();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Student s = studentArrayList.get(position);

                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.container, fragment.newInstance(s.getName(),s.getDate_of_birth(),s.getAge(),s.getCourse()));
                transaction.commit();
            }
        });



    }
}
