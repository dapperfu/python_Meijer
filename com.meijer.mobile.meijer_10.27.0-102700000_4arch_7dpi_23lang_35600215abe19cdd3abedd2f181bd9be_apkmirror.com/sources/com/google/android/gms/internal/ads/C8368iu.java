package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.iu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8368iu {

    /* renamed from: a, reason: collision with root package name */
    private final int f75016a;

    /* renamed from: b, reason: collision with root package name */
    public final int f75017b;

    /* renamed from: c, reason: collision with root package name */
    public final int f75018c;

    private C8368iu(int i10, int i11, int i12) {
        this.f75016a = i10;
        this.f75018c = i11;
        this.f75017b = i12;
    }

    public static C8368iu a() {
        return new C8368iu(0, 0, 0);
    }

    public static C8368iu b(int i10, int i11) {
        return new C8368iu(1, i10, i11);
    }

    public static C8368iu d() {
        return new C8368iu(5, 0, 0);
    }

    public static C8368iu e() {
        return new C8368iu(4, 0, 0);
    }

    public final boolean f() {
        return this.f75016a == 0;
    }

    public final boolean g() {
        return this.f75016a == 2;
    }

    public final boolean h() {
        return this.f75016a == 5;
    }

    public final boolean i() {
        return this.f75016a == 3;
    }

    public final boolean j() {
        return this.f75016a == 4;
    }

    public static C8368iu c(Mc.d2 d2Var) {
        return d2Var.f19216d ? new C8368iu(3, 0, 0) : d2Var.f19221i ? new C8368iu(2, 0, 0) : d2Var.f19220h ? new C8368iu(0, 0, 0) : new C8368iu(1, d2Var.f19218f, d2Var.f19215c);
    }
}
