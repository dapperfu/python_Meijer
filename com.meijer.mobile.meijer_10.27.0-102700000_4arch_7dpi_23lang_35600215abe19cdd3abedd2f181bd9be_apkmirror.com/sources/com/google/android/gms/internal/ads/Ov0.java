package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class Ov0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f69199a = -1;

    /* renamed from: b, reason: collision with root package name */
    private boolean f69200b;

    /* renamed from: c, reason: collision with root package name */
    private Iterator f69201c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Rv0 f69202d;

    /* synthetic */ Ov0(Rv0 rv0, Qv0 qv0) {
        this.f69202d = rv0;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f69200b = true;
        int i10 = this.f69199a + 1;
        this.f69199a = i10;
        Rv0 rv0 = this.f69202d;
        return i10 < rv0.f69960b ? (Lv0) rv0.f69959a[i10] : (Map.Entry) a().next();
    }

    private final Iterator a() {
        if (this.f69201c == null) {
            this.f69201c = this.f69202d.f69961c.entrySet().iterator();
        }
        return this.f69201c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f69199a + 1;
        Rv0 rv0 = this.f69202d;
        if (i10 >= rv0.f69960b) {
            return !rv0.f69961c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f69200b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f69200b = false;
        this.f69202d.v();
        int i10 = this.f69199a;
        Rv0 rv0 = this.f69202d;
        if (i10 >= rv0.f69960b) {
            a().remove();
        } else {
            this.f69199a = i10 - 1;
            rv0.r(i10);
        }
    }
}
