package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes6.dex */
public final class FR extends AbstractC9422rd0 {
    public FR(Context context) {
        super(context, "OfflineUpload.db", null, 1, AbstractC9743ud0.f79727a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE offline_signal_contents (timestamp INTEGER PRIMARY_KEY, serialized_proto_data BLOB)");
        sQLiteDatabase.execSQL("CREATE TABLE offline_signal_statistics (statistic_name TEXT PRIMARY_KEY, value INTEGER)");
        C7700bS.d(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_signal_contents");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_signal_statistics");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        onUpgrade(sQLiteDatabase, i10, i11);
    }
}
