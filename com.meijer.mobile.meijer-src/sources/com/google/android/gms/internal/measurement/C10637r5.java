package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.r5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10637r5 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private final Iterator f83202a;

    public C10637r5(Iterator it) {
        this.f83202a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f83202a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f83202a.next();
        return entry.getValue() instanceof C10646s5 ? new C10629q5(entry, null) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f83202a.remove();
    }
}
