package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Ya, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7480Ya extends AbstractCallableC7816cb {
    public C7480Ya(C8988na c8988na, String str, String str2, C8736l8 c8736l8, int i10, int i11) {
        super(c8988na, "rKSUjmRV/NKsFlHbU0cho8FUC8WVx3Rlxhld5Ju7IE8ltyxUVL0g87xJ7LkJDCm6", "KIfx7EUeWhnA+aC9P4Mk2uzmdiZwzAWUKm+DIiGxj24=", c8736l8, i10, 48);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7816cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        this.f74044d.g0(3);
        boolean zBooleanValue = ((Boolean) this.f74045e.invoke(null, this.f74041a.b())).booleanValue();
        synchronized (this.f74044d) {
            try {
                if (zBooleanValue) {
                    this.f74044d.g0(2);
                } else {
                    this.f74044d.g0(1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
