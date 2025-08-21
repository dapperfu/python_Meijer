package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.l1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10437l1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f82363a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f82364b;

    /* renamed from: c, reason: collision with root package name */
    private Iterator f82365c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ C10413d1 f82366d;

    private C10437l1(C10413d1 c10413d1) {
        this.f82366d = c10413d1;
        this.f82363a = -1;
    }

    private final Iterator a() {
        if (this.f82365c == null) {
            this.f82365c = this.f82366d.f82249c.entrySet().iterator();
        }
        return this.f82365c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f82363a + 1 < this.f82366d.f82248b.size() || (!this.f82366d.f82249c.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f82364b = true;
        int i10 = this.f82363a + 1;
        this.f82363a = i10;
        return (Map.Entry) (i10 < this.f82366d.f82248b.size() ? this.f82366d.f82248b.get(this.f82363a) : a().next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f82364b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f82364b = false;
        this.f82366d.t();
        if (this.f82363a >= this.f82366d.f82248b.size()) {
            a().remove();
            return;
        }
        C10413d1 c10413d1 = this.f82366d;
        int i10 = this.f82363a;
        this.f82363a = i10 - 1;
        c10413d1.i(i10);
    }

    /* synthetic */ C10437l1(C10413d1 c10413d1, C10416e1 c10416e1) {
        this(c10413d1);
    }
}
