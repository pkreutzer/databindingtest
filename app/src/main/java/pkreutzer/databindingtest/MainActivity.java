package pkreutzer.databindingtest;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.Toast;

import pkreutzer.databindingtest.databinding.MainActivityBinding;
import pkreutzer.databindingtest.model.User;
import pkreutzer.databindingtest.view.MainHandler;

//import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkNotNull;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        checkNotNull(this);

        MainActivityBinding binding = (MainActivityBinding) DataBindingUtil.setContentView(this, R.layout.main_activity);

        final User user = new User("foo", "bar", false);
        binding.setUser(user);

        binding.setHandlers(new MainHandler(user));
    }
}
