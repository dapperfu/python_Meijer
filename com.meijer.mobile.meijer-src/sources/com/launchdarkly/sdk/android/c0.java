package com.launchdarkly.sdk.android;

import java.util.HashMap;
import java.util.Map;
import jh.AbstractC15037f;
import jh.EnumC15033b;
import jh.InterfaceC15032a;
import lh.AbstractC15501k;
import lh.AbstractC15507q;
import lh.AbstractC15510t;
import lh.C15495e;
import mh.C15718a;
import nh.C15943a;
import nh.C15951i;
import nh.C15952j;
import nh.C15954l;
import nh.InterfaceC15946d;
import nh.InterfaceC15947e;
import nh.InterfaceC15950h;
import nh.InterfaceC15953k;

/* loaded from: classes8.dex */
public class c0 {

    /* renamed from: s, reason: collision with root package name */
    static final EnumC15033b f91994s = EnumC15033b.INFO;

    /* renamed from: t, reason: collision with root package name */
    static final okhttp3.j f91995t = okhttp3.j.g("application/json; charset=utf-8");

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f91996a;

    /* renamed from: b, reason: collision with root package name */
    final C15718a f91997b;

    /* renamed from: c, reason: collision with root package name */
    final C15943a f91998c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC15946d<InterfaceC15947e> f91999d;

    /* renamed from: e, reason: collision with root package name */
    final InterfaceC15946d<InterfaceC15950h> f92000e;

    /* renamed from: f, reason: collision with root package name */
    final C15951i f92001f;

    /* renamed from: g, reason: collision with root package name */
    final C15954l f92002g;

    /* renamed from: h, reason: collision with root package name */
    final InterfaceC15946d<C15952j> f92003h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f92004i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f92005j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f92006k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f92007l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f92008m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC15032a f92009n;

    /* renamed from: o, reason: collision with root package name */
    private final String f92010o;

    /* renamed from: p, reason: collision with root package name */
    private final int f92011p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f92012q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC15953k f92013r;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f92014a;

        /* renamed from: b, reason: collision with root package name */
        private Map<String, String> f92015b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC15510t f92016c;

        /* renamed from: o, reason: collision with root package name */
        private boolean f92028o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f92029p;

        /* renamed from: q, reason: collision with root package name */
        private InterfaceC15953k f92030q;

        /* renamed from: d, reason: collision with root package name */
        private C15495e f92017d = null;

        /* renamed from: e, reason: collision with root package name */
        private InterfaceC15946d<InterfaceC15947e> f92018e = null;

        /* renamed from: f, reason: collision with root package name */
        private InterfaceC15946d<InterfaceC15950h> f92019f = null;

        /* renamed from: g, reason: collision with root package name */
        private AbstractC15501k f92020g = null;

        /* renamed from: h, reason: collision with root package name */
        private AbstractC15507q f92021h = null;

        /* renamed from: i, reason: collision with root package name */
        private InterfaceC15946d<C15952j> f92022i = null;

        /* renamed from: j, reason: collision with root package name */
        private int f92023j = 5;

        /* renamed from: k, reason: collision with root package name */
        private boolean f92024k = false;

        /* renamed from: l, reason: collision with root package name */
        private boolean f92025l = false;

        /* renamed from: m, reason: collision with root package name */
        private boolean f92026m = false;

        /* renamed from: n, reason: collision with root package name */
        private boolean f92027n = false;

        /* renamed from: r, reason: collision with root package name */
        private InterfaceC15032a f92031r = b();

        /* renamed from: s, reason: collision with root package name */
        private String f92032s = "LaunchDarklySdk";

        /* renamed from: t, reason: collision with root package name */
        private EnumC15033b f92033t = null;

        /* renamed from: com.launchdarkly.sdk.android.c0$a$a, reason: collision with other inner class name */
        public enum EnumC1311a {
            Enabled,
            Disabled
        }

