package com.adobe.marketing.mobile.lifecycle;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    private final R5.v f63403a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f63404b;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final long f63405a;

        /* renamed from: b, reason: collision with root package name */
        private final long f63406b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f63407c;

        long a() {
            return this.f63406b;
        }

        long b() {
            return this.f63405a;
        }

        boolean c() {
            return this.f63407c;
        }

        a(long j10, long j11, boolean z10) {
            this.f63405a = j10;
            this.f63406b = j11;
            this.f63407c = z10;
        }
    }

    Map<String, String> a(long j10, long j11, a aVar) {
        HashMap map = new HashMap();
        if (this.f63403a == null) {
            R5.t.a("Lifecycle", "LifecycleSession", "%s (data store), Failed to get session length data", "Unexpected Null Value");
            return map;
        }
        if (aVar == null) {
            R5.t.a("Lifecycle", "LifecycleSession", "%s (previous session info), Failed to get session length data", "Unexpected Null Value");
            return map;
        }
        long jA = j10 - aVar.a();
        long jA2 = aVar.a() - aVar.b();
        if (jA < j11) {
            return map;
        }
        if (jA2 <= 0 || jA2 >= com.adobe.marketing.mobile.lifecycle.a.f63394a) {
            map.put("ignoredsessionlength", Long.toString(jA2));
            return map;
        }
        map.put("prevsessionlength", Long.toString(jA2));
        return map;
    }

    void b(long j10) {
        R5.v vVar = this.f63403a;
        if (vVar == null) {
            R5.t.a("Lifecycle", "LifecycleSession", "Failed to pause session, %s (persisted data)", "Unexpected Null Value");
            return;
        }
        vVar.f("SuccessfulClose", true);
        this.f63403a.b("PauseDate", j10);
        R5.t.e("Lifecycle", "LifecycleSession", "Lifecycle session paused", new Object[0]);
        this.f63404b = false;
    }

    a c(long j10, long j11, Map<String, String> map) {
        if (this.f63404b) {
            return null;
        }
        R5.v vVar = this.f63403a;
        if (vVar == null) {
            R5.t.a("Lifecycle", "LifecycleSession", "Failed to start session, %s (persisted data)", "Unexpected Null Value");
            return null;
        }
        this.f63404b = true;
        long j12 = vVar.getLong("SessionStart", 0L);
        long j13 = this.f63403a.getLong("PauseDate", 0L);
        boolean z10 = !this.f63403a.getBoolean("SuccessfulClose", true);
        if (j13 > 0) {
            long j14 = j10 - j13;
            if (j14 < j11 && j12 > 0) {
                this.f63403a.b("SessionStart", j12 + j14);
                this.f63403a.f("SuccessfulClose", false);
                this.f63403a.remove("PauseDate");
                return null;
            }
        }
        this.f63403a.b("SessionStart", j10);
        this.f63403a.remove("PauseDate");
        this.f63403a.f("SuccessfulClose", false);
        this.f63403a.c("Launches", this.f63403a.getInt("Launches", 0) + 1);
        this.f63403a.d("OsVersion", map.get("osversion"));
        this.f63403a.d("AppId", map.get("appid"));
        R5.t.e("Lifecycle", "LifecycleSession", "New lifecycle session started", new Object[0]);
        return new a(j12, j13, z10);
    }

    e(R5.v vVar) {
        this.f63403a = vVar;
    }
}
