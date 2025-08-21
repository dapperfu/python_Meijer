package com.medallia.digital.mobilesdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes8.dex */
class q7 extends h1<p7> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f93603a = "templateData";

    class a extends HashMap<String, String> {
        a() {
            put("templatePath", "TEXT");
            put("templateUrl", "TEXT");
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final String f93605a = "templateUrl";

        /* renamed from: b, reason: collision with root package name */
        private static final String f93606b = "templatePath";

        private b() {
        }
    }

    q7() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    public boolean a(p7 p7Var) {
        StringBuilder sb2;
        boolean z10 = true;
        if (p7Var == null || TextUtils.isEmpty(p7Var.b())) {
            sb2 = new StringBuilder();
            sb2.append("delete (invalid data) - ");
            sb2.append(p7Var == null ? "record is null" : "templateUrl is not valid");
        } else {
            z = f1.a().getWritableDatabase().delete(d(), "templateUrl=?", new String[]{p7Var.b()}) > 0;
            z10 = !z;
            sb2 = new StringBuilder();
            sb2.append("delete - ");
            sb2.append(p7Var);
        }
        a(z10, sb2.toString());
        return z;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected long b() {
        try {
            return DatabaseUtils.queryNumEntries(f1.a().getWritableDatabase(), f93603a);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return 0L;
        }
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected ArrayList<p7> c(Object... objArr) {
        ArrayList<p7> arrayList = new ArrayList<>();
        Cursor cursorQuery = f1.a().getReadableDatabase().query(d(), null, null, null, null, null, null);
        if (cursorQuery != null) {
            if (cursorQuery.moveToFirst()) {
                do {
                    arrayList.add(new p7(cursorQuery.getString(cursorQuery.getColumnIndex("templatePath")), cursorQuery.getString(cursorQuery.getColumnIndex("templateUrl"))));
                } while (cursorQuery.moveToNext());
            }
            cursorQuery.close();
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public p7 b(Object... objArr) {
        Object obj;
        Cursor cursorQuery;
        if (objArr != null && objArr.length > 0 && (obj = objArr[0]) != null && (obj instanceof String) && (cursorQuery = f1.a().getReadableDatabase().query(d(), null, "templateUrl=?", new String[]{(String) obj}, null, null, null)) != null) {
            p7Var = cursorQuery.moveToFirst() ? new p7(cursorQuery.getString(cursorQuery.getColumnIndex("templatePath")), cursorQuery.getString(cursorQuery.getColumnIndex("templateUrl"))) : null;
            cursorQuery.close();
        }
        return p7Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    public ContentValues b(p7 p7Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("templatePath", p7Var.a());
        contentValues.put("templateUrl", p7Var.b());
        return contentValues;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected HashMap<String, String> c() {
        return new a();
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected String d() {
        return f93603a;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected boolean a(Object... objArr) {
        Object obj;
        return objArr != null && objArr.length > 0 && (obj = objArr[0]) != null && (obj instanceof String) && f1.a().getWritableDatabase().delete(d(), "templateUrl=?", new String[]{(String) obj}) > 0;
    }
}
