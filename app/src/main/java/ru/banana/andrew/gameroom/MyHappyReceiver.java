package ru.banana.andrew.gameroom;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyHappyReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        context.startActivity(new Intent(context, OnStartActivity.class));
        Toast.makeText(context, intent.getAction(), Toast.LENGTH_LONG).show();
        Log.v("Сообщение", intent.getAction());

        Intent startActivityIntent = new Intent(context, VideogamesActivity.class);
        startActivityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(startActivityIntent);
    }

}

