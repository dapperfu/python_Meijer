package com.google.android.gms.internal.pal;

import java.util.ListIterator;

/* loaded from: classes6.dex */
final class M1 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    final ListIterator f82759a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f82760b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ O1 f82761c;

    M1(O1 o12, int i10) {
        this.f82761c = o12;
        this.f82760b = i10;
        this.f82759a = o12.f82799a.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f82759a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f82759a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f82759a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f82759a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f82759a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f82759a.previousIndex();
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
