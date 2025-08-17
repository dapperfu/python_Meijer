package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.AbstractC10293f0;

/* loaded from: classes6.dex */
final class X0 implements H0 {

    /* renamed from: a, reason: collision with root package name */
    private final J0 f81226a;

    /* renamed from: b, reason: collision with root package name */
    private final String f81227b;

    /* renamed from: c, reason: collision with root package name */
    private final Y0 f81228c;

    X0(J0 j02, String str, Object[] objArr) {
        this.f81226a = j02;
        this.f81227b = str;
        this.f81228c = new Y0(j02.getClass(), str, objArr);
    }

    @Override // com.google.android.gms.internal.clearcut.H0
    public final int a() {
        return (this.f81228c.f81285d & 1) == 1 ? AbstractC10293f0.e.f81442i : AbstractC10293f0.e.f81443j;
    }

    @Override // com.google.android.gms.internal.clearcut.H0
    public final boolean b() {
        return (this.f81228c.f81285d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.clearcut.H0
    public final J0 c() {
        return this.f81226a;
    }

    public final int d() {
        return this.f81228c.f81286e;
    }

    final Y0 e() {
        return this.f81228c;
    }

    public final int f() {
        return this.f81228c.f81289h;
    }

    public final int g() {
        return this.f81228c.f81290i;
    }

    public final int h() {
        return this.f81228c.f81291j;
    }

    public final int i() {
        return this.f81228c.f81294m;
    }

    final int[] j() {
        return this.f81228c.f81295n;
    }

    public final int k() {
        return this.f81228c.f81293l;
    }

    public final int l() {
        return this.f81228c.f81292k;
    }
}
