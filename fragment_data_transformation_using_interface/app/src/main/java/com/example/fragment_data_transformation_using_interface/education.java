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


public class education extends Fragment {

    private Button t1;
    private EditText schoolNameEditView, schoolPercentageEditView, schoolYOPEditView, diplomaCollageNameEditView, diplomaPercentageEditView, diplomaYOPEditView, beCollageNameEditView, bePercentageEditView, beYOPEditView;
    EducationDataSendListener educationDataSendListener;
    public interface EducationDataSendListener
    {
        public void educationDataSend(String schoolName, String schoolPercentage, String schoolYearOfPassinng, String diplomaCollageName, String diplomaPercentage, String diplomaYearOfPassinng, String BECollageName, String BEPercentage, String BEYearOfPassinng);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         final View view= inflater.inflate(R.layout.fragment_education, container, false);
        t1=view.findViewById(R.id.next);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                schoolNameEditView =(EditText) view.findViewById(R.id.s1);
                schoolPercentageEditView =(EditText) view.findViewById(R.id.s2);
                schoolYOPEditView =(EditText) view.findViewById(R.id.s3);
                diplomaCollageNameEditView =(EditText) view.findViewById(R.id.d1);
                diplomaPercentageEditView =(EditText) view.findViewById(R.id.d2);
                diplomaYOPEditView =(EditText) view.findViewById(R.id.d3);
                beCollageNameEditView =(EditText) view.findViewById(R.id.b1);
                bePercentageEditView =(EditText) view.findViewById(R.id.b2);
                beYOPEditView =(EditText) view.findViewById(R.id.b3);
                String s11= schoolNameEditView.getText().toString();
                String s22= schoolPercentageEditView.getText().toString();
                String s33= schoolYOPEditView.getText().toString();
                String d11= diplomaCollageNameEditView.getText().toString();
                String d22= diplomaPercentageEditView.getText().toString();
                String d33= diplomaYOPEditView.getText().toString();
                String b11= beCollageNameEditView.getText().toString();
                String b22= bePercentageEditView.getText().toString();
                String b33= beYOPEditView.getText().toString();
                educationDataSendListener.educationDataSend(s11, s22, s33, d11, d22, d33, b11, b22, b33);
            }
        });
        return view;
    }
    @Override
    public void onAttach(@NonNull Context context) {

        super.onAttach(context);
        Activity activity=(Activity)context;
        try {
            educationDataSendListener=(education.EducationDataSendListener)activity;
        }
        catch (ClassCastException e)
        {
            throw new ClassCastException(activity.toString()+"Must Implement EducationDataSend");
        }
    }




}
