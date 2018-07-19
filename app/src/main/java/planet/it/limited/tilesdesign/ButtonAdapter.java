package planet.it.limited.tilesdesign;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;



/**
 * Created by Tarikul on 4/10/2018.
 */

public class ButtonAdapter extends BaseAdapter {
    private Context mContext;
    private String[] filesnames;
    GridViewButtonInterface gridViewButtonInterface;
    Drawable [] drawables;
    //FontCustomization fontCustomization;
    public  int[] colors;

    // Gets the context so it can be used later
    public ButtonAdapter(Context c, String[] filesnames, GridViewButtonInterface gridViewButtonInterface, Drawable[] drawables, int[] colors) {
        mContext = c;
        this.filesnames = filesnames;
        this.gridViewButtonInterface = gridViewButtonInterface;
        this.drawables = drawables;
        this.colors = colors;

      //  fontCustomization = new FontCustomization(mContext);

    }

    // Total number of things contained within the adapter
    public int getCount() {
        return filesnames.length;
    }

    // Require for structure, not really used in my code.
    public Object getItem(int position) {
        return null;
    }

    // Require for structure, not really used in my code. Can
    // be used to get the id of an item in the adapter for
    // manual control.
    public long getItemId(int position) {
        return position;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public View getView(final int position,
                        View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        gridView =new View(mContext);

        gridView = inflater.inflate(R.layout.grid_layout, null);
        ImageButton imageButton = (ImageButton)gridView.findViewById(R.id.imgbtnDemo);
        TextView textView = (TextView) gridView.findViewById(R.id.txv_btn_name);
        final FrameLayout frameLayoutBtn = (FrameLayout)gridView.findViewById(R.id.btn_framelayout);

        imageButton.setBackgroundDrawable(drawables[position]);
        textView.setText(filesnames[position]);
       // frameLayoutBtn.setBackgroundColor(colors[position]);




      // textView.setTypeface(fontCustomization.getTexgyreHerosBold());



        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               gridViewButtonInterface.getGridButtonPosition(position);
            }
        });

        frameLayoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position==0) {
//                    Intent intent = new Intent(mContext, P2PActivity.class);
//                    mContext.startActivity(intent);
                    //  ((Activity)mContext).finish();
                }
////                }else if(position==1){
////                    Intent intent = new Intent(mContext,SMSDashboard.class);
////                    mContext.startActivity(intent);
////                    //((Activity)mContext).finish();
////                }else if(position==2){
////                    Intent intent = new Intent(mContext,VoiceDashboard.class);
////                    mContext.startActivity(intent);
////                  //  ((Activity)mContext).finish();
////                }
//                    else if(position==3){
//
//                    Intent intent = new Intent(mContext,SettingsActivity.class);
//                    mContext.startActivity(intent);
//                   // ((Activity)mContext).finish();
//                }

                //else if(position==4){
//                    Intent intent = new Intent(mContext,PeopleActivity.class);
//                    mContext.startActivity(intent);
//                  //  ((Activity)mContext).finish();
//                }
            }
        });




        return gridView;
    }

    public interface GridViewButtonInterface{
        void getGridButtonPosition(int position);
    }
}
