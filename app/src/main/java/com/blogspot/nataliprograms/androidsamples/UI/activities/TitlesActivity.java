package com.blogspot.nataliprograms.androidsamples.UI.activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.blogspot.nataliprograms.androidsamples.R;
import com.blogspot.nataliprograms.androidsamples.data.Title;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NataliLA on 3-1-17.
 */

public class TitlesActivity extends RecyclerBaseActivity {

    private class TitlesRecyclerViewAdapter extends RecyclerView.Adapter<TitlesActivity.TitlesRecyclerViewAdapter.TitlesViewHolder> {

        @NonNull
        private List<Title> titlesList;

        public TitlesRecyclerViewAdapter(@NonNull List<Title> titlesList) {
            this.titlesList = titlesList;
        }

        @Override
        public TitlesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_title, parent, false);
            return new TitlesViewHolder(view);
        }

        @Override
        public void onBindViewHolder(TitlesViewHolder holder, int position) {
            holder.titleTitle.setText(titlesList.get(position).getTitle());
        }

        @Override
        public int getItemCount() {
            return titlesList.size();
        }

        class TitlesViewHolder extends RecyclerView.ViewHolder {

            private TextView titleTitle;

            public TitlesViewHolder(View itemView) {
                super(itemView);

                titleTitle = (TextView) itemView.findViewById(R.id.item_title_title);
            }
        }
    }

    public static final String EXTRA_CATEGORY_ID = "ExtraCategoryID";

    private TitlesRecyclerViewAdapter mTitlesRecyclerViewAdapter;

    private int categoryID;

    private static List<Title> UITitles = new ArrayList<Title>() {{
        add(new Title(0, "Buttons"));
        add(new Title(0, "Layouts"));
        add(new Title(0, "Dialogs/Toasts"));
        add(new Title(0, "View group"));
        add(new Title(0, "Images"));
        add(new Title(0, "Maps"));
        add(new Title(0, "Charts"));
        add(new Title(0, "Recycler View"));
        add(new Title(0, "Animations"));
        add(new Title(0, "Inputs/Outputs"));
        add(new Title(0, "Text Views"));
        add(new Title(0, "Action bar"));
        add(new Title(0, "Progress"));
        add(new Title(0, "Calendar"));
        add(new Title(0, "Search"));
        add(new Title(0, "Other"));
        add(new Title(0, "Complex"));
    }};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        categoryID = getIntent().getIntExtra(EXTRA_CATEGORY_ID, -1);
        mTitlesRecyclerViewAdapter = new TitlesRecyclerViewAdapter(categoryID == 0 ? UITitles : new ArrayList<Title>());
        super.onCreate(savedInstanceState);
    }

    @Override
    protected RecyclerView.Adapter getRecyclerViewAdapter() {
        return mTitlesRecyclerViewAdapter;
    }
}
