package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Sa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7280Sa extends AbstractCallableC7816cb {

    /* renamed from: h, reason: collision with root package name */
    private List f70963h;

    /* renamed from: i, reason: collision with root package name */
    private final Context f70964i;

    public C7280Sa(C8988na c8988na, String str, String str2, C8736l8 c8736l8, int i10, int i11, Context context) {
        super(c8988na, "fN18KlRCFMPT8X1qMJmuHpIW+XVsrRSfMnh+5QiArw3xyALVJ87b0VfJ0mW1R0L9", "GJYSDgYrAgCxY14XYxunZiSr8dTk91g66tw4qbpYxV8=", c8736l8, i10, 31);
        this.f70963h = null;
        this.f70964i = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7816cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        this.f74044d.U(-1L);
        this.f74044d.P(-1L);
        Context contextB = this.f70964i;
        if (contextB == null) {
            contextB = this.f74041a.b();
        }
        if (this.f70963h == null) {
            this.f70963h = (List) this.f74045e.invoke(null, contextB);
        }
        List list = this.f70963h;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.f74044d) {
            this.f74044d.U(((Long) this.f70963h.get(0)).longValue());
            this.f74044d.P(((Long) this.f70963h.get(1)).longValue());
        }
    }
}
