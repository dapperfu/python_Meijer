package com.google.android.gms.internal.pal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes6.dex */
public final class B4 extends L4 {

    /* renamed from: i, reason: collision with root package name */
    private final boolean f82490i;

    public B4(X3 x32, String str, String str2, Ya ya2, int i10, int i11) {
        super(x32, "RjfRn/7K/Mx2/M8Fl6a7u1D5niklht4X0VG1cOixOa4SuaPG6Qd7la4v6f0IM/MO", "cZ2qwY2ZIJRch325gepGJtH7dQ9IcqmfWvaHdfiFi6Y=", ya2, i10, 61);
        this.f82490i = x32.s();
    }

    @Override // com.google.android.gms.internal.pal.L4
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.f82744f.invoke(null, this.f82740b.b(), Boolean.valueOf(this.f82490i))).longValue();
        synchronized (this.f82743e) {
            this.f82743e.r(jLongValue);
        }
    }
}
