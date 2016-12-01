package com.saminniss.gladtidingsparents;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class TabBuilder extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    public TabBuilder() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static TabBuilder newInstance(int sectionNumber) {
        TabBuilder fragment = new TabBuilder();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        Context this_context = getContext();
        float text_size = 22f;
        String text_color = "#ca2017";

        switch (getArguments().getInt(ARG_SECTION_NUMBER)) {
            case 0:
                textView.setText("Pre K3 - 3rd Grade");
                // Row 1
                TableRow tr1 = (TableRow) rootView.findViewById(R.id.row_1);
                TableLayout.LayoutParams tr_params = new TableLayout.LayoutParams();
                tr_params.weight = 0.25f;
                tr1.setLayoutParams(tr_params);
                tr1.setGravity(Gravity.CENTER);
                // Row 1 Text Views
                TextView cal_tv = new TextView(this_context);
                TextView news_tv = new TextView(this_context);

                if (Build.VERSION.SDK_INT >= 23) {
                    cal_tv.setTextAppearance(R.style.TextStyle);
                    news_tv.setTextAppearance(R.style.TextStyle);
                }
                else {
                    cal_tv.setTextAppearance(this_context, R.style.TextStyle);
                    news_tv.setTextAppearance(this_context, R.style.TextStyle);
                }

                TableRow.LayoutParams tv_params = new TableRow.LayoutParams();
                tv_params.weight = 0.5f;
                cal_tv.setLayoutParams(tv_params);
                news_tv.setLayoutParams(tv_params);

                cal_tv.setBackgroundResource(R.mipmap.calendar);
                news_tv.setBackgroundResource(R.mipmap.calendar);

                cal_tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                news_tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                cal_tv.setGravity(Gravity.CENTER);
                news_tv.setGravity(Gravity.CENTER);

                cal_tv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gtcacademy.org/calendar/"));
                        startActivity(browserIntent);
                    }
                });

                news_tv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gtcacademy.org/news/"));
                        startActivity(browserIntent);
                    }
                });

                cal_tv.setText("CALENDAR");
                news_tv.setText("NEWS");
                tr1.addView(cal_tv);
                tr1.addView(news_tv);


                // Row 2
                TableRow tr2 = (TableRow) rootView.findViewById(R.id.row_2);
                tr2.setLayoutParams(tr_params);
                tr2.setGravity(Gravity.CENTER);
                // Row 2 Text Views
                TextView price_tv = new TextView(this_context);
                TextView class_tv = new TextView(this_context);
                price_tv.setLayoutParams(tv_params);
                class_tv.setLayoutParams(tv_params);
                price_tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                class_tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

                price_tv.setText("Pricing");
                class_tv.setText("Classes");
                tr2.addView(price_tv);
                tr2.addView(class_tv);

                // Row 3
                TableRow tr3 = (TableRow) rootView.findViewById(R.id.row_3);
                tr3.setLayoutParams(tr_params);
                tr3.setGravity(Gravity.CENTER);

                // Row 4
                TableRow tr4 = (TableRow) rootView.findViewById(R.id.row_4);
                tr4.setLayoutParams(tr_params);
                tr4.setGravity(Gravity.CENTER);


            break;
            case 1:
                textView.setText("6 Weeks - 36 Months");

                // Row 1
                TableRow tr11 = (TableRow) rootView.findViewById(R.id.row_1);
                TableLayout.LayoutParams tr1_params = new TableLayout.LayoutParams();
                tr1_params.weight = 0.33f;
                tr11.setLayoutParams(tr1_params);
                tr11.setGravity(Gravity.CENTER);

                // Row 1 Text Views
                TextView closings_tv = new TextView(this_context);
                TextView news1_tv = new TextView(this_context);
                TableRow.LayoutParams tv1_params = new TableRow.LayoutParams();
                tv1_params.weight = 0.5f;
                closings_tv.setLayoutParams(tv1_params);
                news1_tv.setLayoutParams(tv1_params);

                closings_tv.setBackgroundResource(R.mipmap.calendar);
                news1_tv.setBackgroundResource(R.mipmap.calendar);

                if (Build.VERSION.SDK_INT >= 23) {
                    closings_tv.setTextAppearance(R.style.TextStyle);
                    news1_tv.setTextAppearance(R.style.TextStyle);
                }
                else {
                    closings_tv.setTextAppearance(this_context, R.style.TextStyle);
                    news1_tv.setTextAppearance(this_context, R.style.TextStyle);
                }

                closings_tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                news1_tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                closings_tv.setGravity(Gravity.CENTER);
                news1_tv.setGravity(Gravity.CENTER);

                closings_tv.setText("CLOSINGS");
                news1_tv.setText("NEWS");
                tr11.addView(closings_tv);
                tr11.addView(news1_tv);



                break;
            case 2:
                textView.setText("Payments");
            break;
            case 3:
                textView.setText("Contact Us");
            break;
        }

        return rootView;
    }
}
