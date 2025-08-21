package Rg;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class r implements com.google.zxing.l {
    protected static float e(int[] iArr, int[] iArr2, float f10) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i10 += iArr[i12];
            i11 += iArr2[i12];
        }
        if (i10 < i11) {
            return Float.POSITIVE_INFINITY;
        }
        float f11 = i10;
        float f12 = f11 / i11;
        float f13 = f10 * f12;
        float f14 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            float f15 = iArr2[i13] * f12;
            float f16 = iArr[i13];
            float f17 = f16 > f15 ? f16 - f15 : f15 - f16;
            if (f17 > f13) {
                return Float.POSITIVE_INFINITY;
            }
            f14 += f17;
        }
        return f14 / f11;
    }

    protected static void f(Ig.a aVar, int i10, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i11 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int iL = aVar.l();
        if (i10 >= iL) {
            throw NotFoundException.a();
        }
        boolean z10 = !aVar.g(i10);
        while (i10 < iL) {
            if (aVar.g(i10) != z10) {
                iArr[i11] = iArr[i11] + 1;
            } else {
                i11++;
                if (i11 == length) {
                    break;
                }
                iArr[i11] = 1;
                z10 = !z10;
            }
            i10++;
        }
        if (i11 != length) {
            if (i11 != length - 1 || i10 != iL) {
                throw NotFoundException.a();
            }
        }
    }

    protected static void g(Ig.a aVar, int i10, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        boolean zG = aVar.g(i10);
        while (i10 > 0 && length >= 0) {
            i10--;
            if (aVar.g(i10) != zG) {
                length--;
                zG = !zG;
            }
        }
        if (length >= 0) {
            throw NotFoundException.a();
        }
        f(aVar, i10 + 1, iArr);
    }

    @Override // com.google.zxing.l
    public com.google.zxing.m b(com.google.zxing.c cVar) throws NotFoundException, FormatException {
        return a(cVar, null);
    }

    public abstract com.google.zxing.m c(int i10, Ig.a aVar, Map<com.google.zxing.d, ?> map) throws NotFoundException, ChecksumException, FormatException;

    @Override // com.google.zxing.l
    public void reset() {
    }

    private com.google.zxing.m d(com.google.zxing.c cVar, Map<com.google.zxing.d, ?> map) throws NotFoundException {
        Map<com.google.zxing.d, ?> map2;
        int i10;
        int i11;
        Map<com.google.zxing.d, ?> map3 = map;
        int iD = cVar.d();
        int iC = cVar.c();
        Ig.a aVar = new Ig.a(iD);
        int i12 = 1;
        boolean z10 = map3 != null && map3.containsKey(com.google.zxing.d.TRY_HARDER);
        int iMax = Math.max(1, iC >> (z10 ? 8 : 5));
        int i13 = z10 ? iC : 15;
        int i14 = iC / 2;
        int i15 = 0;
        while (i15 < i13) {
            int i16 = i15 + 1;
            int i17 = i16 / 2;
            if ((i15 & 1) != 0) {
                i17 = -i17;
            }
            int i18 = (i17 * iMax) + i14;
            if (i18 < 0 || i18 >= iC) {
                break;
            }
            try {
                aVar = cVar.b(i18, aVar);
                int i19 = 0;
                while (i19 < 2) {
                    if (i19 == i12) {
                        aVar.p();
                        if (map3 != null) {
                            com.google.zxing.d dVar = com.google.zxing.d.NEED_RESULT_POINT_CALLBACK;
                            if (map3.containsKey(dVar)) {
                                EnumMap enumMap = new EnumMap(com.google.zxing.d.class);
                                enumMap.putAll(map3);
                                enumMap.remove(dVar);
                                map3 = enumMap;
                            }
                        }
                    }
                    try {
                        com.google.zxing.m mVarC = c(i18, aVar, map3);
                        if (i19 == i12) {
                            try {
                                mVarC.h(com.google.zxing.n.ORIENTATION, 180);
                                com.google.zxing.o[] oVarArrE = mVarC.e();
                                if (oVarArrE != null) {
                                    i11 = i12;
                                    float f10 = iD;
                                    try {
                                        map2 = map3;
                                    } catch (ReaderException unused) {
                                        map2 = map3;
                                    }
                                    try {
                                        i10 = iD;
                                        try {
                                            oVarArrE[0] = new com.google.zxing.o((f10 - oVarArrE[0].c()) - 1.0f, oVarArrE[0].d());
                                            oVarArrE[i11] = new com.google.zxing.o((f10 - oVarArrE[i11].c()) - 1.0f, oVarArrE[i11].d());
                                        } catch (ReaderException unused2) {
                                            continue;
                                            i19++;
                                            map3 = map2;
                                            i12 = i11;
                                            iD = i10;
                                        }
                                    } catch (ReaderException unused3) {
                                        i10 = iD;
                                        i19++;
                                        map3 = map2;
                                        i12 = i11;
                                        iD = i10;
                                    }
                                }
                            } catch (ReaderException unused4) {
                                map2 = map3;
                                i10 = iD;
                                i11 = i12;
                            }
                        }
                        return mVarC;
                    } catch (ReaderException unused5) {
                        map2 = map3;
                        i10 = iD;
                        i11 = i12;
                    }
                }
            } catch (NotFoundException unused6) {
            }
            i15 = i16;
            i12 = i12;
            iD = iD;
        }
        throw NotFoundException.a();
    }

    @Override // com.google.zxing.l
    public com.google.zxing.m a(com.google.zxing.c cVar, Map<com.google.zxing.d, ?> map) throws NotFoundException, FormatException {
        try {
            return d(cVar, map);
        } catch (NotFoundException e10) {
            if (map != null && map.containsKey(com.google.zxing.d.TRY_HARDER) && cVar.e()) {
                com.google.zxing.c cVarF = cVar.f();
                com.google.zxing.m mVarD = d(cVarF, map);
                Map<com.google.zxing.n, Object> mapD = mVarD.d();
                int iIntValue = 270;
                if (mapD != null) {
                    com.google.zxing.n nVar = com.google.zxing.n.ORIENTATION;
                    if (mapD.containsKey(nVar)) {
                        iIntValue = (((Integer) mapD.get(nVar)).intValue() + 270) % 360;
                    }
                }
                mVarD.h(com.google.zxing.n.ORIENTATION, Integer.valueOf(iIntValue));
                com.google.zxing.o[] oVarArrE = mVarD.e();
                if (oVarArrE != null) {
                    int iC = cVarF.c();
                    for (int i10 = 0; i10 < oVarArrE.length; i10++) {
                        oVarArrE[i10] = new com.google.zxing.o((iC - oVarArrE[i10].d()) - 1.0f, oVarArrE[i10].c());
                    }
                }
                return mVarD;
            }
            throw e10;
        }
    }
}
