package com.google.gson.internal.sql;

import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.v;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f89676a;

    /* renamed from: b, reason: collision with root package name */
    public static final DefaultDateTypeAdapter.a<? extends Date> f89677b;

    /* renamed from: c, reason: collision with root package name */
    public static final DefaultDateTypeAdapter.a<? extends Date> f89678c;

    /* renamed from: d, reason: collision with root package name */
    public static final v f89679d;

    /* renamed from: e, reason: collision with root package name */
    public static final v f89680e;

    /* renamed from: f, reason: collision with root package name */
    public static final v f89681f;

    /* renamed from: com.google.gson.internal.sql.a$a, reason: collision with other inner class name */
    class C1292a extends DefaultDateTypeAdapter.a<java.sql.Date> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public java.sql.Date d(Date date) {
            return new java.sql.Date(date.getTime());
        }

        C1292a(Class cls) {
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
        f89676a = z10;
        if (z10) {
            f89677b = new C1292a(java.sql.Date.class);
            f89678c = new b(Timestamp.class);
            f89679d = SqlDateTypeAdapter.f89670b;
            f89680e = SqlTimeTypeAdapter.f89672b;
            f89681f = SqlTimestampTypeAdapter.f89674b;
            return;
        }
        f89677b = null;
        f89678c = null;
        f89679d = null;
        f89680e = null;
        f89681f = null;
    }
}
