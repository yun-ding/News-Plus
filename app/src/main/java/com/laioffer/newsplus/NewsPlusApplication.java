package com.laioffer.newsplus;

import android.app.Application;

import androidx.room.Room;

import com.ashokvarma.gander.Gander;
import com.ashokvarma.gander.imdb.GanderIMDB;
import com.facebook.stetho.Stetho;
import com.laioffer.newsplus.database.NewsPlusDatabase;

public class NewsPlusApplication extends Application {
    private NewsPlusDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();
        Gander.setGanderStorage(GanderIMDB.getInstance());
        Stetho.initializeWithDefaults(this);
        database = Room.databaseBuilder(this,
                NewsPlusDatabase.class, "newsplus_db").build();
    }

    public NewsPlusDatabase getDatabase(){
        return database;
    }
}
