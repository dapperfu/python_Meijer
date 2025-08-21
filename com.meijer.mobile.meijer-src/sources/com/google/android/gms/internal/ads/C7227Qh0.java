package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Qh0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7227Qh0 extends AbstractC8042eh0 {

    /* renamed from: f, reason: collision with root package name */
    static final AbstractC8042eh0 f70463f = new C7227Qh0(new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    final transient Object[] f70464d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f70465e;

    @Override // com.google.android.gms.internal.ads.AbstractC7526Zg0
    final int e() {
        return this.f70465e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7526Zg0
    final int f() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7526Zg0
    final boolean l() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7526Zg0
    final Object[] m() {
        return this.f70464d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f70465e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8042eh0, com.google.android.gms.internal.ads.AbstractC7526Zg0
    final int a(Object[] objArr, int i10) {
        System.arraycopy(this.f70464d, 0, objArr, i10, this.f70465e);
        return i10 + this.f70465e;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C6782Df0.a(i10, this.f70465e, "index");
        Object obj = this.f70464d[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    C7227Qh0(Object[] objArr, int i10) {
        this.f70464d = objArr;
        this.f70465e = i10;
    }
}
