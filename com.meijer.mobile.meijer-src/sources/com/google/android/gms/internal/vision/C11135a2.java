package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.a2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11135a2 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f85349a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f85350b;

    /* renamed from: c, reason: collision with root package name */
    private Iterator f85351c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ S1 f85352d;

    private C11135a2(S1 s12) {
        this.f85352d = s12;
        this.f85349a = -1;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f85350b = true;
        int i10 = this.f85349a + 1;
        this.f85349a = i10;
        return i10 < this.f85352d.f85311b.size() ? (Map.Entry) this.f85352d.f85311b.get(this.f85349a) : (Map.Entry) a().next();
    }

    private final Iterator a() {
        if (this.f85351c == null) {
            this.f85351c = this.f85352d.f85312c.entrySet().iterator();
        }
        return this.f85351c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f85349a + 1 < this.f85352d.f85311b.size() || (!this.f85352d.f85312c.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f85350b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f85350b = false;
        this.f85352d.v();
        if (this.f85349a >= this.f85352d.f85311b.size()) {
            a().remove();
            return;
        }
        S1 s12 = this.f85352d;
        int i10 = this.f85349a;
        this.f85349a = i10 - 1;
        s12.n(i10);
    }

    /* synthetic */ C11135a2(S1 s12, R1 r12) {
        this(s12);
    }
}
