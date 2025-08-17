package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class H0 {

    /* renamed from: a, reason: collision with root package name */
    private final GQ f67318a = new GQ(10);

    public final C8651lb a(InterfaceC9236r0 interfaceC9236r0, C8492k2 c8492k2) throws IOException {
        C8651lb c8651lbA = null;
        int i10 = 0;
        while (true) {
            try {
                interfaceC9236r0.g(this.f67318a.n(), 0, 10);
                this.f67318a.l(0);
                if (this.f67318a.E() != 4801587) {
                    break;
                }
                this.f67318a.m(3);
                int iB = this.f67318a.B();
                int i11 = iB + 10;
                if (c8651lbA == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f67318a.n(), 0, bArr, 0, 10);
                    interfaceC9236r0.g(bArr, 10, iB);
                    c8651lbA = C8706m2.a(bArr, i11, c8492k2, new N1());
                } else {
                    interfaceC9236r0.zzg(iB);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        interfaceC9236r0.zzj();
        interfaceC9236r0.zzg(i10);
        return c8651lbA;
    }
}
