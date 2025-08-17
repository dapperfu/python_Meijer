package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.hS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8215hS {

    /* renamed from: a, reason: collision with root package name */
    private final C7392Zc f74725a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f74726b;

    /* renamed from: c, reason: collision with root package name */
    private final MR f74727c;

    /* renamed from: d, reason: collision with root package name */
    private final Qc.a f74728d;

    final /* synthetic */ Void a(boolean z10, SQLiteDatabase sQLiteDatabase) throws Exception {
        if (z10) {
            this.f74726b.deleteDatabase("OfflineUpload.db");
        } else {
            ArrayList arrayList = new ArrayList();
            Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    arrayList.add(C9403sd.G0(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (zzgyg e10) {
                    Qc.p.d("Unable to deserialize proto from offline signals database:");
                    Qc.p.d(e10.getMessage());
                }
            }
            cursorQuery.close();
            Context context = this.f74726b;
            C9617ud c9617udS0 = C9938xd.s0();
            c9617udS0.z(context.getPackageName());
            c9617udS0.E(Build.MODEL);
            c9617udS0.u(C7575bS.a(sQLiteDatabase, 0));
            c9617udS0.y(arrayList);
            c9617udS0.w(C7575bS.a(sQLiteDatabase, 1));
            c9617udS0.D(C7575bS.a(sQLiteDatabase, 3));
            c9617udS0.x(Lc.v.c().a());
            c9617udS0.v(C7575bS.b(sQLiteDatabase, 2));
            final C9938xd c9938xdP = c9617udS0.p();
            int size = arrayList.size();
            long jC0 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                C9403sd c9403sd = (C9403sd) arrayList.get(i10);
                if (c9403sd.D0() == EnumC6756Ge.ENUM_TRUE && c9403sd.C0() > jC0) {
                    jC0 = c9403sd.C0();
                }
            }
            if (jC0 != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", Long.valueOf(jC0));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            this.f74725a.b(new InterfaceC7359Yc() { // from class: com.google.android.gms.internal.ads.fS
                @Override // com.google.android.gms.internal.ads.InterfaceC7359Yc
                public final void a(C6824Ie c6824Ie) {
                    c6824Ie.y(c9938xdP);
                }
            });
            Qc.a aVar = this.f74728d;
            C6822Id c6822IdH0 = C6856Jd.h0();
            c6822IdH0.u(aVar.f29930b);
            c6822IdH0.w(this.f74728d.f29931c);
            c6822IdH0.v(true != this.f74728d.f29932d ? 2 : 0);
            final C6856Jd c6856JdP = c6822IdH0.p();
            this.f74725a.b(new InterfaceC7359Yc() { // from class: com.google.android.gms.internal.ads.gS
                @Override // com.google.android.gms.internal.ads.InterfaceC7359Yc
                public final void a(C6824Ie c6824Ie) {
                    C6552Ae c6552AeH = c6824Ie.F().H();
                    c6552AeH.v(c6856JdP);
                    c6824Ie.w(c6552AeH);
                }
            });
            this.f74725a.c(10004);
            C7575bS.e(sQLiteDatabase);
        }
        return null;
    }

    public final void b(final boolean z10) {
        try {
            this.f74727c.a(new InterfaceC7865e80() { // from class: com.google.android.gms.internal.ads.eS
                @Override // com.google.android.gms.internal.ads.InterfaceC7865e80
                public final Object zza(Object obj) throws Exception {
                    this.f73867a.a(z10, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e10) {
            Qc.p.d("Error in offline signals database startup: ".concat(String.valueOf(e10.getMessage())));
        }
    }

    public C8215hS(Context context, Qc.a aVar, C7392Zc c7392Zc, MR mr2) {
        this.f74726b = context;
        this.f74728d = aVar;
        this.f74725a = c7392Zc;
        this.f74727c = mr2;
    }
}
