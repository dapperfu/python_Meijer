package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10381d implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Iterator f82149a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Iterator f82150b;

    C10381d(C10399f c10399f, Iterator it, Iterator it2) {
        this.f82149a = it;
        this.f82150b = it2;
        Objects.requireNonNull(c10399f);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f82149a.hasNext()) {
            return true;
        }
        return this.f82150b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f82149a;
        if (it.hasNext()) {
            return new C10533u(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f82150b;
        if (it2.hasNext()) {
            return new C10533u((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
