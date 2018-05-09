package com.example.calvin.whowroteit;


import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

public class BookLoader extends AsyncTaskLoader <String> {
    String mQueryString;

    public BookLoader (Context context, String mQueryString) {
        super(context);
        this.mQueryString = mQueryString;
    }

    @Override
    public String loadInBackground() {
        return NetworkUtils.getBookInfo(mQueryString);
    }

    @Override
    protected void onStartLoading(){
        super.onStartLoading();

        forceLoad();
    }
}
