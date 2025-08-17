package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Qh0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7102Qh0 extends AbstractC7917eh0 {

    /* renamed from: f, reason: collision with root package name */
    static final AbstractC7917eh0 f69623f = new C7102Qh0(new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    final transient Object[] f69624d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f69625e;

    @Override // com.google.android.gms.internal.ads.AbstractC7401Zg0
    final int e() {
        return this.f69625e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7401Zg0
    final int f() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7401Zg0
    final boolean l() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7401Zg0
    final Object[] m() {
        return this.f69624d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f69625e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7917eh0, com.google.android.gms.internal.ads.AbstractC7401Zg0
    final int a(Object[] objArr, int i10) {
        System.arraycopy(this.f69624d, 0, objArr, i10, this.f69625e);
        return i10 + this.f69625e;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C6657Df0.a(i10, this.f69625e, "index");
        Object obj = this.f69624d[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    C7102Qh0(Object[] objArr, int i10) {
        this.f69624d = objArr;
        this.f69625e = i10;
    }
}
