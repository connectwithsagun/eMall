package com.savatechnology.emall.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.savatechnology.emall.Adapters.AdapterFavouriteList;
import com.savatechnology.emall.Models.FavouriteList;
import com.savatechnology.emall.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HelpFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FavouritesFragment extends Fragment {


    RecyclerView recyclerView;
    List<FavouriteList> lists;
    AdapterFavouriteList adapter;
    Context mContext;
    LinearLayoutManager layoutManager;
    ImageView img;
    private View view;



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public FavouritesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HelpFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FavouritesFragment newInstance(String param1, String param2) {
        FavouritesFragment fragment = new FavouritesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        initData();
        view = inflater.inflate(R.layout.fragment_favourites, container, false);
        initRecycleView(view);
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }




    private void initRecycleView(View view) {

        recyclerView = view.findViewById(R.id.favRecyclerView);
        layoutManager=new LinearLayoutManager(mContext);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new AdapterFavouriteList(lists);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }

    private void initData() {

        lists = new ArrayList<>();

        lists.add(new FavouriteList(R.drawable.pepsicola,"Cold Drinks","Lungeli Traders"));
        lists.add(new FavouriteList(R.drawable.laptop,"Gaming Laptop","Pangeni Traders"));
        lists.add(new FavouriteList(R.drawable.pepsicola,"Cold Drinks","Lungeli Traders"));
        lists.add(new FavouriteList(R.drawable.laptop,"Gaming Laptop","Pangeni Traders"));
        lists.add(new FavouriteList(R.drawable.pepsicola,"Cold Drinks","Lungeli Traders"));
        lists.add(new FavouriteList(R.drawable.laptop,"Gaming Laptop","Pangeni Traders"));
        lists.add(new FavouriteList(R.drawable.pepsicola,"Cold Drinks","Lungeli Traders"));
        lists.add(new FavouriteList(R.drawable.laptop,"Gaming Laptop","Pangeni Traders"));

    }


}