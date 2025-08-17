package com.google.android.gms.internal.pal;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.pal.p4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10837p4 extends L4 {

    /* renamed from: i, reason: collision with root package name */
    private final long f83277i;

    public C10837p4(X3 x32, String str, String str2, Ya ya2, long j10, int i10, int i11) {
        super(x32, "zwwnNjW/9dn+p0q/2u+mmA6XQB8+gtknmtJMKP3tBmoncBehPCILsKxRnck9yFjA", "vpqgk7W2OO4+emKKnTSxckIsP1c64LGVSWcdsnDvr3w=", ya2, i10, 25);
        this.f83277i = j10;
    }

    @Override // com.google.android.gms.internal.pal.L4
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.f82744f.invoke(null, null)).longValue();
        synchronized (this.f82743e) {
            try {
                this.f82743e.u0(jLongValue);
                long j10 = this.f83277i;
                if (j10 != 0) {
                    this.f82743e.L(jLongValue - j10);
                    this.f82743e.M(this.f83277i);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
