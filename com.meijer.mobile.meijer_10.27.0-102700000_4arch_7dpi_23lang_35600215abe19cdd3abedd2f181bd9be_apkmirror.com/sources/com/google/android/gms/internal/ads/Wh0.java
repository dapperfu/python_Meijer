package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes6.dex */
final class Wh0 extends AbstractC8450jh0 {

    /* renamed from: h, reason: collision with root package name */
    private static final Object[] f71137h;

    /* renamed from: i, reason: collision with root package name */
    static final Wh0 f71138i;

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f71139c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f71140d;

    /* renamed from: e, reason: collision with root package name */
    final transient Object[] f71141e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f71142f;

    /* renamed from: g, reason: collision with root package name */
    private final transient int f71143g;

    static {
        Object[] objArr = new Object[0];
        f71137h = objArr;
        f71138i = new Wh0(objArr, 0, objArr, 0, 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7401Zg0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f71141e;
            if (objArr.length != 0) {
                int iB = C7302Wg0.b(obj);
                while (true) {
                    int i10 = iB & this.f71142f;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iB = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7401Zg0
    final int e() {
        return this.f71143g;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7401Zg0
    final int f() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8450jh0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f71140d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7401Zg0
    final boolean l() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7401Zg0
    final Object[] m() {
        return this.f71139c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f71143g;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8450jh0
    final boolean zzu() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7401Zg0
    final int a(Object[] objArr, int i10) {
        System.arraycopy(this.f71139c, 0, objArr, i10, this.f71143g);
        return i10 + this.f71143g;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8450jh0
    final AbstractC7917eh0 o() {
        return AbstractC7917eh0.p(this.f71139c, this.f71143g);
    }

    Wh0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f71139c = objArr;
        this.f71140d = i10;
        this.f71141e = objArr2;
        this.f71142f = i11;
        this.f71143g = i12;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8450jh0, com.google.android.gms.internal.ads.AbstractC7401Zg0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return h().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8450jh0, com.google.android.gms.internal.ads.AbstractC7401Zg0
    /* renamed from: k */
    public final AbstractC8559ki0 iterator() {
        return h().listIterator(0);
    }
}
