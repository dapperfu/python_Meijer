package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes6.dex */
final class Yx0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    int f71898a = 0;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Zx0 f71899b;

    Yx0(Zx0 zx0) {
        this.f71899b = zx0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f71898a < this.f71899b.f72313a.size() || this.f71899b.f72314b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f71898a >= this.f71899b.f72313a.size()) {
            Zx0 zx0 = this.f71899b;
            zx0.f72313a.add(zx0.f72314b.next());
            return next();
        }
        Zx0 zx02 = this.f71899b;
        int i10 = this.f71898a;
        this.f71898a = i10 + 1;
        return zx02.f72313a.get(i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
