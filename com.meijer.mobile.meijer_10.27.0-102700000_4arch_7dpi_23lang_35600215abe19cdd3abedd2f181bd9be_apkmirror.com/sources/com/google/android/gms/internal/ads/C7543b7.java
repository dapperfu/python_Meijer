package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.b7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7543b7 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f72716a;

    /* renamed from: b, reason: collision with root package name */
    public final G6 f72717b;

    /* renamed from: c, reason: collision with root package name */
    public final zzapv f72718c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f72719d;

    private C7543b7(zzapv zzapvVar) {
        this.f72719d = false;
        this.f72716a = null;
        this.f72717b = null;
        this.f72718c = zzapvVar;
    }

    public static C7543b7 a(zzapv zzapvVar) {
        return new C7543b7(zzapvVar);
    }

    public static C7543b7 b(Object obj, G6 g62) {
        return new C7543b7(obj, g62);
    }

    public final boolean c() {
        return this.f72718c == null;
    }

    private C7543b7(Object obj, G6 g62) {
        this.f72719d = false;
        this.f72716a = obj;
        this.f72717b = g62;
        this.f72718c = null;
    }
}
