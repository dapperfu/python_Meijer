package Cg;

import com.google.zxing.f;
import com.google.zxing.q;
import java.nio.charset.Charset;
import java.util.Map;

/* loaded from: classes8.dex */
public final class c implements q {
    @Override // com.google.zxing.q
    public Ig.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map<f, ?> map) throws NumberFormatException {
        int i12 = 0;
        if (map != null) {
            f fVar = f.CHARACTER_SET;
            charsetForName = map.containsKey(fVar) ? Charset.forName(map.get(fVar).toString()) : null;
            f fVar2 = f.ERROR_CORRECTION;
            i = map.containsKey(fVar2) ? Integer.parseInt(map.get(fVar2).toString()) : 33;
            f fVar3 = f.AZTEC_LAYERS;
            if (map.containsKey(fVar3)) {
                i12 = Integer.parseInt(map.get(fVar3).toString());
            }
        }
        return b(str, aVar, i10, i11, charsetForName, i, i12);
    }

    private static Ig.b b(String str, com.google.zxing.a aVar, int i10, int i11, Charset charset, int i12, int i13) {
        if (aVar == com.google.zxing.a.AZTEC) {
            return c(Fg.c.d(str, i12, i13, charset), i10, i11);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got " + aVar);
    }

    private static Ig.b c(Fg.a aVar, int i10, int i11) {
        Ig.b bVarA = aVar.a();
        if (bVarA != null) {
            int iM = bVarA.m();
            int iJ = bVarA.j();
            int iMax = Math.max(i10, iM);
            int iMax2 = Math.max(i11, iJ);
            int iMin = Math.min(iMax / iM, iMax2 / iJ);
            int i12 = (iMax - (iM * iMin)) / 2;
            int i13 = (iMax2 - (iJ * iMin)) / 2;
            Ig.b bVar = new Ig.b(iMax, iMax2);
            int i14 = 0;
            while (i14 < iJ) {
                int i15 = 0;
                int i16 = i12;
                while (i15 < iM) {
                    if (bVarA.f(i15, i14)) {
                        bVar.r(i16, i13, iMin, iMin);
                    }
                    i15++;
                    i16 += iMin;
                }
                i14++;
                i13 += iMin;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }
}
