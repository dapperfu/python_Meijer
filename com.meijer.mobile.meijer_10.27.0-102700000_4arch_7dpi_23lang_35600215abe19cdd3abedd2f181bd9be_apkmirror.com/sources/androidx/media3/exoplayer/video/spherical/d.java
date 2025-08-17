package androidx.media3.exoplayer.video.spherical;

import androidx.media3.exoplayer.video.spherical.c;
import d3.C;
import d3.D;
import d3.P;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
final class d {
    private static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >> 1);
    }

    private static boolean c(D d10) {
        d10.X(4);
        int iQ = d10.q();
        d10.W(0);
        return iQ == 1886547818;
    }

    public static c a(byte[] bArr, int i10) {
        ArrayList<c.a> arrayListF;
        D d10 = new D(bArr);
        try {
            arrayListF = c(d10) ? f(d10) : e(d10);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayListF = null;
        }
        if (arrayListF == null) {
            return null;
        }
        int size = arrayListF.size();
        if (size == 1) {
            return new c(arrayListF.get(0), i10);
        }
        if (size != 2) {
            return null;
        }
        return new c(arrayListF.get(0), arrayListF.get(1), i10);
    }

    private static ArrayList<c.a> f(D d10) {
        int iQ;
        d10.X(8);
        int iF = d10.f();
        int iG = d10.g();
        while (iF < iG && (iQ = d10.q() + iF) > iF && iQ <= iG) {
            int iQ2 = d10.q();
            if (iQ2 == 2037673328 || iQ2 == 1836279920) {
                d10.V(iQ);
                return e(d10);
            }
            d10.W(iQ);
            iF = iQ;
        }
        return null;
    }

    private static ArrayList<c.a> g(D d10) {
        ArrayList<c.a> arrayList = new ArrayList<>();
        int iF = d10.f();
        int iG = d10.g();
        while (iF < iG) {
            int iQ = d10.q() + iF;
            if (iQ <= iF || iQ > iG) {
                return null;
            }
            if (d10.q() == 1835365224) {
                c.a aVarD = d(d10);
                if (aVarD == null) {
                    return null;
                }
                arrayList.add(aVarD);
            }
            d10.W(iQ);
            iF = iQ;
        }
        return arrayList;
    }

    private static c.a d(D d10) {
        int iQ = d10.q();
        c.a aVar = null;
        if (iQ > 10000) {
            return null;
        }
        float[] fArr = new float[iQ];
        for (int i10 = 0; i10 < iQ; i10++) {
            fArr[i10] = d10.p();
        }
        int iQ2 = d10.q();
        if (iQ2 > 32000) {
            return null;
        }
        double d11 = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(iQ * 2.0d) / dLog);
        C c10 = new C(d10.e());
        int i11 = 8;
        c10.p(d10.f() * 8);
        float[] fArr2 = new float[iQ2 * 5];
        int[] iArr = new int[5];
        int i12 = 0;
        int i13 = 0;
        while (i12 < iQ2) {
            c.a aVar2 = aVar;
            int i14 = 0;
            while (i14 < 5) {
                int iB = iArr[i14] + b(c10.h(iCeil));
                if (iB < iQ && iB >= 0) {
                    fArr2[i13] = fArr[iB];
                    iArr[i14] = iB;
                    i14++;
                    i13++;
                } else {
                    return aVar2;
                }
            }
            i12++;
            aVar = aVar2;
        }
        c.a aVar3 = aVar;
        c10.p((c10.e() + 7) & (-8));
        int i15 = 32;
        int iH = c10.h(32);
        c.b[] bVarArr = new c.b[iH];
        int i16 = 0;
        while (i16 < iH) {
            int iH2 = c10.h(i11);
            int iH3 = c10.h(i11);
            int iH4 = c10.h(i15);
            if (iH4 > 128000) {
                return aVar3;
            }
            int i17 = iH;
            int iCeil2 = (int) Math.ceil(Math.log(iQ2 * d11) / dLog);
            float[] fArr3 = new float[iH4 * 3];
            float[] fArr4 = new float[iH4 * 2];
            int i18 = 0;
            int i19 = 0;
            while (i18 < iH4) {
                int iB2 = i19 + b(c10.h(iCeil2));
                if (iB2 >= 0 && iB2 < iQ2) {
                    int i20 = i18 * 3;
                    int i21 = iB2 * 5;
                    fArr3[i20] = fArr2[i21];
                    fArr3[i20 + 1] = fArr2[i21 + 1];
                    fArr3[i20 + 2] = fArr2[i21 + 2];
                    int i22 = i18 * 2;
                    fArr4[i22] = fArr2[i21 + 3];
                    fArr4[i22 + 1] = fArr2[i21 + 4];
                    i18++;
                    i19 = iB2;
                } else {
                    return aVar3;
                }
            }
            bVarArr[i16] = new c.b(iH2, fArr3, fArr4, iH3);
            i16++;
            iH = i17;
            i15 = 32;
            d11 = 2.0d;
            i11 = 8;
        }
        return new c.a(bVarArr);
    }

    private static ArrayList<c.a> e(D d10) {
        if (d10.H() != 0) {
            return null;
        }
        d10.X(7);
        int iQ = d10.q();
        if (iQ == 1684433976) {
            D d11 = new D();
            Inflater inflater = new Inflater(true);
            try {
                if (!P.x0(d10, d11, inflater)) {
                    return null;
                }
                inflater.end();
                d10 = d11;
            } finally {
                inflater.end();
            }
        } else if (iQ != 1918990112) {
            return null;
        }
        return g(d10);
    }
}
