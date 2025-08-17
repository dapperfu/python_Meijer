package com.google.android.gms.internal.pal;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.pal.s4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10884s4 extends L4 {

    /* renamed from: i, reason: collision with root package name */
    private final Map f84036i;

    /* renamed from: j, reason: collision with root package name */
    private final View f84037j;

    @Override // com.google.android.gms.internal.pal.L4
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = (long[]) this.f82744f.invoke(null, new long[]{c(1), c(2)}, this.f82740b.b(), this.f84037j);
        long j10 = jArr[0];
        this.f84036i.put(1, Long.valueOf(jArr[1]));
        long j11 = jArr[2];
        this.f84036i.put(2, Long.valueOf(jArr[3]));
        synchronized (this.f82743e) {
            this.f82743e.w0(j10);
            this.f82743e.v0(j11);
        }
    }

    public C10884s4(X3 x32, String str, String str2, Ya ya2, int i10, int i11, Map map, View view) {
        super(x32, "RKC3mFMqGi7xOgQ7s39JMoZe9bnzGCFipcdUUf0vlgHDkBg7SvMkVmBGpwLs06ia", "8Xr1ilYJHo+oWZQAYAG91DIHBuqEmXK8yHtxL6KkyfU=", ya2, i10, 85);
        this.f84036i = map;
        this.f84037j = view;
    }

    private final long c(int i10) {
        Map map = this.f84036i;
        Integer numValueOf = Integer.valueOf(i10);
        if (map.containsKey(numValueOf)) {
            return ((Long) this.f84036i.get(numValueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }
}
