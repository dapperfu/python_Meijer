package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.a2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11010a2 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f84509a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f84510b;

    /* renamed from: c, reason: collision with root package name */
    private Iterator f84511c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ S1 f84512d;

    private C11010a2(S1 s12) {
        this.f84512d = s12;
        this.f84509a = -1;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f84510b = true;
        int i10 = this.f84509a + 1;
        this.f84509a = i10;
        return i10 < this.f84512d.f84471b.size() ? (Map.Entry) this.f84512d.f84471b.get(this.f84509a) : (Map.Entry) a().next();
    }

    private final Iterator a() {
        if (this.f84511c == null) {
            this.f84511c = this.f84512d.f84472c.entrySet().iterator();
        }
        return this.f84511c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f84509a + 1 < this.f84512d.f84471b.size() || (!this.f84512d.f84472c.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f84510b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f84510b = false;
        this.f84512d.w();
        if (this.f84509a >= this.f84512d.f84471b.size()) {
            a().remove();
            return;
        }
        S1 s12 = this.f84512d;
        int i10 = this.f84509a;
        this.f84509a = i10 - 1;
        s12.n(i10);
    }

    /* synthetic */ C11010a2(S1 s12, R1 r12) {
        this(s12);
    }
}
