package com.google.android.gms.internal.pal;

import java.util.Iterator;

/* loaded from: classes6.dex */
final class O6 extends K6 {

    /* renamed from: c, reason: collision with root package name */
    private final transient J6 f82807c;

    /* renamed from: d, reason: collision with root package name */
    private final transient F6 f82808d;

    @Override // com.google.android.gms.internal.pal.C6
    final int a(Object[] objArr, int i10) {
        return this.f82808d.a(objArr, 0);
    }

    @Override // com.google.android.gms.internal.pal.C6, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f82807c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f82808d.listIterator(0);
    }

    @Override // com.google.android.gms.internal.pal.K6
    public final S6 k() {
        return this.f82808d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f82807c.size();
    }

    O6(J6 j62, F6 f62) {
        this.f82807c = j62;
        this.f82808d = f62;
    }
}
