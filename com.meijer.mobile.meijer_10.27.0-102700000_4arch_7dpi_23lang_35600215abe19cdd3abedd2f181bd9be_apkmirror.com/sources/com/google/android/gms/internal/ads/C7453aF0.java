package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.aF0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7453aF0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f72382a;

    /* renamed from: b, reason: collision with root package name */
    public final int f72383b;

    /* renamed from: c, reason: collision with root package name */
    public final int f72384c;

    /* renamed from: d, reason: collision with root package name */
    public final long f72385d;

    /* renamed from: e, reason: collision with root package name */
    public final int f72386e;

    private C7453aF0(Object obj, int i10, int i11, long j10, int i12) {
        this.f72382a = obj;
        this.f72383b = i10;
        this.f72384c = i11;
        this.f72385d = j10;
        this.f72386e = i12;
    }

    public final boolean b() {
        return this.f72383b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7453aF0)) {
            return false;
        }
        C7453aF0 c7453aF0 = (C7453aF0) obj;
        return this.f72382a.equals(c7453aF0.f72382a) && this.f72383b == c7453aF0.f72383b && this.f72384c == c7453aF0.f72384c && this.f72385d == c7453aF0.f72385d && this.f72386e == c7453aF0.f72386e;
    }

    public C7453aF0(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    public final C7453aF0 a(Object obj) {
        return this.f72382a.equals(obj) ? this : new C7453aF0(obj, this.f72383b, this.f72384c, this.f72385d, this.f72386e);
    }

    public final int hashCode() {
        return ((((((((this.f72382a.hashCode() + 527) * 31) + this.f72383b) * 31) + this.f72384c) * 31) + ((int) this.f72385d)) * 31) + this.f72386e;
    }

    public C7453aF0(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public C7453aF0(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }
}
