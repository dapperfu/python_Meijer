package com.google.android.gms.internal.clearcut;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.clearcut.w1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10344w1 implements ListIterator<String> {

    /* renamed from: a, reason: collision with root package name */
    private ListIterator<String> f81597a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f81598b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C10341v1 f81599c;

    C10344w1(C10341v1 c10341v1, int i10) {
        this.f81599c = c10341v1;
        this.f81598b = i10;
        this.f81597a = c10341v1.f81580a.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f81597a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f81597a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f81597a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f81597a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.f81597a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f81597a.previousIndex();
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
