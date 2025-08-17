package s3;

import Ce.L;
import a3.G;
import a3.J;
import java.util.Arrays;
import java.util.List;
import s3.AbstractC16849A;

/* renamed from: s3.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16851C {
    public static J b(AbstractC16849A.a aVar, InterfaceC16850B[] interfaceC16850BArr) {
        List[] listArr = new List[interfaceC16850BArr.length];
        for (int i10 = 0; i10 < interfaceC16850BArr.length; i10++) {
            InterfaceC16850B interfaceC16850B = interfaceC16850BArr[i10];
            listArr[i10] = interfaceC16850B != null ? L.y(interfaceC16850B) : L.x();
        }
        return a(aVar, listArr);
    }

    public static J a(AbstractC16849A.a aVar, List<? extends InterfaceC16850B>[] listArr) {
        boolean z10;
        L.a aVar2 = new L.a();
        for (int i10 = 0; i10 < aVar.d(); i10++) {
            p3.w wVarF = aVar.f(i10);
            List<? extends InterfaceC16850B> list = listArr[i10];
            for (int i11 = 0; i11 < wVarF.f155475a; i11++) {
                G gB = wVarF.b(i11);
                boolean z11 = aVar.a(i10, i11, false) != 0;
                int i12 = gB.f43633a;
                int[] iArr = new int[i12];
                boolean[] zArr = new boolean[i12];
                for (int i13 = 0; i13 < gB.f43633a; i13++) {
                    iArr[i13] = aVar.g(i10, i11, i13);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        InterfaceC16850B interfaceC16850B = list.get(i14);
                        if (interfaceC16850B.g().equals(gB) && interfaceC16850B.f(i13) != -1) {
                            z10 = true;
                            break;
                        }
                        i14++;
                    }
                    zArr[i13] = z10;
                }
                aVar2.a(new J.a(gB, z11, iArr, zArr));
            }
        }
        p3.w wVarH = aVar.h();
        for (int i15 = 0; i15 < wVarH.f155475a; i15++) {
            G gB2 = wVarH.b(i15);
            int[] iArr2 = new int[gB2.f43633a];
            Arrays.fill(iArr2, 0);
            aVar2.a(new J.a(gB2, false, iArr2, new boolean[gB2.f43633a]));
        }
        return new J(aVar2.k());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Point c(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto Lf
            r3 = 0
            r0 = 1
            if (r6 <= r7) goto L8
            r1 = r0
            goto L9
        L8:
            r1 = r3
        L9:
            if (r4 <= r5) goto Lc
            r3 = r0
        Lc:
            if (r1 == r3) goto Lf
            goto L12
        Lf:
            r2 = r5
            r5 = r4
            r4 = r2
        L12:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L22
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = d3.P.j(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L22:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = d3.P.j(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.C16851C.c(boolean, int, int, int, int):android.graphics.Point");
    }
}
