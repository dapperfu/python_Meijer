package Fd;

import java.util.Map;

/* loaded from: classes6.dex */
final class X extends J {

    /* renamed from: a, reason: collision with root package name */
    private final Object f9606a;

    /* renamed from: b, reason: collision with root package name */
    private int f9607b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Z f9608c;

    X(Z z10, int i10) {
        this.f9608c = z10;
        this.f9606a = Z.k(z10, i10);
        this.f9607b = i10;
    }

    private final void a() {
        int i10 = this.f9607b;
        if (i10 == -1 || i10 >= this.f9608c.size() || !r.a(this.f9606a, Z.k(this.f9608c, this.f9607b))) {
            this.f9607b = this.f9608c.I(this.f9606a);
        }
    }

    @Override // Fd.J, java.util.Map.Entry
    public final Object getKey() {
        return this.f9606a;
    }

    @Override // Fd.J, java.util.Map.Entry
    public final Object getValue() {
        Map mapT = this.f9608c.t();
        if (mapT != null) {
            return mapT.get(this.f9606a);
        }
        a();
        int i10 = this.f9607b;
        if (i10 == -1) {
            return null;
        }
        return Z.r(this.f9608c, i10);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapT = this.f9608c.t();
        if (mapT != null) {
            return mapT.put(this.f9606a, obj);
        }
        a();
        int i10 = this.f9607b;
        if (i10 == -1) {
            this.f9608c.put(this.f9606a, obj);
            return null;
        }
        Z z10 = this.f9608c;
        Object objR = Z.r(z10, i10);
        Z.x(z10, this.f9607b, obj);
        return objR;
    }
}
