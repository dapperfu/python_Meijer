package J5;

import L5.g;
import L5.m;
import Q5.K;
import Q5.t;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.adobe.marketing.mobile.EventHistoryResult;
import com.adobe.marketing.mobile.internal.eventhub.history.EventHistoryDatabaseCreationException;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001a¨\u0006\u001c"}, d2 = {"LJ5/d;", "", "<init>", "()V", "Ljava/io/File;", "d", "()Ljava/io/File;", "", "c", "a", "", "hash", "timestampMS", "", "b", "(JJ)Z", "from", "to", "Lcom/adobe/marketing/mobile/k;", "e", "(JJJ)Lcom/adobe/marketing/mobile/k;", "Ljava/lang/Object;", "dbMutex", "Ljava/io/File;", "databaseFile", "Landroid/database/sqlite/SQLiteDatabase;", "Landroid/database/sqlite/SQLiteDatabase;", "database", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object dbMutex;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final File databaseFile;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private SQLiteDatabase database;

    private final void a() {
        m.b(this.database);
        this.database = null;
    }

    private final void c() {
        this.database = m.e(this.databaseFile.getPath(), m.a.READ_WRITE);
    }

    private final File d() throws EventHistoryDatabaseCreationException {
        Context applicationContext = K.f().a().getApplicationContext();
        if (applicationContext == null) {
            throw new EventHistoryDatabaseCreationException("Failed to create/open database com.adobe.module.core.eventhistory, error message: ApplicationContext is null");
        }
        File database = applicationContext.getDatabasePath("com.adobe.module.core.eventhistory");
        if (database.exists()) {
            Intrinsics.i(database, "database");
            return database;
        }
        File fileO = K.f().e().o();
        if (fileO == null) {
            Intrinsics.i(database, "database");
            return database;
        }
        try {
            File file = new File(fileO, "EventHistory");
            if (file.exists()) {
                Intrinsics.i(database, "database");
                g.f(file, database);
                t.a("MobileCore", "AndroidEventHistoryDatabase", "Successfully moved database EventHistory from cache directory to database directory", new Object[0]);
            }
        } catch (Exception unused) {
            t.a("MobileCore", "AndroidEventHistoryDatabase", "Failed to move database EventHistory from cache directory to database directory", new Object[0]);
        }
        Intrinsics.i(database, "database");
        return database;
    }

    public boolean b(long hash, long timestampMS) {
        boolean z10;
        synchronized (this.dbMutex) {
            try {
                c();
                ContentValues contentValues = new ContentValues();
                contentValues.put("eventHash", Long.valueOf(hash));
                contentValues.put("timestamp", Long.valueOf(timestampMS));
                SQLiteDatabase sQLiteDatabase = this.database;
                z10 = (sQLiteDatabase != null ? sQLiteDatabase.insert("Events", null, contentValues) : -1L) > 0;
            } catch (Exception e10) {
                t.f("MobileCore", "AndroidEventHistoryDatabase", "Failed to insert rows into the table (%s)", e10.getLocalizedMessage() != null ? e10.getLocalizedMessage() : e10.getMessage());
                return false;
            } finally {
                a();
            }
        }
        return z10;
    }

    public EventHistoryResult e(long hash, long from, long to2) {
        synchronized (this.dbMutex) {
            try {
                try {
                    c();
                    String[] strArr = {String.valueOf(hash), String.valueOf(from), String.valueOf(to2)};
                    SQLiteDatabase sQLiteDatabase = this.database;
                    Cursor cursorRawQuery = sQLiteDatabase != null ? sQLiteDatabase.rawQuery("SELECT COUNT(*) as count, min(timestamp) as oldest, max(timestamp) as newest FROM Events WHERE eventHash = ? AND timestamp >= ? AND timestamp <= ?", strArr) : null;
                    if (cursorRawQuery == null) {
                        EventHistoryResult eventHistoryResult = new EventHistoryResult(-1, null, null, 6, null);
                        a();
                        return eventHistoryResult;
                    }
                    Intrinsics.i(cursorRawQuery, "database?.rawQuery(rawQu…sult(EVENT_HISTORY_ERROR)");
                    try {
                        cursorRawQuery.moveToFirst();
                        int i10 = cursorRawQuery.getInt(0);
                        if (i10 == 0) {
                            EventHistoryResult eventHistoryResult2 = new EventHistoryResult(0, null, null, 6, null);
                            CloseableKt.a(cursorRawQuery, null);
                            a();
                            return eventHistoryResult2;
                        }
                        EventHistoryResult eventHistoryResult3 = new EventHistoryResult(i10, Long.valueOf(cursorRawQuery.getLong(1)), Long.valueOf(cursorRawQuery.getLong(2)));
                        CloseableKt.a(cursorRawQuery, null);
                        a();
                        return eventHistoryResult3;
                    } finally {
                    }
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            } catch (Exception e10) {
                t.f("MobileCore", "AndroidEventHistoryDatabase", "Failed to execute query (%s)", e10.getLocalizedMessage() != null ? e10.getLocalizedMessage() : e10.getMessage());
                EventHistoryResult eventHistoryResult4 = new EventHistoryResult(-1, null, null, 6, null);
                a();
                return eventHistoryResult4;
            }
        }
    }

    public d() throws EventHistoryDatabaseCreationException {
        Object obj = new Object();
        this.dbMutex = obj;
        File fileD = d();
        this.databaseFile = fileD;
        synchronized (obj) {
            if (m.c(fileD.getPath(), "CREATE TABLE IF NOT EXISTS Events (eventHash INTEGER, timestamp INTEGER);")) {
                Unit unit = Unit.f142422a;
            } else {
                throw new EventHistoryDatabaseCreationException("An error occurred while creating the Events table in the Android Event History database.");
            }
        }
    }
}
