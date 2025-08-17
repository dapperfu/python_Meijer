package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Ya, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7355Ya extends AbstractCallableC7691cb {
    public C7355Ya(C8863na c8863na, String str, String str2, C8611l8 c8611l8, int i10, int i11) {
        super(c8863na, "rKSUjmRV/NKsFlHbU0cho8FUC8WVx3Rlxhld5Ju7IE8ltyxUVL0g87xJ7LkJDCm6", "KIfx7EUeWhnA+aC9P4Mk2uzmdiZwzAWUKm+DIiGxj24=", c8611l8, i10, 48);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7691cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        this.f73204d.g0(3);
        boolean zBooleanValue = ((Boolean) this.f73205e.invoke(null, this.f73201a.b())).booleanValue();
        synchronized (this.f73204d) {
            try {
                if (zBooleanValue) {
                    this.f73204d.g0(2);
                } else {
                    this.f73204d.g0(1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
