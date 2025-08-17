package Dd;

import java.util.AbstractMap;
import java.util.Objects;

/* renamed from: Dd.z0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3358z0 extends AbstractC3178j0 {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ A0 f6352d;

    C3358z0(A0 a02) {
        this.f6352d = a02;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        C3291t.a(i10, this.f6352d.f5147e, "index");
        int i11 = i10 + i10;
        Object obj = this.f6352d.f5146d[i11];
        Objects.requireNonNull(obj);
        Object obj2 = this.f6352d.f5146d[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6352d.f5147e;
    }
}
