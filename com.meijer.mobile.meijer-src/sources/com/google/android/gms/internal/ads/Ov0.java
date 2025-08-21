package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class Ov0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f70039a = -1;

    /* renamed from: b, reason: collision with root package name */
    private boolean f70040b;

    /* renamed from: c, reason: collision with root package name */
    private Iterator f70041c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Rv0 f70042d;

    /* synthetic */ Ov0(Rv0 rv0, Qv0 qv0) {
        this.f70042d = rv0;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f70040b = true;
        int i10 = this.f70039a + 1;
        this.f70039a = i10;
        Rv0 rv0 = this.f70042d;
        return i10 < rv0.f70800b ? (Lv0) rv0.f70799a[i10] : (Map.Entry) a().next();
    }

    private final Iterator a() {
        if (this.f70041c == null) {
            this.f70041c = this.f70042d.f70801c.entrySet().iterator();
        }
        return this.f70041c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f70039a + 1;
        Rv0 rv0 = this.f70042d;
        if (i10 >= rv0.f70800b) {
            return !rv0.f70801c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f70040b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f70040b = false;
        this.f70042d.t();
        int i10 = this.f70039a;
        Rv0 rv0 = this.f70042d;
        if (i10 >= rv0.f70800b) {
            a().remove();
        } else {
            this.f70039a = i10 - 1;
            rv0.r(i10);
        }
    }
}
