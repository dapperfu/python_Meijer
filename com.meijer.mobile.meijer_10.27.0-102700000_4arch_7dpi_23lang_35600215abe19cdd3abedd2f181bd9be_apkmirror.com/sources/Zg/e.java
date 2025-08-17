package Zg;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Map;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final Ig.c f42721a = new Ig.c(Ig.a.f13873l);

    private int a(byte[] bArr, int i10) throws ChecksumException {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        try {
            int iA = this.f42721a.a(iArr, bArr.length - i10);
            for (int i12 = 0; i12 < i10; i12++) {
                bArr[i12] = (byte) iArr[i12];
            }
            return iA;
        } catch (ReedSolomonException unused) {
            throw ChecksumException.a();
        }
    }

    public Gg.e b(Gg.b bVar, Map<com.google.zxing.d, ?> map) throws ChecksumException, FormatException {
        ChecksumException e10;
        a aVar = new a(bVar);
        FormatException formatException = null;
        try {
            return c(aVar, map);
        } catch (ChecksumException e11) {
            e10 = e11;
            try {
                aVar.f();
                aVar.g(true);
                aVar.e();
                aVar.d();
                aVar.b();
                Gg.e eVarC = c(aVar, map);
                eVarC.p(new i(true));
                return eVarC;
            } catch (ChecksumException | FormatException unused) {
                if (formatException != null) {
                    throw formatException;
                }
                throw e10;
            }
        } catch (FormatException e12) {
            e10 = null;
            formatException = e12;
            aVar.f();
            aVar.g(true);
            aVar.e();
            aVar.d();
            aVar.b();
            Gg.e eVarC2 = c(aVar, map);
            eVarC2.p(new i(true));
            return eVarC2;
        }
    }

    private Gg.e c(a aVar, Map<com.google.zxing.d, ?> map) throws ChecksumException, FormatException {
        j jVarE = aVar.e();
        f fVarD = aVar.d().d();
        b[] bVarArrB = b.b(aVar.c(), jVarE, fVarD);
        int iC = 0;
        for (b bVar : bVarArrB) {
            iC += bVar.c();
        }
        byte[] bArr = new byte[iC];
        int iA = 0;
        int i10 = 0;
        for (b bVar2 : bVarArrB) {
            byte[] bArrA = bVar2.a();
            int iC2 = bVar2.c();
            iA += a(bArrA, iC2);
            int i11 = 0;
            while (i11 < iC2) {
                bArr[i10] = bArrA[i11];
                i11++;
                i10++;
            }
        }
        Gg.e eVarA = d.a(bArr, jVarE, fVarD, map);
        eVarA.n(Integer.valueOf(iA));
        return eVarA;
    }
}
