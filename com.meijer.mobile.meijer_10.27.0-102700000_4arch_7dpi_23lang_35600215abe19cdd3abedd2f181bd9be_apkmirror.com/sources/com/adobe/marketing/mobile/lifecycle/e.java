package com.adobe.marketing.mobile.lifecycle;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    private final Q5.v f62564a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f62565b;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final long f62566a;

        /* renamed from: b, reason: collision with root package name */
        private final long f62567b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f62568c;

        long a() {
            return this.f62567b;
        }

        long b() {
            return this.f62566a;
        }

        boolean c() {
            return this.f62568c;
        }

        a(long j10, long j11, boolean z10) {
            this.f62566a = j10;
            this.f62567b = j11;
            this.f62568c = z10;
        }
    }

    Map<String, String> a(long j10, long j11, a aVar) {
        HashMap map = new HashMap();
        if (this.f62564a == null) {
            Q5.t.a("Lifecycle", "LifecycleSession", "%s (data store), Failed to get session length data", "Unexpected Null Value");
            return map;
        }
        if (aVar == null) {
            Q5.t.a("Lifecycle", "LifecycleSession", "%s (previous session info), Failed to get session length data", "Unexpected Null Value");
            return map;
        }
        long jA = j10 - aVar.a();
        long jA2 = aVar.a() - aVar.b();
        if (jA < j11) {
            return map;
        }
        if (jA2 <= 0 || jA2 >= com.adobe.marketing.mobile.lifecycle.a.f62555a) {
            map.put("ignoredsessionlength", Long.toString(jA2));
            return map;
        }
        map.put("prevsessionlength", Long.toString(jA2));
        return map;
    }

    void b(long j10) {
        Q5.v vVar = this.f62564a;
        if (vVar == null) {
            Q5.t.a("Lifecycle", "LifecycleSession", "Failed to pause session, %s (persisted data)", "Unexpected Null Value");
            return;
        }
        vVar.f("SuccessfulClose", true);
        this.f62564a.b("PauseDate", j10);
        Q5.t.e("Lifecycle", "LifecycleSession", "Lifecycle session paused", new Object[0]);
        this.f62565b = false;
    }

    a c(long j10, long j11, Map<String, String> map) {
        if (this.f62565b) {
            return null;
        }
        Q5.v vVar = this.f62564a;
        if (vVar == null) {
            Q5.t.a("Lifecycle", "LifecycleSession", "Failed to start session, %s (persisted data)", "Unexpected Null Value");
            return null;
        }
        this.f62565b = true;
        long j12 = vVar.getLong("SessionStart", 0L);
        long j13 = this.f62564a.getLong("PauseDate", 0L);
        boolean z10 = !this.f62564a.getBoolean("SuccessfulClose", true);
        if (j13 > 0) {
            long j14 = j10 - j13;
            if (j14 < j11 && j12 > 0) {
                this.f62564a.b("SessionStart", j12 + j14);
                this.f62564a.f("SuccessfulClose", false);
                this.f62564a.remove("PauseDate");
                return null;
            }
        }
        this.f62564a.b("SessionStart", j10);
        this.f62564a.remove("PauseDate");
        this.f62564a.f("SuccessfulClose", false);
        this.f62564a.c("Launches", this.f62564a.getInt("Launches", 0) + 1);
        this.f62564a.d("OsVersion", map.get("osversion"));
        this.f62564a.d("AppId", map.get("appid"));
        Q5.t.e("Lifecycle", "LifecycleSession", "New lifecycle session started", new Object[0]);
        return new a(j12, j13, z10);
    }

    e(Q5.v vVar) {
        this.f62564a = vVar;
    }
}
