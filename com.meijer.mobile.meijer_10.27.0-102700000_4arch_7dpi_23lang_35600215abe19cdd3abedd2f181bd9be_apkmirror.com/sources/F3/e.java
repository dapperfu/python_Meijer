package F3;

import x3.C17995A;
import x3.J;
import x3.K;
import x3.O;
import x3.r;

/* loaded from: classes.dex */
public final class e implements r {

    /* renamed from: a, reason: collision with root package name */
    private final long f10253a;

    /* renamed from: b, reason: collision with root package name */
    private final r f10254b;

    class a extends C17995A {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J f10255b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(J j10, J j11) {
            super(j10);
            this.f10255b = j11;
        }

        @Override // x3.C17995A, x3.J
        public J.a d(long j10) {
            J.a aVarD = this.f10255b.d(j10);
            K k10 = aVarD.f169078a;
            K k11 = new K(k10.f169083a, k10.f169084b + e.this.f10253a);
            K k12 = aVarD.f169079b;
            return new J.a(k11, new K(k12.f169083a, k12.f169084b + e.this.f10253a));
        }
    }

    @Override // x3.r
    public void g(J j10) {
        this.f10254b.g(new a(j10, j10));
    }

    @Override // x3.r
    public void p() {
        this.f10254b.p();
    }

    @Override // x3.r
    public O t(int i10, int i11) {
        return this.f10254b.t(i10, i11);
    }

    public e(long j10, r rVar) {
        this.f10253a = j10;
        this.f10254b = rVar;
    }
}
