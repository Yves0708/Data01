package net.cloud95.android.lession.data01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import net.macdidi.data01.R;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

public class SearchActivity extends Activity {

	private EditText date_search_edit;
	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search);

		processViews();
	}

	private void processViews() {
	    date_search_edit = (EditText) findViewById(R.id.date_search_edit);
		
	    // 設定為今天的日期
	}
	
	public void clickDateSearch(View view) {
	        // 轉換目前的日期為Date物件
	    // 讀取日期物件中的年、月、日
	    // 日期對話框設定監聽物件
	    OnDateSetListener listener = new OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, 
                    int year, int monthOfYear, int dayOfMonth) {
                // 設定畫面元件為設定的日期
            }
        };
        
        // 建立日期對話框物件
        // 顯示日期對話框
	}

	public void clickOk(View view) {
        // 加入設定的日期資料
        // 設定回傳結果
        // 結束
	}

    public void clickCancel(View view) {
        // 結束
    }
    
}