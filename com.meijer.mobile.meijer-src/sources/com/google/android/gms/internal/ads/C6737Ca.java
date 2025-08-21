package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Ca, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6737Ca extends AbstractCallableC7816cb {
    public C6737Ca(C8988na c8988na, String str, String str2, C8736l8 c8736l8, int i10, int i11) {
        super(c8988na, "BI30n3J1CRcYA+VG0+4MYT6iqJe6ygS/jaP36BUmRAco9FZAzOIaWUnrLPPOeEgd", "opDPFauVb4cwnfQzDqDp9yn5NlOrrzIvgPDGrYZmcXE=", c8736l8, i10, 5);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7816cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        this.f74044d.t0(-1L);
        this.f74044d.s0(-1L);
        int[] iArr = (int[]) this.f74045e.invoke(null, this.f74041a.b());
        synchronized (this.f74044d) {
            try {
                this.f74044d.t0(iArr[0]);
                this.f74044d.s0(iArr[1]);
                int i10 = iArr[2];
                if (i10 != Integer.MIN_VALUE) {
                    this.f74044d.q0(i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
