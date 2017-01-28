package ru.banana.andrew.gameroom;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyHappyReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        context.startActivity(new Intent(context, OnStartActivity.class));
    }
}
