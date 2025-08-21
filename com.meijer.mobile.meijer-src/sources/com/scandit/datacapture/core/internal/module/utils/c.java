package com.scandit.datacapture.core.internal.module.utils;

import java.util.LinkedHashMap;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final double f126271a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f126272b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public double f126273c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f126274d;

    public final void a(long j10, long j11) {
        Long l10 = (Long) this.f126272b.remove(new e(j10));
        if (l10 != null) {
            long jLongValue = j11 - l10.longValue();
            if (!this.f126274d) {
                this.f126273c = jLongValue;
                this.f126274d = true;
            } else {
                double d10 = this.f126273c;
                double d11 = this.f126271a;
                this.f126273c = ((1.0d - d11) * jLongValue) + (d10 * d11);
            }
        }
    }

    public c(double d10) {
        this.f126271a = d10;
    }
}
