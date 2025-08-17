package com.google.android.gms.internal.atv_ads_framework;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
final class E1 implements Iterator {
    E1() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
