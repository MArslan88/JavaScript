package com.example.order;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Set;


/**
 * A simple {@link Fragment} subclass.
 */
public class PizzaFragment extends Fragment {

    private View pizzaFragmentView;
    public Button seekh_kabab_btn,bbq_buzz, spicyRanch, afghaniTikka, behariChicken, chickenArabia;

    private String currentUserID;
    private FirebaseAuth mAuth;
    private DatabaseReference RootRef;




    public PizzaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        pizzaFragmentView = inflater.inflate(R.layout.fragment_pizza, container, false);

        mAuth=FirebaseAuth.getInstance();
        currentUserID=mAuth.getCurrentUser().getUid();
        RootRef = FirebaseDatabase.getInstance().getReference();

        // casting Buttons
        seekh_kabab_btn = (Button) pizzaFragmentView.findViewById(R.id.seekh_kabab_btn);
        bbq_buzz = (Button) pizzaFragmentView.findViewById(R.id.bbq_btn);
        spicyRanch = (Button) pizzaFragmentView.findViewById(R.id.spicy_ranch_btn);
        afghaniTikka = (Button) pizzaFragmentView.findViewById(R.id.afghani_tikka_btn);
        behariChicken = (Button) pizzaFragmentView.findViewById(R.id.behari_chicken_btn);
        chickenArabia = (Button) pizzaFragmentView.findViewById(R.id.checken_arabia_btn);


        seekh_kabab_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FlavourCall("Seekh Kabab Overloaded");
                SentUserToForm();
            }
        });

        bbq_buzz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FlavourCall("BBQ Buzz");
                SentUserToForm();
            }
        });

        spicyRanch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FlavourCall("Spicy Ranch");
                SentUserToForm();
            }
        });

        afghaniTikka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FlavourCall("Afghani Tikka");
                SentUserToForm();
            }
        });

        behariChicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FlavourCall("Behari Chicken");
                SentUserToForm();
            }
        });

        chickenArabia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FlavourCall("Chicken Arabia");
                SentUserToForm();
            }
        });

        return pizzaFragmentView;
    }

    private void FlavourCall(String flavour) {
        HashMap<String,String> flavourMap = new HashMap<>();
        flavourMap.put("flavour",flavour);

        RootRef.child("Users").child(currentUserID).child("flavours").setValue(flavourMap)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful()){
                        }
                    }
                });
    }



    private void SentUserToForm() {
        Intent formIntent = new Intent(getActivity(), FormActivity.class);
        startActivity(formIntent);
    }

}
