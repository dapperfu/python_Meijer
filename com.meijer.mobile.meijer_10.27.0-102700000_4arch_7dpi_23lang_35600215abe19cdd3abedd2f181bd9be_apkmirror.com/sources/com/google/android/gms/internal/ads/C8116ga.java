package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ga, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8116ga implements InterfaceC7483ad0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC7907ec0 f74330a;

    /* renamed from: b, reason: collision with root package name */
    private final C9830wc0 f74331b;

    /* renamed from: c, reason: collision with root package name */
    private final ViewOnAttachStateChangeListenerC9611ua f74332c;

    /* renamed from: d, reason: collision with root package name */
    private final C8009fa f74333d;

    /* renamed from: e, reason: collision with root package name */
    private final R9 f74334e;

    /* renamed from: f, reason: collision with root package name */
    private final C9825wa f74335f;

    /* renamed from: g, reason: collision with root package name */
    private final C8970oa f74336g;

    /* renamed from: h, reason: collision with root package name */
    private final C7902ea f74337h;

    C8116ga(AbstractC7907ec0 abstractC7907ec0, C9830wc0 c9830wc0, ViewOnAttachStateChangeListenerC9611ua viewOnAttachStateChangeListenerC9611ua, C8009fa c8009fa, R9 r92, C9825wa c9825wa, C8970oa c8970oa, C7902ea c7902ea) {
        this.f74330a = abstractC7907ec0;
        this.f74331b = c9830wc0;
        this.f74332c = viewOnAttachStateChangeListenerC9611ua;
        this.f74333d = c8009fa;
        this.f74334e = r92;
        this.f74335f = c9825wa;
        this.f74336g = c8970oa;
        this.f74337h = c7902ea;
    }

    private final Map b() {
        HashMap map = new HashMap();
        AbstractC7907ec0 abstractC7907ec0 = this.f74330a;
        H8 h8B = this.f74331b.b();
        map.put("v", abstractC7907ec0.d());
        map.put("gms", Boolean.valueOf(this.f74330a.g()));
        map.put("int", h8B.a1());
        map.put("attts", Long.valueOf(h8B.Y0().b0()));
        map.put("att", h8B.Y0().e0());
        map.put("attkid", h8B.Y0().f0());
        map.put("up", Boolean.valueOf(this.f74333d.a()));
        map.put("t", new Throwable());
        C8970oa c8970oa = this.f74336g;
        if (c8970oa != null) {
            map.put("tcq", Long.valueOf(c8970oa.c()));
            map.put("tpq", Long.valueOf(this.f74336g.g()));
            map.put("tcv", Long.valueOf(this.f74336g.d()));
            map.put("tpv", Long.valueOf(this.f74336g.h()));
            map.put("tchv", Long.valueOf(this.f74336g.b()));
            map.put("tphv", Long.valueOf(this.f74336g.f()));
            map.put("tcc", Long.valueOf(this.f74336g.a()));
            map.put("tpc", Long.valueOf(this.f74336g.e()));
            R9 r92 = this.f74334e;
            if (r92 != null) {
                map.put("nt", Long.valueOf(r92.a()));
            }
            C9825wa c9825wa = this.f74335f;
            if (c9825wa != null) {
                map.put("vs", Long.valueOf(c9825wa.c()));
                map.put("vf", Long.valueOf(this.f74335f.b()));
            }
        }
        return map;
    }

    final void a(View view) {
        this.f74332c.d(view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7483ad0
    public final Map zza() {
        ViewOnAttachStateChangeListenerC9611ua viewOnAttachStateChangeListenerC9611ua = this.f74332c;
        Map mapB = b();
        mapB.put("lts", Long.valueOf(viewOnAttachStateChangeListenerC9611ua.a()));
        return mapB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7483ad0
    public final Map zzc() {
        C7902ea c7902ea = this.f74337h;
        Map mapB = b();
        if (c7902ea != null) {
            mapB.put("vst", c7902ea.a());
        }
        return mapB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7483ad0
    public final Map zzb() {
        Map mapB = b();
        H8 h8A = this.f74331b.a();
        mapB.put("gai", Boolean.valueOf(this.f74330a.h()));
        mapB.put("did", h8A.Z0());
        mapB.put("dst", Integer.valueOf(h8A.N0() - 1));
        mapB.put("doo", Boolean.valueOf(h8A.K0()));
        return mapB;
    }
}
