package p3;

import Ce.L;
import androidx.media3.exoplayer.C6061l0;
import androidx.media3.exoplayer.source.G;
import d3.C13466a;
import java.util.List;

/* renamed from: p3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16251d implements G {

    /* renamed from: a, reason: collision with root package name */
    private final L<a> f155413a;

    /* renamed from: b, reason: collision with root package name */
    private long f155414b;

    /* renamed from: p3.d$a */
    private static final class a implements G {

        /* renamed from: a, reason: collision with root package name */
        private final G f155415a;

        /* renamed from: b, reason: collision with root package name */
        private final L<Integer> f155416b;

        @Override // androidx.media3.exoplayer.source.G
        public boolean a() {
            return this.f155415a.a();
        }

        @Override // androidx.media3.exoplayer.source.G
        public boolean b(C6061l0 c6061l0) {
            return this.f155415a.b(c6061l0);
        }

        @Override // androidx.media3.exoplayer.source.G
        public long c() {
            return this.f155415a.c();
        }

        @Override // androidx.media3.exoplayer.source.G
        public long d() {
            return this.f155415a.d();
        }

        @Override // androidx.media3.exoplayer.source.G
        public void e(long j10) {
            this.f155415a.e(j10);
        }

        public L<Integer> f() {
            return this.f155416b;
        }

        public a(G g10, List<Integer> list) {
            this.f155415a = g10;
            this.f155416b = L.s(list);
        }
    }

    @Override // androidx.media3.exoplayer.source.G
    public boolean a() {
        for (int i10 = 0; i10 < this.f155413a.size(); i10++) {
            if (this.f155413a.get(i10).a()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.G
    public boolean b(C6061l0 c6061l0) {
        boolean zB;
        boolean z10 = false;
        do {
            long jC = c();
            if (jC == Long.MIN_VALUE) {
                return z10;
            }
            zB = false;
            for (int i10 = 0; i10 < this.f155413a.size(); i10++) {
                long jC2 = this.f155413a.get(i10).c();
                boolean z11 = jC2 != Long.MIN_VALUE && jC2 <= c6061l0.f56324a;
                if (jC2 == jC || z11) {
                    zB |= this.f155413a.get(i10).b(c6061l0);
                }
            }
            z10 |= zB;
        } while (zB);
        return z10;
    }

    @Override // androidx.media3.exoplayer.source.G
    public void e(long j10) {
        for (int i10 = 0; i10 < this.f155413a.size(); i10++) {
            this.f155413a.get(i10).e(j10);
        }
    }

    public C16251d(List<? extends G> list, List<List<Integer>> list2) {
        boolean z10;
        L.a aVarP = L.p();
        if (list.size() == list2.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13466a.a(z10);
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVarP.a(new a(list.get(i10), list2.get(i10)));
        }
        this.f155413a = aVarP.k();
        this.f155414b = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.G
    public long c() {
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f155413a.size(); i10++) {
            long jC = this.f155413a.get(i10).c();
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
        for (int i10 = 0; i10 < this.f155413a.size(); i10++) {
            a aVar = this.f155413a.get(i10);
            long jD = aVar.d();
            if ((aVar.f().contains(1) || aVar.f().contains(2) || aVar.f().contains(4)) && jD != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jD);
            }
            if (jD != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jD);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            this.f155414b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f155414b;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        return jMin2;
    }
}
