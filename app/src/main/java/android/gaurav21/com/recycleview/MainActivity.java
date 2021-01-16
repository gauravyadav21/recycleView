package android.gaurav21.com.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerAdaptor recyclerAdaptor;
    List<String> movieList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieList = new ArrayList<>();

        recyclerView = findViewById(R.id.recycleView);
        recyclerAdaptor = new RecyclerAdaptor(movieList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerAdaptor);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);

        movieList.add("Iron man");
        movieList.add("Q man");
        movieList.add("IrWon man");
        movieList.add("E man");
        movieList.add("IrRon man");
        movieList.add("A man");
        movieList.add("C man");
        movieList.add("F man");
        movieList.add("Iron man");
        movieList.add("Q man");
        movieList.add("IrWon man");
        movieList.add("E man");
        movieList.add("IrRon man");
        movieList.add("A man");
        movieList.add("C man");
        movieList.add("F man");
    }
}