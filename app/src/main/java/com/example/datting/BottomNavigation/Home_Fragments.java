package com.example.datting.BottomNavigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.datting.Home.Home.People;
import com.example.datting.Home.Home.People_Apdapter;
import com.example.datting.R;

import java.util.ArrayList;

public class Home_Fragments extends Fragment {
    ArrayList<People> people;

    LinearLayoutManager linearLayoutManager;
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home_fragments, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.recycler);
        data();
        recyclerView.setHasFixedSize(true);
//        linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        People_Apdapter studentAdapter = new People_Apdapter(people, getContext());
        recyclerView.setAdapter(studentAdapter);
        // recyclerView.setLayoutManager(linearLayoutManager);
    }
    public  void data()
    {
        people = new ArrayList<>();
        people.add(new People("Hiếu Thành", R.drawable.thanhh));

    }
}
