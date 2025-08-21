package com.google.android.gms.internal.vision;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.vision.i2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11167i2 implements ListIterator<String> {

    /* renamed from: a, reason: collision with root package name */
    private ListIterator<String> f85397a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f85398b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ j2 f85399c;

    C11167i2(j2 j2Var, int i10) {
        this.f85399c = j2Var;
        this.f85398b = i10;
        this.f85397a = j2Var.f85403a.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f85397a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f85397a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f85397a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f85397a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.f85397a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f85397a.previousIndex();
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
