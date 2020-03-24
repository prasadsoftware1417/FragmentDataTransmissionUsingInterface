package com.example.fragment_data_transformation_using_interface;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity implements personal.PersonalDataSendListener,education.EducationDataSendListener, company.CompanyDataSendListener {
    public static FragmentManager fragementManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragementManager = getSupportFragmentManager();
        FragmentTransaction ft = fragementManager.beginTransaction();
        ft.add(R.id.fragment, new personal(), "1");
        ft.commit();


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        ;
    }
    Bundle b=new Bundle();
    @Override
    public void personalDataSend(String name, String dateOfBiirth, String mobileNo, String emailId) {

       b.putString("name", name);
        b.putString("dob", dateOfBiirth);
        b.putString("mobileno", mobileNo);
        b.putString("email", emailId);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new education()).addToBackStack(null).commit();
    }

    @Override
    public void educationDataSend(String schoolName, String schoolPercentage, String schoolYearOfPassinng, String diplomaCollageName, String diplomaPercentage, String diplomaYearOfPassinng, String BECollageName, String BEPercentage, String BEYearOfPassinng) {
        b.putString("schoolname", schoolName);
        b.putString("schoolpercentage", schoolPercentage);
        b.putString("schoolyop", schoolYearOfPassinng);
        b.putString("diplomacollagename", diplomaCollageName);
        b.putString("diplamapercentage", diplomaPercentage);
        b.putString("diplomayop", diplomaYearOfPassinng);
        b.putString("BEcollagename", BECollageName);
        b.putString("BEpercentage", BEPercentage);
        b.putString("BEyop", BEYearOfPassinng);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new company()).addToBackStack(null).commit();
    }

    @Override
    public void companyDataSend(String companyName, String jobProfile, String sallary) {
        b.putString("companyname", companyName);
        b.putString("jobprofile", jobProfile);
        b.putString("sallary", sallary);
        Displayfragment displayfragment=new Displayfragment();
        displayfragment.setArguments(b);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment,displayfragment).addToBackStack(null).commit();
    }
}