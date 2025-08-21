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
public final class C9835vS extends AbstractC9422rd0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f79899a;

    /* renamed from: b, reason: collision with root package name */
    private final Xj0 f79900b;

    static final void l(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    public C9835vS(Context context, Xj0 xj0) {
        super(context, "AdMobOfflineBufferedPings.db", null, ((Integer) Oc.A.c().a(C8784lf.f77252l8)).intValue(), AbstractC9743ud0.f79727a);
        this.f79899a = context;
        this.f79900b = xj0;
    }

    static /* synthetic */ void h(SQLiteDatabase sQLiteDatabase, String str, Sc.u uVar) throws Throwable {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        m(sQLiteDatabase, uVar);
    }

    private static void m(SQLiteDatabase sQLiteDatabase, Sc.u uVar) throws Throwable {
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
                            long jA = Nc.v.c().a() - j10;
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

    final /* synthetic */ Void a(C10049xS c10049xS, SQLiteDatabase sQLiteDatabase) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(c10049xS.f80627a));
        contentValues.put("gws_query_id", c10049xS.f80628b);
        contentValues.put("url", c10049xS.f80629c);
        contentValues.put("event_state", Integer.valueOf(c10049xS.f80630d - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        Nc.v.t();
        Rc.T tA = Rc.D0.a(this.f79899a);
        if (tA != null) {
            try {
                tA.zze(com.google.android.gms.dynamic.d.I2(this.f79899a));
            } catch (RemoteException e10) {
                Rc.p0.l("Failed to schedule offline ping sender.", e10);
            }
        }
        return null;
    }

    public final void c(final String str) {
        g(new InterfaceC7990e80(this) { // from class: com.google.android.gms.internal.ads.tS
            @Override // com.google.android.gms.internal.ads.InterfaceC7990e80
            public final Object zza(Object obj) {
                C9835vS.l((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void d(final C10049xS c10049xS) {
        g(new InterfaceC7990e80() { // from class: com.google.android.gms.internal.ads.pS
            @Override // com.google.android.gms.internal.ads.InterfaceC7990e80
            public final Object zza(Object obj) throws Exception {
                this.f78426a.a(c10049xS, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    final void g(InterfaceC7990e80 interfaceC7990e80) {
        Mj0.r(this.f79900b.k0(new Callable() { // from class: com.google.android.gms.internal.ads.rS
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f78867a.getWritableDatabase();
            }
        }), new C9728uS(this, interfaceC7990e80), this.f79900b);
    }

    final void i(final SQLiteDatabase sQLiteDatabase, final Sc.u uVar, final String str) {
        this.f79900b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.sS
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                C9835vS.h(sQLiteDatabase, str, uVar);
            }
        });
    }

    public final void j(final Sc.u uVar, final String str) {
        g(new InterfaceC7990e80() { // from class: com.google.android.gms.internal.ads.qS
            @Override // com.google.android.gms.internal.ads.InterfaceC7990e80
            public final Object zza(Object obj) {
                this.f78621a.i((SQLiteDatabase) obj, uVar, str);
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

    static /* synthetic */ Void b(Sc.u uVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        m(sQLiteDatabase, uVar);
        return null;
    }
}
