package pkreutzer.databindingtest.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;
import android.widget.Toast;

import pkreutzer.databindingtest.BR;

public class User extends BaseObservable {

    private String firstName;
    private String lastName;

    private boolean awesome;

    public User(final String firstName, final String lastName, final boolean awesome) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.awesome = awesome;
    }

    @Bindable
    public final String getFirstName() {
        return this.firstName;
    }

    @Bindable
    public final String getLastName() {
        return this.lastName;
    }

    @Bindable
    public final boolean isAwesome() {
        return this.awesome;
    }

    public final void setFirstName(final String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    public final void setLastName(final String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }

    public final void setAwesome(final boolean awesome) {
        this.awesome = awesome;
        notifyPropertyChanged(BR.awesome);
    }

    public final void toggleAwesomeness() {
        setAwesome(!this.awesome);
    }
}