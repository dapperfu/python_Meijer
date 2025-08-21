package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11353s {

    /* renamed from: a, reason: collision with root package name */
    private final String f86677a;

    /* renamed from: b, reason: collision with root package name */
    private long f86678b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C11367u f86679c;

    public C11353s(C11367u c11367u, String str) {
        Objects.requireNonNull(c11367u);
        this.f86679c = c11367u;
        com.google.android.gms.common.internal.r.f(str);
        this.f86677a = str;
        this.f86678b = -1L;
    }

    public final List a() {
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.f86679c.s0().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{this.f86677a, String.valueOf(this.f86678b)}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j10 = cursorQuery.getLong(0);
                        long j11 = cursorQuery.getLong(3);
                        boolean z10 = cursorQuery.getLong(5) == 1;
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j10 > this.f86678b) {
                            this.f86678b = j10;
                        }
                        try {
                            com.google.android.gms.internal.measurement.N2 n22 = (com.google.android.gms.internal.measurement.N2) u6.U(com.google.android.gms.internal.measurement.O2.O(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            n22.F(string);
                            n22.I(cursorQuery.getLong(2));
                            arrayList.add(new r(j10, j11, z10, (com.google.android.gms.internal.measurement.O2) n22.q()));
                        } catch (IOException e10) {
                            this.f86679c.f85708a.a().m().c("Data loss. Failed to merge raw event. appId", C11343q2.v(this.f86677a), e10);
                        }
                    } while (cursorQuery.moveToNext());
                } else {
                    arrayList = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e11) {
                this.f86679c.f85708a.a().m().c("Data loss. Error querying raw events batch. appId", C11343q2.v(this.f86677a), e11);
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public C11353s(C11367u c11367u, String str, long j10) {
        Objects.requireNonNull(c11367u);
        this.f86679c = c11367u;
        com.google.android.gms.common.internal.r.f(str);
        this.f86677a = str;
        this.f86678b = c11367u.Z("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j10)}, -1L);
    }
}
