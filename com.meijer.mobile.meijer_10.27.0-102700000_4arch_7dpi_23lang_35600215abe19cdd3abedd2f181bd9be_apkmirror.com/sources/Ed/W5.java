package Ed;

/* loaded from: classes6.dex */
final class W5 extends N5 {

    /* renamed from: c, reason: collision with root package name */
    private final transient Object[] f8350c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f8351d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f8352e;

    @Override // java.util.List
    public final Object get(int i10) {
        G1.a(i10, this.f8352e, "index");
        Object obj = this.f8350c[i10 + i10 + this.f8351d];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8352e;
    }

    W5(Object[] objArr, int i10, int i11) {
        this.f8350c = objArr;
        this.f8351d = i10;
        this.f8352e = i11;
    }
}
