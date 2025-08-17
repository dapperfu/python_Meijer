package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Ha, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6782Ha extends AbstractCallableC7691cb {

    /* renamed from: h, reason: collision with root package name */
    private final C8970oa f67464h;

    public C6782Ha(C8863na c8863na, String str, String str2, C8611l8 c8611l8, int i10, int i11, C8970oa c8970oa) {
        super(c8863na, "e9GN1ULeRXoIWzbGPleyg0VqwusIk+Y8UB0jj4l1lcVfEVgEFoeRxD7pvq3YAOeu", "j+KOJWcuW5eAeYurIvI/WDWaxjjVmMhwZuok18XlZ7Q=", c8611l8, i10, 85);
        this.f67464h = c8970oa;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7691cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = (long[]) this.f73205e.invoke(null, Long.valueOf(this.f67464h.d()), Long.valueOf(this.f67464h.h()), Long.valueOf(this.f67464h.b()), Long.valueOf(this.f67464h.f()));
        synchronized (this.f73204d) {
            this.f73204d.C0(jArr[0]);
            this.f73204d.B0(jArr[1]);
        }
    }
}
