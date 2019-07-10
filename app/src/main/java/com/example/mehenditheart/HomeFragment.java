package com.example.mehenditheart;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeFragment extends Fragment {
    RecyclerView rvMainList ;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         super.onCreateView(inflater, container, savedInstanceState);

         View view = inflater.inflate(R.layout.home_fragment , container , false) ;

         rvMainList = view.findViewById(R.id.rvMainList) ;
         ListModel listModel[] = new ListModel[]{new ListModel(R.drawable.design1),new ListModel(R.drawable.design2),
                                    new ListModel(R.drawable.design3),new ListModel(R.drawable.design4)};

         MainAdapter mainAdapter = new MainAdapter(getContext() , listModel);
         rvMainList.setLayoutManager(new LinearLayoutManager(getContext()));
         rvMainList.setAdapter(mainAdapter);

         return view ;
    }
}
