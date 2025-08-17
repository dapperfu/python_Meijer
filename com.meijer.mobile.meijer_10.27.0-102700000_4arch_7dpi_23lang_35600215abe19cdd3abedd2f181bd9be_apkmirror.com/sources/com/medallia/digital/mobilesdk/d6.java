package com.medallia.digital.mobilesdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class d6 extends h1<g6> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f91799a = "quarantineRules";

    class a extends HashMap<String, String> {
        a() {
            put("ruleId", "TEXT");
            put("expirationTime", "INTEGER");
            put("status", "INTEGER");
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f91801a;

        static {
            int[] iArr = new int[d.values().length];
            f91801a = iArr;
            try {
                iArr[d.ASC_EXPIRATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private static final String f91802a = "ruleId";

        /* renamed from: b, reason: collision with root package name */
        private static final String f91803b = "expirationTime";

        /* renamed from: c, reason: collision with root package name */
        private static final String f91804c = "status";

        private c() {
        }
    }

    enum d {
        ASC_EXPIRATION
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ContentValues b(g6 g6Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("ruleId", g6Var.f92102a);
        contentValues.put("expirationTime", g6Var.f92103b);
        Boolean bool = g6Var.f92104c;
        contentValues.put("status", Integer.valueOf((bool == null || !bool.booleanValue()) ? 0 : 1));
        return contentValues;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected long b() {
        try {
            return DatabaseUtils.queryNumEntries(f1.a().getWritableDatabase(), f91799a);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return 0L;
        }
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected ArrayList<g6> c(Object... objArr) {
        ArrayList<g6> arrayList = new ArrayList<>();
        Cursor cursorQuery = f1.a().getReadableDatabase().query(d(), null, null, null, null, null, null);
        if (cursorQuery != null) {
            if (cursorQuery.moveToFirst()) {
                do {
                    arrayList.add(new g6(cursorQuery.getString(cursorQuery.getColumnIndex("ruleId")), Long.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndex("expirationTime"))), Boolean.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("status")) == 1)));
                } while (cursorQuery.moveToNext());
            }
            cursorQuery.close();
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public g6 b(Object... objArr) {
        Object obj;
        g6 g6Var = null;
        if (objArr != null && objArr.length > 0 && (obj = objArr[0]) != null && (obj instanceof d)) {
            Cursor cursorQuery = b.f91801a[((d) obj).ordinal()] != 1 ? null : f1.a().getReadableDatabase().query(d(), null, null, null, null, null, "expirationTime ASC");
            if (cursorQuery != null) {
                if (cursorQuery.moveToFirst()) {
                    do {
                        g6Var = new g6(cursorQuery.getString(cursorQuery.getColumnIndex("ruleId")), Long.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndex("expirationTime"))), Boolean.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("status")) == 1));
                    } while (cursorQuery.moveToNext());
                }
                cursorQuery.close();
            }
        }
        return g6Var;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected boolean a(Object... objArr) {
        return false;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected HashMap<String, String> c() {
        return new a();
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected String d() {
        return f91799a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    /* renamed from: b, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean d(g6 g6Var) {
        return f1.a().getWritableDatabase().update(d(), b(g6Var), "ruleId=?", new String[]{g6Var.b()}) > 0 || super.c((d6) g6Var);
    }
}
