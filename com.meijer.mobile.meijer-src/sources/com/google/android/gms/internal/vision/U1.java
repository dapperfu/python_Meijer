package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
final class U1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f85320a;

    /* renamed from: b, reason: collision with root package name */
    private Iterator f85321b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ S1 f85322c;

    private U1(S1 s12) {
        this.f85322c = s12;
        this.f85320a = s12.f85311b.size();
    }

    private final Iterator a() {
        if (this.f85321b == null) {
            this.f85321b = this.f85322c.f85315f.entrySet().iterator();
        }
        return this.f85321b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f85320a;
        return (i10 > 0 && i10 <= this.f85322c.f85311b.size()) || a().hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ U1(S1 s12, R1 r12) {
        this(s12);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (!a().hasNext()) {
            List list = this.f85322c.f85311b;
            int i10 = this.f85320a - 1;
            this.f85320a = i10;
            return (Map.Entry) list.get(i10);
        }
        return (Map.Entry) a().next();
    }
}
