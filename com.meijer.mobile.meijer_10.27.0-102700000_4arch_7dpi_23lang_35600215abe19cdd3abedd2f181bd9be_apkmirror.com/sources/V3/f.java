package V3;

import U3.k;
import c3.C6350a;
import d3.C13466a;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
final class f implements k {

    /* renamed from: a, reason: collision with root package name */
    private final List<C6350a> f36873a;

    @Override // U3.k
    public int l() {
        return 1;
    }

    @Override // U3.k
    public int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // U3.k
    public List<C6350a> b(long j10) {
        return j10 >= 0 ? this.f36873a : Collections.EMPTY_LIST;
    }

    @Override // U3.k
    public long e(int i10) {
        C13466a.a(i10 == 0);
        return 0L;
    }

    public f(List<C6350a> list) {
        this.f36873a = list;
    }
}
