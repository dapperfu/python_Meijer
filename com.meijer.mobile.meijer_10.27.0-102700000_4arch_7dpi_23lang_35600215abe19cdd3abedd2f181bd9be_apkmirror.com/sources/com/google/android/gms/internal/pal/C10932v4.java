package com.google.android.gms.internal.pal;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.pal.v4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10932v4 extends L4 {

    /* renamed from: i, reason: collision with root package name */
    private final D3 f84141i;

    /* renamed from: j, reason: collision with root package name */
    private final long f84142j;

    /* renamed from: k, reason: collision with root package name */
    private final long f84143k;

    public C10932v4(X3 x32, String str, String str2, Ya ya2, int i10, int i11, D3 d32, long j10, long j11) {
        super(x32, "X9PgbTHLX0FFxbl3gdPDuVwcglfXy5CDrzo8siaVNaH+OIJ6JI34Wu3QK5rLega4", "JLulXGPEHVwHK+0FG96HP9my+NvwpTQbwIaIZrjn9OU=", ya2, i10, 11);
        this.f84141i = d32;
        this.f84142j = j10;
        this.f84143k = j11;
    }

    @Override // com.google.android.gms.internal.pal.L4
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        D3 d32 = this.f84141i;
        if (d32 != null) {
            B3 b32 = new B3((String) this.f82744f.invoke(null, d32.a(), Long.valueOf(this.f84142j), Long.valueOf(this.f84143k)));
            synchronized (this.f82743e) {
                try {
                    this.f82743e.A0(b32.f82487b.longValue());
                    if (b32.f82488c.longValue() >= 0) {
                        this.f82743e.I(b32.f82488c.longValue());
                    }
                    if (b32.f82489d.longValue() >= 0) {
                        this.f82743e.f0(b32.f82489d.longValue());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
