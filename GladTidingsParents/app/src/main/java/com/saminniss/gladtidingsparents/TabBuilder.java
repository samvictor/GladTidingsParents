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

        /*/ go to url when you click
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(go_here));
                startActivity(browserIntent);
            }
        });
*/
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
                        "https://drive.google.com/viewerng/viewer?url=http://www.gtcacademy.org/wp-content/uploads/2016/08/Enrollment-Form.pdf",
                        "REGISTRATION\nFORM");
                MakeButton(this_context, tr4, 0.5f, R.mipmap.calendar,
                        "https://drive.google.com/viewerng/viewer?url=http://www.gtcacademy.org/wp-content/uploads/2017/01/Academy-Private-Pay-Enrollment-Packet.pdf",
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
                        "http://www.gtcacademy.org/development-center/", "DEVELOPMENT CENTER");
                MakeButton(this_context, tr11, 0.5f, R.mipmap.calendar,
                        "http://www.gtcacademy.org/news/", "NEWS");

                // Row 2
                LinearLayout tr12 = (LinearLayout) rootView.findViewById(R.id.row_2);
                tr12.setGravity(Gravity.CENTER);
                // Row 2 Text Views
                MakeButton(this_context, tr12, 1, R.mipmap.calendar,
                        "http://www.gtcacademy.org/development-center/#pricing", "PRICING");

                // Row 3
                LinearLayout tr13 = (LinearLayout) rootView.findViewById(R.id.row_3);
                tr13.setGravity(Gravity.CENTER);
                // Row 3 Text Views
                MakeButton(this_context, tr13, 1f, R.mipmap.calendar,
                        "http://www.gtcacademy.org/development-center/#calendar", "CLOSINGS");

                // Row 4
                LinearLayout tr14 = (LinearLayout) rootView.findViewById(R.id.row_4);
                tr14.setGravity(Gravity.CENTER);
                // Row 4 Text Views
                MakeButton(this_context, tr14, 1f, R.mipmap.calendar,
                        "https://drive.google.com/viewerng/viewer?url=http://www.gtcacademy.org/wp-content/uploads/2016/08/Enrollment-Form.pdf",
                        "REGISTRATION\nFORM");
                break;

            case 2:
                textView.setText("Payments");

                // Row 1
                LinearLayout tr21 = (LinearLayout) rootView.findViewById(R.id.row_1);
                tr21.setGravity(Gravity.CENTER);
                // Row 1 Text Views
                MakeButton(this_context, tr21, 1f, R.mipmap.calendar,
                        "https://www.tuitionexpress.com/", "TUITION EXPRESS");

                // Row 2
                LinearLayout tr22 = (LinearLayout) rootView.findViewById(R.id.row_2);
                tr22.setGravity(Gravity.CENTER);
                // Row 2 Text Views
                MakeButton(this_context, tr22, 1f, R.mipmap.calendar,
                        "http://www.gtcacademy.org/pricing/", "PRICING\nPre K3 - 3rd grade");

                // Row 3
                LinearLayout tr23 = (LinearLayout) rootView.findViewById(R.id.row_3);
                tr23.setGravity(Gravity.CENTER);
                // Row 3 Text Views
                MakeButton(this_context, tr23, 1f, R.mipmap.calendar,
                        "http://www.gtcacademy.org/development-center/#pricing", "PRICING\n6 weeks - 36 months");

                // Row 4
                LinearLayout tr24 = (LinearLayout) rootView.findViewById(R.id.row_4);
                tr24.setGravity(Gravity.CENTER);
                // Row 4 Text Views
                MakeButton(this_context, tr24, 1f, R.mipmap.calendar,
                        "https://drive.google.com/viewerng/viewer?url=http://www.gtcacademy.org/wp-content/uploads/2016/08/Enrollment-Form.pdf",
                        "REGISTRATION\nFORM");
            break;
            case 3:
                textView.setText("Contact Us");

                // Row 1
                LinearLayout tr32 = (LinearLayout) rootView.findViewById(R.id.row_1);
                tr32.setGravity(Gravity.CENTER);
                tr32.setPadding(0, 40, 0, 40);
                // Row 1 Text View

                // make textview and add style from styles.TextStyle
                TextView tv32 = new TextView(this_context);
                tv32.setId(R.id.contact_tv);
                if(Build.VERSION.SDK_INT >= 23)
                    tv32.setTextAppearance(R.style.ParaTextStyle);
                else
                    tv32.setTextAppearance(this_context, R.style.TextStyle);

                // set horizontal weight
                LinearLayout.LayoutParams tv32_params = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT, 1f);
                tv32.setLayoutParams(tv32_params);

                // set background and center text
                tv32.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                tv32.setGravity(Gravity.CENTER);
                //tv32.setBackgroundResource(R.drawable.test_bg);

                tv32.setText("PHONE    816-333-1054\n" +
                        "ARK BUILDING    816-822-7676\n" +
                        "FAX    816-333-0396\n" +
                        "CHURCH    816-333-9102\n" +
                        "\n" +
                        "EMAIL    direfraser@aol.com\n" +
                        "\n" +
                        "OPEN\n" +
                        "\n" +
                        "Mon – Fri: 6:00 AM to 6:00 PM\n" +
                        "\n" +
                        "ADDRESS\n" +
                        "\n" +
                        "Glad Tidings Christian Academy\n" +
                        "2830 East 60th Street\n" +
                        "Kansas City, MO 64130\n" +
                        "\n" +
                        "MAILING ADDRESS\n" +
                        "\n" +
                        "P.O. Box 300932\n" +
                        "Kansas City, MO 64130");
                tr32.addView(tv32);


                // Row 3
                LinearLayout tr33 = (LinearLayout) rootView.findViewById(R.id.row_3);
                tr33.setGravity(Gravity.CENTER);
                //tr33.setBackgroundResource(R.drawable.test_bg);
                // Row 3 Text Views
                MakeButton(this_context, tr33, 1f, R.mipmap.calendar,
                        "https://drive.google.com/viewerng/viewer?url=http://www.gtcacademy.org/wp-content/uploads/2016/08/Enrollment-Form.pdf",
                        "REGISTRATION\nFORM");
            break;
        }

        return rootView;
    }
}
