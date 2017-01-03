package com.blogspot.nataliprograms.androidsamples.UI.activities;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.blogspot.nataliprograms.androidsamples.R;
import com.blogspot.nataliprograms.androidsamples.data.Category;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NataliLA on 2-1-17.
 */

public class CategoriesActivity extends AppCompatActivity {

    private class CategoriesRecyclerViewAdapter extends RecyclerView.Adapter<CategoriesRecyclerViewAdapter.CategoriesViewHolder> {

        @NonNull
        private List<Category> categoriesList;

        public CategoriesRecyclerViewAdapter(@NonNull List<Category> categoriesList) {
            this.categoriesList = categoriesList;
        }

        @Override
        public CategoriesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category, parent, false);
            return new CategoriesViewHolder(view);
        }

        @Override
        public void onBindViewHolder(CategoriesViewHolder holder, int position) {
            holder.categoryTitle.setText(categoriesList.get(position).getTitle());
            //TODO set image icon;
            if (categoriesList.get(position).getImageUrl() == null){
                holder.categoryIcon.setImageResource(R.mipmap.ic_launcher);
            }
        }

        @Override
        public int getItemCount() {
            return categoriesList.size();
        }

        class CategoriesViewHolder extends RecyclerView.ViewHolder {

            private ImageView categoryIcon;
            private TextView categoryTitle;

            public CategoriesViewHolder(View itemView) {
                super(itemView);

                categoryIcon = (ImageView) itemView.findViewById(R.id.item_category_icon);
                categoryTitle = (TextView) itemView.findViewById(R.id.item_category_title);
            }
        }
    }

    private RecyclerView mCategoriesRecyclerView;
    private CategoriesRecyclerViewAdapter mCategoriesRecyclerViewAdapter;

    private static List<Category> mainCategories = new ArrayList<Category>() {{
        add(new Category(0, "UI", null));
        add(new Category(1, "AppCompact", null));
        add(new Category(2, "SupportLibrary", null));
        add(new Category(3, "Data Storage", null));
        add(new Category(4, "Network connectivity", null));
        add(new Category(5, "Testing", null));
        add(new Category(6, "Code tools", null));
        add(new Category(7, "App structure", null));
        add(new Category(8, "Localization", null));
        add(new Category(9, "Memmory", null));
        add(new Category(10, "Social", null));
        add(new Category(11, "Analytics", null));
        add(new Category(12, "Wireless", null));
        add(new Category(13, "Camera", null));
        add(new Category(14, "Algorithms and Data structures", null));
        add(new Category(15, "Wear", null));
        add(new Category(16, "Other", null));
    }};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        mCategoriesRecyclerView = (RecyclerView) findViewById(R.id.categories_recyclerview_main);
        mCategoriesRecyclerViewAdapter = new CategoriesRecyclerViewAdapter(mainCategories);
        mCategoriesRecyclerView.setAdapter(mCategoriesRecyclerViewAdapter);
        mCategoriesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
