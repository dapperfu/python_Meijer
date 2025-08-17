package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
final class U1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f84480a;

    /* renamed from: b, reason: collision with root package name */
    private Iterator f84481b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ S1 f84482c;

    private U1(S1 s12) {
        this.f84482c = s12;
        this.f84480a = s12.f84471b.size();
    }

    private final Iterator a() {
        if (this.f84481b == null) {
            this.f84481b = this.f84482c.f84475f.entrySet().iterator();
        }
        return this.f84481b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f84480a;
        return (i10 > 0 && i10 <= this.f84482c.f84471b.size()) || a().hasNext();
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
            List list = this.f84482c.f84471b;
            int i10 = this.f84480a - 1;
            this.f84480a = i10;
            return (Map.Entry) list.get(i10);
        }
        return (Map.Entry) a().next();
    }
}
