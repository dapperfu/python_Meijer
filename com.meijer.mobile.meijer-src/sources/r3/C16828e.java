package r3;

import Ee.L;
import Ee.g0;
import c3.C6476a;
import d3.C13599a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: r3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C16828e implements InterfaceC16824a {

    /* renamed from: b, reason: collision with root package name */
    private static final g0<U3.e> f159192b = g0.d().e(new De.g() { // from class: r3.c
        @Override // De.g
        public final Object apply(Object obj) {
            return Long.valueOf(((U3.e) obj).f37038b);
        }
    }).a(g0.d().f().e(new De.g() { // from class: r3.d
        @Override // De.g
        public final Object apply(Object obj) {
            return Long.valueOf(((U3.e) obj).f37039c);
        }
    }));

    /* renamed from: a, reason: collision with root package name */
    private final List<U3.e> f159193a = new ArrayList();

    @Override // r3.InterfaceC16824a
    public void e(long j10) {
        int i10 = 0;
        while (i10 < this.f159193a.size()) {
            long j11 = this.f159193a.get(i10).f37038b;
            if (j10 > j11 && j10 > this.f159193a.get(i10).f37040d) {
                this.f159193a.remove(i10);
                i10--;
            } else if (j10 < j11) {
                return;
            }
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r3.InterfaceC16824a
    public L<C6476a> a(long j10) {
        if (!this.f159193a.isEmpty()) {
            if (j10 >= this.f159193a.get(0).f37038b) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.f159193a.size(); i10++) {
                    U3.e eVar = this.f159193a.get(i10);
                    if (j10 >= eVar.f37038b && j10 < eVar.f37040d) {
                        arrayList.add(eVar);
                    }
                    if (j10 < eVar.f37038b) {
                        break;
                    }
                }
                L lG = L.G(f159192b, arrayList);
                L.a aVarP = L.p();
                for (int i11 = 0; i11 < lG.size(); i11++) {
                    aVarP.j(((U3.e) lG.get(i11)).f37037a);
                }
                return aVarP.k();
            }
        }
        return L.x();
    }

    @Override // r3.InterfaceC16824a
    public long b(long j10) {
        if (this.f159193a.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j10 < this.f159193a.get(0).f37038b) {
            return -9223372036854775807L;
        }
        long jMax = this.f159193a.get(0).f37038b;
        for (int i10 = 0; i10 < this.f159193a.size(); i10++) {
            long j11 = this.f159193a.get(i10).f37038b;
            long j12 = this.f159193a.get(i10).f37040d;
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

    @Override // r3.InterfaceC16824a
    public void clear() {
        this.f159193a.clear();
    }

    @Override // r3.InterfaceC16824a
    public boolean d(U3.e eVar, long j10) {
        C13599a.a(eVar.f37038b != -9223372036854775807L);
        C13599a.a(eVar.f37039c != -9223372036854775807L);
        boolean z10 = eVar.f37038b <= j10 && j10 < eVar.f37040d;
        for (int size = this.f159193a.size() - 1; size >= 0; size--) {
            if (eVar.f37038b >= this.f159193a.get(size).f37038b) {
                this.f159193a.add(size + 1, eVar);
                return z10;
            }
        }
        this.f159193a.add(0, eVar);
        return z10;
    }

    @Override // r3.InterfaceC16824a
    public long c(long j10) {
        int i10 = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            if (i10 >= this.f159193a.size()) {
                break;
            }
            long j11 = this.f159193a.get(i10).f37038b;
            long j12 = this.f159193a.get(i10).f37040d;
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
