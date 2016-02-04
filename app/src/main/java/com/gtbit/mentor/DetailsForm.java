package com.gtbit.mentor;


import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

public class DetailsForm extends AppCompatActivity {
    String name, college, phone, year, githubName, skills;
    EditText nam, col, pho, yea, git, skil;
    LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_details);
        init();
    }

    public void init(){
        nam = (EditText) findViewById(R.id.name_editText);
        col = (EditText) findViewById(R.id.college_editText);
        pho = (EditText) findViewById(R.id.contact_editText);
        yea = (EditText) findViewById(R.id.year_editText);
        git = (EditText) findViewById(R.id.git_editText);
        skil = (EditText) findViewById(R.id.skills_editText);
        ll = (LinearLayout) findViewById(R.id.ll);
    }

    public void submit(View view){
        startActivity(new Intent(DetailsForm.this, MainActivity.class));
    }
}
