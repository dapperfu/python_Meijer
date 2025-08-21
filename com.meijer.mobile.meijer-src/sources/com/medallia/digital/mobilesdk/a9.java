package com.medallia.digital.mobilesdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes8.dex */
class a9 extends h1<z8> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f92459a = "workerManager";

    /* renamed from: b, reason: collision with root package name */
    private static final int f92460b = 7;

    class a extends HashMap<String, String> {
        a() {
            put("mediaCaptureClientCorrelationId", "TEXT");
            put("requestId", "TEXT");
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final String f92462a = "mediaCaptureClientCorrelationId";

        /* renamed from: b, reason: collision with root package name */
        private static final String f92463b = "requestId";

        private b() {
        }
    }

    a9() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    public boolean a(z8 z8Var) {
        return f1.a().getWritableDatabase().delete(d(), "mediaCaptureClientCorrelationId=?", new String[]{z8Var.a()}) > 0;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected long b() {
        try {
            return DatabaseUtils.queryNumEntries(f1.a().getWritableDatabase(), f92459a);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return 0L;
        }
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected ArrayList<z8> c(Object... objArr) {
        ArrayList<z8> arrayList = new ArrayList<>();
        Cursor cursorQuery = f1.a().getReadableDatabase().query(d(), null, null, null, null, null, null);
        if (cursorQuery != null) {
            if (cursorQuery.moveToFirst()) {
                do {
                    arrayList.add(new z8(cursorQuery.getString(cursorQuery.getColumnIndex("mediaCaptureClientCorrelationId")), cursorQuery.getString(cursorQuery.getColumnIndex("requestId"))));
                } while (cursorQuery.moveToNext());
            }
            cursorQuery.close();
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public z8 b(Object... objArr) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    public ContentValues b(z8 z8Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("mediaCaptureClientCorrelationId", z8Var.a());
        contentValues.put("requestId", z8Var.b());
        return contentValues;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected HashMap<String, String> c() {
        return new a();
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected String d() {
        return f92459a;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected boolean a(Object... objArr) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    public boolean c(z8 z8Var) {
        if (c(new Object[0]).size() >= 7) {
            Cursor cursorQuery = f1.a().getReadableDatabase().query(d(), new String[]{"mediaCaptureClientCorrelationId"}, null, null, null, null, null);
            ArrayList arrayList = new ArrayList();
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                do {
                    arrayList.add(cursorQuery.getString(0));
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                f1.a().getWritableDatabase().delete(d(), "mediaCaptureClientCorrelationId=?", new String[]{(String) arrayList.get(i10)});
            }
        }
        return super.c((a9) z8Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    public boolean d(z8 z8Var) {
        return f1.a().getWritableDatabase().update(d(), b(z8Var), "mediaCaptureClientCorrelationId=?", new String[]{z8Var.a()}) > 0 || c(z8Var);
    }
}
