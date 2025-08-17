package Dd;

import java.util.Objects;

/* loaded from: classes6.dex */
final class C0 extends AbstractC3178j0 {

    /* renamed from: d, reason: collision with root package name */
    private final transient Object[] f5175d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f5176e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f5177f = 1;

    @Override // java.util.List
    public final Object get(int i10) {
        C3291t.a(i10, this.f5177f, "index");
        Object obj = this.f5175d[i10 + i10 + this.f5176e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5177f;
    }

    C0(Object[] objArr, int i10, int i11) {
        this.f5175d = objArr;
        this.f5176e = i10;
    }
}
