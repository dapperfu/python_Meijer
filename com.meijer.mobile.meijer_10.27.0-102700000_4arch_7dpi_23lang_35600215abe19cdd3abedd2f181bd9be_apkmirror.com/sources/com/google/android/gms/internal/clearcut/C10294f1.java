package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.f1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10294f1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f81448a;

    /* renamed from: b, reason: collision with root package name */
    private Iterator f81449b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C10288d1 f81450c;

    private C10294f1(C10288d1 c10288d1) {
        this.f81450c = c10288d1;
        this.f81448a = c10288d1.f81408b.size();
    }

    private final Iterator a() {
        if (this.f81449b == null) {
            this.f81449b = this.f81450c.f81412f.entrySet().iterator();
        }
        return this.f81449b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f81448a;
        return (i10 > 0 && i10 <= this.f81450c.f81408b.size()) || a().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Object next;
        if (a().hasNext()) {
            next = a().next();
        } else {
            List list = this.f81450c.f81408b;
            int i10 = this.f81448a - 1;
            this.f81448a = i10;
            next = list.get(i10);
        }
        return (Map.Entry) next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ C10294f1(C10288d1 c10288d1, C10291e1 c10291e1) {
        this(c10288d1);
    }
}
