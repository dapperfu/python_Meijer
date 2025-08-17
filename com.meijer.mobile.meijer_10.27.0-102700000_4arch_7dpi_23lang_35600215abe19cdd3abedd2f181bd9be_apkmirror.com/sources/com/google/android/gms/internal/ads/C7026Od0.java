package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Od0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7026Od0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f69125a;

    /* renamed from: b, reason: collision with root package name */
    private final long f69126b;

    public C7026Od0() {
        this.f69125a = null;
        this.f69126b = -1L;
    }

    public final long a() {
        return this.f69126b;
    }

    public final String b() {
        return this.f69125a;
    }

    public final boolean c() {
        return this.f69125a != null && this.f69126b > 0;
    }

    public C7026Od0(String str, long j10) {
        this.f69125a = str;
        this.f69126b = j10;
    }
}
