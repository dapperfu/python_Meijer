package Ue;

import Ke.A;
import Ke.w;
import We.I;
import We.y;
import com.google.crypto.tink.internal.C11426j;
import com.google.crypto.tink.internal.G;
import com.google.crypto.tink.internal.x;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class n implements w {

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f37474d = {0};

    /* renamed from: a, reason: collision with root package name */
    private final w f37475a;

    /* renamed from: b, reason: collision with root package name */
    private final I f37476b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f37477c;

    @Override // Ke.w
    public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 10) {
            throw new GeneralSecurityException("tag too short");
        }
        if (this.f37476b.equals(I.LEGACY)) {
            bArr2 = Xe.f.a(bArr2, f37474d);
        }
        byte[] bArr3 = new byte[0];
        if (!this.f37476b.equals(I.RAW)) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            bArr = Arrays.copyOfRange(bArr, 5, bArr.length);
            bArr3 = bArrCopyOf;
        }
        if (!Arrays.equals(this.f37477c, bArr3)) {
            throw new GeneralSecurityException("wrong prefix");
        }
        this.f37475a.a(bArr, bArr2);
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37478a;

        static {
            int[] iArr = new int[I.values().length];
            f37478a = iArr;
            try {
                iArr[I.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37478a[I.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37478a[I.CRUNCHY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37478a[I.TINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // Ke.w
    public byte[] b(byte[] bArr) throws GeneralSecurityException {
        if (this.f37476b.equals(I.LEGACY)) {
            bArr = Xe.f.a(bArr, f37474d);
        }
        return Xe.f.a(this.f37477c, this.f37475a.b(bArr));
    }

    private n(w wVar, I i10, byte[] bArr) {
        this.f37475a = wVar;
        this.f37476b = i10;
        this.f37477c = bArr;
    }

    public static w c(C11426j c11426j) throws GeneralSecurityException {
        byte[] bArrD;
        G gE = c11426j.e(Ke.i.a());
        w wVar = (w) A.c(y.f0().y(gE.f()).z(gE.g()).x(gE.d()).build(), w.class);
        I iE = gE.e();
        int i10 = a.f37478a[iE.ordinal()];
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                if (i10 == 4) {
                    bArrD = x.b(c11426j.c().intValue()).d();
                } else {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
            } else {
                bArrD = x.a(c11426j.c().intValue()).d();
            }
        } else {
            bArrD = x.f89074a.d();
        }
        return new n(wVar, iE, bArrD);
    }
}
