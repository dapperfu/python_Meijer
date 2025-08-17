package com.google.android.gms.internal.atv_ads_framework;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class J1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f80834a = -1;

    /* renamed from: b, reason: collision with root package name */
    private boolean f80835b;

    /* renamed from: c, reason: collision with root package name */
    private Iterator f80836c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ N1 f80837d;

    /* synthetic */ J1(N1 n12, I1 i12) {
        this.f80837d = n12;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f80835b = true;
        int i10 = this.f80834a + 1;
        this.f80834a = i10;
        return i10 < this.f80837d.f80849b.size() ? (Map.Entry) this.f80837d.f80849b.get(this.f80834a) : (Map.Entry) a().next();
    }

    private final Iterator a() {
        if (this.f80836c == null) {
            this.f80836c = this.f80837d.f80850c.entrySet().iterator();
        }
        return this.f80836c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f80834a + 1 >= this.f80837d.f80849b.size()) {
            return !this.f80837d.f80850c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f80835b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f80835b = false;
        this.f80837d.s();
        if (this.f80834a >= this.f80837d.f80849b.size()) {
            a().remove();
            return;
        }
        N1 n12 = this.f80837d;
        int i10 = this.f80834a;
        this.f80834a = i10 - 1;
        n12.q(i10);
    }
}
