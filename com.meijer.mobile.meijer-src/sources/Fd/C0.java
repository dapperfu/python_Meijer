package Fd;

import java.util.Objects;

/* loaded from: classes6.dex */
final class C0 extends AbstractC3400j0 {

    /* renamed from: d, reason: collision with root package name */
    private final transient Object[] f9208d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f9209e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f9210f = 1;

    @Override // java.util.List
    public final Object get(int i10) {
        C3513t.a(i10, this.f9210f, "index");
        Object obj = this.f9208d[i10 + i10 + this.f9209e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9210f;
    }

    C0(Object[] objArr, int i10, int i11) {
        this.f9208d = objArr;
        this.f9209e = i10;
    }
}
