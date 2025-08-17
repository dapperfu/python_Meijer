package com.google.android.gms.internal.vision;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.vision.i2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11042i2 implements ListIterator<String> {

    /* renamed from: a, reason: collision with root package name */
    private ListIterator<String> f84557a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f84558b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ j2 f84559c;

    C11042i2(j2 j2Var, int i10) {
        this.f84559c = j2Var;
        this.f84558b = i10;
        this.f84557a = j2Var.f84563a.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f84557a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f84557a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f84557a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f84557a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.f84557a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f84557a.previousIndex();
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
