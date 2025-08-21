package U3;

import c3.C6476a;
import d3.InterfaceC13610l;
import java.util.List;

/* loaded from: classes4.dex */
public class i {
    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(U3.k r11, U3.r.b r12, d3.InterfaceC13610l<U3.e> r13) {
        /*
            long r0 = r12.f37066a
            int r0 = a(r11, r0)
            long r1 = r12.f37066a
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L3a
            int r1 = r11.l()
            if (r0 >= r1) goto L3a
            long r3 = r12.f37066a
            java.util.List r6 = r11.b(r3)
            long r3 = r11.e(r0)
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L3a
            long r7 = r12.f37066a
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 >= 0) goto L3a
            U3.e r5 = new U3.e
            long r9 = r3 - r7
            r5.<init>(r6, r7, r9)
            r13.accept(r5)
            r1 = 1
            goto L3b
        L3a:
            r1 = r2
        L3b:
            r3 = r0
        L3c:
            int r4 = r11.l()
            if (r3 >= r4) goto L48
            b(r11, r3, r13)
            int r3 = r3 + 1
            goto L3c
        L48:
            boolean r3 = r12.f37067b
            if (r3 == 0) goto L74
            if (r1 == 0) goto L50
            int r0 = r0 + (-1)
        L50:
            if (r2 >= r0) goto L58
            b(r11, r2, r13)
            int r2 = r2 + 1
            goto L50
        L58:
            if (r1 == 0) goto L74
            U3.e r3 = new U3.e
            long r1 = r12.f37066a
            java.util.List r4 = r11.b(r1)
            long r5 = r11.e(r0)
            long r1 = r12.f37066a
            long r11 = r11.e(r0)
            long r7 = r1 - r11
            r3.<init>(r4, r5, r7)
            r13.accept(r3)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U3.i.c(U3.k, U3.r$b, d3.l):void");
    }

    private static void b(k kVar, int i10, InterfaceC13610l<e> interfaceC13610l) {
        long jE = kVar.e(i10);
        List<C6476a> listB = kVar.b(jE);
        if (!listB.isEmpty()) {
            if (i10 != kVar.l() - 1) {
                long jE2 = kVar.e(i10 + 1) - kVar.e(i10);
                if (jE2 > 0) {
                    interfaceC13610l.accept(new e(listB, jE, jE2));
                    return;
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    private static int a(k kVar, long j10) {
        if (j10 == -9223372036854775807L) {
            return 0;
        }
        int iA = kVar.a(j10);
        if (iA == -1) {
            iA = kVar.l();
        }
        if (iA > 0 && kVar.e(iA - 1) == j10) {
            return iA - 1;
        }
        return iA;
    }
}
