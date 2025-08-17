package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.RemoteException;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.vS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9710vS extends AbstractC9297rd0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f79059a;

    /* renamed from: b, reason: collision with root package name */
    private final Xj0 f79060b;

    static final void l(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    public C9710vS(Context context, Xj0 xj0) {
        super(context, "AdMobOfflineBufferedPings.db", null, ((Integer) Mc.A.c().a(C8659lf.f76412l8)).intValue(), AbstractC9618ud0.f78887a);
        this.f79059a = context;
        this.f79060b = xj0;
    }

    static /* synthetic */ void h(SQLiteDatabase sQLiteDatabase, String str, Qc.u uVar) throws Throwable {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        m(sQLiteDatabase, uVar);
    }

    private static void m(SQLiteDatabase sQLiteDatabase, Qc.u uVar) throws Throwable {
        SQLiteDatabase sQLiteDatabase2;
        String str;
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                Cursor cursorQuery = sQLiteDatabase2.query("offline_buffered_pings", new String[]{"timestamp", "url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
                int count = cursorQuery.getCount();
                String[] strArr = new String[count];
                int i10 = 0;
                while (cursorQuery.moveToNext()) {
                    int columnIndex = cursorQuery.getColumnIndex("timestamp");
                    int columnIndex2 = cursorQuery.getColumnIndex("url");
                    if (columnIndex2 != -1) {
                        long j10 = cursorQuery.getLong(columnIndex);
                        String string = cursorQuery.getString(columnIndex2);
                        if (string == null) {
                            str = "";
                        } else {
                            Uri uri = Uri.parse(string);
                            long jA = Lc.v.c().a() - j10;
                            String encodedQuery = uri.getEncodedQuery();
                            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                            builderClearQuery.appendQueryParameter("bd", Long.toString(jA));
                            str = String.valueOf(builderClearQuery.build()) + "&" + encodedQuery;
                        }
                        strArr[i10] = str;
                    }
                    i10++;
                }
                cursorQuery.close();
                sQLiteDatabase2.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
                sQLiteDatabase2.setTransactionSuccessful();
                sQLiteDatabase2.endTransaction();
                for (int i11 = 0; i11 < count; i11++) {
                    uVar.zza(strArr[i11]);
                }
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                sQLiteDatabase2.endTransaction();
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            sQLiteDatabase2 = sQLiteDatabase;
        }
    }

    final /* synthetic */ Void a(C9924xS c9924xS, SQLiteDatabase sQLiteDatabase) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(c9924xS.f79787a));
        contentValues.put("gws_query_id", c9924xS.f79788b);
        contentValues.put("url", c9924xS.f79789c);
        contentValues.put("event_state", Integer.valueOf(c9924xS.f79790d - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        Lc.v.t();
        Pc.T tA = Pc.D0.a(this.f79059a);
        if (tA != null) {
            try {
                tA.zze(com.google.android.gms.dynamic.d.F2(this.f79059a));
            } catch (RemoteException e10) {
                Pc.p0.l("Failed to schedule offline ping sender.", e10);
            }
        }
        return null;
    }

    public final void c(final String str) {
        g(new InterfaceC7865e80(this) { // from class: com.google.android.gms.internal.ads.tS
            @Override // com.google.android.gms.internal.ads.InterfaceC7865e80
            public final Object zza(Object obj) {
                C9710vS.l((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void d(final C9924xS c9924xS) {
        g(new InterfaceC7865e80() { // from class: com.google.android.gms.internal.ads.pS
            @Override // com.google.android.gms.internal.ads.InterfaceC7865e80
            public final Object zza(Object obj) throws Exception {
                this.f77586a.a(c9924xS, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    final void g(InterfaceC7865e80 interfaceC7865e80) {
        Mj0.r(this.f79060b.i0(new Callable() { // from class: com.google.android.gms.internal.ads.rS
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f78027a.getWritableDatabase();
            }
        }), new C9603uS(this, interfaceC7865e80), this.f79060b);
    }

    final void i(final SQLiteDatabase sQLiteDatabase, final Qc.u uVar, final String str) {
        this.f79060b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.sS
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                C9710vS.h(sQLiteDatabase, str, uVar);
            }
        });
    }

    public final void j(final Qc.u uVar, final String str) {
        g(new InterfaceC7865e80() { // from class: com.google.android.gms.internal.ads.qS
            @Override // com.google.android.gms.internal.ads.InterfaceC7865e80
            public final Object zza(Object obj) {
                this.f77781a.i((SQLiteDatabase) obj, uVar, str);
                return null;
            }
        });
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    static /* synthetic */ Void b(Qc.u uVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        m(sQLiteDatabase, uVar);
        return null;
    }
}
