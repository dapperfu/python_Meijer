package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class On0 implements InterfaceC9543sk0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9543sk0 f70018a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f70019b;

    public static InterfaceC9543sk0 b(InterfaceC9543sk0 interfaceC9543sk0, Et0 et0) {
        return new On0(interfaceC9543sk0, et0.c());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9543sk0
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f70019b;
        if (bArr3.length == 0) {
            return this.f70018a.zza(bArr, bArr2);
        }
        if (Hp0.c(bArr3, bArr)) {
            return this.f70018a.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }

    private On0(InterfaceC9543sk0 interfaceC9543sk0, byte[] bArr) {
        this.f70018a = interfaceC9543sk0;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.f70019b = bArr;
    }

    public static InterfaceC9543sk0 a(C10086xo0 c10086xo0) throws GeneralSecurityException {
        byte[] bArrC;
        C9874vp0 c9874vp0A = c10086xo0.a(Bk0.a());
        Wr0 wr0B0 = Zr0.b0();
        wr0B0.v(c9874vp0A.f());
        wr0B0.w(c9874vp0A.d());
        wr0B0.u(c9874vp0A.b());
        InterfaceC9543sk0 interfaceC9543sk0 = (InterfaceC9543sk0) Tk0.b((Zr0) wr0B0.p(), InterfaceC9543sk0.class);
        Es0 es0C = c9874vp0A.c();
        int iOrdinal = es0C.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(es0C)));
                    }
                    bArrC = Yo0.a(c10086xo0.b().intValue()).c();
                } else {
                    bArrC = Yo0.f72453a.c();
                }
            } else {
                bArrC = Yo0.a(c10086xo0.b().intValue()).c();
            }
        } else {
            bArrC = Yo0.b(c10086xo0.b().intValue()).c();
        }
        return new On0(interfaceC9543sk0, bArrC);
    }
}
