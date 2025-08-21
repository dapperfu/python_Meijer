package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Ha, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6907Ha extends AbstractCallableC7816cb {

    /* renamed from: h, reason: collision with root package name */
    private final C9095oa f68304h;

    public C6907Ha(C8988na c8988na, String str, String str2, C8736l8 c8736l8, int i10, int i11, C9095oa c9095oa) {
        super(c8988na, "e9GN1ULeRXoIWzbGPleyg0VqwusIk+Y8UB0jj4l1lcVfEVgEFoeRxD7pvq3YAOeu", "j+KOJWcuW5eAeYurIvI/WDWaxjjVmMhwZuok18XlZ7Q=", c8736l8, i10, 85);
        this.f68304h = c9095oa;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7816cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = (long[]) this.f74045e.invoke(null, Long.valueOf(this.f68304h.d()), Long.valueOf(this.f68304h.h()), Long.valueOf(this.f68304h.b()), Long.valueOf(this.f68304h.f()));
        synchronized (this.f74044d) {
            this.f74044d.C0(jArr[0]);
            this.f74044d.B0(jArr[1]);
        }
    }
}
