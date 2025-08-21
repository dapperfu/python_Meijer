package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.b7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7668b7 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f73556a;

    /* renamed from: b, reason: collision with root package name */
    public final G6 f73557b;

    /* renamed from: c, reason: collision with root package name */
    public final zzapv f73558c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f73559d;

    private C7668b7(zzapv zzapvVar) {
        this.f73559d = false;
        this.f73556a = null;
        this.f73557b = null;
        this.f73558c = zzapvVar;
    }

    public static C7668b7 a(zzapv zzapvVar) {
        return new C7668b7(zzapvVar);
    }

    public static C7668b7 b(Object obj, G6 g62) {
        return new C7668b7(obj, g62);
    }

    public final boolean c() {
        return this.f73558c == null;
    }

    private C7668b7(Object obj, G6 g62) {
        this.f73559d = false;
        this.f73556a = obj;
        this.f73557b = g62;
        this.f73558c = null;
    }
}
