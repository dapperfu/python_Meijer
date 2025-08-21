package com.launchdarkly.sdk.android;

import com.launchdarkly.sdk.android.J;
import com.launchdarkly.sdk.json.SerializationException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import jh.C15034c;
import nh.InterfaceC15953k;
import oh.AbstractC16130a;

/* loaded from: classes8.dex */
final class m0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15953k f92062a;

    /* renamed from: b, reason: collision with root package name */
    private final C15034c f92063b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f92064c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private Map<com.launchdarkly.sdk.d, String> f92065d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f92066e = new AtomicBoolean(false);

    final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f92067a;

        a(String str) {
            this.f92067a = "LaunchDarkly_" + i0.j(str);
        }

        public b a() {
            LDFailure lDFailure;
            Long lO = m0.this.o(this.f92067a, "lastSuccessfulConnection");
            Long lO2 = m0.this.o(this.f92067a, "lastFailedConnection");
            String strN = m0.this.n(this.f92067a, "lastFailure");
            if (strN != null) {
                try {
                    lDFailure = (LDFailure) AbstractC16130a.a().o(strN, LDFailure.class);
                } catch (Exception unused) {
                }
            } else {
                lDFailure = null;
            }
            return new b(lO, lO2, lDFailure);
        }

        public EnvironmentData b(String str) {
            m0 m0Var = m0.this;
            String strN = m0Var.n(this.f92067a, m0Var.j(str));
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
            String strN = m0.this.n(this.f92067a, "index");
            try {
                return strN == null ? new J() : J.a(strN);
            } catch (SerializationException unused) {
                return null;
            }
        }

        public Long d(String str, String str2) {
            m0 m0Var = m0.this;
            if (!Objects.equals(m0Var.n(this.f92067a, m0Var.i(str)), str2)) {
                return null;
            }
            for (J.b bVar : c().f91912a) {
                if (bVar.f91914a.equals(str)) {
                    return Long.valueOf(bVar.f91915b);
                }
            }
            return null;
        }

        public void e(String str) {
            m0 m0Var = m0.this;
            m0Var.p(this.f92067a, m0Var.j(str), null);
            m0 m0Var2 = m0.this;
            m0Var2.p(this.f92067a, m0Var2.i(str), null);
        }

        public void f(b bVar) {
            HashMap map = new HashMap();
            Long l10 = bVar.f92069a;
            map.put("lastSuccessfulConnection", l10 == null ? null : String.valueOf(l10));
            Long l11 = bVar.f92070b;
            map.put("lastFailedConnection", l11 == null ? null : String.valueOf(l11));
            map.put("lastFailure", bVar.f92071c != null ? AbstractC16130a.a().x(bVar.f92071c) : null);
            m0.this.q(this.f92067a, map);
        }

        public void g(String str, String str2, EnvironmentData environmentData) {
            m0 m0Var = m0.this;
            m0Var.p(this.f92067a, m0Var.j(str), environmentData.d());
            m0 m0Var2 = m0.this;
            m0Var2.p(this.f92067a, m0Var2.i(str), str2);
        }

        public void h(J j10) {
            m0.this.p(this.f92067a, "index", j10.c());
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        final Long f92069a;

        /* renamed from: b, reason: collision with root package name */
        final Long f92070b;

        /* renamed from: c, reason: collision with root package name */
        final LDFailure f92071c;

        b(Long l10, Long l11, LDFailure lDFailure) {
            this.f92069a = l10;
            this.f92070b = l11;
            this.f92071c = lDFailure;
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
        if (this.f92066e.getAndSet(true)) {
            return;
        }
        i0.c(this.f92063b, exc, "Failure in persistent data store", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String n(String str, String str2) {
        String strD;
        try {
            synchronized (this.f92064c) {
                strD = this.f92062a.d(str, str2);
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
            synchronized (this.f92064c) {
                this.f92062a.a(str, str2, str3);
            }
        } catch (Exception e10) {
            k(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(String str, Map<String, String> map) {
        try {
            synchronized (this.f92064c) {
                this.f92062a.c(str, map);
            }
        } catch (Exception e10) {
            k(e10);
        }
    }

    public String h(final com.launchdarkly.sdk.d dVar) {
        synchronized (this.f92065d) {
            try {
                String str = this.f92065d.get(dVar);
                if (str != null) {
                    return str;
                }
                String strN = n("LaunchDarkly", "anonKey_" + dVar.toString());
                if (strN != null) {
                    this.f92065d.put(dVar, strN);
                    return strN;
                }
                final String string = UUID.randomUUID().toString();
                this.f92065d.put(dVar, string);
                this.f92063b.k("Did not find a generated key for context kind \"{}\". Generating a new one: {}", dVar, string);
                new Thread(new Runnable() { // from class: com.launchdarkly.sdk.android.l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        m0.a(this.f92058a, dVar, string);
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

    public m0(InterfaceC15953k interfaceC15953k, C15034c c15034c) {
        this.f92062a = interfaceC15953k;
        this.f92063b = c15034c;
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
