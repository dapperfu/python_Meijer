package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ga, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8241ga implements InterfaceC7608ad0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC8032ec0 f75170a;

    /* renamed from: b, reason: collision with root package name */
    private final C9955wc0 f75171b;

    /* renamed from: c, reason: collision with root package name */
    private final ViewOnAttachStateChangeListenerC9736ua f75172c;

    /* renamed from: d, reason: collision with root package name */
    private final C8134fa f75173d;

    /* renamed from: e, reason: collision with root package name */
    private final R9 f75174e;

    /* renamed from: f, reason: collision with root package name */
    private final C9950wa f75175f;

    /* renamed from: g, reason: collision with root package name */
    private final C9095oa f75176g;

    /* renamed from: h, reason: collision with root package name */
    private final C8027ea f75177h;

    C8241ga(AbstractC8032ec0 abstractC8032ec0, C9955wc0 c9955wc0, ViewOnAttachStateChangeListenerC9736ua viewOnAttachStateChangeListenerC9736ua, C8134fa c8134fa, R9 r92, C9950wa c9950wa, C9095oa c9095oa, C8027ea c8027ea) {
        this.f75170a = abstractC8032ec0;
        this.f75171b = c9955wc0;
        this.f75172c = viewOnAttachStateChangeListenerC9736ua;
        this.f75173d = c8134fa;
        this.f75174e = r92;
        this.f75175f = c9950wa;
        this.f75176g = c9095oa;
        this.f75177h = c8027ea;
    }

    private final Map b() {
        HashMap map = new HashMap();
        AbstractC8032ec0 abstractC8032ec0 = this.f75170a;
        H8 h8B = this.f75171b.b();
        map.put("v", abstractC8032ec0.d());
        map.put("gms", Boolean.valueOf(this.f75170a.g()));
        map.put("int", h8B.a1());
        map.put("attts", Long.valueOf(h8B.Y0().b0()));
        map.put("att", h8B.Y0().e0());
        map.put("attkid", h8B.Y0().f0());
        map.put("up", Boolean.valueOf(this.f75173d.a()));
        map.put("t", new Throwable());
        C9095oa c9095oa = this.f75176g;
        if (c9095oa != null) {
            map.put("tcq", Long.valueOf(c9095oa.c()));
            map.put("tpq", Long.valueOf(this.f75176g.g()));
            map.put("tcv", Long.valueOf(this.f75176g.d()));
            map.put("tpv", Long.valueOf(this.f75176g.h()));
            map.put("tchv", Long.valueOf(this.f75176g.b()));
            map.put("tphv", Long.valueOf(this.f75176g.f()));
            map.put("tcc", Long.valueOf(this.f75176g.a()));
            map.put("tpc", Long.valueOf(this.f75176g.e()));
            R9 r92 = this.f75174e;
            if (r92 != null) {
                map.put("nt", Long.valueOf(r92.a()));
            }
            C9950wa c9950wa = this.f75175f;
            if (c9950wa != null) {
                map.put("vs", Long.valueOf(c9950wa.c()));
                map.put("vf", Long.valueOf(this.f75175f.b()));
            }
        }
        return map;
    }

    final void a(View view) {
        this.f75172c.d(view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7608ad0
    public final Map zza() {
        ViewOnAttachStateChangeListenerC9736ua viewOnAttachStateChangeListenerC9736ua = this.f75172c;
        Map mapB = b();
        mapB.put("lts", Long.valueOf(viewOnAttachStateChangeListenerC9736ua.a()));
        return mapB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7608ad0
    public final Map zzc() {
        C8027ea c8027ea = this.f75177h;
        Map mapB = b();
        if (c8027ea != null) {
            mapB.put("vst", c8027ea.a());
        }
        return mapB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7608ad0
    public final Map zzb() {
        Map mapB = b();
        H8 h8A = this.f75171b.a();
        mapB.put("gai", Boolean.valueOf(this.f75170a.h()));
        mapB.put("did", h8A.Z0());
        mapB.put("dst", Integer.valueOf(h8A.N0() - 1));
        mapB.put("doo", Boolean.valueOf(h8A.K0()));
        return mapB;
    }
}
