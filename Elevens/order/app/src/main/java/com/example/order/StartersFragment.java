package com.example.order;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;


/**
 * A simple {@link Fragment} subclass.
 */
public class StartersFragment extends Fragment {

    int quantity = 1;

    private View startersFragmentView;
    public Button garlicBread, garlicBreadSupreme, potatoSkins, spicyWedges,
            bbqCheckenSpinRoll, behariChickenSpinRoll, mixSalad, chickenWings,flamingWings;
    String selectedFlavour,userName,userAddress, userNumber;


    private String currentUserID;
    private FirebaseAuth mAuth;
    private DatabaseReference RootRef;


    public StartersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        startersFragmentView = inflater.inflate(R.layout.fragment_starters, container, false);

        mAuth=FirebaseAuth.getInstance();
        currentUserID=mAuth.getCurrentUser().getUid();
        RootRef = FirebaseDatabase.getInstance().getReference();

        // casting Buttons
        garlicBread = (Button) startersFragmentView.findViewById(R.id.garlic_bread_btn);
        garlicBreadSupreme = (Button) startersFragmentView.findViewById(R.id.garlic_bread_supreme_btn);
        potatoSkins = (Button) startersFragmentView.findViewById(R.id.potato_skins_btn);
        spicyWedges = (Button) startersFragmentView.findViewById(R.id.spicy_wedges_btn);
        bbqCheckenSpinRoll = (Button) startersFragmentView.findViewById(R.id.bbq_chicken_spin_rolls3_btn);
        behariChickenSpinRoll = (Button) startersFragmentView.findViewById(R.id.behari_spin_rolls_btn);
        mixSalad = (Button) startersFragmentView.findViewById(R.id.salad_btn);
        chickenWings = (Button) startersFragmentView.findViewById(R.id.chicken_wings_btn);
        flamingWings = (Button) startersFragmentView.findViewById(R.id.flaming_wings3_btn);


        garlicBread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FlavourCall("Garlic Bread");
                priceCall("165");
                SentUserToStartersForm();
            }
        });

        garlicBreadSupreme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FlavourCall("Garlic Bread Supreme");
                priceCall("335");
                SentUserToStartersForm();
            }
        });

        potatoSkins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FlavourCall("Potato Skins");
                priceCall("265");
                SentUserToStartersForm();
            }
        });

        spicyWedges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FlavourCall("Spicy Wedges");
                priceCall("265");
                SentUserToStartersForm();
            }
        });

        bbqCheckenSpinRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FlavourCall("BBQ ChickenSprinRoll");
                priceCall("300");
                SentUserToStartersForm();
            }
        });

        behariChickenSpinRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FlavourCall("Behari Chicken Spin Roll");
                priceCall("300");
                SentUserToStartersForm();
            }
        });

        mixSalad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FlavourCall("Mix Salad");
                priceCall("550");
                SentUserToStartersForm();
            }
        });

        chickenWings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FlavourCall("Chicken Wings");
                priceCall("300");
                SentUserToStartersForm();
            }
        });

        flamingWings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FlavourCall("Flaming Wings");
                priceCall("265");
                SentUserToStartersForm();
            }
        });

        return startersFragmentView;
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

    private void priceCall(String price) {
        HashMap<String,String> flavourMap = new HashMap<>();
        flavourMap.put("price",price);

        RootRef.child("Users").child(currentUserID).child("prices").setValue(flavourMap)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful()){
                        }
                    }
                });
    }

    private void SentUserToStartersForm() {
        Intent startersFormIntent = new Intent(getActivity(), StartersFormActivity.class);
        startActivity(startersFormIntent);
    }

}
