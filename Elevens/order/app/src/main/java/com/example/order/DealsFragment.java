package com.example.order;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;


/**
 * A simple {@link Fragment} subclass.
 */
public class DealsFragment extends Fragment {

    int quantity = 1;

    private View dealsFragmentView;
    public Button b1g2, xxlSpecial, pan4All, wowDeals;
    String selectedFlavour,userName,userAddress, userNumber;

    private String currentUserID;
    private FirebaseAuth mAuth;
    private DatabaseReference RootRef;

    public DealsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        dealsFragmentView = inflater.inflate(R.layout.fragment_deals, container, false);


        mAuth=FirebaseAuth.getInstance();
        currentUserID=mAuth.getCurrentUser().getUid();
        RootRef = FirebaseDatabase.getInstance().getReference();

        // casting Buttons
        b1g2 = (Button) dealsFragmentView.findViewById(R.id.b1g2_btn);
        xxlSpecial = (Button) dealsFragmentView.findViewById(R.id.xx_combo_btn);
        pan4All = (Button) dealsFragmentView.findViewById(R.id.pan_4_all_btn);
        wowDeals = (Button) dealsFragmentView.findViewById(R.id.wow_deal_pro_img_new_btn);

        b1g2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DealsCall("Buy 1 Get 2 Free");
                priceCall("1650");
                SentUserToDealsForm();
            }
        });
        xxlSpecial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DealsCall("XXL Special");
                priceCall("2599");
                SentUserToDealsForm();
            }
        });
        pan4All.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DealsCall("Pan 4 all");
                priceCall("1299");
                SentUserToDealsForm();
            }
        });
        wowDeals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DealsCall("Wow deal");
                priceCall("399");
                SentUserToDealsForm();
            }
        });


        return dealsFragmentView;
    }


    private void DealsCall(String deals) {
        HashMap<String,String> dealsMap = new HashMap<>();
        dealsMap.put("deal",deals);

        RootRef.child("Users").child(currentUserID).child("deals").setValue(dealsMap)
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

    private void SentUserToDealsForm() {
        Intent dealsFormIntent = new Intent(getActivity(), DealsFormActivity.class);
        startActivity(dealsFormIntent);
    }

}
