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
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import org.w3c.dom.Text;

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

    public TextView MakeButton(Context context, LinearLayout parent_view, float h_weight,
                               int background_id, final String go_here, String tv_text) {
        // make textview and add style from styles.TextStyle
        TextView tv = new TextView(context);
        if(Build.VERSION.SDK_INT >= 23)
            tv.setTextAppearance(R.style.TextStyle);
        else
            tv.setTextAppearance(context, R.style.TextStyle);

        // set horizontal weight
        LinearLayout.LayoutParams tv_params = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT, h_weight);
        tv.setLayoutParams(tv_params);

        // set background and center text
        tv.setBackgroundResource(background_id);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setGravity(Gravity.CENTER);

        // go to url when you click
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(go_here));
                startActivity(browserIntent);
            }
        });

        tv.setText(tv_text);

        parent_view.addView(tv);
        return tv;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        Context this_context = getContext();

        switch (getArguments().getInt(ARG_SECTION_NUMBER)) {
            case 0:
                textView.setText("Pre K3 - 3rd Grade");

                // Row 1
                LinearLayout tr1 = (LinearLayout) rootView.findViewById(R.id.row_1);
                /*LinearLayout.LayoutParams tr_params11 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 0, 0.25f);
                //tr_params11.weight = 0.25f;
                tr1.setLayoutParams(tr_params11);*/
                tr1.setGravity(Gravity.CENTER);


                // Row 1 Text Views
                MakeButton(this_context, tr1, 0.5f, R.mipmap.calendar,
                        "http://www.gtcacademy.org/calendar/", "CALENDAR");
                MakeButton(this_context, tr1, 0.5f, R.mipmap.calendar,
                        "http://www.gtcacademy.org/news/", "NEWS");


                // Row 2
                LinearLayout tr2 = (LinearLayout) rootView.findViewById(R.id.row_2);
                /*LinearLayout.LayoutParams tr_params12 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 0, 0.25f);
                //tr_params12.weight = 1f;
                tr2.setLayoutParams(tr_params12);*/
                tr2.setGravity(Gravity.CENTER);
                // Row 2 Text Views
                MakeButton(this_context, tr2, 0.5f, R.mipmap.calendar,
                        "http://www.gtcacademy.org/pricing/", "PRICING");
                MakeButton(this_context, tr2, 0.5f, R.mipmap.calendar,
                        "http://www.gtcacademy.org/classes/", "CLASSES");


                // Row 3
                LinearLayout tr3 = (LinearLayout) rootView.findViewById(R.id.row_3);
                /*LinearLayout.LayoutParams tr_params13 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 0, 0.25f);
                //tr_params13.weight = 0.25f;
                tr3.setLayoutParams(tr_params13);*/
                tr3.setGravity(Gravity.CENTER);
                // Row 3 Text Views
                MakeButton(this_context, tr3, 0.5f, R.mipmap.calendar,
                        "http://www.gtcacademy.org/school-uniform/", "UNIFORM");
                MakeButton(this_context, tr3, 0.5f, R.mipmap.calendar,
                        "http://www.gtcacademy.org/school-supplies/", "SUPPLIES");

                // Row 4
                LinearLayout tr4 = (LinearLayout) rootView.findViewById(R.id.row_4);
                /*LinearLayout.LayoutParams tr_params14 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 0, 0.25f);
                //tr_params14.weight = 0.25f;
                tr4.setLayoutParams(tr_params14); */
                tr4.setGravity(Gravity.CENTER);
                // Row 4 Text Views
                MakeButton(this_context, tr4, 0.5f, R.mipmap.calendar,
                        "http://www.gtcacademy.org/wp-content/uploads/2016/08/Enrollment-Form.pdf",
                        "REGISTRATION\nFORM");
                MakeButton(this_context, tr4, 0.5f, R.mipmap.calendar,
                        "http://www.gtcacademy.org/wp-content/uploads/2016/08/Academy-Private-Pay-Enrollment-Packet.pdf",
                        "REGISTRATION\nPACKET");

                break;
            case 1:
                textView.setText("6 Weeks - 36 Months");

                // Row 1
                LinearLayout tr11 = (LinearLayout) rootView.findViewById(R.id.row_1);
                /*LinearLayout.LayoutParams tr1_params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 0, 0.25f);
                tr1_params.weight = 0.33f;
                tr11.setLayoutParams(tr1_params);*/
                tr11.setGravity(Gravity.CENTER);

                // Row 1 Text Views
                MakeButton(this_context, tr11, 0.5f, R.mipmap.calendar,
                        "http://www.gtcacademy.org/development-center/#calendar", "CLOSINGS");
                MakeButton(this_context, tr11, 0.5f, R.mipmap.calendar,
                        "http://www.gtcacademy.org/news/", "NEWS");

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
