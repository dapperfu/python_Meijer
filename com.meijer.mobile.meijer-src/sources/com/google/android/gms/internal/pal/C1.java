package com.google.android.gms.internal.pal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class C1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f83334a = -1;

    /* renamed from: b, reason: collision with root package name */
    private boolean f83335b;

    /* renamed from: c, reason: collision with root package name */
    private Iterator f83336c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ G1 f83337d;

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f83335b = true;
        int i10 = this.f83334a + 1;
        this.f83334a = i10;
        return i10 < this.f83337d.f83455b.size() ? (Map.Entry) this.f83337d.f83455b.get(this.f83334a) : (Map.Entry) a().next();
    }

    private final Iterator a() {
        if (this.f83336c == null) {
            this.f83336c = this.f83337d.f83456c.entrySet().iterator();
        }
        return this.f83336c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f83334a + 1 >= this.f83337d.f83455b.size()) {
            return !this.f83337d.f83456c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f83335b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f83335b = false;
        this.f83337d.s();
        if (this.f83334a >= this.f83337d.f83455b.size()) {
            a().remove();
            return;
        }
        G1 g12 = this.f83337d;
        int i10 = this.f83334a;
        this.f83334a = i10 - 1;
        g12.q(i10);
    }
}
