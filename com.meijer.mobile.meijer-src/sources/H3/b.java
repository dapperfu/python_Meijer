package H3;

import G3.c;
import a3.y;
import d3.C;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class b extends c {
    private static y c(C c10) {
        c10.r(12);
        int iD = (c10.d() + c10.h(12)) - 4;
        c10.r(44);
        c10.s(c10.h(12));
        c10.r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strL = null;
            if (c10.d() >= iD) {
                break;
            }
            c10.r(48);
            int iH = c10.h(8);
            c10.r(4);
            int iD2 = c10.d() + c10.h(12);
            String strL2 = null;
            while (c10.d() < iD2) {
                int iH2 = c10.h(8);
                int iH3 = c10.h(8);
                int iD3 = c10.d() + iH3;
                if (iH2 == 2) {
                    int iH4 = c10.h(16);
                    c10.r(8);
                    if (iH4 == 3) {
                        while (c10.d() < iD3) {
                            strL = c10.l(c10.h(8), StandardCharsets.US_ASCII);
                            int iH5 = c10.h(8);
                            for (int i10 = 0; i10 < iH5; i10++) {
                                c10.s(c10.h(8));
                            }
                        }
                    }
                } else if (iH2 == 21) {
                    strL2 = c10.l(iH3, StandardCharsets.US_ASCII);
                }
                c10.p(iD3 * 8);
            }
            c10.p(iD2 * 8);
            if (strL != null && strL2 != null) {
                arrayList.add(new a(iH, strL + strL2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new y(arrayList);
    }

    @Override // G3.c
    protected y b(G3.b bVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return c(new C(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
