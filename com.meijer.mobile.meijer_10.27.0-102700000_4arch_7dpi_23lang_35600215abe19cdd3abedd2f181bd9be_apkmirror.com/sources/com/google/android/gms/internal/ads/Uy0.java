package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Uy0 {

    /* renamed from: a, reason: collision with root package name */
    private int f70736a;

    /* renamed from: b, reason: collision with root package name */
    private int f70737b;

    /* renamed from: c, reason: collision with root package name */
    private int f70738c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f70739d;

    /* renamed from: e, reason: collision with root package name */
    private int f70740e;

    /* renamed from: f, reason: collision with root package name */
    private int f70741f;

    public Uy0() {
        this.f70736a = -1;
        this.f70737b = -1;
        this.f70738c = -1;
        this.f70740e = -1;
        this.f70741f = -1;
    }

    public final Uy0 a(int i10) {
        this.f70741f = i10;
        return this;
    }

    public final Uy0 b(int i10) {
        this.f70737b = i10;
        return this;
    }

    public final Uy0 c(int i10) {
        this.f70736a = i10;
        return this;
    }

    public final Uy0 d(int i10) {
        this.f70738c = i10;
        return this;
    }

    public final Uy0 e(byte[] bArr) {
        this.f70739d = bArr;
        return this;
    }

    public final Uy0 f(int i10) {
        this.f70740e = i10;
        return this;
    }

    /* synthetic */ Uy0(Vz0 vz0, C9662uz0 c9662uz0) {
        this.f70736a = vz0.f70960a;
        this.f70737b = vz0.f70961b;
        this.f70738c = vz0.f70962c;
        this.f70739d = vz0.f70963d;
        this.f70740e = vz0.f70964e;
        this.f70741f = vz0.f70965f;
    }

    public final Vz0 g() {
        return new Vz0(this.f70736a, this.f70737b, this.f70738c, this.f70739d, this.f70740e, this.f70741f, null);
    }
}
