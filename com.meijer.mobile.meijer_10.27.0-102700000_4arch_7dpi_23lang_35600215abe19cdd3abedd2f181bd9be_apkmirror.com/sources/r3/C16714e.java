package r3;

import Ce.L;
import Ce.g0;
import c3.C6350a;
import d3.C13466a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: r3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C16714e implements InterfaceC16710a {

    /* renamed from: b, reason: collision with root package name */
    private static final g0<U3.e> f157806b = g0.d().e(new Be.g() { // from class: r3.c
        @Override // Be.g
        public final Object apply(Object obj) {
            return Long.valueOf(((U3.e) obj).f35702b);
        }
    }).a(g0.d().f().e(new Be.g() { // from class: r3.d
        @Override // Be.g
        public final Object apply(Object obj) {
            return Long.valueOf(((U3.e) obj).f35703c);
        }
    }));

    /* renamed from: a, reason: collision with root package name */
    private final List<U3.e> f157807a = new ArrayList();

    @Override // r3.InterfaceC16710a
    public void e(long j10) {
        int i10 = 0;
        while (i10 < this.f157807a.size()) {
            long j11 = this.f157807a.get(i10).f35702b;
            if (j10 > j11 && j10 > this.f157807a.get(i10).f35704d) {
                this.f157807a.remove(i10);
                i10--;
            } else if (j10 < j11) {
                return;
            }
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r3.InterfaceC16710a
    public L<C6350a> a(long j10) {
        if (!this.f157807a.isEmpty()) {
            if (j10 >= this.f157807a.get(0).f35702b) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.f157807a.size(); i10++) {
                    U3.e eVar = this.f157807a.get(i10);
                    if (j10 >= eVar.f35702b && j10 < eVar.f35704d) {
                        arrayList.add(eVar);
                    }
                    if (j10 < eVar.f35702b) {
                        break;
                    }
                }
                L lG = L.G(f157806b, arrayList);
                L.a aVarP = L.p();
                for (int i11 = 0; i11 < lG.size(); i11++) {
                    aVarP.j(((U3.e) lG.get(i11)).f35701a);
                }
                return aVarP.k();
            }
        }
        return L.x();
    }

    @Override // r3.InterfaceC16710a
    public long b(long j10) {
        if (this.f157807a.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j10 < this.f157807a.get(0).f35702b) {
            return -9223372036854775807L;
        }
        long jMax = this.f157807a.get(0).f35702b;
        for (int i10 = 0; i10 < this.f157807a.size(); i10++) {
            long j11 = this.f157807a.get(i10).f35702b;
            long j12 = this.f157807a.get(i10).f35704d;
            if (j12 > j10) {
                if (j11 > j10) {
                    break;
                }
                jMax = Math.max(jMax, j11);
            } else {
                jMax = Math.max(jMax, j12);
            }
        }
        return jMax;
    }

    @Override // r3.InterfaceC16710a
    public void clear() {
        this.f157807a.clear();
    }

    @Override // r3.InterfaceC16710a
    public boolean d(U3.e eVar, long j10) {
        C13466a.a(eVar.f35702b != -9223372036854775807L);
        C13466a.a(eVar.f35703c != -9223372036854775807L);
        boolean z10 = eVar.f35702b <= j10 && j10 < eVar.f35704d;
        for (int size = this.f157807a.size() - 1; size >= 0; size--) {
            if (eVar.f35702b >= this.f157807a.get(size).f35702b) {
                this.f157807a.add(size + 1, eVar);
                return z10;
            }
        }
        this.f157807a.add(0, eVar);
        return z10;
    }

    @Override // r3.InterfaceC16710a
    public long c(long j10) {
        int i10 = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            if (i10 >= this.f157807a.size()) {
                break;
            }
            long j11 = this.f157807a.get(i10).f35702b;
            long j12 = this.f157807a.get(i10).f35704d;
            if (j10 < j11) {
                if (jMin == -9223372036854775807L) {
                    jMin = j11;
                } else {
                    jMin = Math.min(jMin, j11);
                }
            } else {
                if (j10 < j12) {
                    if (jMin == -9223372036854775807L) {
                        jMin = j12;
                    } else {
                        jMin = Math.min(jMin, j12);
                    }
                }
                i10++;
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }
}
