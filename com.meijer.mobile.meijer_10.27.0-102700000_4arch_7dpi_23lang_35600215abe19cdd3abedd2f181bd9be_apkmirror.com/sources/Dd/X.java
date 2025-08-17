package Dd;

import java.util.Map;

/* loaded from: classes6.dex */
final class X extends J {

    /* renamed from: a, reason: collision with root package name */
    private final Object f5573a;

    /* renamed from: b, reason: collision with root package name */
    private int f5574b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Z f5575c;

    X(Z z10, int i10) {
        this.f5575c = z10;
        this.f5573a = Z.k(z10, i10);
        this.f5574b = i10;
    }

    private final void a() {
        int i10 = this.f5574b;
        if (i10 == -1 || i10 >= this.f5575c.size() || !r.a(this.f5573a, Z.k(this.f5575c, this.f5574b))) {
            this.f5574b = this.f5575c.I(this.f5573a);
        }
    }

    @Override // Dd.J, java.util.Map.Entry
    public final Object getKey() {
        return this.f5573a;
    }

    @Override // Dd.J, java.util.Map.Entry
    public final Object getValue() {
        Map mapV = this.f5575c.v();
        if (mapV != null) {
            return mapV.get(this.f5573a);
        }
        a();
        int i10 = this.f5574b;
        if (i10 == -1) {
            return null;
        }
        return Z.r(this.f5575c, i10);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapV = this.f5575c.v();
        if (mapV != null) {
            return mapV.put(this.f5573a, obj);
        }
        a();
        int i10 = this.f5574b;
        if (i10 == -1) {
            this.f5575c.put(this.f5573a, obj);
            return null;
        }
        Z z10 = this.f5575c;
        Object objR = Z.r(z10, i10);
        Z.y(z10, this.f5574b, obj);
        return objR;
    }
}
