package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;

/* renamed from: com.google.android.gms.internal.ads.di0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC7938di0 extends AbstractSet {
    AbstractC7938di0() {
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return C8258gi0.e(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
