package com.google.android.gms.internal.ads;

import Rc.C5185e;
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
    protected final Map f68013a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f68014b;

    /* renamed from: c, reason: collision with root package name */
    protected final Executor f68015c;

    /* renamed from: d, reason: collision with root package name */
    protected final Sc.u f68016d;

    /* renamed from: e, reason: collision with root package name */
    protected final boolean f68017e;

    /* renamed from: f, reason: collision with root package name */
    private final Yc.c f68018f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f68019g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f68020h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f68021i;

    /* renamed from: j, reason: collision with root package name */
    private final AtomicReference f68022j;

    public final void f(Map map) {
        h(map, true);
    }

    public final void g(Map map) {
        h(map, false);
    }

    private final void a(Map map) {
        if (map == null || map.isEmpty()) {
            Sc.p.b("Empty or null paramMap.");
            return;
        }
        if (!this.f68021i.getAndSet(true)) {
            final String str = (String) Oc.A.c().a(C8784lf.f77366ta);
            this.f68022j.set(C5185e.a(this.f68014b, str, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.ads.EN
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                    this.f67275a.d(str, sharedPreferences, str2);
                }
            }));
        }
        Bundle bundle = (Bundle) this.f68022j.get();
        for (String str2 : bundle.keySet()) {
            map.put(str2, String.valueOf(bundle.get(str2)));
        }
    }

    protected final String b(Map map) {
        return this.f68018f.a(map);
    }

    public final ConcurrentHashMap c() {
        return new ConcurrentHashMap(this.f68013a);
    }

    final /* synthetic */ void d(String str, SharedPreferences sharedPreferences, String str2) {
        this.f68022j.set(C5185e.b(this.f68014b, str));
    }

    protected GN(Executor executor, Sc.u uVar, Yc.c cVar, Context context) {
        this.f68013a = new HashMap();
        this.f68021i = new AtomicBoolean();
        this.f68022j = new AtomicReference(new Bundle());
        this.f68015c = executor;
        this.f68016d = uVar;
        this.f68017e = ((Boolean) Oc.A.c().a(C8784lf.f77162f2)).booleanValue();
        this.f68018f = cVar;
        this.f68019g = ((Boolean) Oc.A.c().a(C8784lf.f77204i2)).booleanValue();
        this.f68020h = ((Boolean) Oc.A.c().a(C8784lf.f76915N6)).booleanValue();
        this.f68014b = context;
    }

    private final void h(Map map, boolean z10) {
        if (map.isEmpty()) {
            Sc.p.b("Empty paramMap.");
            return;
        }
        a(map);
        final String strA = this.f68018f.a(map);
        Rc.p0.k(strA);
        boolean z11 = Boolean.parseBoolean((String) map.get("scar"));
        if (this.f68017e) {
            if (!z10 || this.f68019g) {
                if (!z11 || this.f68020h) {
                    this.f68015c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.DN
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f67074a.f68016d.zza(strA);
                        }
                    });
                }
            }
        }
    }

    public final void e(Map map) {
        if (map.isEmpty()) {
            Sc.p.b("Empty paramMap.");
            return;
        }
        a(map);
        final String strA = this.f68018f.a(map);
        Rc.p0.k(strA);
        if (!((Boolean) Oc.A.c().a(C8784lf.f77075Yc)).booleanValue() && !this.f68017e) {
            return;
        }
        this.f68015c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.FN
            @Override // java.lang.Runnable
            public final void run() {
                this.f67634a.f68016d.zza(strA);
            }
        });
    }
}
