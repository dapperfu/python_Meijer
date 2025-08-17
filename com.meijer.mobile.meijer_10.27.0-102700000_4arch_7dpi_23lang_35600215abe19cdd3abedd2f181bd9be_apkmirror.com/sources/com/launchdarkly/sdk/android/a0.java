package com.launchdarkly.sdk.android;

import android.app.Application;
import com.launchdarkly.sdk.EvaluationDetail;
import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.LDValue;
import com.launchdarkly.sdk.android.Q;
import com.launchdarkly.sdk.android.m0;
import ih.AbstractC14726e;
import ih.C14724c;
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
import jh.C14894c;
import jh.InterfaceC14896e;
import kh.AbstractC15155i;
import kh.AbstractC15161o;
import kh.C15152f;
import kh.C15160n;
import kh.C15165s;
import mh.C15620a;
import mh.InterfaceC15621b;
import mh.InterfaceC15627h;
import mh.InterfaceC15630k;

/* loaded from: classes7.dex */
public class a0 implements b0, Closeable {

    /* renamed from: i, reason: collision with root package name */
    static volatile Map<String, a0> f91132i;

    /* renamed from: j, reason: collision with root package name */
    private static T f91133j;

    /* renamed from: k, reason: collision with root package name */
    private static T f91134k;

    /* renamed from: l, reason: collision with root package name */
    static Object f91135l = new Object();

    /* renamed from: m, reason: collision with root package name */
    private static volatile C14724c f91136m;

    /* renamed from: a, reason: collision with root package name */
    private volatile C11557s f91137a;

    /* renamed from: b, reason: collision with root package name */
    private final c0 f91138b;

    /* renamed from: c, reason: collision with root package name */
    private final I f91139c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC15627h f91140d;

    /* renamed from: e, reason: collision with root package name */
    private final F f91141e;

    /* renamed from: f, reason: collision with root package name */
    private final C14724c f91142f;

    /* renamed from: g, reason: collision with root package name */
    private final Q f91143g;

    /* renamed from: h, reason: collision with root package name */
    private List<AbstractC15161o> f91144h;

    class a implements InterfaceC15621b<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicInteger f91145a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ W f91146b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a0 f91147c;

        a(AtomicInteger atomicInteger, W w10, a0 a0Var) {
            this.f91145a = atomicInteger;
            this.f91146b = w10;
            this.f91147c = a0Var;
        }

