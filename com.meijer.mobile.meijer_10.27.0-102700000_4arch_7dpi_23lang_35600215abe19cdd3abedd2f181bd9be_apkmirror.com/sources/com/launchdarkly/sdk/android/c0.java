package com.launchdarkly.sdk.android;

import ih.AbstractC14727f;
import ih.EnumC14723b;
import ih.InterfaceC14722a;
import java.util.HashMap;
import java.util.Map;
import kh.AbstractC15157k;
import kh.AbstractC15163q;
import kh.AbstractC15166t;
import kh.C15151e;
import lh.C15409a;
import mh.C15620a;
import mh.C15628i;
import mh.C15629j;
import mh.C15631l;
import mh.InterfaceC15623d;
import mh.InterfaceC15624e;
import mh.InterfaceC15627h;
import mh.InterfaceC15630k;

/* loaded from: classes7.dex */
public class c0 {

    /* renamed from: s, reason: collision with root package name */
    static final EnumC14723b f91155s = EnumC14723b.INFO;

    /* renamed from: t, reason: collision with root package name */
    static final okhttp3.j f91156t = okhttp3.j.g("application/json; charset=utf-8");

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f91157a;

    /* renamed from: b, reason: collision with root package name */
    final C15409a f91158b;

    /* renamed from: c, reason: collision with root package name */
    final C15620a f91159c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC15623d<InterfaceC15624e> f91160d;

    /* renamed from: e, reason: collision with root package name */
    final InterfaceC15623d<InterfaceC15627h> f91161e;

    /* renamed from: f, reason: collision with root package name */
    final C15628i f91162f;

    /* renamed from: g, reason: collision with root package name */
    final C15631l f91163g;

    /* renamed from: h, reason: collision with root package name */
    final InterfaceC15623d<C15629j> f91164h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f91165i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f91166j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f91167k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f91168l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f91169m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC14722a f91170n;

    /* renamed from: o, reason: collision with root package name */
    private final String f91171o;

    /* renamed from: p, reason: collision with root package name */
    private final int f91172p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f91173q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC15630k f91174r;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f91175a;

        /* renamed from: b, reason: collision with root package name */
        private Map<String, String> f91176b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC15166t f91177c;

        /* renamed from: o, reason: collision with root package name */
        private boolean f91189o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f91190p;

        /* renamed from: q, reason: collision with root package name */
        private InterfaceC15630k f91191q;

        /* renamed from: d, reason: collision with root package name */
        private C15151e f91178d = null;

        /* renamed from: e, reason: collision with root package name */
        private InterfaceC15623d<InterfaceC15624e> f91179e = null;

        /* renamed from: f, reason: collision with root package name */
        private InterfaceC15623d<InterfaceC15627h> f91180f = null;

        /* renamed from: g, reason: collision with root package name */
        private AbstractC15157k f91181g = null;

        /* renamed from: h, reason: collision with root package name */
        private AbstractC15163q f91182h = null;

        /* renamed from: i, reason: collision with root package name */
        private InterfaceC15623d<C15629j> f91183i = null;

        /* renamed from: j, reason: collision with root package name */
        private int f91184j = 5;

        /* renamed from: k, reason: collision with root package name */
        private boolean f91185k = false;

        /* renamed from: l, reason: collision with root package name */
        private boolean f91186l = false;

        /* renamed from: m, reason: collision with root package name */
        private boolean f91187m = false;

        /* renamed from: n, reason: collision with root package name */
        private boolean f91188n = false;

        /* renamed from: r, reason: collision with root package name */
        private InterfaceC14722a f91192r = b();

        /* renamed from: s, reason: collision with root package name */
        private String f91193s = "LaunchDarklySdk";

        /* renamed from: t, reason: collision with root package name */
        private EnumC14723b f91194t = null;

        /* renamed from: com.launchdarkly.sdk.android.c0$a$a, reason: collision with other inner class name */
        public enum EnumC1302a {
            Enabled,
            Disabled
        }

