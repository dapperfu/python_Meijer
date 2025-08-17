package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.na0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8864na0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f77094a;

    /* renamed from: b, reason: collision with root package name */
    private final long f77095b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f77096c;

    /* renamed from: d, reason: collision with root package name */
    private final long f77097d = ((Long) Mc.A.c().a(C8659lf.f75886A)).longValue() * 1000;

    public final Object b() {
        return this.f77094a;
    }

    public final long a() {
        return (this.f77097d + Math.min(Math.max(((Long) Mc.A.c().a(C8659lf.f76543v)).longValue(), -900000L), 10000L)) - (this.f77096c.a() - this.f77095b);
    }

    public final boolean c() {
        return this.f77096c.a() >= this.f77095b + this.f77097d;
    }

    public C8864na0(Object obj, com.google.android.gms.common.util.f fVar) {
        this.f77094a = obj;
        this.f77096c = fVar;
        this.f77095b = fVar.a();
    }
}
