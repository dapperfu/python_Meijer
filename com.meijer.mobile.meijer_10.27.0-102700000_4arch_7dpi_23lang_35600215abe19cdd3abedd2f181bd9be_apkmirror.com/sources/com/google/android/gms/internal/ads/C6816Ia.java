package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ia, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6816Ia extends AbstractCallableC7691cb {

    /* renamed from: h, reason: collision with root package name */
    private final Map f67645h;

    /* renamed from: i, reason: collision with root package name */
    private final View f67646i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f67647j;

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7691cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = {c(1), c(2)};
        Context contextB = this.f67647j;
        if (contextB == null) {
            contextB = this.f73201a.b();
        }
        long[] jArr2 = (long[]) this.f73205e.invoke(null, jArr, contextB, this.f67646i);
        long j10 = jArr2[0];
        this.f67645h.put(1, Long.valueOf(jArr2[1]));
        long j11 = jArr2[2];
        this.f67645h.put(2, Long.valueOf(jArr2[3]));
        synchronized (this.f73204d) {
            this.f73204d.C0(j10);
            this.f73204d.B0(j11);
        }
    }

    public C6816Ia(C8863na c8863na, String str, String str2, C8611l8 c8611l8, int i10, int i11, Map map, View view, Context context) {
        super(c8863na, "SGrqoKjotUFKi0Pm8mPdGLEIFA6B5bcdqpg0gya/IITzjxrSi23eKYMffqn0zLlM", "JlPicGd8nbcQ8ZbmhNqFQR3s817OLQa0+uauZ8OF17M=", c8611l8, i10, 85);
        this.f67645h = map;
        this.f67646i = view;
        this.f67647j = context;
    }

    private final long c(int i10) {
        Map map = this.f67645h;
        Integer numValueOf = Integer.valueOf(i10);
        if (map.containsKey(numValueOf)) {
            return ((Long) this.f67645h.get(numValueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }
}
