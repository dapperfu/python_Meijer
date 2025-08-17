package com.google.android.gms.internal.pal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes6.dex */
public final class D4 extends L4 {
    public D4(X3 x32, String str, String str2, Ya ya2, int i10, int i11) {
        super(x32, "sdX902x/AS9226TxUXaqji9wP1uHqRQA8nkg2YMN1TcruTTaw008l9z5V3jZGjLO", "z3i9M2k4RJ/f7GArNBcGbUcpUFpuRmLev6S20UO7Vqs=", ya2, i10, 51);
    }

    @Override // com.google.android.gms.internal.pal.L4
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        synchronized (this.f82743e) {
            S3 s32 = new S3((String) this.f82744f.invoke(null, null));
            this.f82743e.p0(s32.f82865b.longValue());
            this.f82743e.r0(s32.f82866c.longValue());
        }
    }
}