        @Override // mh.InterfaceC15621b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            if (this.f91145a.decrementAndGet() == 0) {
                this.f91146b.a(this.f91147c);
            }
        }

        @Override // mh.InterfaceC15621b
        public void onError(Throwable th2) {
            this.f91146b.b(th2);
        }
    }

    class b implements InterfaceC15621b<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicInteger f91148a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Q.a f91149b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ W f91150c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f91151d;

        b(AtomicInteger atomicInteger, Q.a aVar, W w10, AtomicBoolean atomicBoolean) {
            this.f91148a = atomicInteger;
            this.f91149b = aVar;
            this.f91150c = w10;
            this.f91151d = atomicBoolean;
        }

        @Override // mh.InterfaceC15621b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r32) {
            if (this.f91148a.decrementAndGet() == 0) {
                this.f91149b.a(new C15160n(C15160n.a.COMPLETED));
                this.f91150c.a(null);
            }
        }

        @Override // mh.InterfaceC15621b
        public void onError(Throwable th2) {
            if (this.f91151d.compareAndSet(false, true)) {
                this.f91149b.a(new C15160n(C15160n.a.ERROR));
            }
            this.f91150c.b(th2);
        }
    }

    protected a0(n0 n0Var, InterfaceC14896e interfaceC14896e, v0 v0Var, m0.a aVar, LDContext lDContext, c0 c0Var, String str, String str2) throws LaunchDarklyException {
        S s10;
        n0 n0Var2;
        InterfaceC14896e interfaceC14896e2;
        v0 v0Var2;
        m0.a aVar2;
        LDContext lDContext2;
        String str3;
        String str4;
        C14724c c14724cR = C14724c.r(c0Var.b(), c0Var.c());
        this.f91142f = c14724cR;
        c14724cR.j("Creating LaunchDarkly client. Version: {}", BuildConfig.VERSION_NAME);
        this.f91138b = c0Var;
        if (str == null) {
            throw new LaunchDarklyException("Mobile key cannot be null");
        }
        if (c0Var.f91160d instanceof InterfaceC11559u) {
            n0Var2 = n0Var;
            interfaceC14896e2 = interfaceC14896e;
            v0Var2 = v0Var;
            aVar2 = aVar;
            lDContext2 = lDContext;
            str3 = str;
            str4 = str2;
            s10 = new S(C11557s.o(c0Var, str3, str4, aVar2, null, lDContext2, c14724cR, n0Var2, interfaceC14896e2, v0Var2));
        } else {
            s10 = null;
            n0Var2 = n0Var;
            interfaceC14896e2 = interfaceC14896e;
            v0Var2 = v0Var;
            aVar2 = aVar;
            lDContext2 = lDContext;
            str3 = str;
            str4 = str2;
        }
        this.f91137a = C11557s.o(c0Var, str3, str4, aVar2, s10, lDContext2, c14724cR, n0Var2, interfaceC14896e2, v0Var2);
        I i10 = new I(this.f91137a, aVar, c0Var.d());
        this.f91139c = i10;
        InterfaceC15627h interfaceC15627hB = c0Var.f91161e.b(this.f91137a);
        this.f91140d = interfaceC15627hB;
        this.f91141e = new F(this.f91137a, c0Var.f91160d, interfaceC15627hB, i10, aVar);
        this.f91143g = new Q(c14724cR, c0Var.f91162f.a());
    }

    private void d() throws IOException {
        Collection<a0> collectionValues;
        synchronized (f91135l) {
            collectionValues = h().values();
            f91132i = null;
        }
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((a0) it.next()).g();
        }
        f91136m = null;
    }

    private void g() throws IOException {
        this.f91141e.k();
        try {
            this.f91140d.close();
        } catch (IOException e10) {
            i0.d(this.f91142f, e10, "Unexpected exception from closing event processor", new Object[0]);
        }
    }

    private Map<String, a0> h() {
        Map<String, a0> map = f91132i;
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

    static C14724c i() {
        C14724c c14724c = f91136m;
        return c14724c != null ? c14724c : C14724c.m();
    }

    private Future<Void> j(LDContext lDContext) {
        W w10 = new W();
        Map<String, a0> mapH = h();
        b bVar = new b(new AtomicInteger(mapH.size()), this.f91143g.e(lDContext, null), w10, new AtomicBoolean(false));
        Iterator<a0> it = mapH.values().iterator();
        while (it.hasNext()) {
            it.next().l(lDContext, bVar);
        }
        return w10;
    }

    private void l(LDContext lDContext, InterfaceC15621b<Void> interfaceC15621b) {
        this.f91137a = this.f91137a.v(lDContext);
        this.f91139c.j(lDContext);
        this.f91141e.m(lDContext, interfaceC15621b);
        this.f91140d.a3(lDContext);
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
        C14724c c14724cU = u(c0Var);
        W w10 = new W();
        HashMap map = new HashMap();
        synchronized (f91135l) {
            try {
                if (f91132i != null) {
                    c14724cU.n("LDClient.init() was called more than once! returning primary instance.");
                    return new g0(f91132i.get("default"));
                }
                C11543d c11543d = new C11543d(application, c14724cU);
                C11540a c11540a = new C11540a(application, c11543d, c14724cU);
                InterfaceC15630k q0Var = c0Var.g() == null ? new q0(application, c14724cU) : c0Var.g();
                m0 m0Var = new m0(q0Var, c14724cU);
                j0.a(q0Var, c14724cU);
                C14894c c14894c = new C14894c();
                c14894c.c(c0Var.f91159c);
                if (c0Var.h()) {
                    c14894c.b(application);
                }
                InterfaceC14896e interfaceC14896eA = c14894c.a();
                C15620a c15620aA = interfaceC14896eA.a();
                C15165s c15165s = new C15165s("AndroidClient", BuildConfig.VERSION_NAME);
                if (c0Var.h()) {
                    f91133j = new r(m0Var, interfaceC14896eA, c14724cU);
                } else {
                    f91133j = new k0();
                }
                f91134k = new C11544e(m0Var, c0Var.k());
                LDContext lDContextA = f91134k.a(f91133j.a(lDContext));
                Set<Map.Entry<String, String>> setEntrySet = c0Var.f().entrySet();
                HashMap map2 = new HashMap(setEntrySet.size());
                a0 a0Var = null;
                for (Map.Entry<String, String> entry : setEntrySet) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    InterfaceC14896e interfaceC14896e = interfaceC14896eA;
                    try {
                        a0 a0Var2 = a0Var;
                        C11540a c11540a2 = c11540a;
                        m0.a aVarL = m0Var.l(value);
                        m0 m0Var2 = m0Var;
                        a0 a0Var3 = a0Var2;
                        a0 a0Var4 = new a0(c11540a2, interfaceC14896e, c11543d, aVarL, lDContextA, c0Var, value, key);
                        a0Var4.f91144h = c0Var.f91163g.a();
                        map2.put(key, a0Var4);
                        if (value.equals(c0Var.e())) {
                            a0Var3 = a0Var4;
                        }
                        map.put(a0Var4, new C15152f(c15620aA, c15165s, value));
                        c11540a = c11540a2;
                        interfaceC14896eA = interfaceC14896e;
                        a0Var = a0Var3;
                        m0Var = m0Var2;
                    } catch (LaunchDarklyException e10) {
                        w10.b(e10);
                    }
                }
                a0 a0Var5 = a0Var;
                f91132i = map2;
                for (Map.Entry entry2 : map.entrySet()) {
                    a0 a0Var6 = (a0) entry2.getKey();
                    C15152f c15152f = (C15152f) entry2.getValue();
                    for (AbstractC15161o abstractC15161o : a0Var6.f91144h) {
                        try {
                            Iterator<AbstractC15155i> it = abstractC15161o.a(c15152f).iterator();
                            while (it.hasNext()) {
                                a0Var6.f91143g.c(it.next());
                            }
                        } catch (Exception unused) {
                            new StringBuilder().append("Exception thrown getting hooks for plugin ");
                            abstractC15161o.b();
                            throw null;
                        }
                    }
                    for (AbstractC15161o abstractC15161o2 : a0Var6.f91144h) {
                        try {
                            abstractC15161o2.c(a0Var6, c15152f);
                        } catch (Exception unused2) {
                            new StringBuilder().append("Exception thrown registering plugin ");
                            abstractC15161o2.b();
                            throw null;
                        }
                    }
                }
                a aVar = new a(new AtomicInteger(c0Var.f().size()), w10, a0Var5);
                for (a0 a0Var7 : f91132i.values()) {
                    if (a0Var7.f91141e.l(aVar)) {
                        a0Var7.f91140d.a3(lDContextA);
                    }
                }
                return w10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static C14724c u(c0 c0Var) {
        C14724c c14724c;
        synchronized (f91135l) {
            try {
                if (f91136m == null) {
                    f91136m = C14724c.r(c0Var.b(), c0Var.c());
                }
                c14724c = f91136m;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c14724c;
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
            com.launchdarkly.sdk.android.s r0 = r12.f91137a
            com.launchdarkly.sdk.LDContext r2 = r0.f()
            com.launchdarkly.sdk.android.I r0 = r12.f91139c
            com.launchdarkly.sdk.android.DataModel$Flag r0 = r0.c(r13)
            r11 = -1
            if (r0 != 0) goto L2f
            ih.c r15 = r12.f91142f
            java.lang.String r0 = "Unknown feature flag \"{}\"; returning default value"
            r15.j(r0, r13)
            mh.h r1 = r12.f91140d
            r9 = 0
            r10 = 0
            r4 = -1
            r5 = -1
            r7 = 0
            r8 = r14
            r3 = r13
            r6 = r14
            r1.I3(r2, r3, r4, r5, r6, r7, r8, r9, r10)
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
            ih.c r15 = r12.f91142f
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
            ih.c r15 = r12.f91142f
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
            mh.h r4 = r12.f91140d
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
            r1.I3(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14 = r15
        Le2:
            ih.c r15 = r12.f91142f
            java.lang.String r0 = r2.n()
            java.lang.Object[] r13 = new java.lang.Object[]{r14, r13, r0}
            java.lang.String r0 = "returning variation: {} flagKey: {} context key: {}"
            r15.d(r0, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.launchdarkly.sdk.android.a0.w(java.lang.String, com.launchdarkly.sdk.LDValue, boolean, boolean):com.launchdarkly.sdk.EvaluationDetail");
    }

    @Override // com.launchdarkly.sdk.android.b0
    public void D0(String str, N n10) {
        this.f91139c.k(str, n10);
    }

    @Override // com.launchdarkly.sdk.android.b0
    public LDValue J1(final String str, final LDValue lDValue) {
        return this.f91143g.f("LDClient.jsonValueVariation", str, this.f91137a.f(), LDValue.o(lDValue), new Q.b() { // from class: com.launchdarkly.sdk.android.Y
            @Override // com.launchdarkly.sdk.android.Q.b
            public final EvaluationDetail a() {
                return a0.a(this.f91112a, str, lDValue);
            }
        }).d();
    }

    @Override // com.launchdarkly.sdk.android.b0
    public boolean J3(final String str, final boolean z10) {
        return this.f91143g.f("LDClient.boolVariation", str, this.f91137a.f(), LDValue.t(z10), new Q.b() { // from class: com.launchdarkly.sdk.android.X
            @Override // com.launchdarkly.sdk.android.Q.b
            public final EvaluationDetail a() {
                return a0.b(this.f91109a, str, z10);
            }
        }).d().a();
    }

    @Override // com.launchdarkly.sdk.android.b0
    public void k0(String str, N n10) {
        this.f91139c.i(str, n10);
    }

    @Override // com.launchdarkly.sdk.android.b0
    public Future<Void> o2(LDContext lDContext) {
        if (lDContext == null) {
            return new d0(new LaunchDarklyException("Context cannot be null"));
        }
        if (lDContext.w()) {
            return j(f91134k.a(f91133j.a(lDContext)));
        }
        this.f91142f.o("identify() was called with an invalid context: {}", lDContext.i());
        return new d0(new LaunchDarklyException("Invalid context: " + lDContext.i()));
    }

    @Override // com.launchdarkly.sdk.android.b0
    public String v1(final String str, final String str2) {
        return this.f91143g.f("LDClient.stringVariation", str, this.f91137a.f(), LDValue.s(str2), new Q.b() { // from class: com.launchdarkly.sdk.android.Z
            @Override // com.launchdarkly.sdk.android.Q.b
            public final EvaluationDetail a() {
                return a0.c(this.f91115a, str, str2);
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
            i().f("Exception during Client initialization: {}", AbstractC14726e.b(e10));
            i().a(AbstractC14726e.c(e10));
            return f91132i.get("default");
        } catch (TimeoutException unused) {
            i().o("Client did not successfully initialize within {} seconds. It could be taking longer than expected to fetch data. Client can be used immediately and will continue retrying in the background.", Integer.valueOf(i10));
            return f91132i.get("default");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        d();
        synchronized (f91135l) {
            this.f91137a.u().close();
            this.f91137a.t().close();
        }
    }
}
