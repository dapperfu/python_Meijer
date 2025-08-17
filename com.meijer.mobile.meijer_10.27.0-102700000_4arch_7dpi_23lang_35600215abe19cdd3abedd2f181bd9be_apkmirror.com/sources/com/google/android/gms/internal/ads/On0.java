package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class On0 implements InterfaceC9418sk0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9418sk0 f69178a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f69179b;

    public static InterfaceC9418sk0 b(InterfaceC9418sk0 interfaceC9418sk0, Et0 et0) {
        return new On0(interfaceC9418sk0, et0.c());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9418sk0
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f69179b;
        if (bArr3.length == 0) {
            return this.f69178a.zza(bArr, bArr2);
        }
        if (Hp0.c(bArr3, bArr)) {
            return this.f69178a.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }

    private On0(InterfaceC9418sk0 interfaceC9418sk0, byte[] bArr) {
        this.f69178a = interfaceC9418sk0;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.f69179b = bArr;
    }

    public static InterfaceC9418sk0 a(C9961xo0 c9961xo0) throws GeneralSecurityException {
        byte[] bArrC;
        C9749vp0 c9749vp0A = c9961xo0.a(Bk0.a());
        Wr0 wr0B0 = Zr0.b0();
        wr0B0.v(c9749vp0A.f());
        wr0B0.w(c9749vp0A.d());
        wr0B0.u(c9749vp0A.b());
        InterfaceC9418sk0 interfaceC9418sk0 = (InterfaceC9418sk0) Tk0.b((Zr0) wr0B0.p(), InterfaceC9418sk0.class);
        Es0 es0C = c9749vp0A.c();
        int iOrdinal = es0C.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(es0C)));
                    }
                    bArrC = Yo0.a(c9961xo0.b().intValue()).c();
                } else {
                    bArrC = Yo0.f71613a.c();
                }
            } else {
                bArrC = Yo0.a(c9961xo0.b().intValue()).c();
            }
        } else {
            bArrC = Yo0.b(c9961xo0.b().intValue()).c();
        }
        return new On0(interfaceC9418sk0, bArrC);
    }
}
