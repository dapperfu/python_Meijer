package Cd;

import java.util.AbstractMap;
import java.util.Objects;

/* renamed from: Cd.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C2995m extends AbstractC2988f {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2996n f3817d;

    C2995m(C2996n c2996n) {
        this.f3817d = c2996n;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        Y.a(i10, this.f3817d.f3820e, "index");
        int i11 = i10 + i10;
        Object obj = this.f3817d.f3819d[i11];
        Objects.requireNonNull(obj);
        Object obj2 = this.f3817d.f3819d[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3817d.f3820e;
    }
}
