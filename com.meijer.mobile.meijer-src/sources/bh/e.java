package bh;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Map;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final Kg.c f60388a = new Kg.c(Kg.a.f16619l);

    private int a(byte[] bArr, int i10) throws ChecksumException {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        try {
            int iA = this.f60388a.a(iArr, bArr.length - i10);
            for (int i12 = 0; i12 < i10; i12++) {
                bArr[i12] = (byte) iArr[i12];
            }
            return iA;
        } catch (ReedSolomonException unused) {
            throw ChecksumException.a();
        }
    }

    public Ig.e b(Ig.b bVar, Map<com.google.zxing.d, ?> map) throws ChecksumException, FormatException {
        ChecksumException e10;
        C6387a c6387a = new C6387a(bVar);
        FormatException formatException = null;
        try {
            return c(c6387a, map);
        } catch (ChecksumException e11) {
            e10 = e11;
            try {
                c6387a.f();
                c6387a.g(true);
                c6387a.e();
                c6387a.d();
                c6387a.b();
                Ig.e eVarC = c(c6387a, map);
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
            c6387a.f();
            c6387a.g(true);
            c6387a.e();
            c6387a.d();
            c6387a.b();
            Ig.e eVarC2 = c(c6387a, map);
            eVarC2.p(new i(true));
            return eVarC2;
        }
    }

    private Ig.e c(C6387a c6387a, Map<com.google.zxing.d, ?> map) throws ChecksumException, FormatException {
        j jVarE = c6387a.e();
        f fVarD = c6387a.d().d();
        C6388b[] c6388bArrB = C6388b.b(c6387a.c(), jVarE, fVarD);
        int iC = 0;
        for (C6388b c6388b : c6388bArrB) {
            iC += c6388b.c();
        }
        byte[] bArr = new byte[iC];
        int iA = 0;
        int i10 = 0;
        for (C6388b c6388b2 : c6388bArrB) {
            byte[] bArrA = c6388b2.a();
            int iC2 = c6388b2.c();
            iA += a(bArrA, iC2);
            int i11 = 0;
            while (i11 < iC2) {
                bArr[i10] = bArrA[i11];
                i11++;
                i10++;
            }
        }
        Ig.e eVarA = d.a(bArr, jVarE, fVarD, map);
        eVarA.n(Integer.valueOf(iA));
        return eVarA;
    }
}
