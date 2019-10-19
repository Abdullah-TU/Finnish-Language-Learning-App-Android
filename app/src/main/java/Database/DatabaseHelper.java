package Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Environment;
import android.util.Log;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {



    // Logcat tag
    private static final String LOG = "DatabaseHelper";

    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "quize_app";

    // Table Names
    public static final String TABLE_VIDEOS = "quiz_app_table";

    private static final String KEY_VIDEO_ID = "english";
    private static final String KEY_meaning = "finnish";
    // Tag table create statement
    private static final String CREATE_TABLE_VIDEOS = "CREATE TABLE " + TABLE_VIDEOS
            + "(" + KEY_VIDEO_ID + " TEXT," + KEY_meaning + " TEXT" + ")";


    public DatabaseHelper(Context context) {
        super(context, Environment.getExternalStorageDirectory()
                + File.separator + "Mamun"
                + File.separator + DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        // creating required tables
        db.execSQL(CREATE_TABLE_VIDEOS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // on upgrade drop older tables
        db.execSQL("DROP TABLE IF" + CREATE_TABLE_VIDEOS);
        // create new tables
        onCreate(db);
    }

    // ------------------------ "todos" table methods ----------------//

    /*
     * Creating a todo
     */
    public long createVideo(VideoDetails video, String tableName) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_VIDEO_ID, video.word);
        values.put(KEY_meaning, video.meaning);
        // insert row
        long todo_id = db.insert(tableName, null, values);

        return todo_id;
    }

    public void createVideos(List<VideoDetails> videos, String tableName) {
        for (VideoDetails videoDetail : videos) {
            createVideo(videoDetail, tableName);
        }

    }
    public ArrayList<VideoDetails> getAllVideoDetailsFromTable(String tableName) {
        SQLiteDatabase db = this.getReadableDatabase();
        /*Cursor ti = db.rawQuery("PRAGMA table_info(videos_table_mosarraf)", null);
        if ( ti.moveToFirst() ) {
            do {
                Log.e("Column Name: ","col: " + ti.getString(1));
            } while (ti.moveToNext());
        }*/
        ArrayList<VideoDetails> videos = new ArrayList<>();
        String selectQuery;
        selectQuery = "SELECT  * FROM " + tableName;

        Log.e(LOG, selectQuery);

        //SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (c.moveToFirst()) {
            do {
                VideoDetails videoDetail = new VideoDetails();
                videoDetail.meaning = c.getString((c.getColumnIndex(KEY_meaning)));
                videoDetail.word = c.getString((c.getColumnIndex(KEY_VIDEO_ID)));
                // adding to todo list
                videos.add(videoDetail);
            } while (c.moveToNext());
        }

        return videos;
    }
    /*
     * get single todo
     */
    public VideoDetails getVideofromTable(String video_id, String tableName) {
        SQLiteDatabase db = this.getReadableDatabase();

        String selectQuery = "SELECT  * FROM " + tableName + " WHERE "
                + KEY_VIDEO_ID + " = " + video_id;
        Cursor c = db.query(tableName, null, "english=?", new String[] { video_id }, null, null, null);
        Log.e(LOG, selectQuery);

        /* Cursor c = db.rawQuery(selectQuery, null);
         */
        if (c != null)
            c.moveToFirst();

        VideoDetails videoDetail = new VideoDetails();
        videoDetail.meaning = c.getString((c.getColumnIndex(KEY_meaning)));
        videoDetail.word = c.getString((c.getColumnIndex(KEY_VIDEO_ID)));
        return videoDetail;
    }


    public List<String> getAllmeaningsFromTable(String tableName) {
        List<String> meanings = new ArrayList<String>();
        String selectQuery = "SELECT  " + KEY_meaning + " FROM " + tableName;

        Log.e(LOG, selectQuery);

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (c.moveToFirst()) {
            do {
                // adding to todo list
                meanings.add(c.getString((c.getColumnIndex(KEY_meaning))));
            } while (c.moveToNext());
        }

        return meanings;
    }

    /*
     * getting todo count
     */
    public int getCountForTable(String tableName) {
        String countQuery = "SELECT  * FROM " + tableName;
        SQLiteDatabase db = this.getReadableDatabase();
        db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);

        int count = cursor.getCount();
        cursor.close();

        // return count
        return count;
    }

    /*
     * Updating a todo
     */
    public int updateVideoToTable(VideoDetails
                                          video, String tableName) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_VIDEO_ID, video.word);
        values.put(KEY_meaning, video.meaning);
        // updating row
        return db.update(tableName, values, KEY_VIDEO_ID + " = ?",
                new String[]{String.valueOf(video.word)});
    }

    /*
     * Deleting a todo
     */
    public void deleteVideoFromTable(String word, String TableName) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TableName, KEY_VIDEO_ID + " = ?",
                new String[]{String.valueOf(word)});
    }

    public void deleteAllVideos(String tableName) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(tableName, null, null);
    }
    // ------------------------ "tags" table methods ----------------//


    // ------------------------ "todo_tags" table methods ----------------//

    // closing database
    public void closeDB() {
        SQLiteDatabase db = this.getReadableDatabase();
        if (db != null && db.isOpen())
            db.close();
    }
}