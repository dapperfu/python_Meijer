package Dd;

import java.util.Objects;

/* loaded from: classes6.dex */
final class D0 extends AbstractC3202l0 {

    /* renamed from: d, reason: collision with root package name */
    final transient Object[] f5182d;

    static D0 h(int i10, Object[] objArr, C3190k0 c3190k0) {
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[1];
        Objects.requireNonNull(obj2);
        N.b(obj, obj2);
        return new D0(null, objArr, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    @Override // Dd.AbstractC3202l0, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L5
        L3:
            r4 = r0
            goto L19
        L5:
            java.lang.Object[] r1 = r3.f5182d
            r2 = 0
            r2 = r1[r2]
            java.util.Objects.requireNonNull(r2)
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L3
            r4 = 1
            r4 = r1[r4]
            java.util.Objects.requireNonNull(r4)
        L19:
            if (r4 != 0) goto L1c
            return r0
        L1c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Dd.D0.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return 1;
    }

    @Override // Dd.AbstractC3202l0
    final AbstractC3118e0 a() {
        return new C0(this.f5182d, 1, 1);
    }

    @Override // Dd.AbstractC3202l0
    final AbstractC3214m0 d() {
        return new A0(this, this.f5182d, 0, 1);
    }

    @Override // Dd.AbstractC3202l0
    final AbstractC3214m0 f() {
        return new B0(this, new C0(this.f5182d, 0, 1));
    }

    private D0(Object obj, Object[] objArr, int i10) {
        this.f5182d = objArr;
    }
}
