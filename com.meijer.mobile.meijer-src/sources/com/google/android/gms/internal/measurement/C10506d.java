package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10506d implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Iterator f82989a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Iterator f82990b;

    C10506d(C10524f c10524f, Iterator it, Iterator it2) {
        this.f82989a = it;
        this.f82990b = it2;
        Objects.requireNonNull(c10524f);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f82989a.hasNext()) {
            return true;
        }
        return this.f82990b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f82989a;
        if (it.hasNext()) {
            return new C10658u(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f82990b;
        if (it2.hasNext()) {
            return new C10658u((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
