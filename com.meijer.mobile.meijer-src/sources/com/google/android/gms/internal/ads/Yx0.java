package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes6.dex */
final class Yx0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    int f72738a = 0;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Zx0 f72739b;

    Yx0(Zx0 zx0) {
        this.f72739b = zx0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f72738a < this.f72739b.f73153a.size() || this.f72739b.f73154b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f72738a >= this.f72739b.f73153a.size()) {
            Zx0 zx0 = this.f72739b;
            zx0.f73153a.add(zx0.f73154b.next());
            return next();
        }
        Zx0 zx02 = this.f72739b;
        int i10 = this.f72738a;
        this.f72738a = i10 + 1;
        return zx02.f73153a.get(i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
