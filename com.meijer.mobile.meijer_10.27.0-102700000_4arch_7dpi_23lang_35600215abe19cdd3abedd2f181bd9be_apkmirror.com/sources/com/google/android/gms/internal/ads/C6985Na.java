package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Na, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6985Na extends AbstractCallableC7691cb {

    /* renamed from: h, reason: collision with root package name */
    private final R9 f68905h;

    /* renamed from: i, reason: collision with root package name */
    private final long f68906i;

    /* renamed from: j, reason: collision with root package name */
    private final long f68907j;

    public C6985Na(C8863na c8863na, String str, String str2, C8611l8 c8611l8, int i10, int i11, R9 r92, long j10, long j11) {
        super(c8863na, "zUKUGG1J4yK7pnB9K1G7a+rMPaRfdLvCWmWciVr52bCNv8jFIuRDvr12EhyQDayB", "c80TveimhHTg47yq+ca1w6vXt+JXULmGO8Nz62+yMN8=", c8611l8, i10, 11);
        this.f68905h = r92;
        this.f68906i = j10;
        this.f68907j = j11;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7691cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        R9 r92 = this.f68905h;
        if (r92 != null) {
            P9 p92 = new P9((String) this.f73205e.invoke(null, r92.b(), Long.valueOf(this.f68906i), Long.valueOf(this.f68907j)));
            synchronized (this.f73204d) {
                try {
                    this.f73204d.G0(p92.f69283b.longValue());
                    if (p92.f69284c.longValue() >= 0) {
                        this.f73204d.N(p92.f69284c.longValue());
                    }
                    if (p92.f69285d.longValue() >= 0) {
                        this.f73204d.l0(p92.f69285d.longValue());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
