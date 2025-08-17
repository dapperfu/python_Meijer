package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.mh0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
enum EnumC8771mh0 implements Iterator {
    INSTANCE;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C6657Df0.m(false, "no calls to next() since the last call to remove()");
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }
}
