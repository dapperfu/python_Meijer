package p3;

import Ee.L;
import androidx.media3.exoplayer.C6203l0;
import androidx.media3.exoplayer.source.G;
import d3.C13599a;
import java.util.List;

/* renamed from: p3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16396d implements G {

    /* renamed from: a, reason: collision with root package name */
    private final L<a> f156087a;

    /* renamed from: b, reason: collision with root package name */
    private long f156088b;

    /* renamed from: p3.d$a */
    private static final class a implements G {

        /* renamed from: a, reason: collision with root package name */
        private final G f156089a;

        /* renamed from: b, reason: collision with root package name */
        private final L<Integer> f156090b;

        @Override // androidx.media3.exoplayer.source.G
        public boolean a() {
            return this.f156089a.a();
        }

        @Override // androidx.media3.exoplayer.source.G
        public boolean b(C6203l0 c6203l0) {
            return this.f156089a.b(c6203l0);
        }

        @Override // androidx.media3.exoplayer.source.G
        public long c() {
            return this.f156089a.c();
        }

        @Override // androidx.media3.exoplayer.source.G
        public long d() {
            return this.f156089a.d();
        }

        @Override // androidx.media3.exoplayer.source.G
        public void e(long j10) {
            this.f156089a.e(j10);
        }

        public L<Integer> f() {
            return this.f156090b;
        }

        public a(G g10, List<Integer> list) {
            this.f156089a = g10;
            this.f156090b = L.s(list);
        }
    }

    @Override // androidx.media3.exoplayer.source.G
    public boolean a() {
        for (int i10 = 0; i10 < this.f156087a.size(); i10++) {
            if (this.f156087a.get(i10).a()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.G
    public boolean b(C6203l0 c6203l0) {
        boolean zB;
        boolean z10 = false;
        do {
            long jC = c();
            if (jC == Long.MIN_VALUE) {
                return z10;
            }
            zB = false;
            for (int i10 = 0; i10 < this.f156087a.size(); i10++) {
                long jC2 = this.f156087a.get(i10).c();
                boolean z11 = jC2 != Long.MIN_VALUE && jC2 <= c6203l0.f56548a;
                if (jC2 == jC || z11) {
                    zB |= this.f156087a.get(i10).b(c6203l0);
                }
            }
            z10 |= zB;
        } while (zB);
        return z10;
    }

    @Override // androidx.media3.exoplayer.source.G
    public void e(long j10) {
        for (int i10 = 0; i10 < this.f156087a.size(); i10++) {
            this.f156087a.get(i10).e(j10);
        }
    }

    public C16396d(List<? extends G> list, List<List<Integer>> list2) {
        boolean z10;
        L.a aVarP = L.p();
        if (list.size() == list2.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13599a.a(z10);
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVarP.a(new a(list.get(i10), list2.get(i10)));
        }
        this.f156087a = aVarP.k();
        this.f156088b = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.G
    public long c() {
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f156087a.size(); i10++) {
            long jC = this.f156087a.get(i10).c();
            if (jC != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jC);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // androidx.media3.exoplayer.source.G
    public long d() {
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f156087a.size(); i10++) {
            a aVar = this.f156087a.get(i10);
            long jD = aVar.d();
            if ((aVar.f().contains(1) || aVar.f().contains(2) || aVar.f().contains(4)) && jD != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jD);
            }
            if (jD != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jD);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            this.f156088b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f156088b;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        return jMin2;
    }
}
