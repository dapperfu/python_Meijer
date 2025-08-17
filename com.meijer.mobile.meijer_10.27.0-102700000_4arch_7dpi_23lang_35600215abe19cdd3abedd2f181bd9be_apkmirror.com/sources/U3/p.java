package U3;

import c3.C6350a;
import d3.C13466a;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class p extends g3.e implements k {

    /* renamed from: e, reason: collision with root package name */
    private k f35725e;

    /* renamed from: f, reason: collision with root package name */
    private long f35726f;

    public void F(long j10, k kVar, long j11) {
        this.f132716b = j10;
        this.f35725e = kVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f35726f = j10;
    }

    @Override // U3.k
    public int a(long j10) {
        return ((k) C13466a.e(this.f35725e)).a(j10 - this.f35726f);
    }

    @Override // U3.k
    public List<C6350a> b(long j10) {
        return ((k) C13466a.e(this.f35725e)).b(j10 - this.f35726f);
    }

    @Override // U3.k
    public long e(int i10) {
        return ((k) C13466a.e(this.f35725e)).e(i10) + this.f35726f;
    }

    @Override // U3.k
    public int l() {
        return ((k) C13466a.e(this.f35725e)).l();
    }

    @Override // g3.e, g3.AbstractC14194a
    public void o() {
        super.o();
        this.f35725e = null;
    }
}
