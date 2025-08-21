package com.medallia.digital.mobilesdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class l6 extends h1<ResourceContract> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f93344a = "ResourceData";

    class a extends HashMap<String, String> {
        a() {
            put("formId", "TEXT");
            put("remoteUrl", "TEXT");
            put("localUrl", "TEXT");
            put("checksum", "TEXT");
            put("isGlobal", "INTEGER");
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final String f93346a = "formId";

        /* renamed from: b, reason: collision with root package name */
        private static final String f93347b = "remoteUrl";

        /* renamed from: c, reason: collision with root package name */
        private static final String f93348c = "localUrl";

        /* renamed from: d, reason: collision with root package name */
        private static final String f93349d = "checksum";

        /* renamed from: e, reason: collision with root package name */
        private static final String f93350e = "isGlobal";

        private b() {
        }
    }

    private ResourceContract a(Cursor cursor, boolean z10) {
        return new ResourceContract(cursor.getString(cursor.getColumnIndex("formId")), l3.a(cursor.getString(cursor.getColumnIndex("remoteUrl")), z10), l3.a(cursor.getString(cursor.getColumnIndex("localUrl")), z10), cursor.getString(cursor.getColumnIndex("checksum")), cursor.getInt(cursor.getColumnIndex("isGlobal")) == 1);
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected long b() {
        try {
            return DatabaseUtils.queryNumEntries(f1.a().getWritableDatabase(), f93344a);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return 0L;
        }
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected ArrayList<ResourceContract> c(Object... objArr) {
        Cursor cursorQuery;
        if (objArr == null || objArr.length <= 0) {
            cursorQuery = f1.a().getReadableDatabase().query(d(), null, null, null, null, null, null);
        } else {
            Object obj = objArr[0];
            if (obj == null || !(obj instanceof Boolean)) {
                return null;
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            cursorQuery = f1.a().getReadableDatabase().rawQuery("select * from '" + d() + "' where isGlobal=?", new String[]{String.valueOf(zBooleanValue ? 1 : 0)});
        }
        ArrayList<ResourceContract> arrayList = new ArrayList<>();
        if (cursorQuery != null) {
            if (cursorQuery.moveToFirst()) {
                do {
                    arrayList.add(a(cursorQuery, false));
                } while (cursorQuery.moveToNext());
            }
            cursorQuery.close();
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ResourceContract b(Object... objArr) {
        Object obj;
        Cursor cursorQuery;
        if (objArr != null && objArr.length > 0 && (obj = objArr[0]) != null && (obj instanceof String)) {
            String str = (String) obj;
            if (objArr.length == 1) {
                cursorQuery = f1.a().getReadableDatabase().query(d(), null, "remoteUrl=?", new String[]{l3.a(str, true)}, null, null, null);
            } else if (objArr.length == 2) {
                Object obj2 = objArr[1];
                if (obj2 == null || !(obj2 instanceof String)) {
                    return null;
                }
                cursorQuery = f1.a().getReadableDatabase().query(d(), null, "formId=? AND remoteUrl=?", new String[]{(String) obj2, l3.a(str, true)}, null, null, null);
            } else {
                cursorQuery = null;
            }
            if (cursorQuery != null) {
                resourceContractA = cursorQuery.moveToFirst() ? a(cursorQuery, false) : null;
                cursorQuery.close();
            }
        }
        return resourceContractA;
    }

    protected ArrayList<ResourceContract> a(String str) {
        Cursor cursorQuery;
        ArrayList<ResourceContract> arrayList = new ArrayList<>();
        if (str != null && (cursorQuery = f1.a().getReadableDatabase().query(d(), null, "formId=?", new String[]{str}, null, null, null)) != null) {
            if (cursorQuery.moveToFirst()) {
                do {
                    arrayList.add(a(cursorQuery, false));
                } while (cursorQuery.moveToNext());
            }
            cursorQuery.close();
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    public ContentValues b(ResourceContract resourceContract) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("formId", resourceContract.getFormId());
        contentValues.put("remoteUrl", l3.a(resourceContract.getRemoteUrl(), true));
        contentValues.put("localUrl", l3.a(resourceContract.getLocalUrl(), true));
        contentValues.put("checksum", resourceContract.getChecksum());
        contentValues.put("isGlobal", Integer.valueOf(resourceContract.isGlobal().booleanValue() ? 1 : 0));
        return contentValues;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected HashMap<String, String> c() {
        return new a();
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected String d() {
        return f93344a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    public boolean a(ResourceContract resourceContract) {
        String[] strArr;
        String str;
        String str2;
        boolean z10 = true;
        if (resourceContract == null) {
            str2 = "delete (invalid data) - record is null";
        } else {
            if (resourceContract.isGlobal().booleanValue()) {
                strArr = new String[]{l3.a(resourceContract.getRemoteUrl(), true)};
                str = "isGlobal=1 AND remoteUrl=?";
            } else if (TextUtils.isEmpty(resourceContract.getFormId())) {
                str2 = "delete (invalid data) formId is not valid";
            } else {
                strArr = new String[]{resourceContract.getFormId(), l3.a(resourceContract.getRemoteUrl(), true)};
                str = "formId=? AND remoteUrl=?";
            }
            z = f1.a().getWritableDatabase().delete(d(), str, strArr) > 0;
            z10 = !z;
            str2 = "delete - " + resourceContract;
        }
        a(z10, str2);
        return z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    public boolean c(ResourceContract resourceContract) {
        if (!TextUtils.isEmpty(resourceContract.getFormId()) && !TextUtils.isEmpty(resourceContract.getRemoteUrl()) && !TextUtils.isEmpty(resourceContract.getLocalUrl())) {
            return super.c((l6) resourceContract);
        }
        a(true, "insert (invalid data from collector) - " + resourceContract);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    public boolean d(ResourceContract resourceContract) {
        SQLiteDatabase writableDatabase = f1.a().getWritableDatabase();
        String strD = d();
        ContentValues contentValuesB = b(resourceContract);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("remoteUrl=? AND localUrl=?");
        sb2.append(TextUtils.isEmpty(resourceContract.getFormId()) ? "" : " AND formId=?");
        return writableDatabase.update(strD, contentValuesB, sb2.toString(), TextUtils.isEmpty(resourceContract.getFormId()) ? new String[]{l3.a(resourceContract.getRemoteUrl(), true), l3.a(resourceContract.getLocalUrl(), true)} : new String[]{l3.a(resourceContract.getRemoteUrl(), true), l3.a(resourceContract.getLocalUrl(), true), resourceContract.getFormId()}) > 0 || super.c((l6) resourceContract);
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected boolean a(Object... objArr) {
        Object obj;
        if (objArr != null && objArr.length > 0 && (obj = objArr[0]) != null && (obj instanceof Boolean)) {
            if (f1.a().getWritableDatabase().delete(d(), "isGlobal=?", new String[]{String.valueOf(((Boolean) obj).booleanValue() ? 1 : 0)}) > 0) {
                return true;
            }
        }
        return false;
    }
}
