package a4;

import U3.k;
import c3.C6476a;
import d3.P;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
final class h implements k {

    /* renamed from: a, reason: collision with root package name */
    private final C5660c f45149a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f45150b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, g> f45151c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, e> f45152d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, String> f45153e;

    @Override // U3.k
    public int a(long j10) {
        int iD = P.d(this.f45150b, j10, false, false);
        if (iD < this.f45150b.length) {
            return iD;
        }
        return -1;
    }

    @Override // U3.k
    public List<C6476a> b(long j10) {
        return this.f45149a.h(j10, this.f45151c, this.f45152d, this.f45153e);
    }

    @Override // U3.k
    public long e(int i10) {
        return this.f45150b[i10];
    }

    @Override // U3.k
    public int l() {
        return this.f45150b.length;
    }

    public h(C5660c c5660c, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        Map<String, g> mapUnmodifiableMap;
        this.f45149a = c5660c;
        this.f45152d = map2;
        this.f45153e = map3;
        if (map != null) {
            mapUnmodifiableMap = Collections.unmodifiableMap(map);
        } else {
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        }
        this.f45151c = mapUnmodifiableMap;
        this.f45150b = c5660c.j();
    }
}
