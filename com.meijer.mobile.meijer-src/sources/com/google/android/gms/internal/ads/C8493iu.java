package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.iu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8493iu {

    /* renamed from: a, reason: collision with root package name */
    private final int f75856a;

    /* renamed from: b, reason: collision with root package name */
    public final int f75857b;

    /* renamed from: c, reason: collision with root package name */
    public final int f75858c;

    private C8493iu(int i10, int i11, int i12) {
        this.f75856a = i10;
        this.f75858c = i11;
        this.f75857b = i12;
    }

    public static C8493iu a() {
        return new C8493iu(0, 0, 0);
    }

    public static C8493iu b(int i10, int i11) {
        return new C8493iu(1, i10, i11);
    }

    public static C8493iu d() {
        return new C8493iu(5, 0, 0);
    }

    public static C8493iu e() {
        return new C8493iu(4, 0, 0);
    }

    public final boolean f() {
        return this.f75856a == 0;
    }

    public final boolean g() {
        return this.f75856a == 2;
    }

    public final boolean h() {
        return this.f75856a == 5;
    }

    public final boolean i() {
        return this.f75856a == 3;
    }

    public final boolean j() {
        return this.f75856a == 4;
    }

    public static C8493iu c(Oc.d2 d2Var) {
        return d2Var.f23403d ? new C8493iu(3, 0, 0) : d2Var.f23408i ? new C8493iu(2, 0, 0) : d2Var.f23407h ? new C8493iu(0, 0, 0) : new C8493iu(1, d2Var.f23405f, d2Var.f23402c);
    }
}
