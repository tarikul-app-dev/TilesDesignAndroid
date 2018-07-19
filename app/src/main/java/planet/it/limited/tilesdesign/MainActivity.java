package planet.it.limited.tilesdesign;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity implements ButtonAdapter.GridViewButtonInterface{
    GridView btnGridView;
    public String[] filesnames = {
            "P2P",
            "Topup",
            "Cash Out",
            "Payment",
            "Fund Transfer",
            "Account Info"

    };
    public Drawable[] drawables = new Drawable[6];
    public int colors[] = new int[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawables[0] = this.getResources().getDrawable(R.drawable.ic_p2p);
        drawables[1] = this.getResources().getDrawable(R.drawable.ic_topup);
        drawables[2] = this.getResources().getDrawable(R.drawable.ic_cash_out);
        drawables[3] = this.getResources().getDrawable(R.drawable.ic_payment);
        drawables[4] = this.getResources().getDrawable(R.drawable.ic_fund_transfer);
        drawables[5] = this.getResources().getDrawable(R.drawable.ic_account_info);

        colors[0] = ContextCompat.getColor(MainActivity.this, R.color.color_white);
        colors[1] =ContextCompat.getColor(MainActivity.this, R.color.color_white);
        colors[2] = ContextCompat.getColor(MainActivity.this, R.color.color_white);
        colors[3] =  ContextCompat.getColor(MainActivity.this, R.color.color_white);
        colors[4] =  ContextCompat.getColor(MainActivity.this, R.color.color_white);
        colors[5] =  ContextCompat.getColor(MainActivity.this, R.color.color_white);
        btnGridView = (GridView)findViewById(R.id.btn_gridview);

        btnGridView.setAdapter(new ButtonAdapter(MainActivity.this,filesnames,this,drawables,colors));
    }

    @Override
    public void getGridButtonPosition(int position) {

    }
}
