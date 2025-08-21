package Fd;

import java.util.AbstractMap;
import java.util.Objects;

/* renamed from: Fd.z0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3580z0 extends AbstractC3400j0 {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ A0 f10385d;

    C3580z0(A0 a02) {
        this.f10385d = a02;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        C3513t.a(i10, this.f10385d.f9180e, "index");
        int i11 = i10 + i10;
        Object obj = this.f10385d.f9179d[i11];
        Objects.requireNonNull(obj);
        Object obj2 = this.f10385d.f9179d[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10385d.f9180e;
    }
}
