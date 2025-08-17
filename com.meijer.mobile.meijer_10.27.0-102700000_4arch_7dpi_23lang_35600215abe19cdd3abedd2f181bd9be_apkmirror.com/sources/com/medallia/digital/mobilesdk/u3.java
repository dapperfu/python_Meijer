package com.medallia.digital.mobilesdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes7.dex */
class u3 extends h1<t3> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f93138a = "localNotificationData";

    /* renamed from: b, reason: collision with root package name */
    static final String f93139b = "getLNWithMinDelay";

    class a extends HashMap<String, String> {
        a() {
            put("title", "TEXT");
            put("body", "TEXT");
            put("appIconPath", "TEXT");
            put("expiration", "INTEGER");
            put("activityNameString", "TEXT");
            put("formId", "TEXT");
            put("delay", "INTEGER");
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final String f93141a = "title";

        /* renamed from: b, reason: collision with root package name */
        private static final String f93142b = "body";

        /* renamed from: c, reason: collision with root package name */
        private static final String f93143c = "appIconPath";

        /* renamed from: d, reason: collision with root package name */
        private static final String f93144d = "expiration";

        /* renamed from: e, reason: collision with root package name */
        private static final String f93145e = "activityNameString";

        /* renamed from: f, reason: collision with root package name */
        private static final String f93146f = "formId";

        /* renamed from: g, reason: collision with root package name */
        private static final String f93147g = "delay";

        private b() {
        }
    }

    u3() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    public boolean a(t3 t3Var) {
        StringBuilder sb2;
        boolean z10 = true;
        if (t3Var == null || TextUtils.isEmpty(t3Var.getFormId())) {
            sb2 = new StringBuilder();
            sb2.append("delete (invalid data) - ");
            sb2.append(t3Var == null ? "record is null" : "formId is not valid");
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("formId='");
            sb3.append(t3Var.getFormId());
            sb3.append("'");
            z = f1.a().getWritableDatabase().delete(d(), sb3.toString(), null) > 0;
            z10 = !z;
            sb2 = new StringBuilder();
            sb2.append("delete - ");
            sb2.append(t3Var);
        }
        a(z10, sb2.toString());
        return z;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected long b() {
        try {
            return DatabaseUtils.queryNumEntries(f1.a().getWritableDatabase(), f93138a);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return 0L;
        }
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected ArrayList<t3> c(Object... objArr) {
        SQLiteDatabase readableDatabase;
        String strD;
        String str;
        String str2;
        Object obj;
        ArrayList<t3> arrayList = new ArrayList<>();
        if (objArr == null || objArr.length <= 0 || (obj = objArr[0]) == null || !(obj instanceof String) || !obj.equals(f93139b)) {
            readableDatabase = f1.a().getReadableDatabase();
            strD = d();
            str = null;
            str2 = null;
        } else {
            readableDatabase = f1.a().getReadableDatabase();
            strD = d();
            str = null;
            str2 = "delay ASC";
        }
        Cursor cursorQuery = readableDatabase.query(strD, null, null, null, null, str, str2);
        if (cursorQuery != null) {
            if (cursorQuery.moveToFirst()) {
                do {
                    arrayList.add(new t3(cursorQuery.getString(cursorQuery.getColumnIndex("formId")), cursorQuery.getString(cursorQuery.getColumnIndex("title")), cursorQuery.getString(cursorQuery.getColumnIndex("body")), cursorQuery.getString(cursorQuery.getColumnIndex("appIconPath")), cursorQuery.getLong(cursorQuery.getColumnIndex("expiration")), cursorQuery.getLong(cursorQuery.getColumnIndex("delay"))));
                } while (cursorQuery.moveToNext());
            }
            cursorQuery.close();
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public t3 b(Object... objArr) {
        Object obj;
        if (objArr != null && objArr.length > 0 && (obj = objArr[0]) != null && (obj instanceof String)) {
            if (obj.equals(f93139b)) {
                return f();
            }
            String str = (String) objArr[0];
            Cursor cursorQuery = f1.a().getReadableDatabase().query(d(), null, "formId='" + str + "'", null, null, null, null);
            if (cursorQuery != null) {
                t3Var = cursorQuery.moveToFirst() ? new t3(cursorQuery.getString(cursorQuery.getColumnIndex("formId")), cursorQuery.getString(cursorQuery.getColumnIndex("title")), cursorQuery.getString(cursorQuery.getColumnIndex("body")), cursorQuery.getString(cursorQuery.getColumnIndex("appIconPath")), cursorQuery.getLong(cursorQuery.getColumnIndex("expiration")), cursorQuery.getLong(cursorQuery.getColumnIndex("delay"))) : null;
                cursorQuery.close();
            }
        }
        return t3Var;
    }

    t3 f() {
        Cursor cursorQuery = f1.a().getReadableDatabase().query(d(), null, null, null, null, null, "delay ASC", "1");
        if (cursorQuery != null) {
            t3Var = cursorQuery.moveToFirst() ? new t3(cursorQuery.getString(cursorQuery.getColumnIndex("formId")), cursorQuery.getString(cursorQuery.getColumnIndex("title")), cursorQuery.getString(cursorQuery.getColumnIndex("body")), cursorQuery.getString(cursorQuery.getColumnIndex("appIconPath")), cursorQuery.getLong(cursorQuery.getColumnIndex("expiration")), cursorQuery.getLong(cursorQuery.getColumnIndex("delay"))) : null;
            cursorQuery.close();
        }
        return t3Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    public ContentValues b(t3 t3Var) {
        ContentValues contentValues = new ContentValues();
        if (t3Var != null) {
            contentValues.put("title", t3Var.getTitle());
            contentValues.put("body", t3Var.b());
            contentValues.put("appIconPath", t3Var.a());
            contentValues.put("expiration", Long.valueOf(t3Var.d()));
            contentValues.put("formId", t3Var.getFormId());
            contentValues.put("delay", Long.valueOf(t3Var.c()));
        }
        return contentValues;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected HashMap<String, String> c() {
        return new a();
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected String d() {
        return f93138a;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected boolean a(Object... objArr) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    public boolean c(t3 t3Var) {
        if (t3Var.getFormId() == null || t3Var.getTitle() == null || t3Var.getTitle().isEmpty() || t3Var.b() == null || t3Var.b().isEmpty()) {
            return false;
        }
        return super.c((u3) t3Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    public boolean d(t3 t3Var) {
        SQLiteDatabase writableDatabase = f1.a().getWritableDatabase();
        String strD = d();
        ContentValues contentValuesB = b(t3Var);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("formId='");
        sb2.append(t3Var.getFormId());
        sb2.append("'");
        return writableDatabase.update(strD, contentValuesB, sb2.toString(), null) > 0 || super.c((u3) t3Var);
    }
}
