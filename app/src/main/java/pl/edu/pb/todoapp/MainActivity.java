package pl.edu.pb.todoapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import java.util.UUID;

public class MainActivity extends SingleFragmentActivity {
    //init
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected Fragment createFragment() {
        UUID taskId = (UUID) getIntent().getSerializableExtra(TaskListFragment.KEY_EXTRA_TASK_ID);
        return TaskFragment.newInstance(taskId);
    }
}