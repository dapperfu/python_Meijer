package com.launchdarkly.sdk.android;

import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.LDValue;
import ih.C14724c;
import io.constructor.data.local.PreferencesHelper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import jh.InterfaceC14896e;

/* loaded from: classes7.dex */
public class r implements T {

    /* renamed from: a, reason: collision with root package name */
    private final m0 f91250a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14896e f91251b;

    /* renamed from: c, reason: collision with root package name */
    private final C14724c f91252c;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        com.launchdarkly.sdk.d f91253a;

        /* renamed from: b, reason: collision with root package name */
        Callable<String> f91254b;

        /* renamed from: c, reason: collision with root package name */
        Map<String, Callable<LDValue>> f91255c;

        public a(com.launchdarkly.sdk.d dVar, Callable<String> callable, Map<String, Callable<LDValue>> map) {
            this.f91253a = dVar;
            this.f91254b = callable;
            this.f91255c = map;
        }
    }

    private LDContext n(a aVar) {
        try {
            com.launchdarkly.sdk.c cVarA = LDContext.a(aVar.f91253a, aVar.f91254b.call());
            for (Map.Entry<String, Callable<LDValue>> entry : aVar.f91255c.entrySet()) {
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
                return LDValue.s(this.f91217a.f91251b.a().a());
            }
        });
        map.put("name", new Callable() { // from class: com.launchdarkly.sdk.android.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LDValue.s(this.f91218a.f91251b.a().b());
            }
        });
        map.put("version", new Callable() { // from class: com.launchdarkly.sdk.android.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LDValue.s(this.f91222a.f91251b.a().c());
            }
        });
        map.put("versionName", new Callable() { // from class: com.launchdarkly.sdk.android.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LDValue.s(this.f91233a.f91251b.a().d());
            }
        });
        map.put("locale", new Callable() { // from class: com.launchdarkly.sdk.android.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LDValue.s(this.f91234a.f91251b.getLocale());
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
                return LDValue.s(this.f91247a.f91251b.d());
            }
        });
        map2.put("model", new Callable() { // from class: com.launchdarkly.sdk.android.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LDValue.s(this.f91207a.f91251b.c());
            }
        });
        map2.put("os", new Callable() { // from class: com.launchdarkly.sdk.android.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return r.j(this.f91209a);
            }
        });
        return Arrays.asList(new a(dVarE, new Callable() { // from class: com.launchdarkly.sdk.android.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return i0.j(Objects.toString(this.f91213a.f91251b.a().a(), ""));
            }
        }, map), new a(dVarE2, new Callable() { // from class: com.launchdarkly.sdk.android.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f91215a.f91250a.h(dVarE2);
            }
        }, map2));
    }

    public r(m0 m0Var, InterfaceC14896e interfaceC14896e, C14724c c14724c) {
        this.f91250a = m0Var;
        this.f91251b = interfaceC14896e;
        this.f91252c = c14724c;
    }

    public static /* synthetic */ LDValue j(r rVar) {
        rVar.getClass();
        return new com.launchdarkly.sdk.j().e("family", rVar.f91251b.b()).e("name", rVar.f91251b.getOSName()).e("version", rVar.f91251b.getOSVersion()).a();
    }

    @Override // com.launchdarkly.sdk.android.T
    public LDContext a(LDContext lDContext) {
        com.launchdarkly.sdk.e eVarX = LDContext.x();
        eVarX.a(lDContext);
        for (a aVar : o()) {
            if (lDContext.l(aVar.f91253a) == null) {
                eVarX.a(n(aVar));
            } else {
                C14724c c14724c = this.f91252c;
                com.launchdarkly.sdk.d dVar = aVar.f91253a;
                c14724c.p("Unable to automatically add environment attributes for kind:{}. {} already exists.", dVar, dVar);
            }
        }
        return eVarX.b();
    }
}
