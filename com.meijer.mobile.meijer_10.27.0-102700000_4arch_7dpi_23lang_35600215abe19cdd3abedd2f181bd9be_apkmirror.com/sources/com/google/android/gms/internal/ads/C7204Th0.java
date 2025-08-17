package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Th0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7204Th0 extends AbstractC8450jh0 {

    /* renamed from: c, reason: collision with root package name */
    private final transient AbstractC8238hh0 f70435c;

    /* renamed from: d, reason: collision with root package name */
    private final transient AbstractC7917eh0 f70436d;

    @Override // com.google.android.gms.internal.ads.AbstractC8450jh0, com.google.android.gms.internal.ads.AbstractC7401Zg0
    public final AbstractC7917eh0 h() {
        return this.f70436d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7401Zg0
    final boolean l() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7401Zg0
    final int a(Object[] objArr, int i10) {
        return this.f70436d.a(objArr, i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7401Zg0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f70435c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8450jh0, com.google.android.gms.internal.ads.AbstractC7401Zg0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f70436d.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8450jh0, com.google.android.gms.internal.ads.AbstractC7401Zg0
    /* renamed from: k */
    public final AbstractC8559ki0 iterator() {
        return this.f70436d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f70435c.size();
    }

    C7204Th0(AbstractC8238hh0 abstractC8238hh0, AbstractC7917eh0 abstractC7917eh0) {
        this.f70435c = abstractC8238hh0;
        this.f70436d = abstractC7917eh0;
    }
}
