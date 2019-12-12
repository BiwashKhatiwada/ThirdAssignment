package com.biwash.thirdassignment.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.biwash.thirdassignment.AdapterActivity;
import com.biwash.thirdassignment.DashboardActivity;
import com.biwash.thirdassignment.R;
import com.biwash.thirdassignment.model.Student;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    RecyclerView recyclerView;
    List<Student> students = new ArrayList<>();
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);


        recyclerView=root.findViewById(R.id.rvstudents);

        if(DashboardActivity.st.isEmpty()) {
            DashboardActivity.st.add(new Student("Biwash", "Male", "23", "Baneshwor"));
            DashboardActivity.st.add(new Student("Sakar ", "Male", "26", "Banasthal"));

            AdapterActivity adapter = new AdapterActivity(DashboardActivity.st, getContext());

            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this.getContext());

            recyclerView.setLayoutManager(layoutManager);


            recyclerView.setAdapter(adapter);
        }else {

            AdapterActivity adapter2 = new AdapterActivity(DashboardActivity.st, getContext());

            RecyclerView.LayoutManager layoutManager2 = new LinearLayoutManager(this.getContext());
            recyclerView.setLayoutManager(layoutManager2);

            recyclerView.setAdapter(adapter2);
        }



        return root;
    }
}