package com.scandit.datacapture.core.internal.module.utils;

import java.util.LinkedHashMap;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final double f125319a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f125320b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public double f125321c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f125322d;

    public final void a(long j10, long j11) {
        Long l10 = (Long) this.f125320b.remove(new e(j10));
        if (l10 != null) {
            long jLongValue = j11 - l10.longValue();
            if (!this.f125322d) {
                this.f125321c = jLongValue;
                this.f125322d = true;
            } else {
                double d10 = this.f125321c;
                double d11 = this.f125319a;
                this.f125321c = ((1.0d - d11) * jLongValue) + (d10 * d11);
            }
        }
    }

    public c(double d10) {
        this.f125319a = d10;
    }
}
