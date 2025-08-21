package com.launchdarkly.sdk.android;

import android.app.Application;
import com.launchdarkly.sdk.EvaluationDetail;
import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.LDValue;
import com.launchdarkly.sdk.android.Q;
import com.launchdarkly.sdk.android.m0;
import java.io.Closeable;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import jh.AbstractC15036e;
import jh.C15034c;
import kh.C15128c;
import kh.InterfaceC15130e;
import lh.AbstractC15499i;
import lh.AbstractC15505o;
import lh.C15496f;
import lh.C15504n;
import lh.C15509s;
import nh.C15943a;
import nh.InterfaceC15944b;
import nh.InterfaceC15950h;
import nh.InterfaceC15953k;

/* loaded from: classes8.dex */
public class a0 implements b0, Closeable {

    /* renamed from: i, reason: collision with root package name */
    static volatile Map<String, a0> f91971i;

    /* renamed from: j, reason: collision with root package name */
    private static T f91972j;

    /* renamed from: k, reason: collision with root package name */
    private static T f91973k;

    /* renamed from: l, reason: collision with root package name */
    static Object f91974l = new Object();

    /* renamed from: m, reason: collision with root package name */
    private static volatile C15034c f91975m;

    /* renamed from: a, reason: collision with root package name */
    private volatile C11682s f91976a;

    /* renamed from: b, reason: collision with root package name */
    private final c0 f91977b;

    /* renamed from: c, reason: collision with root package name */
    private final I f91978c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC15950h f91979d;

    /* renamed from: e, reason: collision with root package name */
    private final F f91980e;

    /* renamed from: f, reason: collision with root package name */
    private final C15034c f91981f;

    /* renamed from: g, reason: collision with root package name */
    private final Q f91982g;

    /* renamed from: h, reason: collision with root package name */
    private List<AbstractC15505o> f91983h;

    class a implements InterfaceC15944b<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicInteger f91984a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ W f91985b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a0 f91986c;

        a(AtomicInteger atomicInteger, W w10, a0 a0Var) {
            this.f91984a = atomicInteger;
            this.f91985b = w10;
            this.f91986c = a0Var;
        }

