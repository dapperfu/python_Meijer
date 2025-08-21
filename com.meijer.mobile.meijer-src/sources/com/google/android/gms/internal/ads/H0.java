package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class H0 {

    /* renamed from: a, reason: collision with root package name */
    private final GQ f68158a = new GQ(10);

    public final C8776lb a(InterfaceC9361r0 interfaceC9361r0, C8617k2 c8617k2) throws IOException {
        C8776lb c8776lbA = null;
        int i10 = 0;
        while (true) {
            try {
                interfaceC9361r0.g(this.f68158a.n(), 0, 10);
                this.f68158a.l(0);
                if (this.f68158a.E() != 4801587) {
                    break;
                }
                this.f68158a.m(3);
                int iB = this.f68158a.B();
                int i11 = iB + 10;
                if (c8776lbA == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f68158a.n(), 0, bArr, 0, 10);
                    interfaceC9361r0.g(bArr, 10, iB);
                    c8776lbA = C8831m2.a(bArr, i11, c8617k2, new N1());
                } else {
                    interfaceC9361r0.zzg(iB);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        interfaceC9361r0.zzj();
        interfaceC9361r0.zzg(i10);
        return c8776lbA;
    }
}
