package com.example.fragment_data_transformation_using_interface;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class Displayfragment extends Fragment {
   private TextView nameTextView, addressTextView, mobileNoTextView, emailIdTextView, schoolNameTextView, schoolPercentageTextView, schoolYOPTextView, diplomaCollageNameTextView, diplomaPercentageTextView, diplomaYOPTextView, beCollageNameTextView, bePercentageTextView, beYOPTextView, companyNameTextView, jobProfileTextView, sallaryTextView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_displayfragment, container, false);

        nameTextView = view.findViewById(R.id.fname);
        addressTextView = view.findViewById(R.id.dob);
        mobileNoTextView = view.findViewById(R.id.mobno);
        emailIdTextView = view.findViewById(R.id.emailid);
        schoolNameTextView = view.findViewById(R.id.shchoolname);
        schoolPercentageTextView = view.findViewById(R.id.percent);
        schoolYOPTextView = view.findViewById(R.id.yop);
        diplomaCollageNameTextView = view.findViewById(R.id.dclgname);
        diplomaPercentageTextView = view.findViewById(R.id.dpercent);
        diplomaYOPTextView = view.findViewById(R.id.dyop);
        beCollageNameTextView = view.findViewById(R.id.gclgname);
        bePercentageTextView = view.findViewById(R.id.gpercent);
        beYOPTextView = view.findViewById(R.id.gyop);
        companyNameTextView = view.findViewById(R.id.companyname);
        jobProfileTextView = view.findViewById(R.id.jobprofile);
        sallaryTextView = view.findViewById(R.id.salary);


            Bundle bundle=getArguments();
            nameTextView.setText(bundle.getString("name"));
            addressTextView.setText(bundle.getString("dob"));
            mobileNoTextView.setText(bundle.getString("mobileno"));
            emailIdTextView.setText(bundle.getString("email"));
           schoolNameTextView.setText(bundle.getString("schoolname"));
            schoolPercentageTextView.setText(bundle.getString("schoolpercentage"));
            schoolYOPTextView.setText(bundle.getString("schoolyop"));
            diplomaCollageNameTextView.setText(bundle.getString("diplomacollagename"));
            diplomaPercentageTextView.setText(bundle.getString("diplamapercentage"));
            diplomaYOPTextView.setText(bundle.getString("diplomayop"));
            beCollageNameTextView.setText(bundle.getString("BEcollagename"));
            bePercentageTextView.setText(bundle.getString("BEpercentage"));
            beYOPTextView.setText(bundle.getString("BEyop"));
            companyNameTextView.setText(bundle.getString("companyname"));
            jobProfileTextView.setText(bundle.getString("jobprofile"));
            sallaryTextView.setText(bundle.getString("sallary"));





        return view;
    }


}