        @Override // nh.InterfaceC15944b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            if (this.f91984a.decrementAndGet() == 0) {
                this.f91985b.a(this.f91986c);
            }
        }

        @Override // nh.InterfaceC15944b
        public void onError(Throwable th2) {
            this.f91985b.b(th2);
        }
    }

    class b implements InterfaceC15944b<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicInteger f91987a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Q.a f91988b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ W f91989c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f91990d;

        b(AtomicInteger atomicInteger, Q.a aVar, W w10, AtomicBoolean atomicBoolean) {
            this.f91987a = atomicInteger;
            this.f91988b = aVar;
            this.f91989c = w10;
            this.f91990d = atomicBoolean;
        }

        @Override // nh.InterfaceC15944b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r32) {
            if (this.f91987a.decrementAndGet() == 0) {
                this.f91988b.a(new C15504n(C15504n.a.COMPLETED));
                this.f91989c.a(null);
            }
        }

        @Override // nh.InterfaceC15944b
        public void onError(Throwable th2) {
            if (this.f91990d.compareAndSet(false, true)) {
                this.f91988b.a(new C15504n(C15504n.a.ERROR));
            }
            this.f91989c.b(th2);
        }
    }

    protected a0(n0 n0Var, InterfaceC15130e interfaceC15130e, v0 v0Var, m0.a aVar, LDContext lDContext, c0 c0Var, String str, String str2) throws LaunchDarklyException {
        S s10;
        n0 n0Var2;
        InterfaceC15130e interfaceC15130e2;
        v0 v0Var2;
        m0.a aVar2;
        LDContext lDContext2;
        String str3;
        String str4;
        C15034c c15034cR = C15034c.r(c0Var.b(), c0Var.c());
        this.f91981f = c15034cR;
        c15034cR.j("Creating LaunchDarkly client. Version: {}", BuildConfig.VERSION_NAME);
        this.f91977b = c0Var;
        if (str == null) {
            throw new LaunchDarklyException("Mobile key cannot be null");
        }
        if (c0Var.f91999d instanceof InterfaceC11684u) {
            n0Var2 = n0Var;
            interfaceC15130e2 = interfaceC15130e;
            v0Var2 = v0Var;
            aVar2 = aVar;
            lDContext2 = lDContext;
            str3 = str;
            str4 = str2;
            s10 = new S(C11682s.o(c0Var, str3, str4, aVar2, null, lDContext2, c15034cR, n0Var2, interfaceC15130e2, v0Var2));
        } else {
            s10 = null;
            n0Var2 = n0Var;
            interfaceC15130e2 = interfaceC15130e;
            v0Var2 = v0Var;
            aVar2 = aVar;
            lDContext2 = lDContext;
            str3 = str;
            str4 = str2;
        }
        this.f91976a = C11682s.o(c0Var, str3, str4, aVar2, s10, lDContext2, c15034cR, n0Var2, interfaceC15130e2, v0Var2);
        I i10 = new I(this.f91976a, aVar, c0Var.d());
        this.f91978c = i10;
        InterfaceC15950h interfaceC15950hA = c0Var.f92000e.a(this.f91976a);
        this.f91979d = interfaceC15950hA;
        this.f91980e = new F(this.f91976a, c0Var.f91999d, interfaceC15950hA, i10, aVar);
        this.f91982g = new Q(c15034cR, c0Var.f92001f.a());
    }

    private void d() throws IOException {
        Collection<a0> collectionValues;
        synchronized (f91974l) {
            collectionValues = h().values();
            f91971i = null;
        }
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((a0) it.next()).g();
        }
        f91975m = null;
    }

    private void g() throws IOException {
        this.f91980e.k();
        try {
            this.f91979d.close();
        } catch (IOException e10) {
            i0.d(this.f91981f, e10, "Unexpected exception from closing event processor", new Object[0]);
        }
    }

    private Map<String, a0> h() {
        Map<String, a0> map = f91971i;
        if (map != null) {
            Iterator<a0> it = map.values().iterator();
            while (it.hasNext()) {
                if (it.next() == this) {
                    return map;
                }
            }
        }
        return Collections.EMPTY_MAP;
    }

    static C15034c i() {
        C15034c c15034c = f91975m;
        return c15034c != null ? c15034c : C15034c.m();
    }

    private Future<Void> j(LDContext lDContext) {
        W w10 = new W();
        Map<String, a0> mapH = h();
        b bVar = new b(new AtomicInteger(mapH.size()), this.f91982g.e(lDContext, null), w10, new AtomicBoolean(false));
        Iterator<a0> it = mapH.values().iterator();
        while (it.hasNext()) {
            it.next().l(lDContext, bVar);
        }
        return w10;
    }

    private void l(LDContext lDContext, InterfaceC15944b<Void> interfaceC15944b) {
        this.f91976a = this.f91976a.v(lDContext);
        this.f91978c.j(lDContext);
        this.f91980e.m(lDContext, interfaceC15944b);
        this.f91979d.Y2(lDContext);
    }

    @Deprecated
    public static Future<a0> p(Application application, c0 c0Var, LDContext lDContext) {
        if (application == null) {
            return new d0(new LaunchDarklyException("Client initialization requires a valid application"));
        }
        if (c0Var == null) {
            return new d0(new LaunchDarklyException("Client initialization requires a valid configuration"));
        }
        if (lDContext == null || !lDContext.w()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Client initialization requires a valid evaluation context (");
            sb2.append(lDContext == null ? "was null" : lDContext.i() + ")");
            return new d0(new LaunchDarklyException(sb2.toString()));
        }
        C15034c c15034cU = u(c0Var);
        W w10 = new W();
        HashMap map = new HashMap();
        synchronized (f91974l) {
            try {
                if (f91971i != null) {
                    c15034cU.n("LDClient.init() was called more than once! returning primary instance.");
                    return new g0(f91971i.get("default"));
                }
                C11668d c11668d = new C11668d(application, c15034cU);
                C11665a c11665a = new C11665a(application, c11668d, c15034cU);
                InterfaceC15953k q0Var = c0Var.g() == null ? new q0(application, c15034cU) : c0Var.g();
                m0 m0Var = new m0(q0Var, c15034cU);
                j0.a(q0Var, c15034cU);
                C15128c c15128c = new C15128c();
                c15128c.c(c0Var.f91998c);
                if (c0Var.h()) {
                    c15128c.b(application);
                }
                InterfaceC15130e interfaceC15130eA = c15128c.a();
                C15943a c15943aA = interfaceC15130eA.a();
                C15509s c15509s = new C15509s("AndroidClient", BuildConfig.VERSION_NAME);
                if (c0Var.h()) {
                    f91972j = new r(m0Var, interfaceC15130eA, c15034cU);
                } else {
                    f91972j = new k0();
                }
                f91973k = new C11669e(m0Var, c0Var.k());
                LDContext lDContextA = f91973k.a(f91972j.a(lDContext));
                Set<Map.Entry<String, String>> setEntrySet = c0Var.f().entrySet();
                HashMap map2 = new HashMap(setEntrySet.size());
                a0 a0Var = null;
                for (Map.Entry<String, String> entry : setEntrySet) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    InterfaceC15130e interfaceC15130e = interfaceC15130eA;
                    try {
                        a0 a0Var2 = a0Var;
                        C11665a c11665a2 = c11665a;
                        m0.a aVarL = m0Var.l(value);
                        m0 m0Var2 = m0Var;
                        a0 a0Var3 = a0Var2;
                        a0 a0Var4 = new a0(c11665a2, interfaceC15130e, c11668d, aVarL, lDContextA, c0Var, value, key);
                        a0Var4.f91983h = c0Var.f92002g.a();
                        map2.put(key, a0Var4);
                        if (value.equals(c0Var.e())) {
                            a0Var3 = a0Var4;
                        }
                        map.put(a0Var4, new C15496f(c15943aA, c15509s, value));
                        c11665a = c11665a2;
                        interfaceC15130eA = interfaceC15130e;
                        a0Var = a0Var3;
                        m0Var = m0Var2;
                    } catch (LaunchDarklyException e10) {
                        w10.b(e10);
                    }
                }
                a0 a0Var5 = a0Var;
                f91971i = map2;
                for (Map.Entry entry2 : map.entrySet()) {
                    a0 a0Var6 = (a0) entry2.getKey();
                    C15496f c15496f = (C15496f) entry2.getValue();
                    for (AbstractC15505o abstractC15505o : a0Var6.f91983h) {
                        try {
                            Iterator<AbstractC15499i> it = abstractC15505o.a(c15496f).iterator();
                            while (it.hasNext()) {
                                a0Var6.f91982g.c(it.next());
                            }
                        } catch (Exception unused) {
                            new StringBuilder().append("Exception thrown getting hooks for plugin ");
                            abstractC15505o.b();
                            throw null;
                        }
                    }
                    for (AbstractC15505o abstractC15505o2 : a0Var6.f91983h) {
                        try {
                            abstractC15505o2.c(a0Var6, c15496f);
                        } catch (Exception unused2) {
                            new StringBuilder().append("Exception thrown registering plugin ");
                            abstractC15505o2.b();
                            throw null;
                        }
                    }
                }
                a aVar = new a(new AtomicInteger(c0Var.f().size()), w10, a0Var5);
                for (a0 a0Var7 : f91971i.values()) {
                    if (a0Var7.f91980e.l(aVar)) {
                        a0Var7.f91979d.Y2(lDContextA);
                    }
                }
                return w10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static C15034c u(c0 c0Var) {
        C15034c c15034c;
        synchronized (f91974l) {
            try {
                if (f91975m == null) {
                    f91975m = C15034c.r(c0Var.b(), c0Var.c());
                }
                c15034c = f91975m;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c15034c;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.launchdarkly.sdk.EvaluationDetail<com.launchdarkly.sdk.LDValue> w(java.lang.String r13, com.launchdarkly.sdk.LDValue r14, boolean r15, boolean r16) {
        /*
            r12 = this;
            com.launchdarkly.sdk.android.s r0 = r12.f91976a
            com.launchdarkly.sdk.LDContext r2 = r0.f()
            com.launchdarkly.sdk.android.I r0 = r12.f91978c
            com.launchdarkly.sdk.android.DataModel$Flag r0 = r0.c(r13)
            r11 = -1
            if (r0 != 0) goto L2f
            jh.c r15 = r12.f91981f
            java.lang.String r0 = "Unknown feature flag \"{}\"; returning default value"
            r15.j(r0, r13)
            nh.h r1 = r12.f91979d
            r9 = 0
            r10 = 0
            r4 = -1
            r5 = -1
            r7 = 0
            r8 = r14
            r3 = r13
            r6 = r14
            r1.H3(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.launchdarkly.sdk.EvaluationReason$ErrorKind r15 = com.launchdarkly.sdk.EvaluationReason.ErrorKind.FLAG_NOT_FOUND
            com.launchdarkly.sdk.EvaluationReason r15 = com.launchdarkly.sdk.EvaluationReason.a(r15)
            com.launchdarkly.sdk.EvaluationDetail r14 = com.launchdarkly.sdk.EvaluationDetail.b(r14, r11, r15)
            goto Le2
        L2f:
            java.lang.String[] r1 = r0.f()
            if (r1 == 0) goto L4a
            java.lang.String[] r1 = r0.f()
            int r4 = r1.length
            r5 = 0
            r7 = r5
        L3c:
            if (r7 >= r4) goto L4a
            r8 = r1[r7]
            com.launchdarkly.sdk.LDValue r9 = com.launchdarkly.sdk.LDValue.u()
            r12.w(r8, r9, r5, r5)
            int r7 = r7 + 1
            goto L3c
        L4a:
            com.launchdarkly.sdk.LDValue r1 = r0.h()
            java.lang.Integer r4 = r0.i()
            if (r4 != 0) goto L56
            r4 = r11
            goto L5e
        L56:
            java.lang.Integer r4 = r0.i()
            int r4 = r4.intValue()
        L5e:
            boolean r5 = r1.k()
            if (r5 == 0) goto L75
            jh.c r15 = r12.f91981f
            java.lang.String r1 = "Feature flag \"{}\" retrieved with no value; returning default value"
            r15.o(r1, r13)
            com.launchdarkly.sdk.EvaluationReason r15 = r0.g()
            com.launchdarkly.sdk.EvaluationDetail r15 = com.launchdarkly.sdk.EvaluationDetail.b(r14, r4, r15)
        L73:
            r1 = r14
            goto Lad
        L75:
            if (r15 == 0) goto La5
            boolean r15 = r14.k()
            if (r15 != 0) goto La5
            com.launchdarkly.sdk.i r15 = r1.h()
            com.launchdarkly.sdk.i r5 = r14.h()
            if (r15 == r5) goto La5
            jh.c r15 = r12.f91981f
            com.launchdarkly.sdk.i r1 = r1.h()
            com.launchdarkly.sdk.i r4 = r14.h()
            java.lang.Object[] r1 = new java.lang.Object[]{r13, r1, r4}
            java.lang.String r4 = "Feature flag \"{}\" with type {} retrieved as {}; returning default value"
            r15.q(r4, r1)
            com.launchdarkly.sdk.EvaluationReason$ErrorKind r15 = com.launchdarkly.sdk.EvaluationReason.ErrorKind.WRONG_TYPE
            com.launchdarkly.sdk.EvaluationReason r15 = com.launchdarkly.sdk.EvaluationReason.a(r15)
            com.launchdarkly.sdk.EvaluationDetail r15 = com.launchdarkly.sdk.EvaluationDetail.b(r14, r11, r15)
            goto L73
        La5:
            com.launchdarkly.sdk.EvaluationReason r15 = r0.g()
            com.launchdarkly.sdk.EvaluationDetail r15 = com.launchdarkly.sdk.EvaluationDetail.b(r1, r4, r15)
        Lad:
            nh.h r4 = r12.f91979d
            r6 = r1
            r1 = r4
            int r4 = r0.k()
            java.lang.Integer r5 = r0.i()
            if (r5 != 0) goto Lbd
        Lbb:
            r5 = r11
            goto Lc6
        Lbd:
            java.lang.Integer r5 = r0.i()
            int r11 = r5.intValue()
            goto Lbb
        Lc6:
            boolean r7 = r0.n()
            r7 = r7 | r16
            if (r7 == 0) goto Ld3
            com.launchdarkly.sdk.EvaluationReason r7 = r15.c()
            goto Ld4
        Ld3:
            r7 = 0
        Ld4:
            boolean r9 = r0.m()
            java.lang.Long r10 = r0.c()
            r3 = r13
            r8 = r14
            r1.H3(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14 = r15
        Le2:
            jh.c r15 = r12.f91981f
            java.lang.String r0 = r2.n()
            java.lang.Object[] r13 = new java.lang.Object[]{r14, r13, r0}
            java.lang.String r0 = "returning variation: {} flagKey: {} context key: {}"
            r15.d(r0, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.launchdarkly.sdk.android.a0.w(java.lang.String, com.launchdarkly.sdk.LDValue, boolean, boolean):com.launchdarkly.sdk.EvaluationDetail");
    }

    @Override // com.launchdarkly.sdk.android.b0
    public void B0(String str, N n10) {
        this.f91978c.k(str, n10);
    }

    @Override // com.launchdarkly.sdk.android.b0
    public boolean I3(final String str, final boolean z10) {
        return this.f91982g.f("LDClient.boolVariation", str, this.f91976a.f(), LDValue.t(z10), new Q.b() { // from class: com.launchdarkly.sdk.android.X
            @Override // com.launchdarkly.sdk.android.Q.b
            public final EvaluationDetail a() {
                return a0.b(this.f91948a, str, z10);
            }
        }).d().a();
    }

    @Override // com.launchdarkly.sdk.android.b0
    public LDValue L1(final String str, final LDValue lDValue) {
        return this.f91982g.f("LDClient.jsonValueVariation", str, this.f91976a.f(), LDValue.o(lDValue), new Q.b() { // from class: com.launchdarkly.sdk.android.Y
            @Override // com.launchdarkly.sdk.android.Q.b
            public final EvaluationDetail a() {
                return a0.a(this.f91951a, str, lDValue);
            }
        }).d();
    }

    @Override // com.launchdarkly.sdk.android.b0
    public void l0(String str, N n10) {
        this.f91978c.i(str, n10);
    }

    @Override // com.launchdarkly.sdk.android.b0
    public Future<Void> m2(LDContext lDContext) {
        if (lDContext == null) {
            return new d0(new LaunchDarklyException("Context cannot be null"));
        }
        if (lDContext.w()) {
            return j(f91973k.a(f91972j.a(lDContext)));
        }
        this.f91981f.o("identify() was called with an invalid context: {}", lDContext.i());
        return new d0(new LaunchDarklyException("Invalid context: " + lDContext.i()));
    }

    @Override // com.launchdarkly.sdk.android.b0
    public String t1(final String str, final String str2) {
        return this.f91982g.f("LDClient.stringVariation", str, this.f91976a.f(), LDValue.s(str2), new Q.b() { // from class: com.launchdarkly.sdk.android.Z
            @Override // com.launchdarkly.sdk.android.Q.b
            public final EvaluationDetail a() {
                return a0.c(this.f91954a, str, str2);
            }
        }).d().x();
    }

    public static /* synthetic */ EvaluationDetail a(a0 a0Var, String str, LDValue lDValue) {
        a0Var.getClass();
        return a0Var.w(str, LDValue.o(lDValue), false, false);
    }

    public static /* synthetic */ EvaluationDetail b(a0 a0Var, String str, boolean z10) {
        a0Var.getClass();
        return a0Var.w(str, LDValue.t(z10), true, false);
    }

    public static /* synthetic */ EvaluationDetail c(a0 a0Var, String str, String str2) {
        a0Var.getClass();
        return a0Var.w(str, LDValue.s(str2), true, false);
    }

    public static a0 m(Application application, c0 c0Var, LDContext lDContext, int i10) {
        u(c0Var);
        i().j("Initializing Client and waiting up to {} for initialization to complete", Integer.valueOf(i10));
        if (i10 >= 15) {
            i().p("LDClient.init called with start wait time parameter of {} seconds.  We recommend a timeout of less than {} seconds.", Integer.valueOf(i10), 15);
        }
        try {
            return p(application, c0Var, lDContext).get(i10, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException e10) {
            i().f("Exception during Client initialization: {}", AbstractC15036e.b(e10));
            i().a(AbstractC15036e.c(e10));
            return f91971i.get("default");
        } catch (TimeoutException unused) {
            i().o("Client did not successfully initialize within {} seconds. It could be taking longer than expected to fetch data. Client can be used immediately and will continue retrying in the background.", Integer.valueOf(i10));
            return f91971i.get("default");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        d();
        synchronized (f91974l) {
            this.f91976a.u().close();
            this.f91976a.t().close();
        }
    }
}
