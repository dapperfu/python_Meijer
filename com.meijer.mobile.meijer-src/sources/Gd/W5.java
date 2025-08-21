package Gd;

/* loaded from: classes6.dex */
final class W5 extends N5 {

    /* renamed from: c, reason: collision with root package name */
    private final transient Object[] f11902c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f11903d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f11904e;

    @Override // java.util.List
    public final Object get(int i10) {
        G1.a(i10, this.f11904e, "index");
        Object obj = this.f11902c[i10 + i10 + this.f11903d];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11904e;
    }

    W5(Object[] objArr, int i10, int i11) {
        this.f11902c = objArr;
        this.f11903d = i10;
        this.f11904e = i11;
    }
}
