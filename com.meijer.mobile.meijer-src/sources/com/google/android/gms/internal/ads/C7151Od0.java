package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Od0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7151Od0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f69965a;

    /* renamed from: b, reason: collision with root package name */
    private final long f69966b;

    public C7151Od0() {
        this.f69965a = null;
        this.f69966b = -1L;
    }

    public final long a() {
        return this.f69966b;
    }

    public final String b() {
        return this.f69965a;
    }

    public final boolean c() {
        return this.f69965a != null && this.f69966b > 0;
    }

    public C7151Od0(String str, long j10) {
        this.f69965a = str;
        this.f69966b = j10;
    }
}
