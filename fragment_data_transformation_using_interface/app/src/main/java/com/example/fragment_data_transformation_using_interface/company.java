package com.example.fragment_data_transformation_using_interface;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


public class company extends Fragment {
    private Button button;
    private EditText companyNameEditText, jobProfileEditText, sallaryEditText;


    CompanyDataSendListener companyDataSendListener;

    public interface CompanyDataSendListener
    {
        public void companyDataSend(String companyName, String jobProfile, String sallary);

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view= inflater.inflate(R.layout.fragment_company, container, false);

        button=(Button)view.findViewById(R.id.next);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                companyNameEditText =view.findViewById(R.id.comname);
                jobProfileEditText = view.findViewById(R.id.jobp);
                sallaryEditText = view.findViewById(R.id.salary);
                String companyName= companyNameEditText.getText().toString();
                String jobProfile= jobProfileEditText.getText().toString();
                String sallary= sallaryEditText.getText().toString();

                companyDataSendListener.companyDataSend(companyName, jobProfile, sallary);
            }
        });
        return view;

    }

    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Activity activity=(Activity)context;
        try {
           companyDataSendListener=(company.CompanyDataSendListener)activity;
        }
        catch (ClassCastException e)
        {
            throw new ClassCastException(activity.toString()+"Must Implement PersonalDataSend");
        }
    }













}
