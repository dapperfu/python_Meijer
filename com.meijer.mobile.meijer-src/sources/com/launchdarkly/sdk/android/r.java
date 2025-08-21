package com.launchdarkly.sdk.android;

import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.LDValue;
import io.constructor.data.local.PreferencesHelper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import jh.C15034c;
import kh.InterfaceC15130e;

/* loaded from: classes8.dex */
public class r implements T {

    /* renamed from: a, reason: collision with root package name */
    private final m0 f92089a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC15130e f92090b;

    /* renamed from: c, reason: collision with root package name */
    private final C15034c f92091c;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        com.launchdarkly.sdk.d f92092a;

        /* renamed from: b, reason: collision with root package name */
        Callable<String> f92093b;

        /* renamed from: c, reason: collision with root package name */
        Map<String, Callable<LDValue>> f92094c;

        public a(com.launchdarkly.sdk.d dVar, Callable<String> callable, Map<String, Callable<LDValue>> map) {
            this.f92092a = dVar;
            this.f92093b = callable;
            this.f92094c = map;
        }
    }

    private LDContext n(a aVar) {
        try {
            com.launchdarkly.sdk.c cVarA = LDContext.a(aVar.f92092a, aVar.f92093b.call());
            for (Map.Entry<String, Callable<LDValue>> entry : aVar.f92094c.entrySet()) {
                cVarA.j(entry.getKey(), entry.getValue().call());
            }
            return cVarA.b();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    private List<a> o() {
        com.launchdarkly.sdk.d dVarE = com.launchdarkly.sdk.d.e("ld_application");
        HashMap map = new HashMap();
        map.put("envAttributesVersion", new Callable() { // from class: com.launchdarkly.sdk.android.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LDValue.s("1.0");
            }
        });
        map.put(PreferencesHelper.PREF_ID, new Callable() { // from class: com.launchdarkly.sdk.android.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LDValue.s(this.f92056a.f92090b.a().a());
            }
        });
        map.put("name", new Callable() { // from class: com.launchdarkly.sdk.android.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LDValue.s(this.f92057a.f92090b.a().b());
            }
        });
        map.put("version", new Callable() { // from class: com.launchdarkly.sdk.android.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LDValue.s(this.f92061a.f92090b.a().c());
            }
        });
        map.put("versionName", new Callable() { // from class: com.launchdarkly.sdk.android.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LDValue.s(this.f92072a.f92090b.a().d());
            }
        });
        map.put("locale", new Callable() { // from class: com.launchdarkly.sdk.android.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LDValue.s(this.f92073a.f92090b.getLocale());
            }
        });
        final com.launchdarkly.sdk.d dVarE2 = com.launchdarkly.sdk.d.e("ld_device");
        HashMap map2 = new HashMap();
        map2.put("envAttributesVersion", new Callable() { // from class: com.launchdarkly.sdk.android.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LDValue.s("1.0");
            }
        });
        map2.put("manufacturer", new Callable() { // from class: com.launchdarkly.sdk.android.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LDValue.s(this.f92086a.f92090b.d());
            }
        });
        map2.put("model", new Callable() { // from class: com.launchdarkly.sdk.android.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LDValue.s(this.f92046a.f92090b.c());
            }
        });
        map2.put("os", new Callable() { // from class: com.launchdarkly.sdk.android.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return r.j(this.f92048a);
            }
        });
        return Arrays.asList(new a(dVarE, new Callable() { // from class: com.launchdarkly.sdk.android.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return i0.j(Objects.toString(this.f92052a.f92090b.a().a(), ""));
            }
        }, map), new a(dVarE2, new Callable() { // from class: com.launchdarkly.sdk.android.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f92054a.f92089a.h(dVarE2);
            }
        }, map2));
    }

    public r(m0 m0Var, InterfaceC15130e interfaceC15130e, C15034c c15034c) {
        this.f92089a = m0Var;
        this.f92090b = interfaceC15130e;
        this.f92091c = c15034c;
    }

    public static /* synthetic */ LDValue j(r rVar) {
        rVar.getClass();
        return new com.launchdarkly.sdk.j().e("family", rVar.f92090b.b()).e("name", rVar.f92090b.getOSName()).e("version", rVar.f92090b.getOSVersion()).a();
    }

    @Override // com.launchdarkly.sdk.android.T
    public LDContext a(LDContext lDContext) {
        com.launchdarkly.sdk.e eVarX = LDContext.x();
        eVarX.a(lDContext);
        for (a aVar : o()) {
            if (lDContext.l(aVar.f92092a) == null) {
                eVarX.a(n(aVar));
            } else {
                C15034c c15034c = this.f92091c;
                com.launchdarkly.sdk.d dVar = aVar.f92092a;
                c15034c.p("Unable to automatically add environment attributes for kind:{}. {} already exists.", dVar, dVar);
            }
        }
        return eVarX.b();
    }
}
