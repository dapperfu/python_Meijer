package Re;

import Ke.A;
import Ke.InterfaceC3891f;
import Ke.i;
import We.I;
import We.y;
import com.google.crypto.tink.internal.C11426j;
import com.google.crypto.tink.internal.G;
import com.google.crypto.tink.internal.M;
import com.google.crypto.tink.internal.x;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes8.dex */
public class f implements InterfaceC3891f {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3891f f32497a;

    /* renamed from: b, reason: collision with root package name */
    private final I f32498b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f32499c;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f32500a;

        static {
            int[] iArr = new int[I.values().length];
            f32500a = iArr;
            try {
                iArr[I.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32500a[I.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32500a[I.CRUNCHY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32500a[I.TINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // Ke.InterfaceC3891f
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.f32498b == I.RAW ? this.f32497a.a(bArr, bArr2) : Xe.f.a(this.f32499c, this.f32497a.a(bArr, bArr2));
    }

    @Override // Ke.InterfaceC3891f
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (this.f32498b == I.RAW) {
            return this.f32497a.b(bArr, bArr2);
        }
        if (M.e(this.f32499c, bArr)) {
            return this.f32497a.b(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }

    private f(InterfaceC3891f interfaceC3891f, I i10, byte[] bArr) {
        this.f32497a = interfaceC3891f;
        this.f32498b = i10;
        this.f32499c = bArr;
    }

    public static InterfaceC3891f c(C11426j c11426j) throws GeneralSecurityException {
        byte[] bArrD;
        G gE = c11426j.e(i.a());
        InterfaceC3891f interfaceC3891f = (InterfaceC3891f) A.c(y.f0().y(gE.f()).z(gE.g()).x(gE.d()).build(), InterfaceC3891f.class);
        I iE = gE.e();
        int i10 = a.f32500a[iE.ordinal()];
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                if (i10 == 4) {
                    bArrD = x.b(c11426j.c().intValue()).d();
                } else {
                    throw new GeneralSecurityException("unknown output prefix type " + iE.g());
                }
            } else {
                bArrD = x.a(c11426j.c().intValue()).d();
            }
        } else {
            bArrD = x.f89074a.d();
        }
        return new f(interfaceC3891f, iE, bArrD);
    }
}
