package Ke;

import Ie.InterfaceC3727a;
import com.google.crypto.tink.internal.C11301j;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes7.dex */
public class J implements InterfaceC3727a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3727a f16465a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f16466b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16467a;

        static {
            int[] iArr = new int[Ue.I.values().length];
            f16467a = iArr;
            try {
                iArr[Ue.I.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16467a[Ue.I.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16467a[Ue.I.CRUNCHY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16467a[Ue.I.TINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static InterfaceC3727a c(InterfaceC3727a interfaceC3727a, We.a aVar) {
        return new J(interfaceC3727a, aVar.d());
    }

    @Override // Ie.InterfaceC3727a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f16466b;
        return bArr3.length == 0 ? this.f16465a.a(bArr, bArr2) : Ve.f.a(bArr3, this.f16465a.a(bArr, bArr2));
    }

    @Override // Ie.InterfaceC3727a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f16466b;
        if (bArr3.length == 0) {
            return this.f16465a.b(bArr, bArr2);
        }
        if (com.google.crypto.tink.internal.M.e(bArr3, bArr)) {
            return this.f16465a.b(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }

    private J(InterfaceC3727a interfaceC3727a, byte[] bArr) {
        this.f16465a = interfaceC3727a;
        if (bArr.length != 0 && bArr.length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.f16466b = bArr;
    }

    public static InterfaceC3727a d(C11301j c11301j) throws GeneralSecurityException {
        byte[] bArrD;
        com.google.crypto.tink.internal.G gE = c11301j.e(Ie.i.a());
        InterfaceC3727a interfaceC3727a = (InterfaceC3727a) Ie.A.c(Ue.y.f0().y(gE.f()).z(gE.g()).x(gE.d()).build(), InterfaceC3727a.class);
        Ue.I iE = gE.e();
        int i10 = a.f16467a[iE.ordinal()];
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                if (i10 == 4) {
                    bArrD = com.google.crypto.tink.internal.x.b(c11301j.c().intValue()).d();
                } else {
                    throw new GeneralSecurityException("unknown output prefix type " + iE);
                }
            } else {
                bArrD = com.google.crypto.tink.internal.x.a(c11301j.c().intValue()).d();
            }
        } else {
            bArrD = com.google.crypto.tink.internal.x.f88234a.d();
        }
        return new J(interfaceC3727a, bArrD);
    }
}
