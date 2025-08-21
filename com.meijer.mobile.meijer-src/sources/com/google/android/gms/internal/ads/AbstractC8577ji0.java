package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.ads.ji0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC8577ji0 extends AbstractC8471ii0 implements ListIterator {
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f75838a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f75838a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.f75838a).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f75838a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    AbstractC8577ji0(ListIterator listIterator) {
        super(listIterator);
    }
}
