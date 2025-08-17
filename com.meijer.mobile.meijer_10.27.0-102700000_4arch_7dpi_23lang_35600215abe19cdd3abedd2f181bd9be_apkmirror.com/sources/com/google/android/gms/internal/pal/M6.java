package com.google.android.gms.internal.pal;

import java.util.AbstractMap;

/* loaded from: classes6.dex */
final class M6 extends F6 {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ N6 f82767c;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f82767c.f82790e;
    }

    M6(N6 n62) {
        this.f82767c = n62;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        C10934v6.a(i10, this.f82767c.f82790e, "index");
        N6 n62 = this.f82767c;
        int i11 = i10 + i10;
        Object obj = n62.f82789d[i11];
        obj.getClass();
        Object obj2 = n62.f82789d[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }
}
