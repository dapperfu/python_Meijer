package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ia, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6941Ia extends AbstractCallableC7816cb {

    /* renamed from: h, reason: collision with root package name */
    private final Map f68485h;

    /* renamed from: i, reason: collision with root package name */
    private final View f68486i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f68487j;

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7816cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = {c(1), c(2)};
        Context contextB = this.f68487j;
        if (contextB == null) {
            contextB = this.f74041a.b();
        }
        long[] jArr2 = (long[]) this.f74045e.invoke(null, jArr, contextB, this.f68486i);
        long j10 = jArr2[0];
        this.f68485h.put(1, Long.valueOf(jArr2[1]));
        long j11 = jArr2[2];
        this.f68485h.put(2, Long.valueOf(jArr2[3]));
        synchronized (this.f74044d) {
            this.f74044d.C0(j10);
            this.f74044d.B0(j11);
        }
    }

    public C6941Ia(C8988na c8988na, String str, String str2, C8736l8 c8736l8, int i10, int i11, Map map, View view, Context context) {
        super(c8988na, "SGrqoKjotUFKi0Pm8mPdGLEIFA6B5bcdqpg0gya/IITzjxrSi23eKYMffqn0zLlM", "JlPicGd8nbcQ8ZbmhNqFQR3s817OLQa0+uauZ8OF17M=", c8736l8, i10, 85);
        this.f68485h = map;
        this.f68486i = view;
        this.f68487j = context;
    }

    private final long c(int i10) {
        Map map = this.f68485h;
        Integer numValueOf = Integer.valueOf(i10);
        if (map.containsKey(numValueOf)) {
            return ((Long) this.f68485h.get(numValueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }
}
