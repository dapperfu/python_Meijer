package net.zetetic.database.sqlcipher;

import android.database.Cursor;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* loaded from: classes13.dex */
public interface SQLiteCursorDriver {
    Cursor a(SQLiteDatabase.CursorFactory cursorFactory, String[] strArr);

    void cursorClosed();

    void cursorDeactivated();

    void cursorRequeried(Cursor cursor);
}
