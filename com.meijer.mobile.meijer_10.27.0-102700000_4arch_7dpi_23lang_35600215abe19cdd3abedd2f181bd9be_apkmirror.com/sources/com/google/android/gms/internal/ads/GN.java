package com.google.android.gms.internal.ads;

import Pc.C4564e;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public class GN {

    /* renamed from: a, reason: collision with root package name */
    protected final Map f67173a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f67174b;

    /* renamed from: c, reason: collision with root package name */
    protected final Executor f67175c;

    /* renamed from: d, reason: collision with root package name */
    protected final Qc.u f67176d;

    /* renamed from: e, reason: collision with root package name */
    protected final boolean f67177e;

    /* renamed from: f, reason: collision with root package name */
    private final Wc.c f67178f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f67179g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f67180h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f67181i;

    /* renamed from: j, reason: collision with root package name */
    private final AtomicReference f67182j;

    public final void f(Map map) {
        h(map, true);
    }

    public final void g(Map map) {
        h(map, false);
    }

    private final void a(Map map) {
        if (map == null || map.isEmpty()) {
            Qc.p.b("Empty or null paramMap.");
            return;
        }
        if (!this.f67181i.getAndSet(true)) {
            final String str = (String) Mc.A.c().a(C8659lf.f76526ta);
            this.f67182j.set(C4564e.a(this.f67174b, str, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.ads.EN
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                    this.f66435a.d(str, sharedPreferences, str2);
                }
            }));
        }
        Bundle bundle = (Bundle) this.f67182j.get();
        for (String str2 : bundle.keySet()) {
            map.put(str2, String.valueOf(bundle.get(str2)));
        }
    }

    protected final String b(Map map) {
        return this.f67178f.a(map);
    }

    public final ConcurrentHashMap c() {
        return new ConcurrentHashMap(this.f67173a);
    }

    final /* synthetic */ void d(String str, SharedPreferences sharedPreferences, String str2) {
        this.f67182j.set(C4564e.b(this.f67174b, str));
    }

    protected GN(Executor executor, Qc.u uVar, Wc.c cVar, Context context) {
        this.f67173a = new HashMap();
        this.f67181i = new AtomicBoolean();
        this.f67182j = new AtomicReference(new Bundle());
        this.f67175c = executor;
        this.f67176d = uVar;
        this.f67177e = ((Boolean) Mc.A.c().a(C8659lf.f76322f2)).booleanValue();
        this.f67178f = cVar;
        this.f67179g = ((Boolean) Mc.A.c().a(C8659lf.f76364i2)).booleanValue();
        this.f67180h = ((Boolean) Mc.A.c().a(C8659lf.f76075N6)).booleanValue();
        this.f67174b = context;
    }

    private final void h(Map map, boolean z10) {
        if (map.isEmpty()) {
            Qc.p.b("Empty paramMap.");
            return;
        }
        a(map);
        final String strA = this.f67178f.a(map);
        Pc.p0.k(strA);
        boolean z11 = Boolean.parseBoolean((String) map.get("scar"));
        if (this.f67177e) {
            if (!z10 || this.f67179g) {
                if (!z11 || this.f67180h) {
                    this.f67175c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.DN
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f66234a.f67176d.zza(strA);
                        }
                    });
                }
            }
        }
    }

    public final void e(Map map) {
        if (map.isEmpty()) {
            Qc.p.b("Empty paramMap.");
            return;
        }
        a(map);
        final String strA = this.f67178f.a(map);
        Pc.p0.k(strA);
        if (!((Boolean) Mc.A.c().a(C8659lf.f76235Yc)).booleanValue() && !this.f67177e) {
            return;
        }
        this.f67175c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.FN
            @Override // java.lang.Runnable
            public final void run() {
                this.f66794a.f67176d.zza(strA);
            }
        });
    }
}
