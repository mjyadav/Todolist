

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.mrityunjay.project1.R;

public class MainActivity extends AppCompatActivity {


TextView textView1;
    TextView textView2;
    TextView textView3;
    ImageView imageView;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1=(TextView)findViewById(R.id.text1);
        textView2=(TextView)findViewById(R.id.text2);
        textView3=(TextView)findViewById(R.id.text3);
        imageView=(ImageView)findViewById(R.id.imageView);
        listView=(ListView)findViewById(R.id.listView);

    }
    ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this,R.layout.row_layout, R.id.activity_main, );
        myAdapter.notifyDataSetChanged();

}


      

