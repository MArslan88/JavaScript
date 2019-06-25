package com.example.order;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


/**
 * A simple {@link Fragment} subclass.
 */
public class StartersFragment extends Fragment {

    private View startersFragmentView;
    public Button garlicBread, garlicBreadSupremem, potatoSkins, spicyWedges,
            bbqCheckenSpinRoll, behariChickenSpinRoll, mixSalad, chickenkWings,flamingWings;

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
        garlicBreadSupremem = (Button) startersFragmentView.findViewById(R.id.garlic_bread_supreme_btn);
        potatoSkins = (Button) startersFragmentView.findViewById(R.id.potato_skins_btn);
        spicyWedges = (Button) startersFragmentView.findViewById(R.id.spicy_wedges_btn);
        bbqCheckenSpinRoll = (Button) startersFragmentView.findViewById(R.id.bbq_chicken_spin_rolls3_btn);
        behariChickenSpinRoll = (Button) startersFragmentView.findViewById(R.id.behari_spin_rolls_btn);
        mixSalad = (Button) startersFragmentView.findViewById(R.id.salad_btn);
        chickenkWings = (Button) startersFragmentView.findViewById(R.id.chicken_wings_btn);
        flamingWings = (Button) startersFragmentView.findViewById(R.id.flaming_wings3_btn);




        return startersFragmentView;
    }

}
