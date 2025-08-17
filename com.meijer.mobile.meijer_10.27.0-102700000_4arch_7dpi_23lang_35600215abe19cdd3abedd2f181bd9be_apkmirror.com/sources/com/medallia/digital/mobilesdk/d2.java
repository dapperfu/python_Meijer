package com.medallia.digital.mobilesdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class d2 extends h1<c2> {

    /* renamed from: a, reason: collision with root package name */
    private static final int f91754a = 10;

    /* renamed from: b, reason: collision with root package name */
    private static final String f91755b = "feedbacks";

    class a extends HashMap<String, String> {
        a() {
            put("feedbackData", "TEXT");
            put("feedbackUUID", "TEXT");
            put("formId", "TEXT");
            put("submittedTimestamp", "INTEGER");
            put("formTriggerType", "TEXT");
            put("numberOfRetries", "INTEGER");
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final String f91757a = "feedbackData";

        /* renamed from: b, reason: collision with root package name */
        private static final String f91758b = "feedbackUUID";

        /* renamed from: c, reason: collision with root package name */
        private static final String f91759c = "formId";

        /* renamed from: d, reason: collision with root package name */
        private static final String f91760d = "submittedTimestamp";

        /* renamed from: e, reason: collision with root package name */
        private static final String f91761e = "formTriggerType";

        /* renamed from: f, reason: collision with root package name */
        private static final String f91762f = "numberOfRetries";

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    public boolean a(c2 c2Var) {
        return f1.a().getWritableDatabase().delete(d(), "feedbackUUID=?", new String[]{c2Var.b()}) > 0;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected long b() {
        try {
            return DatabaseUtils.queryNumEntries(f1.a().getWritableDatabase(), f91755b);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return 0L;
        }
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected ArrayList<c2> c(Object... objArr) {
        ArrayList<c2> arrayList = new ArrayList<>();
        Cursor cursorQuery = f1.a().getReadableDatabase().query(d(), null, null, null, null, null, "submittedTimestamp DESC");
        if (cursorQuery != null) {
            if (cursorQuery.moveToFirst()) {
                do {
                    arrayList.add(new c2(t4.e().a(cursorQuery.getString(cursorQuery.getColumnIndex("feedbackData"))), cursorQuery.getString(cursorQuery.getColumnIndex("feedbackUUID")), cursorQuery.getString(cursorQuery.getColumnIndex("formId")), FormTriggerType.valueOf(cursorQuery.getString(cursorQuery.getColumnIndex("formTriggerType"))), cursorQuery.getLong(cursorQuery.getColumnIndex("submittedTimestamp")), cursorQuery.getInt(cursorQuery.getColumnIndex("numberOfRetries"))));
                } while (cursorQuery.moveToNext());
            }
            cursorQuery.close();
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public c2 b(Object... objArr) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    public ContentValues b(c2 c2Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("feedbackData", t4.e().b(c2Var.a()));
        contentValues.put("feedbackUUID", c2Var.b());
        contentValues.put("formId", c2Var.getFormId());
        contentValues.put("submittedTimestamp", Long.valueOf(c2Var.e()));
        contentValues.put("formTriggerType", c2Var.c() != null ? c2Var.c().toString() : null);
        contentValues.put("numberOfRetries", Integer.valueOf(c2Var.d()));
        return contentValues;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected HashMap<String, String> c() {
        return new a();
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected String d() {
        return f91755b;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected boolean a(Object... objArr) {
        Object obj;
        return objArr != null && objArr.length > 0 && (obj = objArr[0]) != null && (obj instanceof Long) && f1.a().getWritableDatabase().delete(d(), "submittedTimestamp<=?", new String[]{String.valueOf(objArr[0])}) > 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    public boolean c(c2 c2Var) {
        int size = c(new Object[0]).size();
        if (size >= 10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("submittedTimestamp ASC LIMIT ");
            sb2.append(size - 9);
            Cursor cursorQuery = f1.a().getReadableDatabase().query(d(), new String[]{"feedbackUUID"}, null, null, null, null, sb2.toString());
            ArrayList arrayList = new ArrayList();
            if (cursorQuery != null) {
                if (cursorQuery.moveToFirst()) {
                    do {
                        arrayList.add(cursorQuery.getString(0));
                    } while (cursorQuery.moveToNext());
                }
                cursorQuery.close();
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                f1.a().getWritableDatabase().delete(d(), "feedbackUUID=?", new String[]{(String) arrayList.get(i10)});
            }
        }
        return super.c((d2) c2Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    public boolean d(c2 c2Var) {
        return f1.a().getWritableDatabase().update(d(), b(c2Var), "feedbackUUID=?", new String[]{c2Var.b()}) > 0 || super.c((d2) c2Var);
    }
}
