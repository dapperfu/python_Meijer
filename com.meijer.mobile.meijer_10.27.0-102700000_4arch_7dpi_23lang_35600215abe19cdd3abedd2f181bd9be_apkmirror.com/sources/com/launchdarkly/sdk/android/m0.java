package com.launchdarkly.sdk.android;

import com.launchdarkly.sdk.android.J;
import com.launchdarkly.sdk.json.SerializationException;
import ih.C14724c;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import mh.InterfaceC15630k;
import nh.AbstractC15796a;

/* loaded from: classes7.dex */
final class m0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15630k f91223a;

    /* renamed from: b, reason: collision with root package name */
    private final C14724c f91224b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f91225c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private Map<com.launchdarkly.sdk.d, String> f91226d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f91227e = new AtomicBoolean(false);

    final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f91228a;

        a(String str) {
            this.f91228a = "LaunchDarkly_" + i0.j(str);
        }

        public b a() {
            LDFailure lDFailure;
            Long lO = m0.this.o(this.f91228a, "lastSuccessfulConnection");
            Long lO2 = m0.this.o(this.f91228a, "lastFailedConnection");
            String strN = m0.this.n(this.f91228a, "lastFailure");
            if (strN != null) {
                try {
                    lDFailure = (LDFailure) AbstractC15796a.a().o(strN, LDFailure.class);
                } catch (Exception unused) {
                }
            } else {
                lDFailure = null;
            }
            return new b(lO, lO2, lDFailure);
        }

        public EnvironmentData b(String str) {
            m0 m0Var = m0.this;
            String strN = m0Var.n(this.f91228a, m0Var.j(str));
            if (strN == null) {
                return null;
            }
            try {
                return EnvironmentData.a(strN);
            } catch (SerializationException unused) {
                return null;
            }
        }

        public J c() {
            String strN = m0.this.n(this.f91228a, "index");
            try {
                return strN == null ? new J() : J.a(strN);
            } catch (SerializationException unused) {
                return null;
            }
        }

        public Long d(String str, String str2) {
            m0 m0Var = m0.this;
            if (!Objects.equals(m0Var.n(this.f91228a, m0Var.i(str)), str2)) {
                return null;
            }
            for (J.b bVar : c().f91073a) {
                if (bVar.f91075a.equals(str)) {
                    return Long.valueOf(bVar.f91076b);
                }
            }
            return null;
        }

        public void e(String str) {
            m0 m0Var = m0.this;
            m0Var.p(this.f91228a, m0Var.j(str), null);
            m0 m0Var2 = m0.this;
            m0Var2.p(this.f91228a, m0Var2.i(str), null);
        }

        public void f(b bVar) {
            HashMap map = new HashMap();
            Long l10 = bVar.f91230a;
            map.put("lastSuccessfulConnection", l10 == null ? null : String.valueOf(l10));
            Long l11 = bVar.f91231b;
            map.put("lastFailedConnection", l11 == null ? null : String.valueOf(l11));
            map.put("lastFailure", bVar.f91232c != null ? AbstractC15796a.a().x(bVar.f91232c) : null);
            m0.this.q(this.f91228a, map);
        }

        public void g(String str, String str2, EnvironmentData environmentData) {
            m0 m0Var = m0.this;
            m0Var.p(this.f91228a, m0Var.j(str), environmentData.d());
            m0 m0Var2 = m0.this;
            m0Var2.p(this.f91228a, m0Var2.i(str), str2);
        }

        public void h(J j10) {
            m0.this.p(this.f91228a, "index", j10.c());
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        final Long f91230a;

        /* renamed from: b, reason: collision with root package name */
        final Long f91231b;

        /* renamed from: c, reason: collision with root package name */
        final LDFailure f91232c;

        b(Long l10, Long l11, LDFailure lDFailure) {
            this.f91230a = l10;
            this.f91231b = l11;
            this.f91232c = lDFailure;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String i(String str) {
        return "contextFingerprint_" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String j(String str) {
        return "flags_" + str;
    }

    private void k(Exception exc) {
        if (this.f91227e.getAndSet(true)) {
            return;
        }
        i0.c(this.f91224b, exc, "Failure in persistent data store", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String n(String str, String str2) {
        String strD;
        try {
            synchronized (this.f91225c) {
                strD = this.f91223a.d(str, str2);
            }
            return strD;
        } catch (Exception e10) {
            k(e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(String str, String str2, String str3) {
        try {
            synchronized (this.f91225c) {
                this.f91223a.a(str, str2, str3);
            }
        } catch (Exception e10) {
            k(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(String str, Map<String, String> map) {
        try {
            synchronized (this.f91225c) {
                this.f91223a.c(str, map);
            }
        } catch (Exception e10) {
            k(e10);
        }
    }

    public String h(final com.launchdarkly.sdk.d dVar) {
        synchronized (this.f91226d) {
            try {
                String str = this.f91226d.get(dVar);
                if (str != null) {
                    return str;
                }
                String strN = n("LaunchDarkly", "anonKey_" + dVar.toString());
                if (strN != null) {
                    this.f91226d.put(dVar, strN);
                    return strN;
                }
                final String string = UUID.randomUUID().toString();
                this.f91226d.put(dVar, string);
                this.f91224b.k("Did not find a generated key for context kind \"{}\". Generating a new one: {}", dVar, string);
                new Thread(new Runnable() { // from class: com.launchdarkly.sdk.android.l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        m0.a(this.f91219a, dVar, string);
                    }
                }).run();
                return string;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public a l(String str) {
        return new a(str);
    }

    public void m(com.launchdarkly.sdk.d dVar, String str) {
        p("LaunchDarkly", "anonKey_" + dVar.toString(), str);
    }

    public m0(InterfaceC15630k interfaceC15630k, C14724c c14724c) {
        this.f91223a = interfaceC15630k;
        this.f91224b = c14724c;
    }

    public static /* synthetic */ void a(m0 m0Var, com.launchdarkly.sdk.d dVar, String str) {
        m0Var.getClass();
        m0Var.p("LaunchDarkly", "anonKey_" + dVar.toString(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Long o(String str, String str2) {
        String strN = n(str, str2);
        if (strN == null) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strN));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
