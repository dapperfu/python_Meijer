package net.zetetic.database.sqlcipher;

import android.database.CursorWindow;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.os.CancellationSignal;
import com.fullstory.FS;

/* loaded from: classes14.dex */
public final class SQLiteQuery extends SQLiteProgram {

    /* renamed from: i, reason: collision with root package name */
    private final CancellationSignal f152391i;

    SQLiteQuery(SQLiteDatabase sQLiteDatabase, String str, CancellationSignal cancellationSignal) {
        super(sQLiteDatabase, str, null, cancellationSignal);
        this.f152391i = cancellationSignal;
    }

    public String toString() {
        return "SQLiteQuery: " + u();
    }

    int z(CursorWindow cursorWindow, int i10, int i11, boolean z10) {
        a();
        try {
            try {
                cursorWindow.acquireReference();
            } catch (Throwable th2) {
                c();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        try {
        } catch (SQLiteDatabaseCorruptException e10) {
            e = e10;
        } catch (SQLiteException e11) {
            e = e11;
        } catch (Throwable th4) {
            th = th4;
            Throwable th5 = th;
            cursorWindow.releaseReference();
            throw th5;
        }
        try {
            int iH = p().h(u(), j(), cursorWindow, i10, i11, z10, l(), this.f152391i);
            cursorWindow.releaseReference();
            c();
            return iH;
        } catch (SQLiteDatabaseCorruptException e12) {
            e = e12;
            SQLiteDatabaseCorruptException sQLiteDatabaseCorruptException = e;
            w();
            throw sQLiteDatabaseCorruptException;
        } catch (SQLiteException e13) {
            e = e13;
            SQLiteException sQLiteException = e;
            FS.log_e("SQLiteQuery", "exception: " + sQLiteException.getMessage() + "; query: " + u());
            throw sQLiteException;
        }
    }
}
