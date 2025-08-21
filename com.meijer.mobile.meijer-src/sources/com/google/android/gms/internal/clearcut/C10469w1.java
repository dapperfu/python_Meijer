package com.google.android.gms.internal.clearcut;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.clearcut.w1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10469w1 implements ListIterator<String> {

    /* renamed from: a, reason: collision with root package name */
    private ListIterator<String> f82437a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f82438b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C10466v1 f82439c;

    C10469w1(C10466v1 c10466v1, int i10) {
        this.f82439c = c10466v1;
        this.f82438b = i10;
        this.f82437a = c10466v1.f82420a.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f82437a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f82437a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f82437a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f82437a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.f82437a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f82437a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
