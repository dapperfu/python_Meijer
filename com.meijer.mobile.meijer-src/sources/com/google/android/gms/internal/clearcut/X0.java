package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.AbstractC10418f0;

/* loaded from: classes6.dex */
final class X0 implements H0 {

    /* renamed from: a, reason: collision with root package name */
    private final J0 f82066a;

    /* renamed from: b, reason: collision with root package name */
    private final String f82067b;

    /* renamed from: c, reason: collision with root package name */
    private final Y0 f82068c;

    X0(J0 j02, String str, Object[] objArr) {
        this.f82066a = j02;
        this.f82067b = str;
        this.f82068c = new Y0(j02.getClass(), str, objArr);
    }

    @Override // com.google.android.gms.internal.clearcut.H0
    public final int a() {
        return (this.f82068c.f82125d & 1) == 1 ? AbstractC10418f0.e.f82282i : AbstractC10418f0.e.f82283j;
    }

    @Override // com.google.android.gms.internal.clearcut.H0
    public final boolean b() {
        return (this.f82068c.f82125d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.clearcut.H0
    public final J0 c() {
        return this.f82066a;
    }

    public final int d() {
        return this.f82068c.f82126e;
    }

    final Y0 e() {
        return this.f82068c;
    }

    public final int f() {
        return this.f82068c.f82129h;
    }

    public final int g() {
        return this.f82068c.f82130i;
    }

    public final int h() {
        return this.f82068c.f82131j;
    }

    public final int i() {
        return this.f82068c.f82134m;
    }

    final int[] j() {
        return this.f82068c.f82135n;
    }

    public final int k() {
        return this.f82068c.f82133l;
    }

    public final int l() {
        return this.f82068c.f82132k;
    }
}
