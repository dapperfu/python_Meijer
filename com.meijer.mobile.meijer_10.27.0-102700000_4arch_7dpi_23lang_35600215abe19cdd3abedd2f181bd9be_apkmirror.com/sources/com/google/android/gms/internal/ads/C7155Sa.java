package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Sa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7155Sa extends AbstractCallableC7691cb {

    /* renamed from: h, reason: collision with root package name */
    private List f70123h;

    /* renamed from: i, reason: collision with root package name */
    private final Context f70124i;

    public C7155Sa(C8863na c8863na, String str, String str2, C8611l8 c8611l8, int i10, int i11, Context context) {
        super(c8863na, "fN18KlRCFMPT8X1qMJmuHpIW+XVsrRSfMnh+5QiArw3xyALVJ87b0VfJ0mW1R0L9", "GJYSDgYrAgCxY14XYxunZiSr8dTk91g66tw4qbpYxV8=", c8611l8, i10, 31);
        this.f70123h = null;
        this.f70124i = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7691cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        this.f73204d.U(-1L);
        this.f73204d.P(-1L);
        Context contextB = this.f70124i;
        if (contextB == null) {
            contextB = this.f73201a.b();
        }
        if (this.f70123h == null) {
            this.f70123h = (List) this.f73205e.invoke(null, contextB);
        }
        List list = this.f70123h;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.f73204d) {
            this.f73204d.U(((Long) this.f70123h.get(0)).longValue());
            this.f73204d.P(((Long) this.f70123h.get(1)).longValue());
        }
    }
}
