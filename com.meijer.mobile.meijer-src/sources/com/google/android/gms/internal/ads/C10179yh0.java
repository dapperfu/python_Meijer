package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.yh0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C10179yh0 extends AbstractC7938di0 {

    /* renamed from: a, reason: collision with root package name */
    final Map f81105a;

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f81105a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f81105a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f81105a.size();
    }

    C10179yh0(Map map) {
        map.getClass();
        this.f81105a = map;
    }
}
