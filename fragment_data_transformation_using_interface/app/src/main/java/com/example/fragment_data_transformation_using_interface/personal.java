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

public class personal extends Fragment {

    private Button nextButton;
    private EditText nameEditText, addressEditText, mobilNoEditText, emailEditText;

    PersonalDataSendListener personalDataSendListener;

    public interface PersonalDataSendListener
    {
            public void personalDataSend(String name, String dateOfBiirth, String mobileNo, String emailId);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_personal, container, false);

        nextButton = view.findViewById(R.id.next);
        nameEditText = view.findViewById(R.id.fullname);
        addressEditText = view.findViewById(R.id.dob);
        mobilNoEditText = view.findViewById(R.id.mobileno);
        emailEditText = view.findViewById(R.id.email);

        nextButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               String name1= nameEditText.getText().toString();
               String dob1= addressEditText.getText().toString();
               String mobileno1= mobilNoEditText.getText().toString();
               String email1= emailEditText.getText().toString();
               personalDataSendListener.personalDataSend(name1, dob1,mobileno1 , email1);
           }
       });
       return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Activity activity=(Activity)context;
        try {
            personalDataSendListener=(PersonalDataSendListener)activity;
        }
        catch (ClassCastException e)
        {
            throw new ClassCastException(activity.toString()+"Must Implement PersonalDataSend");
        }
    }
}
