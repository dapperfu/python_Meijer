package av;

import io.reactivex.s;

/* loaded from: classes10.dex */
public final class q {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        r1 = r8.G(-r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r1 != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T, U> void c(Ou.e<T> r9, io.reactivex.s<? super U> r10, boolean r11, Ju.b r12, av.n<T, U> r13) {
        /*
            r0 = 1
            r1 = r0
        L2:
            boolean r2 = r13.H()
            boolean r3 = r9.isEmpty()
            r6 = r9
            r4 = r10
            r5 = r11
            r7 = r12
            r8 = r13
            boolean r9 = a(r2, r3, r4, r5, r6, r7, r8)
            if (r9 == 0) goto L16
            goto L35
        L16:
            boolean r2 = r8.H()
            java.lang.Object r9 = r6.poll()
            if (r9 != 0) goto L22
            r3 = r0
            goto L24
        L22:
            r10 = 0
            r3 = r10
        L24:
            boolean r10 = a(r2, r3, r4, r5, r6, r7, r8)
            r11 = r3
            if (r10 == 0) goto L2c
            goto L35
        L2c:
            if (r11 == 0) goto L3c
            int r9 = -r1
            int r1 = r8.G(r9)
            if (r1 != 0) goto L36
        L35:
            return
        L36:
            r10 = r4
            r11 = r5
            r9 = r6
            r12 = r7
            r13 = r8
            goto L2
        L3c:
            r8.F(r4, r9)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: av.q.c(Ou.e, io.reactivex.s, boolean, Ju.b, av.n):void");
    }

    public static <T> Ou.f<T> b(int i10) {
        return i10 < 0 ? new Wu.c(-i10) : new Wu.b(i10);
    }

    public static <T, U> boolean a(boolean z10, boolean z11, s<?> sVar, boolean z12, Ou.f<?> fVar, Ju.b bVar, n<T, U> nVar) {
        if (nVar.I()) {
            fVar.clear();
            bVar.dispose();
            return true;
        }
        if (z10) {
            if (z12) {
                if (z11) {
                    if (bVar != null) {
                        bVar.dispose();
                    }
                    Throwable thE = nVar.E();
                    if (thE != null) {
                        sVar.onError(thE);
                    } else {
                        sVar.onComplete();
                    }
                    return true;
                }
                return false;
            }
            Throwable thE2 = nVar.E();
            if (thE2 != null) {
                fVar.clear();
                if (bVar != null) {
                    bVar.dispose();
                }
                sVar.onError(thE2);
                return true;
            }
            if (z11) {
                if (bVar != null) {
                    bVar.dispose();
                }
                sVar.onComplete();
                return true;
            }
            return false;
        }
        return false;
    }
}
