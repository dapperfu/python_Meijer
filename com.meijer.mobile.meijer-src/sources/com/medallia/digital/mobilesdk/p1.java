package com.medallia.digital.mobilesdk;

import android.app.ActivityManager;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes8.dex */
class p1 extends y5<Long> {

    /* renamed from: k, reason: collision with root package name */
    private static final int f93530k = 100;

    protected p1(x5 x5Var, n0 n0Var) {
        super(x5Var, n0Var);
    }

    private long s() {
        ActivityManager.MemoryInfo memoryInfoH = this.f94464g.h();
        if (memoryInfoH == null) {
            a4.c("MemoryInfo is null");
            return 0L;
        }
        long j10 = memoryInfoH.totalMem;
        long j11 = j10 - memoryInfoH.availMem;
        if (j11 == 0) {
            return 0L;
        }
        return (long) ((j11 / j10) * 100.0d);
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f93772d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.y5
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Long j() {
        long jS = s();
        a4.b(String.format(Locale.US, "Collectors > Used memory: %d%%", Long.valueOf(jS)));
        return Long.valueOf(jS);
    }
}
