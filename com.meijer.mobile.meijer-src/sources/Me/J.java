package Me;

import Ke.InterfaceC3886a;
import com.google.crypto.tink.internal.C11426j;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes8.dex */
public class J implements InterfaceC3886a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3886a f19824a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f19825b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19826a;

        static {
            int[] iArr = new int[We.I.values().length];
            f19826a = iArr;
            try {
                iArr[We.I.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19826a[We.I.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19826a[We.I.CRUNCHY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19826a[We.I.TINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static InterfaceC3886a c(InterfaceC3886a interfaceC3886a, Ye.a aVar) {
        return new J(interfaceC3886a, aVar.d());
    }

    @Override // Ke.InterfaceC3886a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f19825b;
        return bArr3.length == 0 ? this.f19824a.a(bArr, bArr2) : Xe.f.a(bArr3, this.f19824a.a(bArr, bArr2));
    }

    @Override // Ke.InterfaceC3886a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f19825b;
        if (bArr3.length == 0) {
            return this.f19824a.b(bArr, bArr2);
        }
        if (com.google.crypto.tink.internal.M.e(bArr3, bArr)) {
            return this.f19824a.b(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }

    private J(InterfaceC3886a interfaceC3886a, byte[] bArr) {
        this.f19824a = interfaceC3886a;
        if (bArr.length != 0 && bArr.length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.f19825b = bArr;
    }

    public static InterfaceC3886a d(C11426j c11426j) throws GeneralSecurityException {
        byte[] bArrD;
        com.google.crypto.tink.internal.G gE = c11426j.e(Ke.i.a());
        InterfaceC3886a interfaceC3886a = (InterfaceC3886a) Ke.A.c(We.y.f0().y(gE.f()).z(gE.g()).x(gE.d()).build(), InterfaceC3886a.class);
        We.I iE = gE.e();
        int i10 = a.f19826a[iE.ordinal()];
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                if (i10 == 4) {
                    bArrD = com.google.crypto.tink.internal.x.b(c11426j.c().intValue()).d();
                } else {
                    throw new GeneralSecurityException("unknown output prefix type " + iE);
                }
            } else {
                bArrD = com.google.crypto.tink.internal.x.a(c11426j.c().intValue()).d();
            }
        } else {
            bArrD = com.google.crypto.tink.internal.x.f89074a.d();
        }
        return new J(interfaceC3886a, bArrD);
    }
}
