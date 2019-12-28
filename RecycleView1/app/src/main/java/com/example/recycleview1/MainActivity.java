package com.example.recycleview1;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import com.example.recycleview1.adapters.ListViewAdapter;
import com.example.recycleview1.beans.Datas;
import com.example.recycleview1.beans.ItemBean;
import java.util.ArrayList;
import java.util.List;
/**
 * @author admin
 */
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private RecyclerView mList;
    private List<ItemBean> mData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mList = findViewById(R.id.recycle_view);
        initData();
    }

    private void initData() {
        mData = new ArrayList<>();
        for (int i = 0; i < Datas.icons.length; i++) {
            ItemBean datas = new ItemBean();
            datas.setIcon(Datas.icons[i]);
            datas.setTitle("我是第"+i+"个条目");
            mData.add(datas);
        }
        ListViewAdapter adapter = new ListViewAdapter(mData);
        mList.setAdapter(adapter);
        //设置RecycleView的样式，实现listView功能
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mList.setLayoutManager(linearLayoutManager);
    }

    /*系统调用*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        switch (itemId) {
            //ListView的部分
            case R.id.list_view_vertical_stander:
                Log.d(TAG, "点击了ListView里头的垂直标准");
                break;
            case R.id.list_view_vertical_reverse:
                Log.d(TAG, "点击了ListView里头的垂直反向");
                break;
            case R.id.list_view_horizontal_stander:
                Log.d(TAG, "点击了ListView里头的水平标准");
                break;
            case R.id.list_view_horizontal_reverse:
                Log.d(TAG, "点击了ListView里头的水平反向");
                break;

            //GridView部分
            case R.id.grid_view_vertical_stander:
                break;
            case R.id.grid_view_vertical_reverse:
                break;
            case R.id.grid_view_horizontal_stander:
                break;
            case R.id.grid_view_horizontal_reverse:
                break;

            //瀑布流部分
            case R.id.stagger_view_vertical_stander:
                break;
            case R.id.stagger_view_vertical_reverse:
                break;
            case R.id.stagger_view_horizontal_stander:
                break;
            case R.id.stagger_view_horizontal_reverse:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}