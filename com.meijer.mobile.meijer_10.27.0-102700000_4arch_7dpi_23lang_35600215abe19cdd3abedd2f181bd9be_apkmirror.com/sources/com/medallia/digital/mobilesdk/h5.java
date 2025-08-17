package com.medallia.digital.mobilesdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import java.util.HashMap;

/* loaded from: classes7.dex */
class h5 extends h1<e5> {

    /* renamed from: a, reason: collision with root package name */
    private static final int f92179a = 7;

    /* renamed from: b, reason: collision with root package name */
    private static final int f92180b = 3;

    /* renamed from: c, reason: collision with root package name */
    private static final String f92181c = "mediaFeedbacks";

    class a extends HashMap<String, String> {
        a() {
            put("mediaCaptureClientCorrelationId", "TEXT");
            put("feedbackClientCorrelationId", "TEXT");
            put("formId", "TEXT");
            put("formName", "TEXT");
            put("submittedTimestamp", "INTEGER");
            put("mediaPath", "TEXT");
            put("mediaType", "TEXT");
            put("ecId", "TEXT");
            put("numberOfRetries", "INTEGER");
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f92183a;

        static {
            int[] iArr = new int[d.values().length];
            f92183a = iArr;
            try {
                iArr[d.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f92183a[d.AUDIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private static final String f92184a = "mediaCaptureClientCorrelationId";

        /* renamed from: b, reason: collision with root package name */
        private static final String f92185b = "feedbackClientCorrelationId";

        /* renamed from: c, reason: collision with root package name */
        private static final String f92186c = "formId";

        /* renamed from: d, reason: collision with root package name */
        private static final String f92187d = "formName";

        /* renamed from: e, reason: collision with root package name */
        private static final String f92188e = "submittedTimestamp";

        /* renamed from: f, reason: collision with root package name */
        private static final String f92189f = "mediaPath";

        /* renamed from: g, reason: collision with root package name */
        private static final String f92190g = "mediaType";

        /* renamed from: h, reason: collision with root package name */
        private static final String f92191h = "ecId";

        /* renamed from: i, reason: collision with root package name */
        private static final String f92192i = "numberOfRetries";

        private c() {
        }
    }

    enum d {
        VIDEO,
        AUDIO
    }

    h5() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    public boolean a(e5 e5Var) {
        return f1.a().getWritableDatabase().delete(d(), "mediaCaptureClientCorrelationId=?", new String[]{e5Var.d()}) > 0;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected long b() {
        try {
            return DatabaseUtils.queryNumEntries(f1.a().getWritableDatabase(), f92181c);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    @Override // com.medallia.digital.mobilesdk.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.util.ArrayList<com.medallia.digital.mobilesdk.e5> c(java.lang.Object... r14) {
        /*
            r13 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r14 == 0) goto L50
            int r1 = r14.length
            if (r1 <= 0) goto L50
            r1 = 0
            r14 = r14[r1]
            boolean r1 = r14 instanceof com.medallia.digital.mobilesdk.h5.d
            if (r1 == 0) goto L4e
            com.medallia.digital.mobilesdk.h5$d r14 = (com.medallia.digital.mobilesdk.h5.d) r14
            int[] r1 = com.medallia.digital.mobilesdk.h5.b.f92183a
            int r14 = r14.ordinal()
            r14 = r1[r14]
            r1 = 1
            if (r14 == r1) goto L3b
            r1 = 2
            if (r14 == r1) goto L22
            goto L4e
        L22:
            com.medallia.digital.mobilesdk.f1 r14 = com.medallia.digital.mobilesdk.f1.a()
            android.database.sqlite.SQLiteDatabase r1 = r14.getReadableDatabase()
            java.lang.String r2 = r13.d()
            r7 = 0
            java.lang.String r8 = "submittedTimestamp DESC"
            r3 = 0
            java.lang.String r4 = "mediaType='audio/wav'"
        L34:
            r5 = 0
            r6 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)
            goto L62
        L3b:
            com.medallia.digital.mobilesdk.f1 r14 = com.medallia.digital.mobilesdk.f1.a()
            android.database.sqlite.SQLiteDatabase r1 = r14.getReadableDatabase()
            java.lang.String r2 = r13.d()
            r7 = 0
            java.lang.String r8 = "submittedTimestamp DESC"
            r3 = 0
            java.lang.String r4 = "mediaType='video/mp4'"
            goto L34
        L4e:
            r14 = 0
            goto L62
        L50:
            com.medallia.digital.mobilesdk.f1 r14 = com.medallia.digital.mobilesdk.f1.a()
            android.database.sqlite.SQLiteDatabase r1 = r14.getReadableDatabase()
            java.lang.String r2 = r13.d()
            r7 = 0
            java.lang.String r8 = "submittedTimestamp DESC"
            r3 = 0
            r4 = 0
            goto L34
        L62:
            if (r14 == 0) goto Ld5
            boolean r1 = r14.moveToFirst()
            if (r1 == 0) goto Ld2
        L6a:
            com.medallia.digital.mobilesdk.e5 r2 = new com.medallia.digital.mobilesdk.e5
            java.lang.String r1 = "mediaCaptureClientCorrelationId"
            int r1 = r14.getColumnIndex(r1)
            java.lang.String r3 = r14.getString(r1)
            java.lang.String r1 = "feedbackClientCorrelationId"
            int r1 = r14.getColumnIndex(r1)
            java.lang.String r4 = r14.getString(r1)
            java.lang.String r1 = "mediaPath"
            int r1 = r14.getColumnIndex(r1)
            java.lang.String r5 = r14.getString(r1)
            java.lang.String r1 = "formId"
            int r1 = r14.getColumnIndex(r1)
            java.lang.String r6 = r14.getString(r1)
            java.lang.String r1 = "formName"
            int r1 = r14.getColumnIndex(r1)
            java.lang.String r7 = r14.getString(r1)
            java.lang.String r1 = "mediaType"
            int r1 = r14.getColumnIndex(r1)
            java.lang.String r8 = r14.getString(r1)
            java.lang.String r1 = "submittedTimestamp"
            int r1 = r14.getColumnIndex(r1)
            long r9 = r14.getLong(r1)
            java.lang.String r1 = "ecId"
            int r1 = r14.getColumnIndex(r1)
            java.lang.String r11 = r14.getString(r1)
            java.lang.String r1 = "numberOfRetries"
            int r1 = r14.getColumnIndex(r1)
            int r12 = r14.getInt(r1)
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11, r12)
            r0.add(r2)
            boolean r1 = r14.moveToNext()
            if (r1 != 0) goto L6a
        Ld2:
            r14.close()
        Ld5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.h5.c(java.lang.Object[]):java.util.ArrayList");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public e5 b(Object... objArr) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    public ContentValues b(e5 e5Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("mediaCaptureClientCorrelationId", e5Var.d());
        contentValues.put("feedbackClientCorrelationId", e5Var.b());
        contentValues.put("formId", e5Var.getFormId());
        contentValues.put("formName", e5Var.c());
        contentValues.put("submittedTimestamp", Long.valueOf(e5Var.h()));
        contentValues.put("mediaPath", e5Var.e());
        contentValues.put("mediaType", e5Var.f());
        contentValues.put("ecId", e5Var.a());
        contentValues.put("numberOfRetries", Integer.valueOf(e5Var.g()));
        return contentValues;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected HashMap<String, String> c() {
        return new a();
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected String d() {
        return f92181c;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected boolean a(Object... objArr) {
        Object obj;
        return objArr != null && objArr.length > 0 && (obj = objArr[0]) != null && (obj instanceof Long) && f1.a().getWritableDatabase().delete(d(), "submittedTimestamp<=?", new String[]{String.valueOf(objArr[0])}) > 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    public boolean c(e5 e5Var) {
        Cursor cursorQuery;
        String string;
        int size = c(new Object[0]).size();
        int size2 = c(d.VIDEO).size();
        String strD = j5.d(e5Var.f());
        if (size2 >= 3 && strD != null && (strD.equals("video") || strD.equals("upload"))) {
            cursorQuery = f1.a().getReadableDatabase().query(d(), new String[]{"mediaCaptureClientCorrelationId", "submittedTimestamp", "mediaPath"}, "mediaType='video/mp4'", null, null, null, "submittedTimestamp ASC ");
            if (cursorQuery != null && cursorQuery.getColumnName(0) != null && cursorQuery.getColumnName(1) != null && cursorQuery.getColumnName(2) != null && cursorQuery.moveToFirst()) {
                if (Long.parseLong(cursorQuery.getString(1)) > e5Var.h()) {
                    return false;
                }
                f1.a().getWritableDatabase().delete(d(), "mediaCaptureClientCorrelationId=?", new String[]{cursorQuery.getString(0)});
                string = cursorQuery.getColumnName(2);
                g2.c(string);
                cursorQuery.close();
            }
        } else if (size >= 7 && (cursorQuery = f1.a().getReadableDatabase().query(d(), new String[]{"mediaCaptureClientCorrelationId", "submittedTimestamp", "mediaPath"}, null, null, null, null, "submittedTimestamp ASC ")) != null && cursorQuery.moveToFirst() && cursorQuery.getColumnName(0) != null && cursorQuery.getColumnName(1) != null && cursorQuery.getColumnName(2) != null) {
            if (Long.parseLong(cursorQuery.getString(1)) > e5Var.h()) {
                return false;
            }
            f1.a().getWritableDatabase().delete(d(), "mediaCaptureClientCorrelationId=?", new String[]{cursorQuery.getString(0)});
            string = cursorQuery.getString(2);
            g2.c(string);
            cursorQuery.close();
        }
        return super.c((h5) e5Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    public boolean d(e5 e5Var) {
        return f1.a().getWritableDatabase().update(d(), b(e5Var), "mediaCaptureClientCorrelationId=?", new String[]{e5Var.d()}) > 0 || c(e5Var);
    }
}
