package com.google.gson.internal.sql;

import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.v;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f90518a;

    /* renamed from: b, reason: collision with root package name */
    public static final DefaultDateTypeAdapter.a<? extends Date> f90519b;

    /* renamed from: c, reason: collision with root package name */
    public static final DefaultDateTypeAdapter.a<? extends Date> f90520c;

    /* renamed from: d, reason: collision with root package name */
    public static final v f90521d;

    /* renamed from: e, reason: collision with root package name */
    public static final v f90522e;

    /* renamed from: f, reason: collision with root package name */
    public static final v f90523f;

    /* renamed from: com.google.gson.internal.sql.a$a, reason: collision with other inner class name */
    class C1301a extends DefaultDateTypeAdapter.a<java.sql.Date> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public java.sql.Date d(Date date) {
            return new java.sql.Date(date.getTime());
        }

        C1301a(Class cls) {
            super(cls);
        }
    }

    class b extends DefaultDateTypeAdapter.a<Timestamp> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Timestamp d(Date date) {
            return new Timestamp(date.getTime());
        }

        b(Class cls) {
            super(cls);
        }
    }

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f90518a = z10;
        if (z10) {
            f90519b = new C1301a(java.sql.Date.class);
            f90520c = new b(Timestamp.class);
            f90521d = SqlDateTypeAdapter.f90512b;
            f90522e = SqlTimeTypeAdapter.f90514b;
            f90523f = SqlTimestampTypeAdapter.f90516b;
            return;
        }
        f90519b = null;
        f90520c = null;
        f90521d = null;
        f90522e = null;
        f90523f = null;
    }
}
