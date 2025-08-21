package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.aF0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7578aF0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f73222a;

    /* renamed from: b, reason: collision with root package name */
    public final int f73223b;

    /* renamed from: c, reason: collision with root package name */
    public final int f73224c;

    /* renamed from: d, reason: collision with root package name */
    public final long f73225d;

    /* renamed from: e, reason: collision with root package name */
    public final int f73226e;

    private C7578aF0(Object obj, int i10, int i11, long j10, int i12) {
        this.f73222a = obj;
        this.f73223b = i10;
        this.f73224c = i11;
        this.f73225d = j10;
        this.f73226e = i12;
    }

    public final boolean b() {
        return this.f73223b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7578aF0)) {
            return false;
        }
        C7578aF0 c7578aF0 = (C7578aF0) obj;
        return this.f73222a.equals(c7578aF0.f73222a) && this.f73223b == c7578aF0.f73223b && this.f73224c == c7578aF0.f73224c && this.f73225d == c7578aF0.f73225d && this.f73226e == c7578aF0.f73226e;
    }

    public C7578aF0(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    public final C7578aF0 a(Object obj) {
        return this.f73222a.equals(obj) ? this : new C7578aF0(obj, this.f73223b, this.f73224c, this.f73225d, this.f73226e);
    }

    public final int hashCode() {
        return ((((((((this.f73222a.hashCode() + 527) * 31) + this.f73223b) * 31) + this.f73224c) * 31) + ((int) this.f73225d)) * 31) + this.f73226e;
    }

    public C7578aF0(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public C7578aF0(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }
}