        public c0 a() {
            InterfaceC14722a interfaceC14722a = this.f91192r;
            EnumC14723b enumC14723b = this.f91194t;
            if (enumC14723b == null) {
                enumC14723b = c0.f91155s;
            }
            InterfaceC14722a interfaceC14722aA = AbstractC14727f.a(interfaceC14722a, enumC14723b);
            HashMap map = this.f91176b == null ? new HashMap() : new HashMap(this.f91176b);
            map.put("default", this.f91175a);
            AbstractC15166t abstractC15166tF = this.f91177c;
            if (abstractC15166tF == null) {
                abstractC15166tF = AbstractC11558t.f();
            }
            C15409a c15409aA = abstractC15166tF.a();
            C15151e c15151e = this.f91178d;
            C15620a c15620aI = c15151e == null ? null : c15151e.i();
            InterfaceC15623d interfaceC15623dG = this.f91179e;
            if (interfaceC15623dG == null) {
                interfaceC15623dG = AbstractC11558t.g();
            }
            InterfaceC15623d interfaceC15623d = interfaceC15623dG;
            InterfaceC15623d interfaceC15623dE = this.f91180f;
            if (interfaceC15623dE == null) {
                interfaceC15623dE = AbstractC11558t.e();
            }
            InterfaceC15623d interfaceC15623d2 = interfaceC15623dE;
            AbstractC15157k abstractC15157kA = this.f91181g;
            if (abstractC15157kA == null) {
                abstractC15157kA = AbstractC11558t.a();
            }
            C15628i c15628iA = abstractC15157kA.a();
            AbstractC15163q abstractC15163qC = this.f91182h;
            if (abstractC15163qC == null) {
                abstractC15163qC = AbstractC11558t.c();
            }
            C15631l c15631lA = abstractC15163qC.a();
            InterfaceC15623d interfaceC15623dB = this.f91183i;
            if (interfaceC15623dB == null) {
                interfaceC15623dB = AbstractC11558t.b();
            }
            return new c0(map, c15409aA, c15620aI, interfaceC15623d, interfaceC15623d2, c15628iA, c15631lA, interfaceC15623dB, this.f91185k, this.f91186l, this.f91188n, this.f91187m, this.f91184j, this.f91189o, this.f91190p, this.f91191q, interfaceC14722aA, this.f91193s);
        }

        public a c(boolean z10) {
            this.f91188n = z10;
            return this;
        }

        public a d(boolean z10) {
            this.f91189o = z10;
            return this;
        }

        public a e(String str) {
            Map<String, String> map = this.f91176b;
            if (map != null && map.containsValue(str)) {
                throw new IllegalArgumentException("The primary environment key cannot be in the secondary mobile keys.");
            }
            this.f91175a = str;
            return this;
        }

        public a(EnumC1302a enumC1302a) {
            this.f91190p = false;
            this.f91190p = enumC1302a == EnumC1302a.Enabled;
        }

        private static InterfaceC14722a b() {
            return h0.a();
        }
    }

    boolean a() {
        return this.f91165i;
    }

    InterfaceC14722a b() {
        return this.f91170n;
    }

    String c() {
        return this.f91171o;
    }

    int d() {
        return this.f91172p;
    }

    public String e() {
        return this.f91157a.get("default");
    }

    public Map<String, String> f() {
        return this.f91157a;
    }

    InterfaceC15630k g() {
        return this.f91174r;
    }

    public boolean h() {
        return this.f91169m;
    }

    public boolean i() {
        return this.f91166j;
    }

    public boolean j() {
        return this.f91167k;
    }

    public boolean k() {
        return this.f91168l;
    }

    public boolean l() {
        return this.f91173q;
    }

    c0(Map<String, String> map, C15409a c15409a, C15620a c15620a, InterfaceC15623d<InterfaceC15624e> interfaceC15623d, InterfaceC15623d<InterfaceC15627h> interfaceC15623d2, C15628i c15628i, C15631l c15631l, InterfaceC15623d<C15629j> interfaceC15623d3, boolean z10, boolean z11, boolean z12, boolean z13, int i10, boolean z14, boolean z15, InterfaceC15630k interfaceC15630k, InterfaceC14722a interfaceC14722a, String str) {
        this.f91157a = map;
        this.f91158b = c15409a;
        this.f91159c = c15620a;
        this.f91160d = interfaceC15623d;
        this.f91161e = interfaceC15623d2;
        this.f91162f = c15628i;
        this.f91163g = c15631l;
        this.f91164h = interfaceC15623d3;
        this.f91173q = z10;
        this.f91166j = z11;
        this.f91167k = z12;
        this.f91165i = z13;
        this.f91172p = i10;
        this.f91168l = z14;
        this.f91169m = z15;
        this.f91174r = interfaceC15630k;
        this.f91170n = interfaceC14722a;
        this.f91171o = str;
    }
}
