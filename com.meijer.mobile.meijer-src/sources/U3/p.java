package U3;

import c3.C6476a;
import d3.C13599a;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class p extends g3.e implements k {

    /* renamed from: e, reason: collision with root package name */
    private k f37061e;

    /* renamed from: f, reason: collision with root package name */
    private long f37062f;

    public void F(long j10, k kVar, long j11) {
        this.f134006b = j10;
        this.f37061e = kVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f37062f = j10;
    }

    @Override // U3.k
    public int a(long j10) {
        return ((k) C13599a.e(this.f37061e)).a(j10 - this.f37062f);
    }

    @Override // U3.k
    public List<C6476a> b(long j10) {
        return ((k) C13599a.e(this.f37061e)).b(j10 - this.f37062f);
    }

    @Override // U3.k
    public long e(int i10) {
        return ((k) C13599a.e(this.f37061e)).e(i10) + this.f37062f;
    }

    @Override // U3.k
    public int l() {
        return ((k) C13599a.e(this.f37061e)).l();
    }

    @Override // g3.e, g3.AbstractC14323a
    public void o() {
        super.o();
        this.f37061e = null;
    }
}
