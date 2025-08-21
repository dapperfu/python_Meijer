package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.na0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8989na0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f77934a;

    /* renamed from: b, reason: collision with root package name */
    private final long f77935b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f77936c;

    /* renamed from: d, reason: collision with root package name */
    private final long f77937d = ((Long) Oc.A.c().a(C8784lf.f76726A)).longValue() * 1000;

    public final Object b() {
        return this.f77934a;
    }

    public final long a() {
        return (this.f77937d + Math.min(Math.max(((Long) Oc.A.c().a(C8784lf.f77383v)).longValue(), -900000L), 10000L)) - (this.f77936c.a() - this.f77935b);
    }

    public final boolean c() {
        return this.f77936c.a() >= this.f77935b + this.f77937d;
    }

    public C8989na0(Object obj, com.google.android.gms.common.util.f fVar) {
        this.f77934a = obj;
        this.f77936c = fVar;
        this.f77935b = fVar.a();
    }
}
