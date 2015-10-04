package net.cloud95.android.lession.data01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateActivity extends Activity {

    private EditText id_update_edit;
	private EditText latitude_update_edit;
	private EditText longitude_update_edit;
	private EditText accuracy_update_edit;
	private EditText datetime_update_edit;
	private EditText note_update_edit;
	// 資料庫物件

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_update);

        // 取得資料庫物件
        // 讀取修改資料的編號
        // 取得指定編號的物件
		processViews();
	}

	private void processViews() {
	    id_update_edit = (EditText) findViewById(R.id.id_update_edit);
		latitude_update_edit = (EditText) findViewById(R.id.latitude_update_edit);
		longitude_update_edit = (EditText) findViewById(R.id.longitude_update_edit);
		accuracy_update_edit = (EditText) findViewById(R.id.accuracy_update_edit);
		datetime_update_edit = (EditText) findViewById(R.id.datetime_update_edit);
		note_update_edit = (EditText) findViewById(R.id.note_update_edit);
		
		// 設定畫面元件顯示的資料
	}

	public void clickOk(View view) {
	 // 讀取使用者輸入的資料
	    double latitudeValue = Double.parseDouble(latitude_update_edit.getText().toString());
	    double longitudeValue = Double.parseDouble(longitude_update_edit.getText().toString());
	    double accuracyValue = Double.parseDouble(accuracy_update_edit.getText().toString());
	    String datetimeValue = datetime_update_edit.getText().toString();
	    String noteValue = note_update_edit.getText().toString();
	    
	    // 把讀取的資料設定給物件
        // 修改
        // 顯示修改成功
        // 設定回傳結果
        // 結束
	}

    public void clickCancel(View view) {
        // 結束
    }
    
}