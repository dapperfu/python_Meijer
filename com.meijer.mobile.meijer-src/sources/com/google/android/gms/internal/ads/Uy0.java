package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Uy0 {

    /* renamed from: a, reason: collision with root package name */
    private int f71576a;

    /* renamed from: b, reason: collision with root package name */
    private int f71577b;

    /* renamed from: c, reason: collision with root package name */
    private int f71578c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f71579d;

    /* renamed from: e, reason: collision with root package name */
    private int f71580e;

    /* renamed from: f, reason: collision with root package name */
    private int f71581f;

    public Uy0() {
        this.f71576a = -1;
        this.f71577b = -1;
        this.f71578c = -1;
        this.f71580e = -1;
        this.f71581f = -1;
    }

    public final Uy0 a(int i10) {
        this.f71581f = i10;
        return this;
    }

    public final Uy0 b(int i10) {
        this.f71577b = i10;
        return this;
    }

    public final Uy0 c(int i10) {
        this.f71576a = i10;
        return this;
    }

    public final Uy0 d(int i10) {
        this.f71578c = i10;
        return this;
    }

    public final Uy0 e(byte[] bArr) {
        this.f71579d = bArr;
        return this;
    }

    public final Uy0 f(int i10) {
        this.f71580e = i10;
        return this;
    }

    /* synthetic */ Uy0(Vz0 vz0, C9787uz0 c9787uz0) {
        this.f71576a = vz0.f71800a;
        this.f71577b = vz0.f71801b;
        this.f71578c = vz0.f71802c;
        this.f71579d = vz0.f71803d;
        this.f71580e = vz0.f71804e;
        this.f71581f = vz0.f71805f;
    }

    public final Vz0 g() {
        return new Vz0(this.f71576a, this.f71577b, this.f71578c, this.f71579d, this.f71580e, this.f71581f, null);
    }
}
