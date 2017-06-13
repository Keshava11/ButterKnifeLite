package test.mindorks.com.butterknifelite;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.mindorks.butterknifelite.ButterKnifeLite;
import com.mindorks.butterknifelite.annotations.BindButtonSelector;
import com.mindorks.butterknifelite.annotations.BindView;
import com.mindorks.butterknifelite.annotations.BindViewWithData;
import com.mindorks.butterknifelite.annotations.OnClick;
import com.mindorks.butterknifelite.annotations.OnLongClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txtView)
    private TextView txtView;

    @BindViewWithData(value = R.id.quotes_txv, defaultData = "Default data added")
    private TextView mQuotesTxv;

    @BindViewWithData(value = R.id.author_txv, defaultData = "Author is here")
    private TextView mAuthorTxv;

    @BindView(R.id.general_txv)
    private TextView mGeneralTxv;

    @BindButtonSelector(value = R.id.submit_btn, defaultBgResource = R.drawable.btn_bg_normal, selectedBgResource = R.drawable.btn_bg_pressed,
            textStrNormal = "Normal", textStrSelected = "Selected", textColorNormal = R.color.colorBtnTxtNormal,
            textColorSelected = R.color.colorBtnTxtPressed)
    private Button mSubmitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ButterKnifeLite.bind(this);
        txtView.setText("Testing");

    }


    @BindButtonSelector(value = R.id.submit_btn, defaultBgResource = R.drawable.btn_bg_normal, selectedBgResource = R.drawable.btn_bg_pressed,
            textStrNormal = "Normal", textStrSelected = "Pressed", textColorNormal = R.color.colorBtnTxtNormal,
            textColorSelected = R.color.colorBtnTxtPressed)
    private void OnBindToggle(View iView){

        String selected = "Button is " +(iView.isSelected() ? "Selected" : "Normal");

        Toast.makeText(MainActivity.this, selected, Toast.LENGTH_SHORT).show();

        mGeneralTxv.setText(selected);
    }

    @OnClick(R.id.btn1)
    private void onBtn1Click(){
        txtView.setText("Btn 1 click");
    }

    @OnClick(R.id.btn2)
    private void onBtn2Click(){
        txtView.setText("Btn 2 click");
    }

    @OnLongClick(R.id.btn2)
    private void onBtn2LongClick(){
        txtView.setText("Btn 2 long click");
    }
}
