package Pe;

import Ie.A;
import Ie.InterfaceC3732f;
import Ie.i;
import Ue.I;
import Ue.y;
import com.google.crypto.tink.internal.C11301j;
import com.google.crypto.tink.internal.G;
import com.google.crypto.tink.internal.M;
import com.google.crypto.tink.internal.x;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes7.dex */
public class f implements InterfaceC3732f {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3732f f25283a;

    /* renamed from: b, reason: collision with root package name */
    private final I f25284b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f25285c;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25286a;

        static {
            int[] iArr = new int[I.values().length];
            f25286a = iArr;
            try {
                iArr[I.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25286a[I.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25286a[I.CRUNCHY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25286a[I.TINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // Ie.InterfaceC3732f
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.f25284b == I.RAW ? this.f25283a.a(bArr, bArr2) : Ve.f.a(this.f25285c, this.f25283a.a(bArr, bArr2));
    }

    @Override // Ie.InterfaceC3732f
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (this.f25284b == I.RAW) {
            return this.f25283a.b(bArr, bArr2);
        }
        if (M.e(this.f25285c, bArr)) {
            return this.f25283a.b(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }

    private f(InterfaceC3732f interfaceC3732f, I i10, byte[] bArr) {
        this.f25283a = interfaceC3732f;
        this.f25284b = i10;
        this.f25285c = bArr;
    }

    public static InterfaceC3732f c(C11301j c11301j) throws GeneralSecurityException {
        byte[] bArrD;
        G gE = c11301j.e(i.a());
        InterfaceC3732f interfaceC3732f = (InterfaceC3732f) A.c(y.f0().y(gE.f()).z(gE.g()).x(gE.d()).build(), InterfaceC3732f.class);
        I iE = gE.e();
        int i10 = a.f25286a[iE.ordinal()];
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                if (i10 == 4) {
                    bArrD = x.b(c11301j.c().intValue()).d();
                } else {
                    throw new GeneralSecurityException("unknown output prefix type " + iE.g());
                }
            } else {
                bArrD = x.a(c11301j.c().intValue()).d();
            }
        } else {
            bArrD = x.f88234a.d();
        }
        return new f(interfaceC3732f, iE, bArrD);
    }
}
