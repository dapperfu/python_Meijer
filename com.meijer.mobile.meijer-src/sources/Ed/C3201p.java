package Ed;

import java.util.Objects;

/* renamed from: Ed.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3201p extends AbstractC3191f {

    /* renamed from: d, reason: collision with root package name */
    private final transient Object[] f7135d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f7136e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f7137f;

    @Override // java.util.List
    public final Object get(int i10) {
        Y.a(i10, this.f7137f, "index");
        Object obj = this.f7135d[i10 + i10 + this.f7136e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7137f;
    }

    C3201p(Object[] objArr, int i10, int i11) {
        this.f7135d = objArr;
        this.f7136e = i10;
        this.f7137f = i11;
    }
}
