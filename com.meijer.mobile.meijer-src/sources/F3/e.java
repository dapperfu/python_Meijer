package F3;

import x3.C18061A;
import x3.J;
import x3.K;
import x3.O;
import x3.r;

/* loaded from: classes.dex */
public final class e implements r {

    /* renamed from: a, reason: collision with root package name */
    private final long f9020a;

    /* renamed from: b, reason: collision with root package name */
    private final r f9021b;

    class a extends C18061A {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J f9022b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(J j10, J j11) {
            super(j10);
            this.f9022b = j11;
        }

        @Override // x3.C18061A, x3.J
        public J.a d(long j10) {
            J.a aVarD = this.f9022b.d(j10);
            K k10 = aVarD.f170166a;
            K k11 = new K(k10.f170171a, k10.f170172b + e.this.f9020a);
            K k12 = aVarD.f170167b;
            return new J.a(k11, new K(k12.f170171a, k12.f170172b + e.this.f9020a));
        }
    }

    @Override // x3.r
    public void g(J j10) {
        this.f9021b.g(new a(j10, j10));
    }

    @Override // x3.r
    public void p() {
        this.f9021b.p();
    }

    @Override // x3.r
    public O t(int i10, int i11) {
        return this.f9021b.t(i10, i11);
    }

    public e(long j10, r rVar) {
        this.f9020a = j10;
        this.f9021b = rVar;
    }
}
