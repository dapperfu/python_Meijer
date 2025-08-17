package Cd;

import java.util.Objects;

/* renamed from: Cd.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C2998p extends AbstractC2988f {

    /* renamed from: d, reason: collision with root package name */
    private final transient Object[] f3823d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f3824e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f3825f;

    @Override // java.util.List
    public final Object get(int i10) {
        Y.a(i10, this.f3825f, "index");
        Object obj = this.f3823d[i10 + i10 + this.f3824e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3825f;
    }

    C2998p(Object[] objArr, int i10, int i11) {
        this.f3823d = objArr;
        this.f3824e = i10;
        this.f3825f = i11;
    }
}
