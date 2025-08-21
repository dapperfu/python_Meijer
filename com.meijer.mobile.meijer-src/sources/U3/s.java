package U3;

import U3.r;
import android.util.SparseArray;
import x3.J;
import x3.O;

/* loaded from: classes4.dex */
public final class s implements x3.r {

    /* renamed from: a, reason: collision with root package name */
    private final x3.r f37068a;

    /* renamed from: b, reason: collision with root package name */
    private final r.a f37069b;

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray<u> f37070c = new SparseArray<>();

    /* renamed from: d, reason: collision with root package name */
    private boolean f37071d;

    @Override // x3.r
    public O t(int i10, int i11) {
        if (i11 != 3) {
            this.f37071d = true;
            return this.f37068a.t(i10, i11);
        }
        u uVar = this.f37070c.get(i10);
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(this.f37068a.t(i10, i11), this.f37069b);
        this.f37070c.put(i10, uVar2);
        return uVar2;
    }

    @Override // x3.r
    public void g(J j10) {
        this.f37068a.g(j10);
    }

    @Override // x3.r
    public void p() {
        this.f37068a.p();
        if (this.f37071d) {
            for (int i10 = 0; i10 < this.f37070c.size(); i10++) {
                this.f37070c.valueAt(i10).k(true);
            }
        }
    }

    public s(x3.r rVar, r.a aVar) {
        this.f37068a = rVar;
        this.f37069b = aVar;
    }
}
