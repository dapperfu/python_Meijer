package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Ca, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6612Ca extends AbstractCallableC7691cb {
    public C6612Ca(C8863na c8863na, String str, String str2, C8611l8 c8611l8, int i10, int i11) {
        super(c8863na, "BI30n3J1CRcYA+VG0+4MYT6iqJe6ygS/jaP36BUmRAco9FZAzOIaWUnrLPPOeEgd", "opDPFauVb4cwnfQzDqDp9yn5NlOrrzIvgPDGrYZmcXE=", c8611l8, i10, 5);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7691cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        this.f73204d.t0(-1L);
        this.f73204d.s0(-1L);
        int[] iArr = (int[]) this.f73205e.invoke(null, this.f73201a.b());
        synchronized (this.f73204d) {
            try {
                this.f73204d.t0(iArr[0]);
                this.f73204d.s0(iArr[1]);
                int i10 = iArr[2];
                if (i10 != Integer.MIN_VALUE) {
                    this.f73204d.r0(i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
