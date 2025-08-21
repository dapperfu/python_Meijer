package com.google.android.gms.internal.pal;

import java.util.ListIterator;

/* loaded from: classes6.dex */
final class M1 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    final ListIterator f83599a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f83600b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ O1 f83601c;

    M1(O1 o12, int i10) {
        this.f83601c = o12;
        this.f83600b = i10;
        this.f83599a = o12.f83639a.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f83599a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f83599a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f83599a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f83599a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f83599a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f83599a.previousIndex();
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
