package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Ea, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6805Ea extends AbstractCallableC7816cb {

    /* renamed from: h, reason: collision with root package name */
    private final long f67325h;

    public C6805Ea(C8988na c8988na, String str, String str2, C8736l8 c8736l8, long j10, int i10, int i11) {
        super(c8988na, "y3qsDqWUxj+0NW9GzaLLQcml0WYfJuDlvc/LrtwTbAkNDXLpsSYbwYlOmoW50beE", "vyPJQ44Cs+DiV597MU4yHYF5mAH0rpjmfJE+rEowUe0=", c8736l8, i10, 25);
        this.f67325h = j10;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7816cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.f74045e.invoke(null, null)).longValue();
        synchronized (this.f74044d) {
            try {
                this.f74044d.A0(jLongValue);
                long j10 = this.f67325h;
                if (j10 != 0) {
                    this.f74044d.Q(jLongValue - j10);
                    this.f74044d.R(this.f67325h);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
