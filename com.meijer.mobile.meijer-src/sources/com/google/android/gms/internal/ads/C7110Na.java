package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Na, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7110Na extends AbstractCallableC7816cb {

    /* renamed from: h, reason: collision with root package name */
    private final R9 f69745h;

    /* renamed from: i, reason: collision with root package name */
    private final long f69746i;

    /* renamed from: j, reason: collision with root package name */
    private final long f69747j;

    public C7110Na(C8988na c8988na, String str, String str2, C8736l8 c8736l8, int i10, int i11, R9 r92, long j10, long j11) {
        super(c8988na, "zUKUGG1J4yK7pnB9K1G7a+rMPaRfdLvCWmWciVr52bCNv8jFIuRDvr12EhyQDayB", "c80TveimhHTg47yq+ca1w6vXt+JXULmGO8Nz62+yMN8=", c8736l8, i10, 11);
        this.f69745h = r92;
        this.f69746i = j10;
        this.f69747j = j11;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7816cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        R9 r92 = this.f69745h;
        if (r92 != null) {
            P9 p92 = new P9((String) this.f74045e.invoke(null, r92.b(), Long.valueOf(this.f69746i), Long.valueOf(this.f69747j)));
            synchronized (this.f74044d) {
                try {
                    this.f74044d.G0(p92.f70123b.longValue());
                    if (p92.f70124c.longValue() >= 0) {
                        this.f74044d.N(p92.f70124c.longValue());
                    }
                    if (p92.f70125d.longValue() >= 0) {
                        this.f74044d.l0(p92.f70125d.longValue());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
