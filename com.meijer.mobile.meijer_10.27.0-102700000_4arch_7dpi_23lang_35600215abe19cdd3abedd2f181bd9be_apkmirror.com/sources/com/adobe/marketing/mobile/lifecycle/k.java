package com.adobe.marketing.mobile.lifecycle;

import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
class k {

    /* renamed from: a, reason: collision with root package name */
    private final Q5.v f62585a;

    /* renamed from: b, reason: collision with root package name */
    private final long f62586b;

    /* renamed from: c, reason: collision with root package name */
    private long f62587c;

    private void d(String str, String str2) {
        Q5.v vVar = this.f62585a;
        if (vVar != null && vVar.contains(str)) {
            long j10 = this.f62585a.getLong(str, 0L);
            if (j10 > 0) {
                this.f62585a.b(str2, TimeUnit.SECONDS.toMillis(j10));
                Q5.t.e("Lifecycle", "LifecycleV2DataStoreCache", "Migrated persisted '%s' to '%s'.", str, str2);
            }
            this.f62585a.remove(str);
        }
    }

    private void e() {
        d("v2AppStartTimestamp", "v2AppStartTimestampMillis");
        d("v2AppPauseTimestamp", "v2AppPauseTimestampMillis");
        d("v2AppCloseTimestamp", "v2AppCloseTimestampMillis");
    }

    long a() {
        Q5.v vVar = this.f62585a;
        if (vVar != null) {
            return vVar.getLong("v2AppPauseTimestampMillis", 0L);
        }
        return 0L;
    }

    long b() {
        Q5.v vVar = this.f62585a;
        if (vVar != null) {
            return vVar.getLong("v2AppStartTimestampMillis", 0L);
        }
        return 0L;
    }

    long c() {
        return this.f62586b;
    }

    void f(long j10) {
        Q5.v vVar = this.f62585a;
        if (vVar != null) {
            vVar.b("v2AppPauseTimestampMillis", j10);
        }
    }

    void g(long j10) {
        Q5.v vVar = this.f62585a;
        if (vVar != null) {
            vVar.b("v2AppStartTimestampMillis", j10);
        }
    }

    void h(long j10) {
        Q5.v vVar = this.f62585a;
        if (vVar == null || j10 - this.f62587c < 2000) {
            return;
        }
        vVar.b("v2AppCloseTimestampMillis", j10);
        this.f62587c = j10;
    }

    k(Q5.v vVar) {
        this.f62585a = vVar;
        if (vVar == null) {
            Q5.t.f("Lifecycle", "LifecycleV2DataStoreCache", "%s DataStore was provided, the functionality is limited", "Unexpected Empty Value");
            this.f62586b = 0L;
        } else {
            e();
            long j10 = vVar.getLong("v2AppCloseTimestampMillis", 0L);
            this.f62586b = j10 > 0 ? j10 + 2000 : j10;
        }
    }
}
