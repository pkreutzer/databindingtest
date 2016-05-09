package pkreutzer.databindingtest.view;

import android.view.View;
import android.widget.Toast;

import pkreutzer.databindingtest.model.User;

public class MainHandler {

    private final User user;

    public MainHandler(final User user) {
        this.user = user;
    }

    public final void onClickToggleAwesomeness(final View view) {
        this.user.toggleAwesomeness();
    }

    public final void onClickSetName(final View view) {
        this.user.setLastName("foobarbazz");
    }

}
