package com.google.android.gms.internal.pal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class N6 extends K6 {

    /* renamed from: c, reason: collision with root package name */
    private final transient J6 f83628c;

    /* renamed from: d, reason: collision with root package name */
    private final transient Object[] f83629d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f83630e;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f83630e;
    }

    @Override // com.google.android.gms.internal.pal.C6, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f83628c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.pal.K6
    final F6 m() {
        return new M6(this);
    }

    N6(J6 j62, Object[] objArr, int i10, int i11) {
        this.f83628c = j62;
        this.f83629d = objArr;
        this.f83630e = i11;
    }

    @Override // com.google.android.gms.internal.pal.C6
    final int a(Object[] objArr, int i10) {
        return l().a(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return l().listIterator(0);
    }

    @Override // com.google.android.gms.internal.pal.K6
    public final S6 k() {
        return l().listIterator(0);
    }
}
