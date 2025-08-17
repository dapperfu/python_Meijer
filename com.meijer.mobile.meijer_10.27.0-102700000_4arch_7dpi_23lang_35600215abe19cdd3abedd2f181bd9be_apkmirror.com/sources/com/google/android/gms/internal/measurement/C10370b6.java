package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.b6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10370b6 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f82132a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f82133b;

    /* renamed from: c, reason: collision with root package name */
    private Iterator f82134c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C10388d6 f82135d;

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f82133b = true;
        int i10 = this.f82132a + 1;
        this.f82132a = i10;
        C10388d6 c10388d6 = this.f82135d;
        return i10 < c10388d6.k() ? (C10361a6) c10388d6.j()[i10] : (Map.Entry) a().next();
    }

    private final Iterator a() {
        if (this.f82134c == null) {
            this.f82134c = this.f82135d.n().entrySet().iterator();
        }
        return this.f82134c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f82132a + 1;
        C10388d6 c10388d6 = this.f82135d;
        if (i10 >= c10388d6.k()) {
            return !c10388d6.n().isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f82133b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f82133b = false;
        C10388d6 c10388d6 = this.f82135d;
        c10388d6.i();
        int i10 = this.f82132a;
        if (i10 >= c10388d6.k()) {
            a().remove();
        } else {
            this.f82132a = i10 - 1;
            c10388d6.h(i10);
        }
    }

    /* synthetic */ C10370b6(C10388d6 c10388d6, byte[] bArr) {
        Objects.requireNonNull(c10388d6);
        this.f82135d = c10388d6;
        this.f82132a = -1;
    }
}
