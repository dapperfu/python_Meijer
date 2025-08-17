package com.google.android.gms.internal.pal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class C1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f82494a = -1;

    /* renamed from: b, reason: collision with root package name */
    private boolean f82495b;

    /* renamed from: c, reason: collision with root package name */
    private Iterator f82496c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ G1 f82497d;

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f82495b = true;
        int i10 = this.f82494a + 1;
        this.f82494a = i10;
        return i10 < this.f82497d.f82615b.size() ? (Map.Entry) this.f82497d.f82615b.get(this.f82494a) : (Map.Entry) a().next();
    }

    private final Iterator a() {
        if (this.f82496c == null) {
            this.f82496c = this.f82497d.f82616c.entrySet().iterator();
        }
        return this.f82496c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f82494a + 1 >= this.f82497d.f82615b.size()) {
            return !this.f82497d.f82616c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f82495b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f82495b = false;
        this.f82497d.s();
        if (this.f82494a >= this.f82497d.f82615b.size()) {
            a().remove();
            return;
        }
        G1 g12 = this.f82497d;
        int i10 = this.f82494a;
        this.f82494a = i10 - 1;
        g12.q(i10);
    }
}
