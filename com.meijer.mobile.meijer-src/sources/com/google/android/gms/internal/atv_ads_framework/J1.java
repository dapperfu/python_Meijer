package com.google.android.gms.internal.atv_ads_framework;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class J1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f81674a = -1;

    /* renamed from: b, reason: collision with root package name */
    private boolean f81675b;

    /* renamed from: c, reason: collision with root package name */
    private Iterator f81676c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ N1 f81677d;

    /* synthetic */ J1(N1 n12, I1 i12) {
        this.f81677d = n12;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f81675b = true;
        int i10 = this.f81674a + 1;
        this.f81674a = i10;
        return i10 < this.f81677d.f81689b.size() ? (Map.Entry) this.f81677d.f81689b.get(this.f81674a) : (Map.Entry) a().next();
    }

    private final Iterator a() {
        if (this.f81676c == null) {
            this.f81676c = this.f81677d.f81690c.entrySet().iterator();
        }
        return this.f81676c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f81674a + 1 >= this.f81677d.f81689b.size()) {
            return !this.f81677d.f81690c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f81675b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f81675b = false;
        this.f81677d.s();
        if (this.f81674a >= this.f81677d.f81689b.size()) {
            a().remove();
            return;
        }
        N1 n12 = this.f81677d;
        int i10 = this.f81674a;
        this.f81674a = i10 - 1;
        n12.q(i10);
    }
}
