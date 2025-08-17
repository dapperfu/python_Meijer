package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Ea, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6680Ea extends AbstractCallableC7691cb {

    /* renamed from: h, reason: collision with root package name */
    private final long f66485h;

    public C6680Ea(C8863na c8863na, String str, String str2, C8611l8 c8611l8, long j10, int i10, int i11) {
        super(c8863na, "y3qsDqWUxj+0NW9GzaLLQcml0WYfJuDlvc/LrtwTbAkNDXLpsSYbwYlOmoW50beE", "vyPJQ44Cs+DiV597MU4yHYF5mAH0rpjmfJE+rEowUe0=", c8611l8, i10, 25);
        this.f66485h = j10;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7691cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.f73205e.invoke(null, null)).longValue();
        synchronized (this.f73204d) {
            try {
                this.f73204d.A0(jLongValue);
                long j10 = this.f66485h;
                if (j10 != 0) {
                    this.f73204d.Q(jLongValue - j10);
                    this.f73204d.R(this.f66485h);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
