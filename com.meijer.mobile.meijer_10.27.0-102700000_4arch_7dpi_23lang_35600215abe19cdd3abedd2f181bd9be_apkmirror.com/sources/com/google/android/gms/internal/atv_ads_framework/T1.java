package com.google.android.gms.internal.atv_ads_framework;

import java.util.ListIterator;

/* loaded from: classes6.dex */
final class T1 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    final ListIterator f80899a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f80900b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ V1 f80901c;

    T1(V1 v12, int i10) {
        this.f80901c = v12;
        this.f80900b = i10;
        this.f80899a = v12.f80911a.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f80899a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f80899a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f80899a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f80899a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f80899a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f80899a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
