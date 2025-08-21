package com.medallia.digital.mobilesdk;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.text.TextUtils;
import com.medallia.digital.mobilesdk.d7;
import java.util.HashMap;

/* renamed from: com.medallia.digital.mobilesdk.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C11696g extends h1<k> {

    /* renamed from: c, reason: collision with root package name */
    private static final String f92883c = "analyticsEvents";

    /* renamed from: d, reason: collision with root package name */
    private static final int f92884d = 5000;

    /* renamed from: e, reason: collision with root package name */
    private static final int f92885e = 50;

    /* renamed from: a, reason: collision with root package name */
    private int f92886a = 0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f92887b = false;

    /* renamed from: com.medallia.digital.mobilesdk.g$a */
    class a extends HashMap<String, String> {
        a() {
            put("sessionId", "TEXT");
            put("name", "TEXT");
            put("lifetime", "TEXT");
            put("timestamp", "INTEGER");
            put("groupType", "TEXT");
            put("event", "TEXT");
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.g$b */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final String f92889a = "sessionId";

        /* renamed from: b, reason: collision with root package name */
        private static final String f92890b = "name";

        /* renamed from: c, reason: collision with root package name */
        private static final String f92891c = "lifetime";

        /* renamed from: d, reason: collision with root package name */
        private static final String f92892d = "timestamp";

        /* renamed from: e, reason: collision with root package name */
        private static final String f92893e = "groupType";

        /* renamed from: f, reason: collision with root package name */
        private static final String f92894f = "event";

        private b() {
        }
    }

    C11696g() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ContentValues b(k kVar) {
        ContentValues contentValues = new ContentValues();
        if (kVar != null) {
            contentValues.put("sessionId", kVar.e());
            contentValues.put("name", kVar.a());
            contentValues.put("timestamp", Long.valueOf(kVar.f()));
            contentValues.put("lifetime", kVar.c() == null ? null : kVar.c().name());
            contentValues.put("groupType", kVar.b() == null ? null : kVar.b().name());
            contentValues.put("event", kVar.d() != null ? kVar.d().toString() : null);
        }
        return contentValues;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected long b() {
        try {
            return DatabaseUtils.queryNumEntries(f1.a().getWritableDatabase(), f92883c);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // com.medallia.digital.mobilesdk.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.util.ArrayList<com.medallia.digital.mobilesdk.k> c(java.lang.Object... r18) {
        /*
            r17 = this;
            r0 = r18
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 1
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L26
            int r5 = r0.length
            if (r5 <= 0) goto L26
            r5 = r0[r3]
            boolean r6 = r5 instanceof java.lang.Long
            if (r6 == 0) goto L26
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            java.lang.String[] r7 = new java.lang.String[r2]
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r7[r3] = r5
            java.lang.String r5 = "timestamp<=?"
            goto L28
        L26:
            r5 = r4
            r7 = r5
        L28:
            r6 = 2
            if (r0 == 0) goto L69
            int r8 = r0.length
            if (r8 <= r2) goto L69
            r8 = r0[r2]
            if (r8 == 0) goto L69
            boolean r9 = r8 instanceof java.lang.Long
            if (r9 == 0) goto L69
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r5)
            java.lang.String r5 = " AND timestamp>?"
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            if (r7 == 0) goto L61
            int r10 = r7.length
            if (r10 <= 0) goto L61
            r7 = r7[r3]
            java.lang.String[] r10 = new java.lang.String[r6]
            r10[r3] = r7
            java.lang.String r3 = java.lang.String.valueOf(r8)
            r10[r2] = r3
            r11 = r5
            r12 = r10
            goto L6b
        L61:
            java.lang.String[] r7 = new java.lang.String[r2]
            java.lang.String r2 = java.lang.String.valueOf(r8)
            r7[r3] = r2
        L69:
            r11 = r5
            r12 = r7
        L6b:
            if (r0 == 0) goto L7c
            int r2 = r0.length
            if (r2 <= r6) goto L7c
            r0 = r0[r6]
            if (r0 == 0) goto L7c
            boolean r2 = r0 instanceof java.lang.Integer
            if (r2 == 0) goto L7c
            java.lang.String r4 = java.lang.String.valueOf(r0)
        L7c:
            r16 = r4
            com.medallia.digital.mobilesdk.f1 r0 = com.medallia.digital.mobilesdk.f1.a()
            android.database.sqlite.SQLiteDatabase r8 = r0.getReadableDatabase()
            java.lang.String r9 = r17.d()
            r14 = 0
            java.lang.String r15 = "timestamp ASC"
            r10 = 0
            r13 = 0
            android.database.Cursor r0 = r8.query(r9, r10, r11, r12, r13, r14, r15, r16)
            if (r0 == 0) goto Lf0
            boolean r2 = r0.moveToFirst()
            if (r2 == 0) goto Led
        L9b:
            com.medallia.digital.mobilesdk.k r3 = new com.medallia.digital.mobilesdk.k
            java.lang.String r2 = "event"
            int r2 = r0.getColumnIndex(r2)
            java.lang.String r4 = r0.getString(r2)
            java.lang.String r2 = "groupType"
            int r2 = r0.getColumnIndex(r2)
            java.lang.String r2 = r0.getString(r2)
            com.medallia.digital.mobilesdk.GroupType r5 = com.medallia.digital.mobilesdk.GroupType.valueOf(r2)
            java.lang.String r2 = "lifetime"
            int r2 = r0.getColumnIndex(r2)
            java.lang.String r2 = r0.getString(r2)
            com.medallia.digital.mobilesdk.Lifetime r6 = com.medallia.digital.mobilesdk.Lifetime.valueOf(r2)
            java.lang.String r2 = "name"
            int r2 = r0.getColumnIndex(r2)
            java.lang.String r7 = r0.getString(r2)
            java.lang.String r2 = "timestamp"
            int r2 = r0.getColumnIndex(r2)
            long r8 = r0.getLong(r2)
            java.lang.String r2 = "sessionId"
            int r2 = r0.getColumnIndex(r2)
            java.lang.String r10 = r0.getString(r2)
            r3.<init>(r4, r5, r6, r7, r8, r10)
            r1.add(r3)
            boolean r2 = r0.moveToNext()
            if (r2 != 0) goto L9b
        Led:
            r0.close()
        Lf0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C11696g.c(java.lang.Object[]):java.util.ArrayList");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public k b(Object... objArr) {
        return null;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected String e() {
        return "timestamp";
    }

    protected void f() throws SQLException {
        Double maxDbFileSizeInMb;
        Integer numValueOf;
        String strA;
        if (this.f92886a >= f92885e) {
            this.f92886a = 0;
            try {
                maxDbFileSizeInMb = t0.c().a().getSdkConfiguration().getMedalliaDigitalBrain().getMaxDbFileSizeInMb();
            } catch (Exception unused) {
                a4.b("Unable to get maxDbFileSize from config");
                maxDbFileSizeInMb = null;
            }
            try {
                numValueOf = t0.c().a().getSdkConfiguration().getMedalliaDigitalBrain().getMaxTableRecordsBeforeClean();
            } catch (Exception unused2) {
                a4.b("Unable to get maxRecordsBeforeClean from config");
                numValueOf = null;
            }
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(f92884d);
            }
            if (f1.a().a(maxDbFileSizeInMb)) {
                a4.b("DB file max size reached");
                if (b() < numValueOf.intValue() || this.f92887b || (strA = d7.b().a(d7.a.SESSION_ID, (String) null)) == null) {
                    return;
                }
                String str = "DELETE FROM " + d() + " WHERE sessionId != '" + strA + "'";
                f1.a().getWritableDatabase().execSQL(str);
                this.f92887b = true;
                a4.b("Older sessions analytics events deletion triggered. Query: " + str);
            }
        }
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected boolean a(Object... objArr) {
        String[] strArr;
        long jLongValue;
        String str;
        if (objArr != null && objArr.length != 0) {
            Object obj = objArr[0];
            long jLongValue2 = -1;
            if (obj instanceof Long) {
                jLongValue = ((Long) obj).longValue();
                strArr = new String[]{String.valueOf(jLongValue)};
                str = "timestamp<=?";
            } else {
                strArr = null;
                jLongValue = -1;
                str = null;
            }
            if (objArr.length > 1) {
                Object obj2 = objArr[1];
                if (obj2 instanceof Long) {
                    jLongValue2 = ((Long) obj2).longValue();
                    if (str == null) {
                        strArr = new String[]{String.valueOf(jLongValue2)};
                        str = "timestamp>=?";
                    } else {
                        str = str + " AND timestamp>=?";
                        strArr = (strArr == null || strArr.length <= 0) ? new String[]{String.valueOf(jLongValue2)} : new String[]{strArr[0], String.valueOf(jLongValue2)};
                    }
                }
            }
            String[] strArr2 = strArr;
            String str2 = str;
            z = f1.a().getWritableDatabase().delete(d(), str2, strArr2) > 0;
            if (z) {
                a4.e("Delete Analytics records from timestamp " + jLongValue2 + " to timestamp " + jLongValue);
            }
            a(!z, "delete " + (!z ? f1.a().getReadableDatabase().query(d(), null, str2, strArr2, null, null, "timestamp ASC", null).getCount() : -1) + " analytics records from timestamp " + jLongValue2 + " to timestamp " + jLongValue);
        }
        return z;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected HashMap<String, String> c() {
        return new a();
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected String d() {
        return f92883c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    /* renamed from: c, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean d(k kVar) {
        return f1.a().getWritableDatabase().update(d(), b(kVar), "name=?", new String[]{kVar.a()}) > 0 || super.c((C11696g) kVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    /* renamed from: b, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean c(k kVar) throws SQLException {
        if (TextUtils.isEmpty(kVar.e()) || kVar.f() <= 0) {
            a(true, "insert (invalid data from analytics) - " + kVar);
            return false;
        }
        boolean zC = super.c((C11696g) kVar);
        if (zC) {
            this.f92886a++;
        } else {
            this.f92886a = 0;
        }
        f();
        return zC;
    }
}
