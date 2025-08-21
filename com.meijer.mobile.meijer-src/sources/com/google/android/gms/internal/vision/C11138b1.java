package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.b1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11138b1<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: a, reason: collision with root package name */
    private Iterator<Map.Entry<K, Object>> f85355a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f85355a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.f85355a.next();
        return next.getValue() instanceof C11134a1 ? new C11142c1(next) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f85355a.remove();
    }

    public C11138b1(Iterator<Map.Entry<K, Object>> it) {
        this.f85355a = it;
    }
}
