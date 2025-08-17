package a4;

import U3.k;
import c3.C6350a;
import d3.P;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
final class h implements k {

    /* renamed from: a, reason: collision with root package name */
    private final C5577c f44331a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f44332b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, C5581g> f44333c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, C5579e> f44334d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, String> f44335e;

    @Override // U3.k
    public int a(long j10) {
        int iD = P.d(this.f44332b, j10, false, false);
        if (iD < this.f44332b.length) {
            return iD;
        }
        return -1;
    }

    @Override // U3.k
    public List<C6350a> b(long j10) {
        return this.f44331a.h(j10, this.f44333c, this.f44334d, this.f44335e);
    }

    @Override // U3.k
    public long e(int i10) {
        return this.f44332b[i10];
    }

    @Override // U3.k
    public int l() {
        return this.f44332b.length;
    }

    public h(C5577c c5577c, Map<String, C5581g> map, Map<String, C5579e> map2, Map<String, String> map3) {
        Map<String, C5581g> mapUnmodifiableMap;
        this.f44331a = c5577c;
        this.f44334d = map2;
        this.f44335e = map3;
        if (map != null) {
            mapUnmodifiableMap = Collections.unmodifiableMap(map);
        } else {
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        }
        this.f44333c = mapUnmodifiableMap;
        this.f44332b = c5577c.j();
    }
}
