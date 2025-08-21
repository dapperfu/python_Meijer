package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Th0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7329Th0 extends AbstractC8575jh0 {

    /* renamed from: c, reason: collision with root package name */
    private final transient AbstractC8363hh0 f71275c;

    /* renamed from: d, reason: collision with root package name */
    private final transient AbstractC8042eh0 f71276d;

    @Override // com.google.android.gms.internal.ads.AbstractC8575jh0, com.google.android.gms.internal.ads.AbstractC7526Zg0
    public final AbstractC8042eh0 h() {
        return this.f71276d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7526Zg0
    final boolean l() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7526Zg0
    final int a(Object[] objArr, int i10) {
        return this.f71276d.a(objArr, i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7526Zg0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f71275c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8575jh0, com.google.android.gms.internal.ads.AbstractC7526Zg0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f71276d.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8575jh0, com.google.android.gms.internal.ads.AbstractC7526Zg0
    /* renamed from: k */
    public final AbstractC8684ki0 iterator() {
        return this.f71276d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f71275c.size();
    }

    C7329Th0(AbstractC8363hh0 abstractC8363hh0, AbstractC8042eh0 abstractC8042eh0) {
        this.f71275c = abstractC8363hh0;
        this.f71276d = abstractC8042eh0;
    }
}
