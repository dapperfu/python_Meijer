package com.google.android.gms.internal.atv_ads_framework;

import java.util.ListIterator;

/* loaded from: classes6.dex */
final class T1 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    final ListIterator f81739a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f81740b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ V1 f81741c;

    T1(V1 v12, int i10) {
        this.f81741c = v12;
        this.f81740b = i10;
        this.f81739a = v12.f81751a.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f81739a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f81739a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f81739a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f81739a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f81739a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f81739a.previousIndex();
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
