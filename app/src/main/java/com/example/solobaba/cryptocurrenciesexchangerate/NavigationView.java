package com.example.solobaba.cryptocurrenciesexchangerate;

/**
 * Created by SOLOBABA on 11/3/2017.
 */

class NavigationView {
    private MainActivity navigationItemSelectedListener;


    public void setNavigationItemSelectedListener(MainActivity navigationItemSelectedListener) {
        this.navigationItemSelectedListener = navigationItemSelectedListener;
    }

    public interface OnNavigationItemSelectedListener {
    }
}
