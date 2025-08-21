package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.hS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8340hS {

    /* renamed from: a, reason: collision with root package name */
    private final C7517Zc f75565a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f75566b;

    /* renamed from: c, reason: collision with root package name */
    private final MR f75567c;

    /* renamed from: d, reason: collision with root package name */
    private final Sc.a f75568d;

    final /* synthetic */ Void a(boolean z10, SQLiteDatabase sQLiteDatabase) throws Exception {
        if (z10) {
            this.f75566b.deleteDatabase("OfflineUpload.db");
        } else {
            ArrayList arrayList = new ArrayList();
            Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    arrayList.add(C9528sd.G0(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (zzgyg e10) {
                    Sc.p.d("Unable to deserialize proto from offline signals database:");
                    Sc.p.d(e10.getMessage());
                }
            }
            cursorQuery.close();
            Context context = this.f75566b;
            C9742ud c9742udS0 = C10063xd.s0();
            c9742udS0.z(context.getPackageName());
            c9742udS0.E(Build.MODEL);
            c9742udS0.u(C7700bS.a(sQLiteDatabase, 0));
            c9742udS0.y(arrayList);
            c9742udS0.w(C7700bS.a(sQLiteDatabase, 1));
            c9742udS0.D(C7700bS.a(sQLiteDatabase, 3));
            c9742udS0.x(Nc.v.c().a());
            c9742udS0.v(C7700bS.b(sQLiteDatabase, 2));
            final C10063xd c10063xdP = c9742udS0.p();
            int size = arrayList.size();
            long jC0 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                C9528sd c9528sd = (C9528sd) arrayList.get(i10);
                if (c9528sd.D0() == EnumC6881Ge.ENUM_TRUE && c9528sd.C0() > jC0) {
                    jC0 = c9528sd.C0();
                }
            }
            if (jC0 != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", Long.valueOf(jC0));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            this.f75565a.b(new InterfaceC7484Yc() { // from class: com.google.android.gms.internal.ads.fS
                @Override // com.google.android.gms.internal.ads.InterfaceC7484Yc
                public final void a(C6949Ie c6949Ie) {
                    c6949Ie.y(c10063xdP);
                }
            });
            Sc.a aVar = this.f75568d;
            C6947Id c6947IdH0 = C6981Jd.h0();
            c6947IdH0.u(aVar.f34480b);
            c6947IdH0.w(this.f75568d.f34481c);
            c6947IdH0.v(true != this.f75568d.f34482d ? 2 : 0);
            final C6981Jd c6981JdP = c6947IdH0.p();
            this.f75565a.b(new InterfaceC7484Yc() { // from class: com.google.android.gms.internal.ads.gS
                @Override // com.google.android.gms.internal.ads.InterfaceC7484Yc
                public final void a(C6949Ie c6949Ie) {
                    C6677Ae c6677AeH = c6949Ie.F().H();
                    c6677AeH.v(c6981JdP);
                    c6949Ie.w(c6677AeH);
                }
            });
            this.f75565a.c(10004);
            C7700bS.e(sQLiteDatabase);
        }
        return null;
    }

    public final void b(final boolean z10) {
        try {
            this.f75567c.a(new InterfaceC7990e80() { // from class: com.google.android.gms.internal.ads.eS
                @Override // com.google.android.gms.internal.ads.InterfaceC7990e80
                public final Object zza(Object obj) throws Exception {
                    this.f74707a.a(z10, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e10) {
            Sc.p.d("Error in offline signals database startup: ".concat(String.valueOf(e10.getMessage())));
        }
    }

    public C8340hS(Context context, Sc.a aVar, C7517Zc c7517Zc, MR mr2) {
        this.f75566b = context;
        this.f75568d = aVar;
        this.f75565a = c7517Zc;
        this.f75567c = mr2;
    }
}
