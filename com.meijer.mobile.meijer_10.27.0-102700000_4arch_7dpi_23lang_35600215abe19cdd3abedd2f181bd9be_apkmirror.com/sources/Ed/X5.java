package Ed;

/* loaded from: classes6.dex */
final class X5 extends P5 {

    /* renamed from: f, reason: collision with root package name */
    static final P5 f8364f = new X5(null, new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    final transient Object[] f8365d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f8366e;

    static X5 h(int i10, Object[] objArr, O5 o52) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        C3491j3.a(obj, obj2);
        return new X5(null, objArr, 1);
    }

    @Override // Ed.P5
    final M4 a() {
        return new W5(this.f8365d, 1, this.f8366e);
    }

    @Override // Ed.P5
    final Q5 d() {
        return new U5(this, this.f8365d, 0, this.f8366e);
    }

    @Override // Ed.P5
    final Q5 f() {
        return new V5(this, new W5(this.f8365d, 0, this.f8366e));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    @Override // Ed.P5, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f8365d
            int r1 = r4.f8366e
            r2 = 0
            if (r5 != 0) goto L9
        L7:
            r5 = r2
            goto L1d
        L9:
            r3 = 1
            if (r1 != r3) goto L7
            r1 = 0
            r1 = r0[r1]
            r1.getClass()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L7
            r5 = r0[r3]
            r5.getClass()
        L1d:
            if (r5 != 0) goto L20
            return r2
        L20:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Ed.X5.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f8366e;
    }

    private X5(Object obj, Object[] objArr, int i10) {
        this.f8365d = objArr;
        this.f8366e = i10;
    }
}
