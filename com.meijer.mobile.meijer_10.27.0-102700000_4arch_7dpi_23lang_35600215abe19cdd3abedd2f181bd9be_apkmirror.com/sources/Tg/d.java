package Tg;

import Xg.e;
import com.google.zxing.WriterException;
import com.google.zxing.f;
import com.google.zxing.q;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* loaded from: classes7.dex */
public final class d implements q {
    private static byte[][] d(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int length = (bArr.length - i10) - 1;
            for (int i11 = 0; i11 < bArr[0].length; i11++) {
                bArr2[i11][length] = bArr[i10][i11];
            }
        }
        return bArr2;
    }

    private static Gg.b b(byte[][] bArr, int i10) {
        int i11 = i10 * 2;
        Gg.b bVar = new Gg.b(bArr[0].length + i11, bArr.length + i11);
        bVar.b();
        int iJ = (bVar.j() - i10) - 1;
        int i12 = 0;
        while (i12 < bArr.length) {
            byte[] bArr2 = bArr[i12];
            for (int i13 = 0; i13 < bArr[0].length; i13++) {
                if (bArr2[i13] == 1) {
                    bVar.q(i13 + i10, iJ);
                }
            }
            i12++;
            iJ--;
        }
        return bVar;
    }

    @Override // com.google.zxing.q
    public Gg.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map<f, ?> map) throws WriterException {
        if (aVar != com.google.zxing.a.PDF_417) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got " + aVar);
        }
        e eVar = new e();
        boolean z10 = false;
        if (map != null) {
            f fVar = f.PDF417_COMPACT;
            if (map.containsKey(fVar)) {
                eVar.h(Boolean.parseBoolean(map.get(fVar).toString()));
            }
            f fVar2 = f.PDF417_COMPACTION;
            if (map.containsKey(fVar2)) {
                eVar.i(Xg.c.valueOf(map.get(fVar2).toString()));
            }
            f fVar3 = f.PDF417_DIMENSIONS;
            if (map.containsKey(fVar3)) {
                Xg.d dVar = (Xg.d) map.get(fVar3);
                eVar.j(dVar.a(), dVar.c(), dVar.b(), dVar.d());
            }
            f fVar4 = f.MARGIN;
            i = map.containsKey(fVar4) ? Integer.parseInt(map.get(fVar4).toString()) : 30;
            f fVar5 = f.ERROR_CORRECTION;
            i = map.containsKey(fVar5) ? Integer.parseInt(map.get(fVar5).toString()) : 2;
            f fVar6 = f.CHARACTER_SET;
            if (map.containsKey(fVar6)) {
                eVar.k(Charset.forName(map.get(fVar6).toString()));
            }
            f fVar7 = f.PDF417_AUTO_ECI;
            if (map.containsKey(fVar7) && Boolean.parseBoolean(map.get(fVar7).toString())) {
                z10 = true;
            }
        }
        return c(eVar, str, i, i10, i11, i, z10);
    }

    private static Gg.b c(e eVar, String str, int i10, int i11, int i12, int i13, boolean z10) throws WriterException {
        boolean z11;
        boolean z12;
        boolean z13;
        eVar.e(str, i10, z10);
        byte[][] bArrB = eVar.f().b(1, 4);
        if (i12 > i11) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (bArrB[0].length < bArrB.length) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 != z12) {
            bArrB = d(bArrB);
            z13 = true;
        } else {
            z13 = false;
        }
        int iMin = Math.min(i11 / bArrB[0].length, i12 / bArrB.length);
        if (iMin > 1) {
            byte[][] bArrB2 = eVar.f().b(iMin, iMin * 4);
            if (z13) {
                bArrB2 = d(bArrB2);
            }
            return b(bArrB2, i13);
        }
        return b(bArrB, i13);
    }
}
