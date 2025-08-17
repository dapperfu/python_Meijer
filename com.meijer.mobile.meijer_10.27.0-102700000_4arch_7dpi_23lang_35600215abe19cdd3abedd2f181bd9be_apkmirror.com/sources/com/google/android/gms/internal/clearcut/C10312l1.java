package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.l1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10312l1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f81523a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f81524b;

    /* renamed from: c, reason: collision with root package name */
    private Iterator f81525c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ C10288d1 f81526d;

    private C10312l1(C10288d1 c10288d1) {
        this.f81526d = c10288d1;
        this.f81523a = -1;
    }

    private final Iterator a() {
        if (this.f81525c == null) {
            this.f81525c = this.f81526d.f81409c.entrySet().iterator();
        }
        return this.f81525c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f81523a + 1 < this.f81526d.f81408b.size() || (!this.f81526d.f81409c.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f81524b = true;
        int i10 = this.f81523a + 1;
        this.f81523a = i10;
        return (Map.Entry) (i10 < this.f81526d.f81408b.size() ? this.f81526d.f81408b.get(this.f81523a) : a().next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f81524b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f81524b = false;
        this.f81526d.v();
        if (this.f81523a >= this.f81526d.f81408b.size()) {
            a().remove();
            return;
        }
        C10288d1 c10288d1 = this.f81526d;
        int i10 = this.f81523a;
        this.f81523a = i10 - 1;
        c10288d1.i(i10);
    }

    /* synthetic */ C10312l1(C10288d1 c10288d1, C10291e1 c10291e1) {
        this(c10288d1);
    }
}