        public c0 a() {
            InterfaceC15032a interfaceC15032a = this.f92031r;
            EnumC15033b enumC15033b = this.f92033t;
            if (enumC15033b == null) {
                enumC15033b = c0.f91994s;
            }
            InterfaceC15032a interfaceC15032aA = AbstractC15037f.a(interfaceC15032a, enumC15033b);
            HashMap map = this.f92015b == null ? new HashMap() : new HashMap(this.f92015b);
            map.put("default", this.f92014a);
            AbstractC15510t abstractC15510tF = this.f92016c;
            if (abstractC15510tF == null) {
                abstractC15510tF = AbstractC11683t.f();
            }
            C15718a c15718aA = abstractC15510tF.a();
            C15495e c15495e = this.f92017d;
            C15943a c15943aI = c15495e == null ? null : c15495e.i();
            InterfaceC15946d interfaceC15946dG = this.f92018e;
            if (interfaceC15946dG == null) {
                interfaceC15946dG = AbstractC11683t.g();
            }
            InterfaceC15946d interfaceC15946d = interfaceC15946dG;
            InterfaceC15946d interfaceC15946dE = this.f92019f;
            if (interfaceC15946dE == null) {
                interfaceC15946dE = AbstractC11683t.e();
            }
            InterfaceC15946d interfaceC15946d2 = interfaceC15946dE;
            AbstractC15501k abstractC15501kA = this.f92020g;
            if (abstractC15501kA == null) {
                abstractC15501kA = AbstractC11683t.a();
            }
            C15951i c15951iA = abstractC15501kA.a();
            AbstractC15507q abstractC15507qC = this.f92021h;
            if (abstractC15507qC == null) {
                abstractC15507qC = AbstractC11683t.c();
            }
            C15954l c15954lA = abstractC15507qC.a();
            InterfaceC15946d interfaceC15946dB = this.f92022i;
            if (interfaceC15946dB == null) {
                interfaceC15946dB = AbstractC11683t.b();
            }
            return new c0(map, c15718aA, c15943aI, interfaceC15946d, interfaceC15946d2, c15951iA, c15954lA, interfaceC15946dB, this.f92024k, this.f92025l, this.f92027n, this.f92026m, this.f92023j, this.f92028o, this.f92029p, this.f92030q, interfaceC15032aA, this.f92032s);
        }

        public a c(boolean z10) {
            this.f92027n = z10;
            return this;
        }

        public a d(boolean z10) {
            this.f92028o = z10;
            return this;
        }

        public a e(String str) {
            Map<String, String> map = this.f92015b;
            if (map != null && map.containsValue(str)) {
                throw new IllegalArgumentException("The primary environment key cannot be in the secondary mobile keys.");
            }
            this.f92014a = str;
            return this;
        }

        public a(EnumC1311a enumC1311a) {
            this.f92029p = false;
            this.f92029p = enumC1311a == EnumC1311a.Enabled;
        }

        private static InterfaceC15032a b() {
            return h0.a();
        }
    }

    boolean a() {
        return this.f92004i;
    }

    InterfaceC15032a b() {
        return this.f92009n;
    }

    String c() {
        return this.f92010o;
    }

    int d() {
        return this.f92011p;
    }

    public String e() {
        return this.f91996a.get("default");
    }

    public Map<String, String> f() {
        return this.f91996a;
    }

    InterfaceC15953k g() {
        return this.f92013r;
    }

    public boolean h() {
        return this.f92008m;
    }

    public boolean i() {
        return this.f92005j;
    }

    public boolean j() {
        return this.f92006k;
    }

    public boolean k() {
        return this.f92007l;
    }

    public boolean l() {
        return this.f92012q;
    }

    c0(Map<String, String> map, C15718a c15718a, C15943a c15943a, InterfaceC15946d<InterfaceC15947e> interfaceC15946d, InterfaceC15946d<InterfaceC15950h> interfaceC15946d2, C15951i c15951i, C15954l c15954l, InterfaceC15946d<C15952j> interfaceC15946d3, boolean z10, boolean z11, boolean z12, boolean z13, int i10, boolean z14, boolean z15, InterfaceC15953k interfaceC15953k, InterfaceC15032a interfaceC15032a, String str) {
        this.f91996a = map;
        this.f91997b = c15718a;
        this.f91998c = c15943a;
        this.f91999d = interfaceC15946d;
        this.f92000e = interfaceC15946d2;
        this.f92001f = c15951i;
        this.f92002g = c15954l;
        this.f92003h = interfaceC15946d3;
        this.f92012q = z10;
        this.f92005j = z11;
        this.f92006k = z12;
        this.f92004i = z13;
        this.f92011p = i10;
        this.f92007l = z14;
        this.f92008m = z15;
        this.f92013r = interfaceC15953k;
        this.f92009n = interfaceC15032a;
        this.f92010o = str;
    }
}
