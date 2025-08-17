package Se;

import Ie.A;
import Ie.w;
import Ue.I;
import Ue.y;
import com.google.crypto.tink.internal.C11301j;
import com.google.crypto.tink.internal.G;
import com.google.crypto.tink.internal.x;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class n implements w {

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f33598d = {0};

    /* renamed from: a, reason: collision with root package name */
    private final w f33599a;

    /* renamed from: b, reason: collision with root package name */
    private final I f33600b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f33601c;

    @Override // Ie.w
    public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 10) {
            throw new GeneralSecurityException("tag too short");
        }
        if (this.f33600b.equals(I.LEGACY)) {
            bArr2 = Ve.f.a(bArr2, f33598d);
        }
        byte[] bArr3 = new byte[0];
        if (!this.f33600b.equals(I.RAW)) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            bArr = Arrays.copyOfRange(bArr, 5, bArr.length);
            bArr3 = bArrCopyOf;
        }
        if (!Arrays.equals(this.f33601c, bArr3)) {
            throw new GeneralSecurityException("wrong prefix");
        }
        this.f33599a.a(bArr, bArr2);
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33602a;

        static {
            int[] iArr = new int[I.values().length];
            f33602a = iArr;
            try {
                iArr[I.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33602a[I.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33602a[I.CRUNCHY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33602a[I.TINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // Ie.w
    public byte[] b(byte[] bArr) throws GeneralSecurityException {
        if (this.f33600b.equals(I.LEGACY)) {
            bArr = Ve.f.a(bArr, f33598d);
        }
        return Ve.f.a(this.f33601c, this.f33599a.b(bArr));
    }

    private n(w wVar, I i10, byte[] bArr) {
        this.f33599a = wVar;
        this.f33600b = i10;
        this.f33601c = bArr;
    }

    public static w c(C11301j c11301j) throws GeneralSecurityException {
        byte[] bArrD;
        G gE = c11301j.e(Ie.i.a());
        w wVar = (w) A.c(y.f0().y(gE.f()).z(gE.g()).x(gE.d()).build(), w.class);
        I iE = gE.e();
        int i10 = a.f33602a[iE.ordinal()];
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                if (i10 == 4) {
                    bArrD = x.b(c11301j.c().intValue()).d();
                } else {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
            } else {
                bArrD = x.a(c11301j.c().intValue()).d();
            }
        } else {
            bArrD = x.f88234a.d();
        }
        return new n(wVar, iE, bArrD);
    }
}
