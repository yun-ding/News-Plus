package com.laioffer.newsplus.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.laioffer.newsplus.model.Article;

@Database(entities = {Article.class}, version = 1, exportSchema = false)
public abstract class NewsPlusDatabase extends RoomDatabase {
    public abstract ArticleDao articleDao();
}
