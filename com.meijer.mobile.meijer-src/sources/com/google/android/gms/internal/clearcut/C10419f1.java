package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.f1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10419f1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f82288a;

    /* renamed from: b, reason: collision with root package name */
    private Iterator f82289b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C10413d1 f82290c;

    private C10419f1(C10413d1 c10413d1) {
        this.f82290c = c10413d1;
        this.f82288a = c10413d1.f82248b.size();
    }

    private final Iterator a() {
        if (this.f82289b == null) {
            this.f82289b = this.f82290c.f82252f.entrySet().iterator();
        }
        return this.f82289b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f82288a;
        return (i10 > 0 && i10 <= this.f82290c.f82248b.size()) || a().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Object next;
        if (a().hasNext()) {
            next = a().next();
        } else {
            List list = this.f82290c.f82248b;
            int i10 = this.f82288a - 1;
            this.f82288a = i10;
            next = list.get(i10);
        }
        return (Map.Entry) next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ C10419f1(C10413d1 c10413d1, C10416e1 c10416e1) {
        this(c10413d1);
    }
}
