package Ed;

import java.util.AbstractMap;
import java.util.Objects;

/* renamed from: Ed.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3198m extends AbstractC3191f {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3199n f7129d;

    C3198m(C3199n c3199n) {
        this.f7129d = c3199n;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        Y.a(i10, this.f7129d.f7132e, "index");
        int i11 = i10 + i10;
        Object obj = this.f7129d.f7131d[i11];
        Objects.requireNonNull(obj);
        Object obj2 = this.f7129d.f7131d[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7129d.f7132e;
    }
}
