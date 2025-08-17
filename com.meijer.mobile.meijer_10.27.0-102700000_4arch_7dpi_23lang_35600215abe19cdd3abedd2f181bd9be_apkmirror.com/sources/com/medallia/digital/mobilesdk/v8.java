package com.medallia.digital.mobilesdk;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes7.dex */
class v8 extends h1<c0> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f93180a = "userJourney";

    class a extends HashMap<String, String> {
        a() {
            put("sessionId", "TEXT");
            put("name", "TEXT");
            put("value", "TEXT");
            put("valueType", "TEXT");
            put("lifetime", "TEXT");
            put("timestamp", "INTEGER");
            put("groupType", "TEXT");
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f93182a;

        static {
            int[] iArr = new int[d.values().length];
            f93182a = iArr;
            try {
                iArr[d.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f93182a[d.ALL_DESC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f93182a[d.SESSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f93182a[d.EVENTS_SESSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f93182a[d.DISTINCT_LATEST_NO_CP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f93182a[d.DISTINCT_SESSION_COLLECTORS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f93182a[d.CUSTOM_PARAMS_DESC.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f93182a[d.CUSTOM_PARAMS_SESSION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private static final String f93183a = "sessionId";

        /* renamed from: b, reason: collision with root package name */
        private static final String f93184b = "name";

        /* renamed from: c, reason: collision with root package name */
        private static final String f93185c = "value";

        /* renamed from: d, reason: collision with root package name */
        private static final String f93186d = "valueType";

        /* renamed from: e, reason: collision with root package name */
        private static final String f93187e = "lifetime";

        /* renamed from: f, reason: collision with root package name */
        private static final String f93188f = "timestamp";

        /* renamed from: g, reason: collision with root package name */
        private static final String f93189g = "groupType";

        private c() {
        }
    }

    enum d {
        ALL,
        ALL_DESC,
        SESSION,
        EVENTS_SESSION,
        DISTINCT_LATEST_NO_CP,
        DISTINCT_SESSION_COLLECTORS,
        CUSTOM_PARAMS_DESC,
        CUSTOM_PARAMS_SESSION
    }

    v8() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ContentValues b(c0 c0Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sessionId", c0Var.g());
        contentValues.put("name", c0Var.getName());
        contentValues.put("value", c0Var.i() == null ? null : c0Var.i().toString());
        contentValues.put("valueType", c0Var.j() == null ? null : c0Var.j().name());
        contentValues.put("timestamp", Long.valueOf(c0Var.h()));
        contentValues.put("lifetime", c0Var.f() == null ? null : c0Var.f().name());
        contentValues.put("groupType", c0Var.e() != null ? c0Var.e().name() : null);
        return contentValues;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected long b() {
        try {
            return DatabaseUtils.queryNumEntries(f1.a().getWritableDatabase(), f93180a);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0125  */
    @Override // com.medallia.digital.mobilesdk.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.util.ArrayList<com.medallia.digital.mobilesdk.c0> c(java.lang.Object... r14) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.v8.c(java.lang.Object[]):java.util.ArrayList");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public c0 b(Object... objArr) {
        return null;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected String e() {
        return "timestamp";
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected boolean a(Object... objArr) {
        String[] strArr;
        String str;
        if (objArr != null && objArr.length != 0) {
            Object obj = objArr[0];
            Lifetime lifetime = Lifetime.Session;
            Lifetime lifetime2 = obj instanceof Lifetime ? (Lifetime) obj : lifetime;
            if (lifetime2 != Lifetime.Forever) {
                strArr = new String[]{lifetime2.name()};
                str = "lifetime=?";
                if (objArr.length > 1) {
                    Object obj2 = objArr[1];
                    if (obj2 instanceof GroupType) {
                        str = "lifetime=? AND groupType!=?";
                        strArr = new String[]{lifetime2.name(), ((GroupType) obj2).name()};
                    }
                }
                if (lifetime2 == Lifetime.Application) {
                    str = str + " OR lifetime=?";
                    strArr = strArr.length > 1 ? new String[]{lifetime2.name(), strArr[1], lifetime.name()} : new String[]{lifetime2.name(), lifetime.name()};
                }
            } else {
                strArr = null;
                str = null;
            }
            z = f1.a().getWritableDatabase().delete(d(), str, strArr) > 0;
            if (z) {
                a4.e("Delete records by criterion " + lifetime2.name());
            }
            a(!z, "delete by " + lifetime2.name() + " criterion");
        }
        return z;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected HashMap<String, String> c() {
        return new a();
    }

    @Override // com.medallia.digital.mobilesdk.h1
    protected String d() {
        return f93180a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    /* renamed from: c, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean d(c0 c0Var) {
        StringBuilder sb2 = new StringBuilder("name=?");
        ArrayList arrayList = new ArrayList();
        arrayList.add(c0Var.getName());
        if (c0Var instanceof n8) {
            sb2.append(" AND value=?");
            n8 n8Var = (n8) c0Var;
            arrayList.add("Name: " + n8Var.n() + " Value: " + n8Var.m());
        }
        return f1.a().getWritableDatabase().update(d(), b(c0Var), sb2.toString(), (String[]) arrayList.toArray(new String[0])) > 0 || super.c((v8) c0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.h1
    /* renamed from: b, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean c(c0 c0Var) {
        if (!TextUtils.isEmpty(c0Var.g()) && c0Var.h() > 0) {
            return super.c((v8) c0Var);
        }
        a(true, "insert (invalid data from event) - " + c0Var);
        return false;
    }
}
